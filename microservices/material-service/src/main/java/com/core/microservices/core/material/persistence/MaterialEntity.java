package com.core.microservices.core.material.persistence;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import org.springframework.lang.Nullable;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "material")
public class MaterialEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Column(name = "materialId", unique = true, nullable = false)
	@Column(name="materialId")
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public int getFromId() {
		return fromId;
	}

	public void setFromId(int fromId) {
		this.fromId = fromId;
	}

	public int getToId() {
		return toId;
	}

	public void setToId(int toId) {
		this.toId = toId;
	}

	public String getApproval() {
		return approval;
	}

	public void setApproval(String approval) {
		this.approval = approval;
	}

	public LocalDateTime getCreateTime() {
		return createTime;
	}

	public void setCreateTime(LocalDateTime createTime) {
		this.createTime = createTime;
	}

	public double getClarity() {
		return clarity;
	}

	public void setClarity(double clarity) {
		this.clarity = clarity;
	}

	public String getWebUrl() {
		return webUrl;
	}

	public void setWebUrl(String webUrl) {
		this.webUrl = webUrl;
	}
}
