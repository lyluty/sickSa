package sickSa.service;

import java.util.List;
import java.util.Map;

import sickSa.domain.Product;
import sickSa.domain.ProductCategories;

public interface ProductService {

	int insertProduct(Product product);
	List<Map> getProductList();
	List<Product> getAllProductList();
	List<Product> getAllCategoryProductList(Integer pdct_id);
	public List<ProductCategories> getAllCategories();
	Product getProductById(Integer pdt_id);
	int updateProductById(Product product);
	int deleteProductById(Integer pdt_id);

	
	
}
