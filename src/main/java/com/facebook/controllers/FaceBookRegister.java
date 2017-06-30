package com.facebook.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.facebook.Hdao.HibernateDao;
import com.facebook.pojos.User;


@Controller
public class FaceBookRegister {
	
	@Autowired
	private HibernateDao dao;

	@RequestMapping(value="registerFacebook", method=RequestMethod.POST)
	public String saveUser(User user,Model model){
		/*System.out.println("iam in controller");
		System.out.println("Entered into Save user");
		System.out.println("divya changes");
		System.out.println("******Database saving code*****");
		System.out.println("venu changes...");
		System.out.println("Venu modificatons");*/
		
		
		String response = dao.register(user, model);
		return response;
		

	}
	@RequestMapping(value="deleteIt", method=RequestMethod.POST)
	public String deleteUser(){
		System.out.println("Entered into delete User");
		return"deletesuccess";
	}
	
	@RequestMapping(value="heloUpdateIt", method= RequestMethod.POST)
	public String updateUser(){
		System.out.println("Update Logic!!");
		return "myfile";
	}
	
	public void registerUser(){
		System.out.println("Registration is done");
	}
	
	public String loginFlow(){
		System.out.println("Login flow implemented");
		System.out.println("Name validations");
		System.out.println("mobile validation");
		return "showProfiles";
	}
}
