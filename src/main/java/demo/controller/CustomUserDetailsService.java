package demo.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailsService implements UserDetailsService{

	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		UserDetails user = new User(username, username, true, true, true, true,
				getAuthorities(username));
		return user;
	}

	public Collection<GrantedAuthority> getAuthorities(String username) {  
		  
        List<GrantedAuthority> authList = new ArrayList<GrantedAuthority>(2);  
  
        // 所有的用户默认拥有ROLE_USER权限  
        if (!username.equals("admin")) {
        	authList.add(new GrantedAuthorityImpl("ROLE_USER"));  
		}else {
			authList.add(new GrantedAuthorityImpl("ROLE_ADMIN"));  
		}
  
        return authList;  
    }  
}
