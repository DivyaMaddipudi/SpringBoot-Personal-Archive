package com.divya.entity;

public class Blog {
	
	int blogId;
	String title;
	String body;
	
	public Blog(int blogId, String title, String body) {
		this.blogId = blogId;
		this.title = title;
		this.body = body;
	}

	public int getBlogId() {
		return blogId;
	}

	public void setPostId(int blogId) {
		this.blogId = blogId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "Post [postId=" + blogId + ", title=" + title + ", body=" + body + "]";
	}
	
}
