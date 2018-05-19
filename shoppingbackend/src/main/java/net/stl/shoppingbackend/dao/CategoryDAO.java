package net.stl.shoppingbackend.dao;

import java.util.List;

import net.stl.shoppingbackend.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();
	Category get(int id);

}
