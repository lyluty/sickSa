package sickSa.service;

import java.util.List;
import java.util.Map;

import sickSa.domain.Product;

public interface ProductService {

	int insertProduct(Product product);
	List<Map> getProductList();
	List<Product> getAllProductList();
	Product getProductById(Integer pdt_id);
	int updateProductById(Product product);
	int deleteProductById(Integer pdt_id);

	
	
}
