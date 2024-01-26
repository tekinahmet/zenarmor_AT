package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SettingsPage {
    public SettingsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//span[.='Settings']")
    public WebElement settings;

    @FindBy (xpath = "//a[.=' Scheduled Reports '] ")
    public WebElement scheduledReports;
    @FindBy (xpath = "//button[.=' Disabled ']")
    public WebElement disabled;
    @FindBy (xpath = "//button[.=' Enabled '] ")
    public WebElement enabled;
    @FindBy (xpath = "//select[@id='provider'] ")
    public WebElement mailProvider;
    @FindBy (xpath = "//button[.=' Add Recipient '] ")
    public WebElement addParticipant;
    @FindBy (xpath = "//input[@id='name']")
    public WebElement name;
    @FindBy (xpath = "//input[@id='email']")
    public WebElement email;
    @FindBy (xpath = "//button[.=' Add ']")
    public WebElement addButton;
    @FindBy (xpath = "//select[@id='reportingCriteria']")
    public WebElement reportingCriteria;
    @FindBy (xpath = "//input[@id='scheduleTime']")
    public WebElement scheduledTime;
    @FindBy (xpath = "//select[@id='schedulePeriod']")
    public WebElement scheduledPeriod;
    @FindBy (xpath = "//button[.=' Test Connection & Send Email ']")
    public WebElement testButton;
    @FindBy (xpath = "//h2[.='Success']")
    public WebElement verifyTestConnection;
    @FindBy (xpath = "//button[.=' Save ']")
    public WebElement saveButton;
    @FindBy (xpath = "//span[.='Continue']")
    public WebElement continueButton;
    @FindBy (xpath = "//p[.='Scheduled reporting settings have been saved.']")
    public WebElement savedMessage;
    @FindBy (xpath = "//a[@class='svn-badge-remove']")
    public WebElement remove;



}
