package com.facebook.Hdao;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

import com.facebook.pojos.User;

@Repository
public class HibernateDao {
	
	@Autowired
	private HibernateTemplate template;
	public String register(User user, Model model) {
		// SessionFactory sessionFactory = new AnnotationConfiguration().configure("hibernate.cfg.xml").buildSessionFactory(); 
	    //    Session session = sessionFactory.openSession(); 
	     //   session.beginTransaction();
	        if (user.getPassword().equals(user.getRepassword())) {
	        	System.out.println("passwords matched...");
	        	try{
	        		System.out.println("in dao: "+user.getJoinDate());
	        	user.setLocked(false);
		        user.setAttempts(0);
		        user.setRole(2);
		       /* SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/YYYY hh:mm:ss");
		        Date date = new Date();
				//String dateString=sdf.format(date);*/
				user.setJoinDate(new Date());
		        template.save(user); 
		        System.out.println("date: "+user.getJoinDate());
		        model.addAttribute("message","Registration Successfully completed!!");
		        return "success";	
	        	}catch(Exception e){
	        		e.printStackTrace();
	        	}
	        	
	        	}
	        model.addAttribute("message","password not matched...");
    		return "success";		        	
	        }
	}
