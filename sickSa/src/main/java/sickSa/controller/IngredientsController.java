package sickSa.controller;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import sickSa.dao.IngredientsDao;

@Controller
public class IngredientsController {
	
	@Autowired
	private SqlSession sqlSession;
	 
	@RequestMapping("/test/mybatis/{userId}")
	public String testMybatis(@PathVariable("userId") String userId) {
	    return "";
	}
	
	
}
