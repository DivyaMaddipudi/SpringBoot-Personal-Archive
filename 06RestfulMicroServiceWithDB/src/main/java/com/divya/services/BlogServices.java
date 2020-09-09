package com.divya.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.divya.entity.Blog;

@Service
public class BlogServices {
	
	static List<Blog> blogs = new ArrayList<Blog>(
			Arrays.asList(new Blog(1, "Data", "Sample data"),
						new Blog(2, "Objects", "Objects data"),
						new Blog(3, "Classes", "Classes data")
					));
	
	public List<Blog> getBlogs() {
		return blogs;
	}

	public Blog getBlog(int id) {
		for(Blog blog:blogs) {
			if(blog.getBlogId() == id) {
				return blog;
			}
		}
		return null;
	}

	public void addBlog(Blog blog) {
		blogs.add(blog);
		
	}

	public void updateBlog(Blog blog, int id) {
		for(int i=0;i<blogs.size();i++) {
			Blog tempBlog = blogs.get(i);
			if(tempBlog.getBlogId() == id) {
				blogs.set(i, blog);
				return;
			}
		}
		
	}

	public void deleteBlog(int id) {
		for(int i=0;i<blogs.size();i++) {
			Blog tempBlog = blogs.get(i);
			if(tempBlog.getBlogId() == id) {
				blogs.remove(i);
				return;
			}
		}
		
	}
}
