package sickSa.dao;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sickSa.domain.Product;
import sickSa.domain.ProductCategories;

public class MapperInterfaceProductCategoriesDaoMain {

	public static void main(String[] args) {
		
	      System.out.println("------------ProductCategoriesMapper Interface를 사용한Dao메쏘드호출-----------");
	      System.out.println("-------application context[bean factory]초기화전------");
	      ApplicationContext applicationContext=
	            new ClassPathXmlApplicationContext("classpath:spring/application-config.xml");
	      System.out.println("-------application context[bean factory]초기화후------");
	      
	      ProductCategoriesDao productCategoriesDao=(ProductCategoriesDao)applicationContext.getBean("productCategoriesDao");
	            
	      //System.out.println(productCategoriesDao.insertCategories(new ProductCategories(1,"육류")));
	      //System.out.println(productCategoriesDao.insertCategories(new ProductCategories(2,"어류")));
	      //System.out.println(productCategoriesDao.insertCategories(new ProductCategories(3,"채소류")));
	      //System.out.println(productCategoriesDao.insertCategories(new ProductCategories(4,"야체류")));

	      
	      //ProductCategories updateCategories = new ProductCategories(4,"야채류");
	      //int updateRowCount = productCategoriesDao.updateCategories(updateCategories);
	      //System.out.println("updateRowCount:"+ updateRowCount);
	      
	      System.out.println(productCategoriesDao.selectAllProductCategories());
	   }

	}