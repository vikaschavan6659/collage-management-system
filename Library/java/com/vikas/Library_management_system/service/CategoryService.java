package com.vikas.Library_management_system.service;

import java.util.List;

import com.vikas.Library_management_system.entity.Category;


public interface CategoryService {

	public List<Category> findAllCategories();

	public Category findCategoryById(Long id);

	public void createCategory(Category category);

	public void updateCategory(Category category);

	public void deleteCategory(Long id);

}
