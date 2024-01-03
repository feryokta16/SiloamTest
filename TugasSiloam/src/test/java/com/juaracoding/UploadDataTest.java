package com.juaracoding;

import com.juaracoding.Driver.DriverSingleton;
import com.juaracoding.pages.InputDataPage;
import com.juaracoding.pages.UploadData;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en_lol.AN;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class UploadDataTest{
    private static WebDriver driver;
    private static InputDataPage inputDataPage = new InputDataPage();
    private static UploadData uploadData =new UploadData();
    private ExtentTest extentTest;

    public UploadDataTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    @Given("Sales Masukan data diri")
    public void sales_masukan_data_diri(){
        inputDataPage.setFullName();
        inputDataPage.setNoBpjs();
        inputDataPage.setNoKTP();
        inputDataPage.setAlamatPasien();
        inputDataPage.setKotaKptp();
        inputDataPage.kotaBogor();
        inputDataPage.setFaskesAwal();
        inputDataPage.setFaskesTujuan();
        inputDataPage.clickBogorSelatan();
        inputDataPage.setAlasanPasien();
        inputDataPage.setBtnSubmit();
    }
    @And("Sales click button foto faskes awal")
    public void sales_click_button_foto_faskes_awal(){
     DriverSingleton.delay(2);
        uploadData.setbtnFotoFaskesAwal();
        extentTest.log(LogStatus.PASS, "Sales click button foto faskes awal");
    }
    @And("user memilih foto faskes awal dengan format jpg")
    public void user_memilihi_foto_faskes_awal_dengan_format_jpg(){
      uploadData.setChooseFile("D:\\BACKUP DATA\\DATA C\\IdeaProjects\\TugasSiloam\\UpladFoto\\fotoJPG.jpg");
        extentTest.log(LogStatus.PASS, "user memilih foto faskes awal dengan format jpg");
    }
    @And("user memilih foto faskes awal dengan format jpeg")
    public void user_memilihi_foto_faskes_awal_dengan_format_jpeg(){
        uploadData.setChooseFile("D:\\BACKUP DATA\\DATA C\\IdeaProjects\\TugasSiloam\\UpladFoto\\fotoJPEG.jpeg");
        extentTest.log(LogStatus.PASS, "user memilih foto faskes awal dengan format jpeg");
    }
    @And("user memilih foto faskes awal dengan format png")
    public void user_memilihi_foto_faskes_awal_dengan_format_png(){
        uploadData.setChooseFile("D:\\BACKUP DATA\\DATA C\\IdeaProjects\\TugasSiloam\\UpladFoto\\fotoPNG.png");
        extentTest.log(LogStatus.PASS, "user memilih foto faskes awal dengan format png");
    }
    @And("user memilih foto faskes awal dengan format pdf")
    public void user_memilihi_foto_faskes_awal_dengan_format_pdf(){
        uploadData.setChooseFile("D:\\BACKUP DATA\\DATA C\\IdeaProjects\\TugasSiloam\\UpladFoto\\fotoPDF.pdf");
        extentTest.log(LogStatus.PASS, "user memilih foto faskes awal dengan format pdf");
    }
    @And("user memilih foto faskes awal dengan lebih besar")
    public void user_memilih_foto_faskes_awal_dengan_lebih_besar(){
        uploadData.setChooseFile("D:\\BACKUP DATA\\DATA C\\IdeaProjects\\TugasSiloam\\UpladFoto\\Largefile.jpg");
        extentTest.log(LogStatus.PASS, "user memilih foto faskes awal dengan lebih besar");
    }

    // Faskes Tujuan

    @And("Sales click button foto faskes Tujuan")
    public void sales_click_button_foto_faskes_tujuan(){
        DriverSingleton.delay(2);
        uploadData.setbtnFotoFaskesTujuan();
        extentTest.log(LogStatus.PASS, "Sales click button foto faskes Tujuan");
    }

    @And("User click button simpan upload foto")
    public void user_click_button_simpan_upload_foto(){
        DriverSingleton.delay(2);
        uploadData.clickBtnSimpan();
        extentTest.log(LogStatus.PASS, "User click button simpan upload foto");
    }
    @And("User get text berhasil upload data")
    public void user_get_text_berhasil_upload_data(){
        Assert.assertEquals(uploadData.getTxtberhasilUpload(),"Data Berhasil diupload!");
        extentTest.log(LogStatus.PASS, "User get text berhasil upload data");
    }
    @And("User click btn ok upload data")
    public void user_click_btn_ok_upload_data(){
        DriverSingleton.delay(10);
        uploadData.clickBtnOKUploadData();
        extentTest.log(LogStatus.PASS, "User click btn ok upload data");
    }
    @And("User get text DissAlow Data")
    public void User_get_text_DissAlow_Data(){
        Assert.assertEquals(uploadData.disallowTxt(),"Only jpeg, jpg and png Images type allowed");
        extentTest.log(LogStatus.PASS, "User get text DissAlow Data");
    }
    @And("User get text large Data")
    public void User_get_text_large_data(){
        DriverSingleton.delay(6);
        Assert.assertEquals(uploadData.largeFile(),"Upload error: The file you are attempting to upload is larger than the permitted size.");
        extentTest.log(LogStatus.PASS, "User get text large Data");
    }

    @And("User get text Form Input")
    public void user_get_text_Form_Input(){
        DriverSingleton.delay(2);
        Assert.assertEquals(uploadData.getFormInput(),"Form Input");
        extentTest.log(LogStatus.PASS, "User get text Form Input");
    }
    @And("User click btn cancel")
    public void user_click_btn_cancel(){
        DriverSingleton.delay(3);
        uploadData.setbtnCancel();
        extentTest.log(LogStatus.PASS, "User click btn cancel");
    }
    @And("User click btn close")
    public void user_click_btn_close(){
        DriverSingleton.delay(2);
        uploadData.setBtnClose();
        extentTest.log(LogStatus.PASS, "User click btn close");
    }
    @And("Sales click button foto Tanda Tangan Digital")
    public void sales_click_button_foto_tanda_tangan_digital(){
        uploadData.setTandaTanganDigital();
        extentTest.log(LogStatus.PASS, "Sales click button foto Tanda Tangan Digital");
    }
    @And("User get Text Complate")
    public void user_get_text_complate(){
        Assert.assertEquals(uploadData.getTxtComplate(),"Terima kasih dokumen anda sudah lengkap !");
    }
    @And("User Click Btn Selanjutnya")
    public void user_klick_btn_selanjutnya(){
        uploadData.setBtnSelanjutnya();
    }




}
