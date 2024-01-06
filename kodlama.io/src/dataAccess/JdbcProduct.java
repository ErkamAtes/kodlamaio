package dataAccess;

import entities.Product;

public class JdbcProduct implements ProductDao{

	@Override
	public void add(Product product) {
		// TODO Auto-generated method stub
		System.out.println(product.getName() + " " + "JDBC ile eklendi");
	}

}
