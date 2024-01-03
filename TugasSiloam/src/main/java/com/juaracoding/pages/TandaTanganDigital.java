package com.juaracoding.pages;

import com.juaracoding.Driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TandaTanganDigital{
    private WebDriver driver;

    public TandaTanganDigital (){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }
    //Locator
    @FindBy(xpath = ("//*[@id=\"name\"]"))
    private WebElement fieldNama;
    @FindBy(xpath = ("//*[@id=\"no_bpjs\"]"))
    private WebElement fieldBpjs;
    @FindBy(xpath = ("//input[@id='no_ktp']"))
    private WebElement fieldKtp;
    @FindBy(xpath = ("//textarea[@id='address']"))
    private WebElement fieldAlamat;
    @FindBy(xpath = ("//span[@id='select2-ktp_city-container']"))
    private WebElement fieldKotaKtp;
    @FindBy(xpath = ("//*[@id=\"origin_faskes\"]"))
    private WebElement fieldFaskesAwal;
    @FindBy(xpath = ("//span[@id='select2-destination_faskes-container']"))
    private WebElement fieldFaskesTujuan;
    @FindBy(xpath = ("//textarea[@id='reason']"))
    private WebElement fieldAlasan;
    @FindBy(xpath = ("//button[@id='btnEdit']"))
    private WebElement btnEdit;
    @FindBy(xpath = ("//button[@id='btnUpdate']"))
    private WebElement btnSimpanTandaTangan;



    public void setBtnEdit(){
        this.btnEdit.click();
    }
    public void getFieldNama(){
        fieldNama.clear();
        fieldNama.sendKeys("testing automation");
    }
    public String getNamabaru(){
        return fieldNama.getAttribute("value");
    }
    public void setBtnSimpanTandaTangan(){
        this.btnSimpanTandaTangan.click();
    }


}
