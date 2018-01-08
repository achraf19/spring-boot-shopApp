package HF.Project.ShopApp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import HF.Project.ShopApp.Repository.UserRepository;
import HF.Project.ShopApp.Model.User;


@RestController
public class UserController {
	
	@Autowired
	UserRepository userRepo;
	
	@RequestMapping("/hi")
	public String HiMethod() {
		return "hi from Morocco";
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "/user/getAll", method = RequestMethod.GET)
	public List<User> getAllUsers(){
		return userRepo.findAll();
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/signup")
	public User SignUpUser(@RequestBody User user) {
		
		return userRepo.insert(user);
	}
	
	
	
}
