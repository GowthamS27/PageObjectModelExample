package org.iframe;

import org.baseclass.BaseClass;

public class iFrameEx extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		BaseClass baseclass = new BaseClass();
		baseclass.launchBrowser();
		baseclass.launchUrl("https://www.leafground.com/frame.xhtml");
		driver.switchTo().frame(0);
		Frame_Page_Object frame = new Frame_Page_Object();
		frame.getClickframe1().click();
        String text = frame.getClickframe1().getText();
        System.out.println(text);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");
		frame.getNestedFrame().click();
		String text1 = frame.getNestedFrame().getText();
		System.out.println(text1);
		driver.switchTo().defaultContent();
		int count = frame.getFrameCount().size();
		System.out.println("Total Number of Frames is :"+count);
	}
}
