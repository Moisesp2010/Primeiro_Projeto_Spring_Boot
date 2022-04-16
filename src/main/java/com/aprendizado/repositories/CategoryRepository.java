package com.aprendizado.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendizado.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	

}