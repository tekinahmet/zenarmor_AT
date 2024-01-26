package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PoliciesPage {
    public PoliciesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//span[.='Policies']")
    public WebElement policies;

    @FindBy (xpath = "//button[.=' Create New Policy ']")
    public WebElement createNewPolicy;
    @FindBy (xpath = "//div[2]/div/div/input")
    public WebElement policyName;
    @FindBy (xpath = "//span[.='Create']")
    public WebElement createButton;

    @FindBy (xpath = "//a[.='ahmet']")
    public WebElement clickOnPolicyName;

    @FindBy (xpath = "//button[.=' Add IP / Network ']")
    public WebElement addIP;

    @FindBy (xpath = "//input[@placeholder='IP / Network address']")
    public WebElement enterIP;
    @FindBy (xpath = "//textarea[@placeholder='Description']")
    public WebElement enterIPV4Desc;

    @FindBy (xpath = "//button[.=' Submit ']")
    public WebElement submitButton;

    @FindBy (xpath = "//button[.=' Add MAC Address ']")
    public WebElement macAddress;

    @FindBy (xpath = "//input[@placeholder='MAC address']")
    public WebElement enterMac;

    @FindBy (xpath = "//textarea[@placeholder='Description']")
    public WebElement enterMacDesc;

    @FindBy (xpath = "//button[.=' Add New Schedule ']")
    public WebElement timeSchedule;

    @FindBy (xpath = "(//input[@class='el-input__inner'])[2]")
    public WebElement timeScheduleName;
    @FindBy (xpath = "//span[.='Add']")
    public WebElement addButton;

    @FindBy (xpath = "//span[.='Mon']")
    public WebElement selectDay;

    @FindBy (xpath = "//div[4]/div/label/span/div")
    public WebElement enablePolicy;

    @FindBy (xpath = "//button[@class='svn-button circle danger']")
    public WebElement deletePolicy;

}
