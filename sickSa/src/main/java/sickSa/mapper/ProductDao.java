package sickSa.mapper;



import java.util.List;
import java.util.Map;


import sickSa.domain.Product;

public interface ProductDao {

	int insertProduct(Product product);
	int updateProduct(Product updateProduct);
	int deleteProductById(int pdt_id);
	Product findProductById(int pdt_id);
	List<Product> findAllProducts();
	List<Map> findAllProductsMap();
	List<Product> findProductsByCategoryId(int pdct_id);



}
