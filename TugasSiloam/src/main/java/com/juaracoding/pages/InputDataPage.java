package com.juaracoding.pages;

import com.juaracoding.Driver.DriverSingleton;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class InputDataPage {
    private WebDriver driver;

    public InputDataPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);

    }

    //Locator

    @FindBy(xpath = ("//a[@href='https://dev.ptdika.com/siloam/sales/input']"))
    private WebElement btnInput;

    @FindBy(xpath = ("//h1[@class='page-header']"))
    private WebElement txtInput;

    @FindBy(xpath = ("//input[@id='name']"))
    private WebElement fullName;

    @FindBy(xpath = ("//input[@id='no_bpjs']"))
    private WebElement noBpjs;

    @FindBy(xpath = ("//input[@id='no_ktp']"))
    private WebElement noKTP;

    @FindBy(xpath = ("//textarea[@id='address']"))
    private WebElement alamatPasien;

    @FindBy(xpath = ("//span[@id='select2-ktp_city-container']"))
    private WebElement kotaKptp;

    @FindBy(xpath = ("//input[@role='textbox']"))
    private WebElement serachbar;

    @FindBy(xpath = ("//input[@id='origin_faskes']"))
    private WebElement faskesAwal;

    @FindBy(xpath = ("//span[@id='select2-destination_faskes-container']"))
    private WebElement faskesTujuan;

    @FindBy(xpath = ("//input[@role='textbox']"))
    private WebElement searchTujuan;

    @FindBy(xpath = ("//textarea[@id='reason']"))
    private WebElement alasanPasien;

    @FindBy(xpath = ("//i[@class='fas fa-save']"))
    private WebElement btnSubmit;

    @FindBy(xpath = ("//*[@id=\"ktp_city\"]/option[162]"))
    private WebElement kotaBogor;

    @FindBy(xpath = ("//*[@id=\"destination_faskes\"]/option[14]"))
    private WebElement clinickBogorSelata;

    @FindBy(xpath = ("//span[normalize-space()='The Nomor BPJS already exist.']"))
    private WebElement bpjSudahAda;
    @FindBy(xpath = ("//*[@id=\"ktp_city\"]/option[1]"))
    private WebElement kotaKosong;
    @FindBy(xpath = ("//*[@id=\"destination_faskes\"]/option[1]"))
    private WebElement faskseKosong;

    @FindBy(xpath = ("//span[normalize-space()='Field Alamat Harus Diisi!']"))
    private WebElement txtAlamatKosong;
    @FindBy(xpath = ("//*[@id=\"ktp_city\"]"))
    private WebElement getKotaKosong;

    @FindBy(xpath = ("//span[normalize-space()='Field Alasan Harus Diisi!']"))
    private WebElement txtAlasanKosong;

    @FindBy(xpath = ("//div[@role='alert']"))
    private WebElement gettxtDataSimpan;

    @FindBy(xpath = ("//div[@role='alert']"))
    private WebElement txtBerhasilDisimpan;

    public void setBtnInput() {
        btnInput.click();

    }

    public void setFullName() {
        fullName.sendKeys("Fery");
    }
    public void setFullNameAngka() {
        fullName.sendKeys("000");
    }
    public void setFullNameKosong() {
        fullName.sendKeys("");
    }
    public String getTxtNameKosong(){
        return fullName.getAttribute("required");
    }




    public void setNoBpjs() {
        noBpjs.sendKeys(randomNumber(13));
    }
    public void setNoBpjsKurang() {
        noBpjs.sendKeys(randomNumber(12));
    }

    public void setNoBpjsSudahAda() {
        noBpjs.sendKeys("1111111111111");
    }
    public void bpjsKosong(){
        noBpjs.sendKeys("");
    }
    public String getTextKurang13(){
        return noBpjs.getAttribute("minlength");
    }
    public String getRequirednoBPJS(){
        return noBpjs.getAttribute("required");
    }
    public String getTxtAlasanKosong(){
        return txtAlasanKosong.getText();
    }







    public void setNoKTP() {
        noKTP.sendKeys(randomNumber(16));
    }
    public void setNoKTPKurangEnamBelas() {
        noKTP.sendKeys(randomNumber(15));
    }
    public void setNoKTPKosong() {
        noKTP.sendKeys("");
    }
    public String getTxtKTPKurangEnamBelas(){
        return noKTP.getAttribute("minlength");
    }
    public String getTxtKTPRequired(){
        return noKTP.getAttribute("required");
    }
    public void setAlamatPasien() {
        alamatPasien.sendKeys("papua");
    }

    public void setKotaKptp() {
        kotaKptp.click();
    }

    public void kotaBogor() {
        kotaBogor.click();
    }

    public void clickBogorSelatan() {
        clinickBogorSelata.click();
    }

    public void Search() {
        serachbar.sendKeys("Kota Bogor");
        serachbar.sendKeys(Keys.ENTER);
    }

    public void setFaskesAwal() {
        faskesAwal.sendKeys("Puskesmas cibinong");
    }

    public void setFaskesTujuan() {
        faskesTujuan.click();
    }

    public void setSearchTujuan() {
        searchTujuan.sendKeys("Siloam Clinic Bogor Barat || Kota Bogor");
        searchTujuan.sendKeys(Keys.ENTER);
    }
    public void clearkotaktp(){
        kotaKptp.click();
        kotaKosong.click();
    }
    public void alasankosong(){
        alasanPasien.sendKeys("");
    }

    public void setAlasanPasien() {
        alasanPasien.sendKeys("nyaman");
    }

    public void setBtnSubmit() {
        btnSubmit.click();
    }
    public void clearHalamanFormInput(){
        fullName.sendKeys(Keys.CONTROL + "a");
        fullName.sendKeys(Keys.DELETE);
        noBpjs.sendKeys(Keys.CONTROL + "a");
        noBpjs.sendKeys(Keys.DELETE);
        noKTP.sendKeys(Keys.CONTROL + "a");
        noKTP.sendKeys(Keys.DELETE);
        alamatPasien.sendKeys(Keys.CONTROL + "a");
        alamatPasien.sendKeys(Keys.DELETE);
//        kotaKptp.click();
//        kotaKosong.click();
        faskesAwal.sendKeys(Keys.CONTROL + "a");
        faskesAwal.sendKeys(Keys.DELETE);
//        faskesTujuan.click();
//        faskseKosong.click();
        alasanPasien.sendKeys(Keys.CONTROL + "a");
        alasanPasien.sendKeys(Keys.DELETE);
    }
    public void kosongkanFaskestujuan(){
        faskesTujuan.click();
        faskseKosong.click();
    }
    public String getTxtFaskesTujuanKosong(){
        return faskesTujuan.getAttribute("required");
    }


    public String getTxtInput() {
        return txtInput.getText();
    }
    public String getTxtBPJSSudahAda(){
        return bpjSudahAda.getText();
    }
    public String getTxtAlamatkosong(){
        return txtAlamatKosong.getText();
    }
    public String getTxtKotaKosong(){
        return kotaKosong.getAttribute("required");
    }
    public String getFaskesAwalKosong(){
        return faskesAwal.getAttribute("required");
    }
    public String gettxtBerhasilDisimapan() {
        return txtBerhasilDisimpan.getText();
    }

    public String randomNumber(int length) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int randomNumber = random.nextInt(10);
            sb.append(randomNumber);
        }
        return sb.toString();
    }

}
