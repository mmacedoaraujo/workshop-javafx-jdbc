package model.dao;

import db.DbConnector;
import model.dao.impl.DepartmentDaoJdbc;
import model.dao.impl.SellerDaoJdbc;

public class DaoFactory {

	public static SellerDao createSellerDAO() {
		return new SellerDaoJdbc(DbConnector.getConnection());
	}
	
	public static DepartmentDao createDepartmentDao() {
		return new DepartmentDaoJdbc(DbConnector.getConnection());
	}
}
