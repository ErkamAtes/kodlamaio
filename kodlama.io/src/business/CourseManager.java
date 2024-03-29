package business;


import java.util.List;

import core.logging.Logger;
import dataAccess.ProductDao;
import entities.Courses;
import entities.Product;

public class CourseManager implements ProductManager{
	private ProductDao productDao;
	private Logger[] loggers;
	private List<Courses> courses;
	public CourseManager(ProductDao productDao, Logger[] loggers,List<Courses> courses) {
		this.productDao = productDao;
		this.loggers = loggers;
		this.courses = courses;
	}
	
	public void add(Courses course) throws Exception {
		
		if(course.getUnitPrice()<0) {
			throw new Exception("Ürün fiyatı 0 dan küçük olamaz");
		}
		for (Product course2 : courses) {
			if(!courses.isEmpty()) {
				if(course.getName().equals(course2.getName()))throw new Exception("Ürün isimleri tekrar edemez"); 
				if(course.getCategory().equals(course2.getCategory()))throw new Exception("Category tekrar edemez");

				
			}
		
		
		}
		
		productDao.add(course);
		for (Logger logger : loggers) { 
			logger.log(course.getName());
		
		}

	}
	
}
