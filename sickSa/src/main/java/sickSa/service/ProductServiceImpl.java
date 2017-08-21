package sickSa.service;

import java.util.List;
import java.util.Map;

import sickSa.dao.ProductDao;
import sickSa.domain.Product;
import sickSa.domain.ProductIngredients;

public class ProductServiceImpl implements ProductService {

	private ProductDao productDao;

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

	@Override
	public List<Map> getProductList() {
		return productDao.findAllProductsMap();
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
