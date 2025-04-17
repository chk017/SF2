    package com.Diyar.Selenium.Framework.Lib;

import com.Diyar.Selenium.Browser.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectBox extends Select {
   private static String locator = null;
   private static Browser browser = new Browser();

   public SelectBox(String element) {
	   
      // super(browser.getDriver().findElement(By.xpath(element)));
      
      System.out.println("element : "+ element);
   //   System.out.println("browser.getDriver().findElement(By.xpath(element)) : " + browser.getDriver().findElement(By.xpath(element))); 
      
      locator = element;
   }

   public WebElement getElement() {
	    System.out.println("get element : "+ locator);
	      System.out.println(" get web elem : " + browser.getDriver().findElement(By.xpath(locator)));

      return browser.getDriver().findElement(By.xpath(locator));
   }

   public String locator() {
      return locator;
   }
}





/*
 * package com.Diyar.Selenium.Framework.Lib;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebElement; import
 * org.openqa.selenium.support.ui.Select;
 * 
 * 
 * 
 * public class SelectBox extends Select{ //public class SelectBox {
 * 
 * // protected WebDriver driver = BaseTest.driver; private static String
 * locator = null; // private static BaseTest basetest = new BaseTest(); //
 * private Browser browser = new Browser(); protected static FrameLib frameLib =
 * new FrameLib();
 * 
 * // public SelectBox(WebElement element) { public SelectBox(String element) {
 * 
 * // super(browser.getDriver().findElement(By.xpath(element)));
 * super(frameLib.getDriver().findElement(By.xpath(element))); // new
 * Select(browser.getDriver().findElement(By.xpath(element)));
 * 
 * 
 * // locator = element; }
 * 
 * 
 * 
 * // new
 * Select(getDriver().findElement(By.xpath(ActivityPage.ActivityType.getElement(
 * ))));
 * 
 * 
 * 
 * 
 * public SelectBox(WebElement webElem) {
 * 
 * super(browser.getDriver().findElement(By.xpath(locator))); }
 * 
 * 
 * 
 * public SelectBox(String element, SimpleLib.Type type) {
 * super(SimpleLib.getWebElement(element, type)); locator = element; }
 * 
 * 
 * public WebElement getWebElement() { // return
 * basetest.getDriver().findElement(By.xpath(locator)); // return
 * browser.getDriver().findElement(By.xpath(locator)); return
 * frameLib.getDriver().findElement(By.xpath(locator));
 * 
 * }
 * 
 * public String getElement() { return locator; }
 * 
 * 
 * public String locator() { return locator; }
 * 
 * 
 * }
 */