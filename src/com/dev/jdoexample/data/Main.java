package com.dev.jdoexample.data;

import java.util.Date;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Transaction;

public class Main {

	public static void main(String[] args) {
		Data d = new Data(10, "adsf", new Date());
		makePersistent(d);

	}

	
	public static void makePersistent(Data data){
		PersistenceManagerFactory pmf = JDOHelper.getPersistenceManagerFactory("datanucleus.properties");
		PersistenceManager pm = pmf.getPersistenceManager();
		
		Transaction tx = pm.currentTransaction();
		try{
			tx.begin();
			
			pm.makePersistent(data);
			
			tx.commit();
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			if (tx.isActive())
		    {
		        tx.rollback();
		    }
		    pm.close();
		}
	}
}
