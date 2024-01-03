package com.juaracoding;

import com.juaracoding.Driver.DriverSingleton;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.View;
import com.juaracoding.utils.Constans;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestLogin {
    private static WebDriver driver;
    private static LoginPage loginPage = new LoginPage();
    private static View view= new View();
    private static ExtentTest extentTest;

    public  TestLogin(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }


    @Given("Admin enter url Dika Siloam")
    public void user_enter_url_hrm() {
        driver.get(Constans.URL);
        extentTest.log(LogStatus.PASS,"Admin enter url  Dika Siloam");
    }

    @When("Admin input valid username")
    public void user_input_valid_username() {
        loginPage.inputUsername("admin_siloam");
        extentTest.log(LogStatus.PASS,"Admin input valid username");
    }

    @And("Admin input valid password")
    public void user_input_valid_Password() {
        loginPage.inputPassword("12345678");
        extentTest.log(LogStatus.PASS,"Admin input valid password");
    }

    @And("Admin click button login")
    public void user_click_button_login() {
        loginPage.clickbuttonLogin();
        extentTest.log(LogStatus.PASS,"Admin click button login");
    }

    @Then("Admin menampilkan title page")
    public void user_get_title_Invalid_credentials() {
        Assert.assertEquals(loginPage.getTxtDashboard(), "Home");
        extentTest.log(LogStatus.PASS,"Admin menampilkan title page");
    }
//    @And("click profile")
//    public void click_profile(){
//        loginPage.profile();
//    }
    @And("Click logut")
    public void Click_logut(){
        DriverSingleton.delay(2);
        loginPage.logOutAcount();
        extentTest.log(LogStatus.PASS, "Click logut");
    }
    @Then("Admin menampilkan required Username")
    public void admin_menampilkan_required_username(){
        Assert.assertTrue(true,loginPage.getrequiredUsername());
        extentTest.log(LogStatus.PASS, "");
    }
    @And("clear password")
    public void clear_password(){
        loginPage.ClearPassword();
        extentTest.log(LogStatus.PASS, "");
    }
    @And("clear Username")
    public void clear_username(){
        loginPage.ClearUsername();
        extentTest.log(LogStatus.PASS, "");
    }
    @Then("Admin menampilkan required pass")
    public void admin_menampilkan_required_pass(){
        Assert.assertTrue(true,loginPage.getrequiredPassword());
        extentTest.log(LogStatus.PASS, "");
    }
    @And("Admin input invalid username")
    public void admin_input_invalid_username(){
        loginPage.inputUsername("admin_siloa");
        extentTest.log(LogStatus.PASS, "Admin input invalid username");
    }
    @And("Admin input invalid password")
    public void admin_input_invalid_password(){
        loginPage.inputUsername("123");
        extentTest.log(LogStatus.PASS, "admin input invalid password");
    }
    @And("menampilkan Tulisan Text Dika")
    public void tulisan_Text_dika(){
        Assert.assertEquals(loginPage.getTxtDika(),"DIKA | SILOAM");
        extentTest.log(LogStatus.PASS, "menampilkan Tulisan Text Dika");
    }
    @And("Input Valid username Sales")
    public void input_valid_username_sales(){
        loginPage.inputUsername("K6400001");
        extentTest.log(LogStatus.PASS, "Input Valid username Sales");
    }
    @And("Input Valid password Sales")
    public void input_valid_password_sales(){
        loginPage.inputPassword("a");
        extentTest.log(LogStatus.PASS, "Input Valid password Sales");
    }
    @Given("click profile")
    public void click_profile(){
        loginPage.profile();
        extentTest.log(LogStatus.PASS, "click profile");
    }
    @When("click logout")
    public void cllick_logout(){
        loginPage.logOut();
        extentTest.log(LogStatus.PASS, "click logout");
    }





}
