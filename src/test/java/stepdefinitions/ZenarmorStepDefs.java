package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;

import org.openqa.selenium.support.ui.Select;
import pages.*;
import utilities.Driver;
import utilities.WaitUtils;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ZenarmorStepDefs {
    LoginPage loginPage = new LoginPage();
    ReportsPage reportsPage = new ReportsPage();
    SettingsPage settingsPage = new SettingsPage();
    PoliciesPage policiesPage = new PoliciesPage();
    HomePage homePage = new HomePage();
    Faker faker = new Faker();
    int threatNumber;


//LOGIN
    @Given("user goes to login page")
    public void user_goes_to_login_page() {
       Driver.getDriver().get("https://dash.zenarmor.com/login");
    }
    @When("user enters his her email")
    public void user_enters_his_her_email() {
        loginPage.email.sendKeys("itsme.atekin@gmail.com");
    }
    @When("user enters his her password")
    public void user_enters_his_her_password() {
       loginPage.password.sendKeys("itsme.atekin");
    }
    @When("user clicks on continue button")
    public void user_clicks_on_continue_button() {
        loginPage.continueButton.click();
    }
    @When("User clicks on Firewall menu")
    public void user_clicks_on_firewall_menu() {
       reportsPage.firewall.click();
    }
    @When("User clicks on My Firewalls")
    public void user_clicks_on_my_firewalls() {
       reportsPage.myFirewalls.click();

    }

//    REPORTS
    @When("User clicks on Report menu")
    public void user_clicks_on_report_menu() {
        String window1Handle = Driver.getDriver().getWindowHandle();
        //System.out.println(window1Handle);

        Set<String> allWindowHandles = Driver.getDriver().getWindowHandles();
        //System.out.println(allWindowHandles);

        for (String eachHandle : allWindowHandles){
            if (!eachHandle.equals(window1Handle)){
                Driver.getDriver().switchTo().window(eachHandle);
                break;
            }
        }
        WaitUtils.waitFor(3);
        reportsPage.reports.click();
    }
    @When("User clicks on Filter menu")
    public void user_clicks_on_filter_menu() {
        WaitUtils.waitFor(3);
        reportsPage.filter.click();
    }
    @When("User enables Hide local connections")
    public void user_enables_hide_local_connections() {
        reportsPage.hideLocalConnections.click();
    }
    @When("User selects Application Category from Filter dropdown menu")
    public void user_selects_application_category_from_filter_dropdown_menu() {
        reportsPage.selectFilter.click();
        WaitUtils.waitFor(3);
        reportsPage.applicationCategory.click();
    }
    @When("User selects Equal from menu")
    public void user_selects_equal_from_menu() {
        reportsPage.equal.click();
        reportsPage.activeEqual.click();
    }
    @When("User selects Email from menu")
    public void user_selects_email_from_menu() {
        reportsPage.value.click();
        reportsPage.email.click();
    }
    @When("User clicks on Add button")
    public void user_clicks_on_add_button() {
        reportsPage.addButton.click();
    }
    @When("User picks up Volume")
    public void user_picks_up_volume() {
        reportsPage.volumeMenu.click();
        reportsPage.volume.click();
    }
    @When("User selects Last Thirty minutes")
    public void user_selects_last_thirty_minutes() {
        reportsPage.lastSixHours.click();
        reportsPage.lastThirtyHours.click();
    }
    @When("User selects Top Five")
    public void user_selects_top_five() {
        reportsPage.topTen.click();
        reportsPage.topFive.click();
    }
    @When("User clicks on Reset All Filters")
    public void user_clicks_on_reset_all_filters() {
        reportsPage.resetAllFilters.click();
    }
    @When("User clicks on Download button")
    public void user_clicks_on_download_button() {
        reportsPage.download.click();
    }
    @When("User selects PDF")
    public void user_selects_pdf() {
        reportsPage.pdf.click();
        WaitUtils.waitFor(15);
    }
    @When("User closes the browser")
    public void user_closes_the_browser() {
        Driver.closeDriver();
    }

//    SETTINGS
    @When("User clicks on Settings menu")
    public void user_clicks_on_settings_menu() {
        String window1Handle = Driver.getDriver().getWindowHandle();
        //System.out.println(window1Handle);

        Set<String> allWindowHandles = Driver.getDriver().getWindowHandles();
        //System.out.println(allWindowHandles);

        for (String eachHandle : allWindowHandles){
            if (!eachHandle.equals(window1Handle)){
                Driver.getDriver().switchTo().window(eachHandle);
                break;
            }
        }
        WaitUtils.waitFor(3);
        settingsPage.settings.click();
        WaitUtils.waitFor(1);
    }
    @When("User clicks On Scheduled Reports")
    public void user_clicks_on_scheduled_reports() {
       settingsPage.scheduledReports.click();
        WaitUtils.waitFor(1);
        Driver.getDriver().navigate().refresh();
    }
    @When("User clicks On Disabled button")
    public void user_clicks_on_disabled_button() {
        settingsPage.disabled.click();
        WaitUtils.waitFor(1);
    }
    @Then("Verfiy Scheduled Reports are enabled")
    public void verfiy_scheduled_reports_are_enabled() {
        assertTrue(settingsPage.enabled.isDisplayed());
        WaitUtils.waitFor(1);
    }
    @When("User selects Zenconsole from Mail Provider")
    public void user_selects_zenconsole_from_mail_provider() {
        Select select =new Select(settingsPage.mailProvider);
        select.selectByValue("zenconsole");
        WaitUtils.waitFor(1);
    }
    @When("User enters admin information")
    public void user_enters_admin_information() {
        settingsPage.addParticipant.click();
        WaitUtils.waitFor(1);
        settingsPage.name.sendKeys(faker.name().fullName());
        //settingsPage.name.sendKeys("ahmet");

        WaitUtils.waitFor(1);
        settingsPage.email.sendKeys(faker.internet().emailAddress());
        //settingsPage.email.sendKeys("itsme.atekin@gmail.com");
        WaitUtils.waitFor(1);
        settingsPage.addButton.click();
        WaitUtils.waitFor(1);
    }
//    @When("User enters owner information")
//    public void admin_enters_owner_information() {
//        settingsPage.addParticipant.click();
//        WaitUtils.waitFor(1);
//        settingsPage.name.sendKeys("salih");
//        WaitUtils.waitFor(1);
//        settingsPage.email.sendKeys("salih@sunnyvalley.io");
//        WaitUtils.waitFor(1);
//        settingsPage.addButton.click();
//        WaitUtils.waitFor(1);
//    }
    @When("User selects Volume from Reporting Criteria")
    public void user_selects_volume_from_reporting_criteria() {
        Select select = new Select(settingsPage.reportingCriteria);
        select.selectByValue("volume");
    }
    @When("User selects time from Schedule")
    public void user_selects_time_from_schedule() {
        settingsPage.scheduledTime.sendKeys("12 00 PM");
    }
    @When("User selects Friday from Schedule")
    public void user_selects_friday_from_schedule() {
        Select select = new Select(settingsPage.scheduledPeriod);
        select.selectByValue("5");
    }
    @When("User clicks on Test Connection and Send Email button")
    public void user_clicks_on_test_connection_and_send_email_button() {
        settingsPage.testButton.click();
        WaitUtils.waitFor(3);
    }
    @Then("User verifies the successfully connected message")
    public void user_verifies_the_successfully_connected_message() {
       assertTrue(settingsPage.verifyTestConnection.isDisplayed());
    }
    @When("User clicks Save Button")
    public void user_clicks_save_button() {
        settingsPage.saveButton.click();
    }
    @When("User clicks Continue button")
    public void user_clicks_continue_button() {
       settingsPage.continueButton.click();
       WaitUtils.waitFor(3);
    }
    @Then("User verifies the successfully saved message")
    public void user_verifies_the_successfully_saved_message() {
       assertTrue(settingsPage.savedMessage.isDisplayed());

    }

//    POLICIES MENU

    @When("User clicks On Policies menu")
    public void user_clicks_on_policies_menu() {
        String window1Handle = Driver.getDriver().getWindowHandle();
        //System.out.println(window1Handle);

        Set<String> allWindowHandles = Driver.getDriver().getWindowHandles();
        //System.out.println(allWindowHandles);

        for (String eachHandle : allWindowHandles){
            if (!eachHandle.equals(window1Handle)){
                Driver.getDriver().switchTo().window(eachHandle);
                break;
            }
        }
        WaitUtils.waitFor(3);
        policiesPage.policies.click();
    }
    @When("User clicks on Create New Policy button")
    public void user_clicks_on_create_new_policy_button() {
        policiesPage.createNewPolicy.click();
    }
    @When("User enters a policy name")
    public void user_enters_a_policy_name() {
        policiesPage.policyName.sendKeys("ahmet");
        policiesPage.createButton.click();
    }
    @When("User clicks on policy created")
    public void user_clicks_on_policy_created() {
       policiesPage.clickOnPolicyName.click();
    }
    @When("User enters an IPV4 address")
    public void user_enters_an_ipv4_address() {
        policiesPage.addIP.click();
        policiesPage.enterIP.sendKeys(faker.internet().ipV4Address());
    }
    @When("User types a description in the box")
    public void user_types_a_description_in_the_box() {
        policiesPage.enterIPV4Desc.sendKeys("test");
        policiesPage.submitButton.click();
    }
    @When("User adds a mac address")
    public void user_adds_a_mac_address() {
        policiesPage.macAddress.click();
        policiesPage.enterMac.sendKeys(faker.internet().macAddress());
        policiesPage.enterMacDesc.sendKeys("test");
        policiesPage.submitButton.click();
    }
    @When("User adds a time schedule")
    public void user_adds_a_time_schedule() {
        policiesPage.timeSchedule.click();
        policiesPage.timeScheduleName.sendKeys("working time");
        policiesPage.addButton.click();
        policiesPage.selectDay.click();
    }
    @When("User refreshes the page")
    public void user_refreshes_the_page() {
        policiesPage.enablePolicy.click();
        policiesPage.deletePolicy.click();
        Driver.getDriver().navigate().refresh();
    }
//    HOME MENU

    @When("User clicks on Home menu")
    public void user_clicks_on_home_menu() {
        String window1Handle = Driver.getDriver().getWindowHandle();
        //System.out.println(window1Handle);

        Set<String> allWindowHandles = Driver.getDriver().getWindowHandles();
        //System.out.println(allWindowHandles);

        for (String eachHandle : allWindowHandles){
            if (!eachHandle.equals(window1Handle)){
                Driver.getDriver().switchTo().window(eachHandle);
                break;
            }
        }
        homePage.project.click();
    }
    @When("User clicks on Engine")
    public void user_clicks_on_engine() {
        homePage.engine.click();
    }
    @When("User clicks on Restart button")
    public void user_clicks_on_restart_button() {

        WaitUtils.waitFor(1);
        homePage.restart.click();
        homePage.warningRestart.click();
        WaitUtils.waitFor(10);
    }
    @When("User clicks on the number after the detected word")
    public void user_clicks_on_the_number_after_the_detected_word() {
        String threatCounter = homePage.threatCounter.getText();
        threatNumber = Integer.parseInt(threatCounter);
        System.out.println("threatNumber = " + threatNumber);
        homePage.threatCounter.click();
    }
    @When("User verifies the size of the list")
    public void user_verifies_the_size_of_the_list() {
//        int data = homePage.targetList.getText().length();
//        System.out.println("data = " + data);
//        assertEquals(threatNumber, data);

//        String list = homePage.resultList.getText();
//        System.out.println("list = " + list);

        List<String> listSize = Collections.singletonList(homePage.resultList2.getText());
        System.out.println("listSize.size() = " + listSize.size());
        System.out.println("listSize = " + listSize);
        int noData = listSize.size()+2;
        System.out.println("noData = " + noData);
        assertEquals(threatNumber, noData);



    }
}
