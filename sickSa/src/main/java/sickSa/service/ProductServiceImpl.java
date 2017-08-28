package sickSa.service;

import java.util.List;
import java.util.Map;

import sickSa.dao.ProductCategoriesDao;
import sickSa.dao.ProductDao;
import sickSa.domain.Product;
import sickSa.domain.ProductCategories;

public class ProductServiceImpl implements ProductService {

	private ProductDao productDao;
	private ProductCategoriesDao productCategoriesDao;

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}
	
	public void setProductCategoriesDao(ProductCategoriesDao productCategoriesDao) {
		this.productCategoriesDao = productCategoriesDao;
	}
	
	@Override
	public List<Map> getProductList() {
		return productDao.findAllProductsMap();
	}
	@Override
	public List<Product> getAllProductList(){
		return productDao.findAllProducts();
	}
	@Override
	public List<Product> getAllCategoryProductList(Integer pdt_id) {
		return productDao.findProductsByCategoryId(pdt_id);
	}
	public List<ProductCategories> getAllCategories() {
		return productCategoriesDao.selectAllProductCategories();
	}
	@Override
	public Product getProductById(Integer pdt_id) {
		return productDao.findProductById(pdt_id);

	}
	
	@Override
	public int deleteProductById(Integer pdt_id){
		return productDao.deleteProductById(pdt_id);
	}
	
	@Override
	public int updateProductById(Product product){
		return productDao.updateProduct(product);//product 객체 
		 
	}
	
	@Override
	public int insertProduct(Product product){
		return productDao.insertProduct(product); 
	}

	


}
