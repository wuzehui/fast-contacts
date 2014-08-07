//package com.chinadreamer.contacts.filter.springSecurity;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.HashMap;
//import java.util.Iterator;
//
//import javax.servlet.http.HttpServletRequest;
//
//import org.apache.log4j.Logger;
//import org.springframework.security.access.ConfigAttribute;
//import org.springframework.security.access.SecurityConfig;
//import org.springframework.security.web.FilterInvocation;
//import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
//
//public class SecurityMetadataSource implements
//		FilterInvocationSecurityMetadataSource {
//
//	private final static Logger LOGGER = Logger
//			.getLogger(SecurityMetadataSource.class);
//
//	private HashMap<String, Collection<ConfigAttribute>> resourceMap = new HashMap<String, Collection<ConfigAttribute>>();
//
//	/**
//	 * initialize resources associated to authority TODO implement with service
//	 * interface
//	 */
//	private void loadResourceDefine() {
//		Collection<ConfigAttribute> atts = new ArrayList<ConfigAttribute>(4);
//		ConfigAttribute ca = new SecurityConfig("ROLE_USER");
//        atts.add(ca);
//        resourceMap.put("/login.html", atts);
//        resourceMap.put("/view/homepage.html", atts);
//	}
//
//	public SecurityMetadataSource() {
//		this.loadResourceDefine();
//	}
//
//	@Override
//	public Collection<ConfigAttribute> getAllConfigAttributes() {
//		return null;
//	}
//
//	@Override
//	public Collection<ConfigAttribute> getAttributes(Object obj)
//			throws IllegalArgumentException {
//		LOGGER.info(obj);
//		HttpServletRequest request = ((FilterInvocation)obj).getHttpRequest();
//		AntPathRequestMatcher matcher = null;
//		String resUrl = null;
//		for (Iterator<String> iter = resourceMap.keySet().iterator();iter.hasNext();) {
//			resUrl = iter.next();
//			matcher = new AntPathRequestMatcher(resUrl);
//			if (null != resUrl && matcher.matches(request)) {
//				return resourceMap.get(resUrl);
//			}
//		}
//		return null;
//	}
//
//	@Override
//	public boolean supports(Class<?> arg0) {
//		// TODO Auto-generated method stub
//		return true;
//	}
//
//}
