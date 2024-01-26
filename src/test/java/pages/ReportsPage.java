package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ReportsPage {
    public ReportsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@id='firewalls']")
    public WebElement firewall;

    @FindBy(xpath = "//a[@class='dropdown-item']")
    public WebElement myFirewalls;

    @FindBy(xpath = "//span[.='Reports']")
    public WebElement reports;

    @FindBy(xpath = "//button[.=' Filter ']")
    public WebElement filter;

    @FindBy(xpath = "(//span[@class='core'])[2]")
    public WebElement hideLocalConnections;

    @FindBy(xpath = "//button[.=' Select filter ']")
    public WebElement selectFilter;

    @FindBy(xpath = "//a[.='Application category']")
    public WebElement applicationCategory;

    @FindBy(xpath = "//button[.=' Equal ']")
    public WebElement equal;
    @FindBy(xpath = "//a[.='Equal']")
    public WebElement activeEqual;

    @FindBy(xpath = "//button[@class='svn-button large empty']")
    public WebElement value;

    @FindBy(xpath = "//a[.='Email']")
    public WebElement email;

    @FindBy(xpath = "//button[.=' Add ']")
    public WebElement addButton;

    @FindBy(xpath = "//button[.=' Volume ']")
    public WebElement volumeMenu;

    @FindBy(xpath = "(//a[@class='active'])[2]")
    public WebElement volume;

    @FindBy(xpath = "//button[.=' Last 6 hours ']")
    public WebElement lastSixHours;

    @FindBy(xpath = "//a[.='Last 30 minutes']")
    public WebElement lastThirtyHours;

    @FindBy(xpath = "//button[.=' Top 10 ']")
    public WebElement topTen;

    @FindBy(xpath = "//a[.='Top 5']")
    public WebElement topFive;

    @FindBy(xpath = "//button[.=' Reset All Filters ']")
    public WebElement resetAllFilters;

    @FindBy(xpath = "//button[.=' Download ']")
    public WebElement download;

    @FindBy(xpath = "//a[.='PDF']")
    public WebElement pdf;
}
