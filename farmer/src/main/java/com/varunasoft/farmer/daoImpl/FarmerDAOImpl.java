package com.varunasoft.farmer.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.varunasoft.farmer.HibernateUtil.HibernateUtil;
import com.varunasoft.farmer.dao.FarmerDAO;
import com.varunasoft.farmer.domain.FarmersDetails;

public class FarmerDAOImpl implements FarmerDAO {
	
	SessionFactory sessionFactory;

	public void saveFarmerDetail() {
       		
	}

	public FarmersDetails getFarmerDetail(String farmerId) {

		sessionFactory = HibernateUtil.getSessionFactory();
		Session session=sessionFactory.openSession();
		FarmersDetails farmersDetails=session.get(FarmersDetails.class, farmerId);
		return farmersDetails;
	}

	public List<FarmersDetails> AllFarmerDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateFarmerDetails() {
		// TODO Auto-generated method stub
		
	}

 
	

}
