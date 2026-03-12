//http://localhost:9090/service/user//1001;
//http://localhost:9090/service/user//add/1009/codesquadz9/codesquadz9/abc9
package com.codesquadz;


import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.codesquadz.UserService;

import com.codesquadz.User;



@RestController

@RequestMapping("/service/user/")

public class SpringServiceController {
	
	
UserService userService=new UserService();
	     	    
	@RequestMapping(value = "/{id}", method = RequestMethod.GET,headers="Accept=application/json")
	
public User getUser(@PathVariable int id) 
{
		
User user=userService.getUserById(id);
		return user;
	
}
	
	@RequestMapping(value = "del/{id}", method = RequestMethod.GET,headers="Accept=application/json")
	
	public void delUser(@PathVariable int id) 
	{
			
	userService.deleteUser(id);
			
	}
@RequestMapping(value = "add/{id}/{name}/{last}/{mail}", method = RequestMethod.GET,headers="Accept=application/json")
	
	public void addUser(@PathVariable int id,@PathVariable String name,@PathVariable String last,@PathVariable String mail) 
	{
		User user=new User();
		 user.setUserid(id);
		 user.setFirstName(name);
		 user.setLastName(last);			
		 user.setEmail(mail);
	userService.addUser(user);
			
	}
	
@RequestMapping(method = RequestMethod.GET,headers="Accept=application/json")
	
public List<User> getAllUsers() {
		
List<User> users=userService.getAllUsers();
		return users;
	
}
	
	

}