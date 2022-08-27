package com.qa.guru99.config;

public class Configpop {
	private static  String url;
	private static  String browser;
	
	public static String getBrowser() {
		return browser;
	}

	public static void setBrowser(String browser) {
		Configpop.browser = browser;
	}

	public static void setUrl(String strurl) {
		url=strurl;
	}
	
	public static String getUrl() {
		return url;
	}
	


}
