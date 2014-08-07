//package com.chinadreamer.contacts.filter.springSecurity;
//
//import java.util.Collection;
//import java.util.Iterator;
//
//import org.apache.log4j.Logger;
//import org.springframework.security.access.AccessDeniedException;
//import org.springframework.security.access.ConfigAttribute;
//import org.springframework.security.authentication.InsufficientAuthenticationException;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.GrantedAuthority;
//
//public class AccessDecisionManager implements com.chinadreamer.contacts.filter.springSecurity.security.access.AccessDecisionManager{
//	private final static Logger LOGGER = Logger.getLogger(AccessDecisionManager.class);
//
//	@Override
//	public void decide(Authentication authentication, Object object,
//			Collection<ConfigAttribute> configAttributes)
//			throws AccessDeniedException, InsufficientAuthenticationException {
//		LOGGER.info("AccessDecisionManager.decide");
//		if (null == configAttributes || configAttributes.size() <= 0) {
//			return;
//		}
//		ConfigAttribute cfg = null;
//		String needRole = null;
//		for (Iterator<ConfigAttribute> iterator = configAttributes.iterator(); iterator.hasNext();) {
//			cfg = iterator.next();
//			needRole = cfg.getAttribute();
//			LOGGER.info("resource access privilege:" + needRole);
//			for (GrantedAuthority ga : authentication.getAuthorities()) {
//				if (needRole.trim().equals(ga.getAuthority())) {
//					return;
//				}
//			}
//		}
//		
//		throw new AccessDeniedException("this user has no privilege");
//	}
//
//	@Override
//	public boolean supports(ConfigAttribute attribute) {
//		return true;
//	}
//
//	@Override
//	public boolean supports(Class<?> clazz) {
//		return true;
//	}
//}
