package com.sbs.exam.app.dto;

public class Article extends Object {   // extends Object 포함됨, 제외가능
	public int id;     // 같은 파일이 아니라면 public (외부에 공개, 외부도 접근가능)
	public String regDate;
	public String updateDate;
	public String title;
	public String body;
	
	@Override       // Alt + shift + s    toString 
	public String toString() {
		return "Article [id=" + id + ", regDate=" + regDate + ", updateDate=" + updateDate + ", title=" + title
				+ ", body=" + body + "]";
	}
	
	
	
}

