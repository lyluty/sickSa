package sickSa.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import sickSa.domain._Product;
import sickSa.domain._ProductCategory;

@Repository
@Mapper
public interface _ProductDao {

	@Select("select * from PRODUCT_CATEGORIES order by PDCT_ID")
	List<_ProductCategory> selectProductCategoryList();
	
	@Select("select * from PRODUCTS where PDCT_ID = #{categoryId} order by PDT_ID")
	List<_Product> selectProductListByCategoryId(int categoryId);
	
	@Select("select * from PRODUCTS where PDT_ID = #{productId}")
	_Product selectProductByProductId(int productId);
}
