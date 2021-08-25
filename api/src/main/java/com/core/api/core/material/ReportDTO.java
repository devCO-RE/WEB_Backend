package com.core.api.core.material;

import java.time.LocalDateTime;

public class ReportDTO {

	// 제보 아이디, 악플 url, 악플 pdf 파일 url, 승인 여부, 제보 날짜
	private String fileName;
	private int fromId; //제보 아이디
	private int toId; // 자신의 아이디 (수정 필요)
	private String approval; // 승인 여부 string으로 줌
	private LocalDateTime createTime; //  "yyyy-MM-dd_HH-mm" 형태
	private String webUrl;

	public ReportDTO(String fileName, int fromId, int toId, String approval, LocalDateTime createTime,
		String webUrl) {
		this.fileName = fileName;
		this.fromId = fromId;
		this.toId = toId;
		this.approval = approval;
		this.createTime = createTime;
		this.webUrl = webUrl;
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

	public String getWebUrl() {
		return webUrl;
	}

	public void setWebUrl(String webUrl) {
		this.webUrl = webUrl;
	}
}
