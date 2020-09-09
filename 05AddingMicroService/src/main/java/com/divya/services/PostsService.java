package com.divya.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.divya.entity.Post;

@Service
public class PostsService {
	

	static List<Post> posts = new ArrayList<Post>(
			Arrays.asList(
					new Post(1, "DataType", "Sample text"),
					new Post(2, "Classes", "Sample text"),
					new Post(3, "Objects", "Sample text"),
					new Post(4, "Specifiers", "Sample text"),
					new Post(5, "OOPS", "Sample text")
					
					));
	
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

	public void addPost(Post postElement) {
		posts.add(postElement);
	}

	public void updatePost(Post post, int id) {
		for(int i=0;i<posts.size();i++) {
			Post tempPost = posts.get(i);
			if(tempPost.getPostId() == id) {
				posts.set(i, post);
				return;
			}
		}
		
	}

	public void deletePost(int id) {
		for(int i=0;i<posts.size();i++) {
			Post tempPost = posts.get(i);
			if(tempPost.getPostId() == id) {
				posts.remove(i);
				return;
			}
		}
		
	}
	
}
