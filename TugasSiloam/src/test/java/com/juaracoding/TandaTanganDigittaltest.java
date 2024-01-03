package com.juaracoding;

import com.juaracoding.Driver.DriverSingleton;
import com.juaracoding.pages.InputDataPage;
import com.juaracoding.pages.TandaTanganDigital;
import com.juaracoding.pages.UploadData;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TandaTanganDigittaltest {

    private static WebDriver driver;

    private static InputDataPage inputDataPage = new InputDataPage();
    private UploadData uploadData = new UploadData();
    private ExtentTest extentTest;
    JavascriptExecutor js = (JavascriptExecutor) driver;

    private TandaTanganDigital tandaTanganDigital = new TandaTanganDigital();

    public void TandaTanganDigitaltest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @And("Unggah Documen Pendukung")
    public void unggah_document_pendukung(){
        uploadData.setbtnFotoFaskesAwal();
        uploadData.setChooseFile("D:\\BACKUP DATA\\DATA C\\IdeaProjects\\TugasSiloam\\UpladFoto\\fotoJPG.jpg");
        DriverSingleton.delay(3);
        uploadData.clickBtnSimpan();
        DriverSingleton.delay(3);
        uploadData.clickBtnOKUploadData();
        DriverSingleton.delay(3);
        uploadData.setbtnFotoFaskesTujuan();
        DriverSingleton.delay(3);
        uploadData.setChooseFile("D:\\BACKUP DATA\\DATA C\\IdeaProjects\\TugasSiloam\\UpladFoto\\fotoJPG.jpg");
        uploadData.clickBtnSimpan();
        DriverSingleton.delay(3);
        uploadData.clickBtnOKUploadData();
        DriverSingleton.delay(3);
        uploadData.setTandaTanganDigital();
        uploadData.setChooseFile("D:\\BACKUP DATA\\DATA C\\IdeaProjects\\TugasSiloam\\UpladFoto\\fotoJPG.jpg");
        DriverSingleton.delay(3);
        uploadData.clickBtnSimpan();
        DriverSingleton.delay(3);
        uploadData.clickBtnOKUploadData();
        DriverSingleton.delay(3);
        uploadData.setBtnSelanjutnya();
    }
    @And("click button edit")
    public void click_button_edit(){
        tandaTanganDigital.setBtnEdit();
    }
    @And("Ganti Nama Pasien")
    public void ganti_nama_pasien(){
        tandaTanganDigital.getFieldNama();
    }
    @Then("Simpan Perubahan Data")
    public void Simpan_perubahan_data(){
        tandaTanganDigital.setBtnSimpanTandaTangan();
    }
    @And("user get nama baru")
    public void user_get_nama_baru(){
        Assert.assertEquals(tandaTanganDigital.getNamabaru(),"testing automation");
    }


}
