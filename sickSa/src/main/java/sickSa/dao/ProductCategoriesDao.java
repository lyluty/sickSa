package sickSa.dao;

import java.util.List;

import sickSa.domain.ProductCategories;

/*
**********************************
* Table Name: 상품카테고리 *
/**********************************
CREATE TABLE PRODUCT_CATEGORIES(
		PDCT_ID                       		NUMBER(6)		 NULL ,
		PDCT_NAME                     		VARCHAR2(20)		 NOT NULL
);

COMMENT ON TABLE PRODUCT_CATEGORIES is '상품카테고리';
COMMENT ON COLUMN PRODUCT_CATEGORIES.PDCT_ID is '상품카테고리번호';
COMMENT ON COLUMN PRODUCT_CATEGORIES.PDCT_NAME is '상품카테고리명';


ALTER TABLE PRODUCT_CATEGORIES ADD CONSTRAINT IDX_PRODUCT_CATEGORIES_PK PRIMARY KEY (PDCT_ID);
*/
public interface ProductCategoriesDao {
	public List<ProductCategories> selectAllProductCategories();
	public ProductCategories selectProductCategoriesById(Integer pdct_id);
}
