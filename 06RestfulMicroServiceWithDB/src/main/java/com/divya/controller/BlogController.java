package com.divya.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.divya.entity.Blog;
import com.divya.services.BlogServices;

@RestController
public class BlogController {
	
	@Autowired
	private BlogServices service;
	
	@RequestMapping("/blogs")
	public List<Blog> getBlogs() {
		return service.getBlogs();
		
	}
	
	@RequestMapping("/blogs/{id}")
	public Blog getBlog(@PathVariable int id) {
		return service.getBlog(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/blogs")
	public void addBlog(@RequestBody Blog blog) {
		 service.addBlog(blog);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/blogs/{id}")
	public void updateBlog(@RequestBody Blog blog) {
		service.updateBlog(blog);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/blogs/{id}")
	public void deleteBlog(@PathVariable int id) {
		service.deleteBlog(id);
	}
	
}
