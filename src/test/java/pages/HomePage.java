package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h5[.='HA']")
    public WebElement project;

    @FindBy(xpath = "//div[.=' Engine ']")
    public WebElement engine;

    @FindBy(xpath = "//a[.='Restart']")
    public WebElement restart;

    @FindBy(xpath = "//span[.='Restart']")
    public WebElement warningRestart;

    @FindBy(xpath = "(//a[@class='value'])[1]")
    public WebElement threatCounter;

    @FindBy(xpath = "//*[@id=\"page-content\"]/div/div/div[2]/div[2]/div/table/tbody")
    public WebElement targetList;

    @FindBy(xpath = "//div[@class='lse-results']")
    public WebElement resultList;

    @FindBy(xpath = "(//tr[@class='lse-table-tr'])[3]")
    public WebElement resultList2;

}
