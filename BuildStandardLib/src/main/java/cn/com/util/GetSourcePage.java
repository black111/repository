package cn.com.util;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
public class GetSourcePage {
	private static WebDriver driver=null;
	private static FirefoxProfile profile = null;

	public  String getHtml(String url){
		String proxyIp = "180.97.235.30";//代理ip
		int proxyPort = 80;//ip端口
		
//		File pathToFirefoxBinary = new File("E:/Firefox/firefox.exe");
//        FirefoxBinary firefoxbin = new FirefoxBinary(pathToFirefoxBinary);
//        driver=new FirefoxDriver(firefoxbin,null);
		driver=new FirefoxDriver();
		driver.get(url);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String html = driver.getPageSource();
		driver.close();
		return html;
	}
//	public static void main(String[] args) {
//		new GetSourcePage().getHtml("http://hotels.ctrip.com/hotel/shanghai2#ctm_ref=ctr_hp_sb_lst");
//	}
}
