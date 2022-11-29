package org.radiobuttons;

import org.baseclass.BaseClass;

public class RadioButtonEx {
	public static void main(String[] args) throws InterruptedException {
		BaseClass baseclass = new BaseClass();
		baseclass.launchBrowser();
		baseclass.launchUrl("https://www.leafground.com/radio.xhtml");
		// Your most favorite browser
		RadioButton_Page rbpage = new RadioButton_Page();
		rbpage.getFavorite().click();
		//UnSelectable
		rbpage.getUnSelectable().click();
		//Find the default select radio button
		baseclass.gettext(rbpage.getCheckSelected());
		System.out.println(baseclass.gettext(rbpage.getCheckSelected()));
	}
}
