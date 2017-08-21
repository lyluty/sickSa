package sickSa.dao;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import sickSa.domain.Product;

public class MapperInterfaceProductDaoMain {

   public static void main(String[] args) {
      System.out.println("------------ProductMapper Interface를 사용한Dao메쏘드호출-----------");
      System.out.println("-------application context[bean factory]초기화전------");
      ApplicationContext applicationContext=
            new ClassPathXmlApplicationContext("classpath:spring/application-config.xml");
      System.out.println("-------application context[bean factory]초기화후------");
      
      ProductDao productDao=(ProductDao)applicationContext.getBean("productDao");
            
      //System.out.println(productDao.insertProduct(new Product(1,"스시",15000,"7","8","1",2222)));
      //System.out.println(productDao.insertProduct(new Product(2,"돈까스",7000,"1","1","1",1111)));
      //System.out.println(productDao.insertProduct(new Product(3,"카레",6000,"2","2","2",3333)));
      //System.out.println(productDao.insertProduct(new Product(4,"규동",7000,"3","3","3",4444)));
      //System.out.println(productDao.insertProduct(new Product(5,"함바그",20000,"3","3","3",5555)));
      //System.out.println(productDao.insertProduct(new Product(6,"소바",7600,"3","3","3",6666)));
      //Product p=productDao.findProductById(3333)  ;
      //System.out.println(p);
      //Product updateProduct=new Product(1111, "소딱",12345, "6","6","6",3333);
      //int updateRowCount=productDao.updateProduct(updateProduct);
      //System.out.println("updateRowCount:"+updateRowCount);
      //System.out.println(productDao.findAllProductsMap());
      System.out.println(productDao.findAllProducts());
      //System.out.println(productDao.deleteProductById(3333));
      
   }

}