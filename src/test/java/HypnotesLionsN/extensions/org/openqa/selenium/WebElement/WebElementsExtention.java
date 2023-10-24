package HypnotesLionsN.extensions.org.openqa.selenium.WebElement;

import manifold.ext.rt.api.Extension;
import manifold.ext.rt.api.This;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utilities.Driver;

import static stepDefinitions.Hooks.driver;

@Extension
public class WebElementsExtention {


  public static void assertTextColor(@This WebElement w, String expectedColor){
    String actuelTextColor=w.getCssValue("color");
    Assert.assertEquals(expectedColor,actuelTextColor);
  }

  public static void assertBackroundColor(@This WebElement w, String expectedColor){
    String actuelBackroundColor=w.getCssValue("background-color");
    Assert.assertEquals(expectedColor,actuelBackroundColor);
  }

  public static void scrollIntoViewJS(@This WebElement element) {
    JavascriptExecutor jsexecutor = ((JavascriptExecutor) driver);
    jsexecutor.executeScript("arguments[0].scrollIntoView(true);", element);
  }

}