package com.divya.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.divya.entity.Post;
import com.divya.services.PostsService;

@RestController
public class PostsController {
	
	@RequestMapping("/posts")
	public List<Post> getPosts() {
		return new PostsService().getPosts();
	}
	
}
