package com.LiMing.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.LiMing.dao.article_moreDao;
import com.LiMing.entity.article_more;
import com.LiMing.util.DBManager;
import com.mysql.jdbc.ResultSet;



public class article_moreDaoImpl implements article_moreDao{

	public List<article_more> queryarticle_mores() {
		List<article_more> artm = new ArrayList<article_more>();
		ResultSet re = DBManager.querySQL("SELECT * FROM dengdb.xinwen_zixun_neirong;");
		try {
			while (re.next()) {
				article_more am = new article_more();
				am.setId(re.getInt(1));
				am.setNeirong(re.getString(2));
				am.setName(re.getString(3));
				am.setTime(re.getString(4));
				artm.add(am);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return artm;
	}

}