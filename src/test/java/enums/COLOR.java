package enums;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

public enum COLOR {
    BlACK_TEXT("#000000", "rgb(0, 0, 0)","rgba(0, 0, 0, 1)"),
    WHITE_TEXT("#ffffff","rgb(255, 255, 255)", "rgba(255, 255, 255, 1)"),
    TEXT_GRAY_BACKROUND("#cccece", "rgb(204, 206, 206)", "rgba(204, 206, 206, 1)"),
    TEXT_GREEN_BACKROUND("#007385", "rgb(0, 115, 133)", "rgba(0, 115, 133, 1)"),
    TEXT_Yellow_BACKROUND("#FFDC28", "rgb(255, 220, 40)", "rgba(255, 220, 40, 0.15)"),

    BLOCK_TIME_COLOR("#000000","rgb(0, 0, 0)","rgba(0, 0, 0, 0.04)")

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

    public void assertTextColor(WebElement w){
        String actuelTextColor=w.getCssValue("color");
        Assert.assertEquals(this.getRGBA(),actuelTextColor);
    }
    public void assertBackroundColor(WebElement w){
        String actuelBackroundColor=w.getCssValue("background-color");
        Assert.assertEquals(this.getRGBA(),actuelBackroundColor);
    }

    public Boolean assertBackroundColorByBoolean (WebElement w){
        String actuelBackroundColor=w.getCssValue("background-color");
        return this.getRGBA().equals(actuelBackroundColor);
    }
}
