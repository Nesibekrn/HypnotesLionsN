package HypnotesLionsN.extensions.org.openqa.selenium.WebElement;

import manifold.ext.rt.api.Extension;
import manifold.ext.rt.api.This;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static stepDefinitions.Hooks.actions;
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
  public static void hoverWebElement(@This WebElement element ){
    actions.moveToElement(element).build().perform();
  }

  /**
   * This method is used to find the play or stop moment of a video or audio.
   * @param w Web element:a play button (for video or audio).
   * @return Double
   * @author gul yalcin
   * @since 09.11.2023
   */
  public static Double getCurrentTime (@This WebElement w){
    String time=w.getAttribute("currentTime");
    return Double.parseDouble(time);
  }

}