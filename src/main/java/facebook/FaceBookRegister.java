package facebook;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FaceBookRegister {

	@RequestMapping(value="registerFacebook", method=RequestMethod.POST)
	public String saveUser(){
		System.out.println("Entered into Save user");
		System.out.println("divya changes");
		System.out.println("******Database saving code*****");
		System.out.println("venu changes...");
		System.out.println("Venu modificatons");
		return "success";
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
}
