package com.ojas.serviceLayer;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.ojas.dao.UserRepositery;

public class MyUserDetails  implements UserDetailsService{
	@Autowired
	private UserRepositery repo;
	

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = repo.findbyUsername(username);
				if(user == null) 
					throw new UsernameNotFoundException(" user 404");
				
				return new UserPricipal(user);
	

}
}
