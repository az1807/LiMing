package com.LiMing.dao;

import java.util.List;

import com.LiMing.entity.article;

public interface articleDao {
	/**
	 * 查询新闻列表
	 * @return
	 */
List<article> queryarticles();
}
