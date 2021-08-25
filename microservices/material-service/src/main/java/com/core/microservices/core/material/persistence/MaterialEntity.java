package com.core.microservices.core.material.persistence;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

@Getter
@Setter
@Entity
@Table(name = "material")
public class MaterialEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "materialId", unique = true, nullable = false)
	private int id;

	private String fileName;

	private int fromId;

	private int toId;

	private String approval;

	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd_HH-mm", timezone = "Asia/Seoul")
	private LocalDateTime createTime;

	private double clarity;

	private String webUrl;

	public MaterialEntity(){
	}

	@Builder
	public MaterialEntity(int id, String fileName, int fromId, int toId, String approval, LocalDateTime createTime, double clarity, String webUrl){
		this.id = id;
		this.fileName = fileName;
		this.fromId = fromId;
		this.toId = toId;
		this.approval = approval;
		this.createTime = createTime;
		this.clarity = clarity;
		this.webUrl = webUrl;
	}

}
