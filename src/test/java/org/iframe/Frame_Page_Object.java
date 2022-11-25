package org.iframe;

import java.util.List;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Frame_Page_Object extends BaseClass {
	public Frame_Page_Object() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="click")
	private WebElement clickframe1;
	@FindBy(xpath="//*[@id='Click']")
	private WebElement nestedFrame;
	@FindBy(xpath="//*[@id='Click;]")
	private WebElement text1;
	@FindBy(tagName="iframe")
	private List<WebElement> frameCount;
	public WebElement getClickframe1() {
		return clickframe1;
	}
	public void setClickframe1(WebElement clickframe1) {
		this.clickframe1 = clickframe1;
	}
	public WebElement getNestedFrame() {
		return nestedFrame;
	}
	public void setNestedFrame(WebElement nestedFrame) {
		this.nestedFrame = nestedFrame;
	}
	public WebElement getText1() {
		return text1;
	}
	public void setText1(WebElement text1) {
		this.text1 = text1;
	}
	public List<WebElement> getFrameCount() {
		return frameCount;
	}
	public void setFrameCount(List<WebElement> frameCount) {
		this.frameCount = frameCount;
	}
	
}
