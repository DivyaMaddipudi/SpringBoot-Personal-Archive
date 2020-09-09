package com.divya.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.divya.entity.Post;

@Service
public class PostsService {
	
	List<Post> posts = new ArrayList<Post>();
	
	public PostsService() {
		posts.add(new Post(1, "DataType", "Sample text"));
		posts.add(new Post(2, "Classes", "Sample text"));
		posts.add(new Post(3, "Objects", "Sample text"));
		posts.add(new Post(4, "Specifiers", "Sample text"));
		posts.add(new Post(5, "OOPS", "Sample text"));
	}
	
	public List<Post> getPosts() {
		return posts;
	}

	public Post getPost(int id) {
		for(Post post: posts) {
			if(post.getPostId() == id) {
				return post;
			}
		}
		return null;
	}
	
}
