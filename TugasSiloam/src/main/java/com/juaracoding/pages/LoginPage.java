package com.juaracoding.pages;

import com.juaracoding.Driver.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;

    public LoginPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //Locator

    @FindBy(xpath = "//*[@id=\"page-container\"]/div/div[2]/form/div[1]/input")
    private WebElement username;
    @FindBy(xpath = "//*[@id=\"page-container\"]/div/div[2]/form/div[2]/input")
    private WebElement password;
    @FindBy(xpath = "//*[@id=\"page-container\"]/div/div[2]/form/div[3]/button")
    private WebElement btnLogin;


    //logout
    @FindBy(xpath = "//a[@class='dropdown-toggle']//img")
    private WebElement profile;
    //
    @FindBy(xpath = "//a[@class='dropdown-item']")
    private WebElement logOut;
    //
    @FindBy(xpath = "/html/body/div[5]/h1")
    private WebElement txtDashboard;
    //
    @FindBy(xpath = ("/html/body/div[1]/div[2]/main/article/div/div/div[1]/ul/li/strong"))
    private WebElement txtInvalid;
    //
    @FindBy(xpath = ("//*[@id=\"page-container\"]/div/div[2]/form/div[2]/input"))
    private WebElement requiredPassword;
    //
    @FindBy(xpath = ("//*[@id=\"page-container\"]/div/div[2]/form/div[1]/input"))
    private WebElement requiredUsername;

    @FindBy(xpath = ("/html/body/p/a"))
    private WebElement dismis;

    @FindBy(xpath = ("//*[@id=\"page-container\"]/div/div[1]/div[1]/b"))
    private WebElement txtDika;


    public void login() {
        username.sendKeys("admindika");
        password.sendKeys("d1k4@passw0rd");
        btnLogin.click();
    }

    public void loginForm(String username, String password) {
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        btnLogin.click();
    }

    public void inputUsername(String username) {
        this.username.sendKeys(username);
    }

    public void inputPassword(String password) {
        this.password.sendKeys(password);
    }

    public void clickbuttonLogin() {
        btnLogin.click();
    }

    public void logOutAcount() {
//        dismis.click();
        profile.click();
        logOut.click();
    }

    public void profile() {
        profile.click();
    }

    public void logOut() {
        logOut.click();
    }

    public String getTxtDashboard() {
        return txtDashboard.getText();
    }

    public String getTxtInvalid() {
        return txtInvalid.getText();
    }

    //
    public String getrequiredPassword() {
        return requiredPassword.getText();
    }

    //
    public String getrequiredUsername() {
        return requiredUsername.getAttribute("required");
    }

    public void ClearUsername() {
        username.sendKeys(Keys.CONTROL + "a");
        username.sendKeys(Keys.DELETE);

    }
    public String getTxtDika(){
        return txtDika.getText();
    }

    public void ClearPassword() {
        password.sendKeys(Keys.CONTROL + "a");
        password.sendKeys(Keys.DELETE);
    }

}
