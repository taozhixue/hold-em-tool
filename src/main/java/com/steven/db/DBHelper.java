package com.steven.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class DBHelper {

	public static Map<String,String> getConntent(String names,String CPID,String BitRateID){
		Map<String,String> contentMap = new HashMap<String, String>();
		try{
			String mysqlUrl = "jdbc:mysql://rds85bb7dchb84478m12o.mysql.rds.aliyuncs.com:3306/ottdb?useUnicode=true&characterEncoding=UTF-8";
			String mysqlUserName = "ropukka";
			String mysqlPassWord = "Ropukka!@#";
			Connection con = getConnection(mysqlUrl, mysqlUserName, mysqlPassWord);
			String sql = "SELECT CPContentID,CONCAT('http://vstore.oss-cn-shanghai.aliyuncs.com/',PlayUrl) from t_movie "
					+ " where   BitRateID="+BitRateID+" and PlayUrl is not null and  PlayUrl!='' and "
					+ " ResourceID in ("
					+ " SELECT id from t_resource "
					+ " where `Name` in ( "+names+" ) and CPID="+CPID+" )";
			System.out.println("sql : " +sql);
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				String name = rs.getString(1).toString();
				String url = rs.getString(2).toString();
				contentMap.put(name, url);
			}
			System.out.println("查询完毕"+contentMap.size());
		}catch(Exception e){
			e.printStackTrace();
		}
		return contentMap;
	}

	private static Connection getConnection(String mysqlUrl, String mysqlUserName, String mysqlPassWord)
			throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		return DriverManager.getConnection(mysqlUrl, mysqlUserName, mysqlPassWord);
	}

}
