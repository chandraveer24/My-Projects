package com.PA.Queries;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.PA.Pojo.Inheritance.Single.*;
import com.PA.util.HibernateUtil;

public class CdMain {

	public static void main(String[] args) {

//		CD cd=new CD();
//		cd.setPurchaseDate(new Date());
//		cd.setArtist("Jazz");
//		cd.setTitle("Chain smokers");
		
//		InernationalCD cd=new InernationalCD();
//		cd.setArtist("Dj");
//		cd.setCountry("USA");
//		cd.setPurchaseDate(new Date());
//		cd.setTitle("Snake");
		
		SpecificRegionCD cd=new SpecificRegionCD();
		cd.setArtist("Some");
		cd.setFeatures("Mass");
		cd.setPurchaseDate(new Date());
		cd.setTitle("DSP");
		
		SessionFactory sf=HibernateUtil.sessionFactory;
		Session s=sf.openSession();
		
		s.beginTransaction();
		s.save(cd);
		s.flush();
		s.close();
		sf.close();
		
	}

}
