package com.LiMing.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.LiMing.dao.articleDao;
import com.LiMing.entity.article;
import com.LiMing.util.DBManager;


public class articleDaoImpl implements articleDao{

	public List<article> queryarticles() {
		List<article> art = new ArrayList<article>();
		ResultSet re = DBManager.querySQL("SELECT * FROM dengdb.xinwen_zixun;");
		try {
			while (re.next()) {
				article ac = new article();
				ac.setId(re.getInt(1));
				ac.setName(re.getString(2));
				art.add(ac);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return art;
	}

}
