package model.services;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class SellerService {
	
	private SellerDao dao = DaoFactory.createSellerDAO();
	
	public List<Seller> findAll() {
		return dao.findAll();
	}
	
	public void insert(Seller seller) {
		dao.insert(seller);
	}
}
