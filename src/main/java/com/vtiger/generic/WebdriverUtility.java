package com.vtiger.generic;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverUtility {
	/**
	 * maximize the browser window
	 */
	
	public void maximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	/**
	 * wait until the page is loaded
	 */

	public void implicitwait(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(AutoConstants.implicittime, TimeUnit.SECONDS);
	}
	/**
	 * wait until the element is clicked
	 * @param driver
	 * @param element
	 */
	
	public void elementsclickable(WebDriver driver,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,AutoConstants.explicitwaittime);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	
	/**
	 * select element from dd by visibletext
	 * 
	 */
	
	
	public void selectdropdownbyvisibletext(WebElement element,String visibletext)
	{
		Select select=new Select(element);
		select.selectByVisibleText(visibletext);
		
	}
	/**
	 * 
	 * 
	 * select element by index
	 * @param element
	 * @param index
	 */
	
	public void selectdropdownbyindex(WebElement element,int index)
	{
		Select select=new Select(element);
		select.selectByIndex(index);
	}
	
	public void selectdropdownbyvalue(WebElement element,String value)
	{
		Select select=new Select(element);
		select.selectByValue(value);
	}
	
	public void moveToelement(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}
	/**
	 * drag and drop
	 * 
	 * @param driver
	 * @param src
	 * @param dest
	 */
	
	public void draganddrop(WebDriver driver,WebElement src,WebElement dest)
	{
		Actions act=new Actions(driver);
		act.dragAndDrop(src, dest).perform();
	}
	/**
	 * 
	 * Refresh the page
	 * @param driver
	 */
	
	public void refresh(WebDriver driver)
	{
		driver.navigate().refresh();
	}
	
	/**
	 * Switch frame by index
	 * @param index
	 */
	
	public void switchframe(WebDriver driver,int index)
	{
		driver.switchTo().frame(index);
	}
	/**
	 * Switch frame by element
	 * @param element
	 */
	
	public void switchframe(WebDriver driver,WebElement frameelement)
	{
		driver.switchTo().frame(frameelement);
	}
	/**
	 * Switch frame by nameorid
	 * @param nameorid
	 */
	
	
	public void switchframe(WebDriver driver,String nameorid)
	{
		driver.switchTo().frame(nameorid);
	}
	
	
	/**
	 * 
	 * switch to window
	 * 
	 */
	public void switchToWindow(WebDriver driver,String exptitle)
	{
		Set<String> set = driver.getWindowHandles();
		
		Iterator<String> it = set.iterator();
		while(it.hasNext())
		{
			String winid=it.next();//method in iterator interface used to access the element and moves cursor to next element
			driver.switchTo().window(winid);
			String atitle=driver.getTitle();
			if(atitle.contains(exptitle))
			{
				break;
			}
			
		}
			
		}
	}





	
	
	

