package dataAccess;

import entities.Product;

public class HibernateProduct implements ProductDao{
	@Override
	public void add(Product product) {
		// TODO Auto-generated method stub
		System.out.println(product.getName() + " " + "Hibernate ile eklendi");
	}
}
