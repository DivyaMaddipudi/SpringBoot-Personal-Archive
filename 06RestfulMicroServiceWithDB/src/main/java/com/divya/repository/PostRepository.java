package com.divya.repository;

import org.springframework.data.repository.CrudRepository;

import com.divya.entity.Blog;

public interface PostRepository extends CrudRepository<Blog, Integer>{
	
}
