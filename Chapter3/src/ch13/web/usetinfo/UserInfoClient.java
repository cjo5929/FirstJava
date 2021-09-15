package ch13.web.usetinfo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserInfoDao;
import ch13.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import ch13.domain.userinfo.dao.oracle.UserInfoOracleDao;

//�������̽� db ���� ���� 
public class UserInfoClient {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("db.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		String dbType = prop.getProperty("DBTYPE");
		
		UserInfo userInfo = new UserInfo();
		userInfo.setUserID("asd123");
		userInfo.setPassWord("123456");
		userInfo.setUserName("Kim");
		
		UserInfoDao userInfoDao = null;
		
		if( dbType.equals("ORACLE")) {
			userInfoDao = new UserInfoOracleDao();
		}else if (dbType.equals("MYSQL")) {
			userInfoDao = new UserInfoMySqlDao();
		}else {
			System.out.println("Error");
			return;
		}
		
		userInfoDao.insertUserInfo(userInfo);
		userInfoDao.updateUserInfo(userInfo);
		userInfoDao.deleteUserInfo(userInfo);
	}

}
