package com.listen.bbs.vo;

import org.springframework.web.multipart.MultipartFile;

public class BbsFileVo {

	private String bbs_file_seq; // 파일 SEQ
	private String bbs_seq; // 게시판 SEQ
	private String path; // 경로
	private String org_name; // 원래의 파일이름
	private String save_name; // 저장된 이름
	private String file_size; // 파일 사이즈
	private MultipartFile upload; // 업로드할 파일

	// setter , getter
	public String getBbs_seq() {
		return bbs_seq;
	}

	public void setBbs_seq(String bbs_seq) {
		this.bbs_seq = bbs_seq;
	}

	public String getBbs_file_seq() {
		return bbs_file_seq;
	}

	public void setBbs_file_seq(String bbs_file_seq) {
		this.bbs_file_seq = bbs_file_seq;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getOrg_name() {
		return org_name;
	}

	public void setOrg_name(String org_name) {
		this.org_name = org_name;
	}

	public String getSave_name() {
		return save_name;
	}

	public void setSave_name(String save_name) {
		this.save_name = save_name;
	}

	public String getFile_size() {
		return file_size;
	}

	public void setFile_size(String file_size) {
		this.file_size = file_size;
	}

	public MultipartFile getUpload() {
		return upload;
	}

	public void setUpload(MultipartFile upload) {
		this.upload = upload;
	}
}
