package com.chinadreamer.contacts.filter.shiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;

import com.chinadreamer.contacts.sys.user.entity.User;

public class ShiroUtils {
	public static boolean checkUserOnline(String sessionId){
        SecurityManager securityManager = SecurityUtils.getSecurityManager();
        Subject subject = new Subject.Builder(securityManager).sessionId(sessionId).buildSubject();
        if(subject != null && subject.isAuthenticated()){
            return true;
        }
        return false;
    }
	
	public static User getUser(){
        Object principal = SecurityUtils.getSubject().getPrincipal();
        if(principal instanceof  User){
            return (User)principal;
        }
        return null;
    }
}
