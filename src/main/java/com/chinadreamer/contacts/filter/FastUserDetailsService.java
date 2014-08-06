package com.chinadreamer.contacts.filter;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.chinadreamer.contacts.user.dao.UserDao;

public class FastUserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService{
	
	@Resource(name = "userDao")
	private UserDao userDao;

	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		com.chinadreamer.contacts.user.dto.User user = this.userDao.findByUsername(username);
		if (null == user) {
			throw new UsernameNotFoundException("User:" + username + " not exists!");
		}
		Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();  
        
		authorities.add(new SimpleGrantedAuthority("ROLE_USER"));   
		return new User(user.getUsername(), user.getPassword(),true,true,true,true, authorities);  
	}

}
