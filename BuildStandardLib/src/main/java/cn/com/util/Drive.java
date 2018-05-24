package cn.com.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Drive {
	private static WebDriver driver=null;
	private static FirefoxProfile profile = null;
	public static WebDriver  webdriver(){
		System.setProperty("webdriver.firefox.bin","E:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		ProfilesIni allprofiles = new ProfilesIni();
		FirefoxProfile profile = allprofiles.getProfile("default");
		profile.setPreference("network.proxy.type", 1);
		
		profile.setPreference("network.proxy.share_proxy_settings", true);
		profile.setPreference("general.useragent.override", "Mozilla/5.0 (X11; Linux x86_64; rv:2.0b9pre) Gecko/20110111 Firefox/4.0b9pre");
		WebDriver driver = new FirefoxDriver(profile);
		return driver;
	}
}
