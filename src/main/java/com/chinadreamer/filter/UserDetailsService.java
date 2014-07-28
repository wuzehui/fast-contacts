package com.chinadreamer.filter;

import java.util.ArrayList;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService{

	@Override
	public UserDetails loadUserByUsername(String arg0)
			throws UsernameNotFoundException {
		//TODO implements with service interface
		ArrayList<GrantedAuthority> array = new ArrayList<GrantedAuthority>();  
        GrantedAuthority ga = new SimpleGrantedAuthority("a1");  
        array.add(ga);  
          
        return new User("admin", "8ae29a58361c8b3ec237ae8419df7e58", true, true, true, true, array);  
	}

}
