package com.juaracoding.pages;

import com.juaracoding.Driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.Alert;

public class UploadData {

    private WebDriver driver;

    public UploadData(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }

    //Locator
    @FindBy(xpath = ("//span[normalize-space()='Foto Faskes Awal']"))
    private WebElement btnFotoFaskesAwal;

    @FindBy(xpath = ("//*[@id=\"default-tab-2\"]/div[1]/div/table/tbody[2]/tr[1]/td[2]/a/span"))
    private WebElement btnFotoFaskesTujuan;

    @FindBy(xpath = ("//span[normalize-space()='Tanda Tangan Digital']"))
    private WebElement btnTandaTanganDigital;

    @FindBy(xpath = ("//input[@id='file']"))
    private WebElement chooseFile;

    @FindBy(xpath = ("//*[@id=\"btnSave\"]"))
    private WebElement btnSimpanUploadFoto;

    @FindBy(xpath = ("/html/body/div[7]/div/div[2]"))
    private WebElement txtberhasilUploadData;

    @FindBy(xpath = ("/html/body/div[7]/div/div[3]/div/button"))
    private WebElement btnOkBerhasilUploadData;

    @FindBy(xpath = ("//*[@id=\"error_message\"]"))
    private WebElement txtDisAllow;

    @FindBy(xpath = ("//button[normalize-space()='Cancel']"))
    private WebElement btnCancel;

    @FindBy(xpath = ("//*[@id=\"message\"]"))
    private WebElement txtLarge;

    @FindBy(xpath = ("//*[@id=\"content\"]/h1"))
    private WebElement txtFormInput;

    @FindBy(xpath = ("//*[@id=\"modal_form\"]/div/div/div[1]/button/span"))
    private WebElement btnClose;

    @FindBy(xpath = ("//*[@id=\"default-tab-2\"]/div[1]/div/table/tbody[4]/tr/td/div[2]/strong"))
    private WebElement txtComplate;

    @FindBy(xpath = ("//a[@class='btn btn-primary']"))
    private WebElement btnSelanjutnya;

    public void setbtnFotoFaskesAwal(){
        this.btnFotoFaskesAwal.click();
    }
    public void setbtnFotoFaskesTujuan(){
        this.btnFotoFaskesTujuan.click();
    }
    public void setTandaTanganDigital(){
        this.btnTandaTanganDigital.click();
    }
    public void setChooseFile(String choseFile){
        chooseFile.sendKeys(choseFile);
    }
    public void clickBtnSimpan(){
        btnSimpanUploadFoto.click();
    }
    public void setBtnClose(){
        btnClose.click();
    }

    public String getTxtberhasilUpload(){
        return txtberhasilUploadData.getText();
    }
    public String disallowTxt(){
        return txtDisAllow.getText();
    }
    public String largeFile(){
        return txtLarge.getText();
    }
    public String getFormInput(){
        return txtFormInput.getText();
    }
    public String getTxtComplate(){
        return txtComplate.getText();
    }
    public void setbtnCancel(){
        btnCancel.click();
    }
    public void clickBtnOKUploadData(){
        btnOkBerhasilUploadData.click();
    }
    public void setBtnSelanjutnya(){
        btnSelanjutnya.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public void DocumentPendukung(){

    }



}
