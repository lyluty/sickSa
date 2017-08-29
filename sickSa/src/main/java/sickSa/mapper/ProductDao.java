package sickSa.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import sickSa.domain.Product;
import sickSa.domain.ProductCategory;

@Repository
@Mapper
public interface ProductDao {

	@Select("select * from PRODUCT_CATEGORIES order by PDCT_ID")
	List<ProductCategory> selectProductCategoryList();
	
	@Select("select * from PRODUCTS where PDCT_ID = #{categoryId} order by PDT_ID")
	List<Product> selectProductListByCategoryId(int categoryId);
	
	@Select("select * from PRODUCTS where PDT_ID = #{productId}")
	Product selectProductByProductId(int productId);
}
