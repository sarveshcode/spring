package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @Autowired
    UserRepository userRepository;

	@RequestMapping("/")
	@ResponseBody
	public String hello() {
        System.out.println("-->> hit hello page");
        return "Hello Page";
	}

	@RequestMapping("/add")
	@ResponseBody
	public String addNewUser(@RequestParam String name, @RequestParam String email) {
		System.out.println("-->> hit add user page");

		User user = new User();
		user.setName(name);
		user.setEmail(email);
		userRepository.save(user);

		return "Saved "+user;
	}

	@RequestMapping("/all")
    @ResponseBody
	public Iterable<User> getAllUsers() {
        System.out.println("-->> hit get all users page");
        return userRepository.findAll();
    }
}