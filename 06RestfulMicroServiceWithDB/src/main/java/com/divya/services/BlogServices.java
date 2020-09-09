package com.divya.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.divya.entity.Blog;
import com.divya.repository.BlogRepository;

@Service
public class BlogServices {
	
//	static List<Blog> blogs = new ArrayList<Blog>(
//			Arrays.asList(new Blog(1, "Data", "Sample data"),
//						new Blog(2, "Objects", "Objects data"),
//						new Blog(3, "Classes", "Classes data")
//					));
	
	
	@Autowired
	private BlogRepository repo;
	
	public List<Blog> getBlogs() {
		List<Blog> list = new ArrayList<>();
		
		for(Blog blog: repo.findAll()) {
			list.add(blog);
		}
		return list;
	}
	
	public Blog getBlog(int id) {
		return repo.findById(id).get();
	}

	public void addBlog(Blog blog) {
		repo.save(blog);
		
	}

	public void updateBlog(Blog blog) {
		repo.save(blog);
		
	}

	public void deleteBlog(int id) {
		repo.deleteById(id);
		}
}
