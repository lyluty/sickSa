package sickSa.service;

import java.util.List;
import java.util.Map;

import sickSa.domain.Product;

public interface ProductService {

	List<Map> getProductList();
	Product getProductById(Integer pdt_id);
	int deleteProductById(Integer pdt_id);
	int updateProductById(Product product);
	int insertProduct(Product product);

	
	
}
