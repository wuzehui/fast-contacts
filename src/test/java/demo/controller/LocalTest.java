package demo.controller;

import java.util.Date;

import org.junit.Test;


public class LocalTest {

	@Test
	public void test() {
		String a = "/dfjapdoif";
		String b = "dfjapdoif";
		String c = "\\dfjapdoif";
		System.err.println("a: " + this.format(a));
		System.err.println("b: " + this.format(b));
		System.err.println("c: " + this.format(c));
	}
	
	private String format(String url) {
		if (url.startsWith("/") || url.startsWith("\\")) {
			url = url.substring(1);
		}
		url = "/" + url;
		return url;
	}
	
	@Test
	public void testSubStr(){
		String a = "jsession=fjao";
		System.out.println(a.substring(a.indexOf("jsession=") + "jsession".length()));
	}

	@Test
	public void testDateTransfer(){
		String l = "1404782989000";
		Long lrt =  Long.parseLong(l);
		Date date = new Date(lrt);
		System.out.println(date);
	}
}
