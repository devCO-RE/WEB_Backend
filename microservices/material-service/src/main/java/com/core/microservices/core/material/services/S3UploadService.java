package com.core.microservices.core.material.services;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;

@Service
public class S3UploadService {

	// s3
	// go to cofiguration file later
	@Value("${aws.s3.access-id}")
	private String accessKey;

	@Value("${aws.s3.access-pw}")
	private String secretKey;

	final String endPoint = "https://kr.object.ncloudstorage.com";
	final String regionName = "kr-standard";
	final String bucketName = "corematerial";

	public static final String CLOUD_FRONT_DOMAIN_NAME = "wiatfmhhelqh7856744.cdn.ntruss.com";

	private static final Logger LOG = LoggerFactory.getLogger(S3UploadService.class);

	public String uploadMaterial(MultipartFile file , String time, String serviceName, int toUserId) {

		StringBuilder sb = new StringBuilder();
		//	index 나중에 붙여야함
		//	fromUserId값을 token에서 가져와야함
		sb.append(time).append("_").append(serviceName).append("_").append(Integer.toString(1));
		
		ObjectMetadata omd = new ObjectMetadata();
		omd.setContentType(file.getContentType());
		omd.setContentLength(file.getSize());
		omd.setHeader("filename", sb.toString());

		//	client 생성 -> 나중에 밖으로 빼줘야함
		AmazonS3 s3Client = AmazonS3ClientBuilder.standard()
			.withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration(endPoint, regionName))
			.withCredentials(new AWSStaticCredentialsProvider(new BasicAWSCredentials(this.accessKey, this.secretKey)))
			.build();

		String folderName = Integer.toString(toUserId);
		try {
			s3Client.putObject(
				new PutObjectRequest(bucketName + "/" + folderName, sb.toString(), file.getInputStream(),
					omd)
			.withCannedAcl(CannedAccessControlList.PublicRead));

			return folderName+"/"+sb.toString();
			// return s3Client.getUrl(bucketName+ "/" + folderName, sb.toString()).toString();
		}catch(IOException e){
			//dont put object
			return null;
		}
	}


}
