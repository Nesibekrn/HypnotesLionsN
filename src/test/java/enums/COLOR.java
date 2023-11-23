package enums;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import utilities.JS_utilities;
import utilities.ReusableMethods;

public enum COLOR {
    BlACK_TEXT("#000000", "rgb(0, 0, 0)", "rgba(0, 0, 0, 1)"),
    WHITE_TEXT("#ffffff", "rgb(255, 255, 255)", "rgba(255, 255, 255, 1)"),
    TEXT_GRAY_BACKROUND("#cccece", "rgb(204, 206, 206)", "rgba(204, 206, 206, 1)"),
    TEXT_GREEN_BACKROUND("#007385", "rgb(0, 115, 133)", "rgba(0, 115, 133, 1)"),

    BORDER_COLOR("#4aafba", "rgb(74, 175, 186)", "rgba(74, 175, 186, 1)"),
    BUTTON_GREEN_BACKROUND("#299cae","rgb(41, 156, 174)","rgba(41, 156, 174, 1)")


    ;
    private String HEX;
    private String RBG;
    private String RGBA;

    COLOR(String HEX, String RBG, String RGBA) {
        this.HEX = HEX;
        this.RBG = RBG;
        this.RGBA = RGBA;
    }

    public String getHEX() {
        return HEX;
    }

    public String getRBG() {
        return RBG;
    }

    public String getRGBA() {
        return RGBA;
    }

    public void assertTextColor(WebElement w) {
        String actuelTextColor = w.getCssValue("color");
        Assert.assertEquals(this.getRGBA(), actuelTextColor);
    }

    public void assertBackroundColor(WebElement w) {
        String actuelBackroundColor = w.getCssValue("background-color");
        Assert.assertEquals(this.getRGBA(), actuelBackroundColor);
    }

    public void assertBorderColor(WebElement w) {
        w.click();
        ReusableMethods.waitFor(1);
        String actuelColor = w.getCssValue("border-bottom-color");
        Assert.assertEquals(this.getRGBA(), actuelColor);

    }
}
