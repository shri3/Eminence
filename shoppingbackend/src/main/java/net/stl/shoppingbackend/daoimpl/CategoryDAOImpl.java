package net.stl.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.stl.shoppingbackend.dao.CategoryDAO;
import net.stl.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	
	private static List<Category> categories = new ArrayList<>();
	
	static {
		Category category = new Category();
		
		category.setId(1);
		category.setName("Television");
		category.setDescription("this is sony  television category");
		category.setImageURL("CAT_1.png");
		
		categories.add(category);
	
		category = new Category();
		
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("this is sony  Mobile category");
		category.setImageURL("CAT_2.png");
		
		categories.add(category);
	
		category = new Category();
		
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("this is sony viao laptop category");
		category.setImageURL("CAT_3.png");
		
		categories.add(category);
	
	}
	
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}


	@Override
	public Category get(int id) {
		//enhanced for loop
		
		for(Category category:categories) {
			if(category.getId()== id) return category;
		}
		return null;
	}

}
