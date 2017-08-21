package sickSa.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import sickSa.dao.ProductDao;
import sickSa.domain.Product;
import sickSa.domain.ProductIngredients;
import sickSa.mapper.ProductIngredientMapper;

public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDao productDao;
	@Autowired
	private ProductIngredientMapper productIngredientMapper;

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}
	
	public void setProductIngredientMapper(
			ProductIngredientMapper productIngredientMapper) {
		this.productIngredientMapper = productIngredientMapper;
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

	@Override
	public ProductIngredients passAmount(Integer PDT_ID) {
		return productIngredientMapper.passAmount(PDT_ID);
	}

}
