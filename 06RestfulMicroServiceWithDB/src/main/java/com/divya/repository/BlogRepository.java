package com.divya.repository;

import org.springframework.data.repository.CrudRepository;

import com.divya.entity.Blog;

public interface BlogRepository extends CrudRepository<Blog, Integer>{
	
}
