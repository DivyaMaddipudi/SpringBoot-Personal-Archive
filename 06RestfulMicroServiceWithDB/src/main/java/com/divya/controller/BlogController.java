package com.divya.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.divya.entity.Blog;
import com.divya.services.BlogServices;

@RestController
public class BlogController {
	
	@RequestMapping("/blogs")
	public List<Blog> getBlogs() {
		return new BlogServices().getBlogs();
		
	}
	
	@RequestMapping("/blogs/{id}")
	public Blog getBlog(@PathVariable int id) {
		return new BlogServices().getBlog(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/blogs")
	public void addBlog(@RequestBody Blog blog) {
		new BlogServices().addBlog(blog);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/blogs/{id}")
	public void updateBlog(@RequestBody Blog blog, @PathVariable int id) {
		new BlogServices().updateBlog(blog, id);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/blogs/{id}")
	public void deleteBlog(@PathVariable int id) {
		new BlogServices().deleteBlog(id);
	}
}
