package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;

import nLayeredDemo.business.concretes.ProductManager;

import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entites.concretes.Product;


public class Main {

	public static void main(String[] args) {
			
			ProductService productService = new ProductManager(new HibernateProductDao());
			productService.add(new Product(1,2,"Orange",22,55));
			
	}

}
