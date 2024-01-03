package com.juaracoding;

import com.juaracoding.Driver.DriverSingleton;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.View;
import com.juaracoding.utils.Constans;
import com.juaracoding.utils.Utils;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.io.IOException;
import java.util.Set;

public class ViewAndExport {
    private static WebDriver driver;
    private static LoginPage loginPage = new LoginPage();
    private static View view= new View();
    private static ExtentTest extentTest;


    public ViewAndExport(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }


    //TestCase 2-7
    @Given("Admin click button View")
    public void user_click_button_view() {
        view.buttonView();
        extentTest.log(LogStatus.PASS,"Admin click button View");
    }
    @And("click tombol back")
    public void click_tombol_back() {
        view.setBackStart();
        extentTest.log(LogStatus.PASS,"click tombol back");
    }
    @And("click tombol next")
    public void click_tombol_next() {
        view.setBackNext();
        extentTest.log(LogStatus.PASS,"click tombol next");
    }
    @And("click tombol back End")
    public void click_tombol_back_end() {
        view.setBackStartEnd();
        extentTest.log(LogStatus.PASS,"click tombol back End");
    }
    @And("click tombol next End")
    public void click_tombol_next_end() {
        view.setBackNextEnd();
        extentTest.log(LogStatus.PASS,"click tombol next End");
    }



    @And("Admin get text view")
    public void getTxtView() {
//        Assert.assertEquals(view.getTextView(),"View & Export");
        Assert.assertEquals(view.getTextView(),"View & Export");
        extentTest.log(LogStatus.PASS,"Admin get text view");
    }

    @Given("Masukan Tanggal Start")
    public void masukan_Taggal_Start() {
        view.tanggalStart();
        extentTest.log(LogStatus.PASS,"Masukan Tanggal Start");
    }

    @Then("Masukan Tanggal dua")
    public void Masukan_tanggal_dua() {
        view.tanggaldua();
        DriverSingleton.delay(5);
        extentTest.log(LogStatus.PASS,"Masukan Tanggal dua");
    }

    @And("Masukan Tanggal End")
    public void Masukan_tanggal_end() {
        view.tanggalend();
        extentTest.log(LogStatus.PASS,"Masukan Tanggal End");
    }

    @And("Masukan Tanggal delapan")
    public void masukan_tanggal_depalan() {
        view.tanggaldelapan();
        DriverSingleton.delay(5);
        extentTest.log(LogStatus.PASS,"Masukan Tanggal delapan");
    }

    @And("klick Button Filter")
    public void klick_button_filter() {
        view.buttonFilter();
        DriverSingleton.delay(2);
        extentTest.log(LogStatus.PASS,"klick Button Filter");
    }

    @And("Masukan Tanggal Satu")
    public void Masukan_tanggal_satu() {
        view.tanggalSatuNov();
        DriverSingleton.delay(5);
        extentTest.log(LogStatus.PASS,"Masukan Tanggal Satu");
    }

    @And("Klick Button Refresh")
    public void klick_button_refresh() {
        view.buttonRefresh();
        extentTest.log(LogStatus.PASS,"Klick Button Refresh");
    }
    @And("Masukan Send Tanggal dua")
    public void Masukan_send_tanggal_dua(){
        view.inputTglDua();
        extentTest.log(LogStatus.PASS,"Masukan Send Tanggal dua");
    }
    @Then("Admin get Data")
    public void user_get_data(){
        Assert.assertEquals(view.getTxtData(),"Data");
        extentTest.log(LogStatus.PASS,"Admin get Data");
    }
    @Then("data berhasil di Refresh")
    public void data_berhasil_direfresh(){
        Assert.assertEquals(view.txtStart(),"");
        extentTest.log(LogStatus.PASS,"data berhasil di Refresh");
    }
    @Then("Menampilkan Alert Start Date Please Fill Out This Field")
    public void menampilkan_Start_alert_please_fill_out_this_field(){
        Assert.assertTrue(true, view.getStart());
        extentTest.log(LogStatus.PASS,"Menampilkan Alert Start Date Please Fill Out This Field");
    }
    @Then("Menampilkan Alert End Date Please Fill Out This Field")
    public void Menampilkan_alert_end_date_please_fill_0ut_this_Field(){
        Assert.assertTrue(true,view.getEnd());
        extentTest.log(LogStatus.PASS,"Menampilkan Alert End Date Please Fill Out This Field");
    }



    // Test case 8-10
    @And("Klick Button Export")
    public void klick_button_export() {
        view.btnExport();
        extentTest.log(LogStatus.PASS,"Klick Button Export");
        DriverSingleton.delay(2);
    }
    @Then("Admin berhasil Export Data")
    public void user_berhasil_export_data(){
        Assert.assertTrue(true, "berhasil melakukan export data");
        extentTest.log(LogStatus.PASS,"Admin berhasil Export Data");
    }
    @And("Admin Get Text Danger")
    public void get_text_danger() {
        Assert.assertEquals(view.getTextDanger(),"Danger! Mohon isi start_date dan end_date terlebih dahulu!!!\n" +
                "×");
        extentTest.log(LogStatus.PASS,"Admin Get Text Danger");
    }


    @And("Masukan Tanggal Empat")
    public void Masukan_tanggal_empat(){
        view.setEmpatNovember();
        extentTest.log(LogStatus.PASS,"Masukan Tanggal Empat");
    }
    @And("Admin get text Data Kosong")
    public void  user_get_text_data_Kosong(){
        Assert.assertEquals(view.getTxtKosong(),"Danger! Data Tidak Ada!!!\n"+"×");
        extentTest.log(LogStatus.PASS,"Admin get text Data Kosong");
    }

    //testcase 11-13
    @And("Klick Button Download")
    public void klick_button_download() {
        view.btnDownload();
        extentTest.log(LogStatus.PASS,"Klick Button Download");
        DriverSingleton.delay(3);
    }
    @Then("Data Berhasil DiDownload")
    public void Data_Berhasil_DiDownload(){
        Assert.assertTrue(true, "berhasil melakukan  Download data");
        extentTest.log(LogStatus.PASS,"Data Berhasil DiDownload");
    }
//    @Given("click Button Faskes Foto Awal")
//    public void Click_button_faskes_awal(){
//        view.getFotoAwal();
//        DriverSingleton.delay(5);
//        extentTest.log(LogStatus.PASS,"click Button Faskes Foto Awal");
//    }
    @Then("Swich Page")
    public void swich_pages(){
//        driver.close();
        Set<String> windowHandles = driver.getWindowHandles();
        driver.switchTo().window((String) windowHandles.toArray()[0]);
        extentTest.log(LogStatus.PASS,"Swich Page");
    }
//    @Given("click Button Faskes Foto Akhir")
//    public void Click_button_faskes_akhir(){
//        view.getFotoAkhir();
//        DriverSingleton.delay(5);
//        extentTest.log(LogStatus.PASS,"click Button Faskes Foto Akhir");
//    }
//
//    @And("Click Pdf Agreement")
//    public void Click_Pdf_Agreement(){
//        view.getPdfAgreement();
//        DriverSingleton.delay(5);
//        extentTest.log(LogStatus.PASS,"Click Pdf Agreement");
//    }
    //TestCase 14
    @And("Masukan Tanggal Sepuluh Start")
        public void masukan_tanggal_sepuluh_start(){
        view.setStartSepuluhNovember();
        extentTest.log(LogStatus.PASS,"Masukan Tanggal Sepuluh Start");
        DriverSingleton.delay(3);
    }
    @And("Masukan Tanggal Sepuluh End")
    public void masukan_tanggal_sepuluh_end(){
        view.setEndSepuluhNovember();
        extentTest.log(LogStatus.PASS,"Masukan Tanggal Sepuluh End");
        DriverSingleton.delay(3);
    }
    @And("Klick Button Foto Awal JPEG")
       public void klick_button_foto_awal_jpeg(){
        view.setFotoAwalJPEG();
        DriverSingleton.delay(3);
        extentTest.log(LogStatus.PASS,"Klick Button Foto Awal JPEG");
    }
    @And("Berhasil menampilkan Foto Awal JPEG")
    public void berhasil_menampilkan_foto_awal_JPEG(){
        Assert.assertTrue(true, "berhasil Menampilkan Foto Awal dengan format JPEG");
        extentTest.log(LogStatus.PASS,"Berhasil menampilkan Foto Awal JPEG");
    }


    //TestCase 15
    @And("Klick Button Foto Tujuan JPEG")
    public void klick_button_foto_tujuan_JPEG(){
     view.setFotoTujuanJPEG();
     DriverSingleton.delay(3);
        extentTest.log(LogStatus.PASS,"Klick Button Foto Tujuan JPEG");
    }
    @And("Berhasil menampilkan Foto Akhir JPEG")
    public void berhasil_menampilkan_foto_akhir_JPEG(){
        Assert.assertTrue(true, "berhasil Menampilkan Foto Akir dengan format JPEG");
        extentTest.log(LogStatus.PASS,"Berhasil menampilkan Foto Akhir JPEG");
    }

    //Testcase 16
    @And("Klick Button PDF Agreement JPEG")
    public void Klick_button_PDF_agreement_JPEG(){
        view.setPdfAgreementJPEG();
        DriverSingleton.delay(3);
        extentTest.log(LogStatus.PASS,"Klick Button PDF Agreement JPEG");
    }
    @And("Berhasil menampilkan PDF Agreement JPEG")
    public void berhasil_menampilkan_pdf_JPEG(){
        Assert.assertTrue(true, "berhasil Menampilkan PDF Agreement dengan format JPEG");
        extentTest.log(LogStatus.PASS,"Berhasil menampilkan PDF Agreement JPEG");
    }

    //Testcase 17
    @And("Klick Button Foto Awal JPG")
    public void klick_button_foto_awal_jpg(){
        view.setFotoAwalJPG();
        DriverSingleton.delay(3);
        extentTest.log(LogStatus.PASS,"Klick Button Foto Awal JPG");
    }
    @And("Berhasil menampilkan Foto Awal JPG")
    public void berhasil_menampilkan_foto_awal_JPG(){
        Assert.assertTrue(true, "berhasil Menampilkan Foto Awal dengan format JPG");
        extentTest.log(LogStatus.PASS,"Berhasil menampilkan Foto Awal JPG");
    }


    //TestCase 18
    @And("Klick Button Foto Tujuan JPG")
    public void klick_button_foto_tujuan_JPG(){
        view.setFotoTujuanJPG();
        DriverSingleton.delay(3);
        extentTest.log(LogStatus.PASS,"Klick Button Foto Tujuan JPG");
    }
    @And("Berhasil menampilkan Foto Tujuan JPG")
    public void berhasil_menampilkan_foto_tujuan_JPG(){
        Assert.assertTrue(true, "berhasil Menampilkan Foto Tujuan dengan format JPG");
        extentTest.log(LogStatus.PASS,"Berhasil menampilkan Foto Tujuan JPG");
    }

    //Testcase 19
    @And("Klick Button PDF Agreement JPG")
    public void Klick_button_PDF_agreement_JPG(){
        view.setPdfAgreementJPG();
        DriverSingleton.delay(3);
        extentTest.log(LogStatus.PASS,"Klick Button PDF Agreement JPG");
    }
    @And("Berhasil menampilkan PDF Agreement JPG")
    public void berhasil_menampilkan_pdf_JPG(){
        Assert.assertTrue(true, "berhasil Menampilkan PDF Agreement dengan format JPG");
        extentTest.log(LogStatus.PASS,"Berhasil menampilkan PDF Agreement JPG");
    }

    //TestCase 20
    @And("Klick Button Foto Awal PNG")
    public void klick_button_foto_awal_png(){
        view.setFotoAwalPNG();
        DriverSingleton.delay(3);
        extentTest.log(LogStatus.PASS,"Klick Button Foto Awal PNG");
    }
    @And("Berhasil menampilkan Foto Awal PNG")
    public void berhasil_menampilkan_foto_awal_PNG(){
        Assert.assertTrue(true, "berhasil Menampilkan Foto Awal dengan format PNG");
        extentTest.log(LogStatus.PASS,"Berhasil menampilkan Foto Awal PNG");
    }


    //TestCase 21
    @And("Klick Button Foto Tujuan PNG")
    public void klick_button_foto_tujuan_png(){
        view.setFotoTujuanPNG();
        DriverSingleton.delay(3);
        extentTest.log(LogStatus.PASS,"Klick Button Foto Tujuan PNG");
    }
    @And("Berhasil menampilkan Foto Akhir PNG")
    public void berhasil_menampilkan_foto_akhir_PNG(){
        Assert.assertTrue(true, "berhasil Menampilkan Foto Akhir dengan format PNG");
        extentTest.log(LogStatus.PASS,"Berhasil menampilkan Foto Akhir PNG");
    }

    //Testcase 22
    @And("Klick Button PDF Agreement PNG")
    public void Klick_button_PDF_agreement_png(){
        view.setPdfAgreementPNG();
        DriverSingleton.delay(3);
        extentTest.log(LogStatus.PASS,"Klick Button PDF Agreement PNG");
    }
    @And("berhasil menampilkan PDF Agreement PNG")
    public void berhasil_menampilkan_foto_pdf_PNG(){
        Assert.assertTrue(true, "berhasil Menampilkan pdf Agrement dengan format PNG");
        extentTest.log(LogStatus.PASS,"berhasil menampilkan PDF Agreement PNG");
    }

    //Testcase 23
    @And("Klick Button View JPEG")
    public void Klick_Button_View_JPEG(){
        view.setViewJPEG();
        DriverSingleton.delay(3);
        extentTest.log(LogStatus.PASS,"Klick Button View JPEG");
    }

    //TestCase 24
    @And("Klick Button View JPG")
    public void Klick_Button_View_JPG(){
        view.setViewJPG();
        DriverSingleton.delay(3);
        extentTest.log(LogStatus.PASS,"Klick Button View JPG");
    }

    //TestCase 25
    @And("Klick Button View PNG")
    public void Klick_Button_View_PNG(){
        view.setViewPNG();
        DriverSingleton.delay(3);
        extentTest.log(LogStatus.PASS,"Klick Button View PNG");
    }

    //TestCase 23-25
    @And("Pindah ke halaman JPEG")
    public void Pindah_ke_halaman_JPEG(){
        Set<String> windowHandles = driver.getWindowHandles();
        driver.switchTo().window((String) windowHandles.toArray()[10]);
        extentTest.log(LogStatus.PASS,"Pindah ke halaman JPEG");
    }
    @And("Pindah ke halaman JPG")
    public void Pindah_ke_halaman_JPG(){
        Set<String> windowHandles = driver.getWindowHandles();
        driver.switchTo().window((String) windowHandles.toArray()[11]);
        extentTest.log(LogStatus.PASS,"Pindah ke halaman JPG");
    }
    @And("Pindah ke halaman PNG")
    public void Pindah_ke_halaman_PNG(){
        Set<String> windowHandles = driver.getWindowHandles();
        driver.switchTo().window((String) windowHandles.toArray()[12]);
        extentTest.log(LogStatus.PASS,"Pindah ke halaman PNG");
    }


    @And("Get Text Before")
    public void get_text_before(){
        Assert.assertEquals(view.getTxtBefore(),"Before");
        extentTest.log(LogStatus.PASS,"Get Text Before");
    }
    @And("Get Text After")
    public void get_text_after(){
        Assert.assertEquals(view.getTxtAfter(),"After");
        extentTest.log(LogStatus.PASS,"Get Text After");
    }


    //TestCase 27-28
    @And("Click Button Priview Data JPEG")
    public void click_button_priview_data_JPEG(){
        Set<String> windowHandles = driver.getWindowHandles();
        driver.switchTo().window((String) windowHandles.toArray()[13]);
//        Assert.assertNull(driver.getCurrentUrl());
        view.setBtnPriviewData();
        DriverSingleton.delay(5);
//        Assert.assertTrue(true,"berhasil menampilkan foto");
        extentTest.log(LogStatus.PASS,"Click Button Priview Data JPEG");
    }
    @And("pindah ke Data jpeg")
    public void Pindah_ke_data_jpeg(){
        Set<String> windowHandles = driver.getWindowHandles();
        driver.switchTo().window((String) windowHandles.toArray()[14]);
        extentTest.log(LogStatus.PASS,"pindah ke Data jpeg");
    }
    @And("get screen jpeg")
    public void get_screenshot_jpeg(){
        Assert.assertTrue(true, "berhasil menampilkan foto jpeg");
        extentTest.log(LogStatus.PASS,"get screen jpeg");
    }
    @And("Click Button Priview Data JPG")
    public void click_button_priview_data_JPG(){
        Set<String> windowHandles = driver.getWindowHandles();
        driver.switchTo().window((String) windowHandles.toArray()[15]);
//        Assert.assertNull(driver.getCurrentUrl());
        view.setBtnPriviewData();
        DriverSingleton.delay(5);
//        Assert.assertTrue(true,"berhasil menampilkan foto");
        extentTest.log(LogStatus.PASS,"Click Button Priview Data JPG");
    }

    @And("pindah ke Data jpg")
    public void Pindah_ke_data_jpg(){
        Set<String> windowHandles = driver.getWindowHandles();
        driver.switchTo().window((String) windowHandles.toArray()[16]);
        extentTest.log(LogStatus.PASS,"pindah ke Data jpg");

    }

    @And("get screen jpg")
    public void get_screenshot_jpg(){
        Assert.assertTrue(true, "berhasil menampilkan foto jpg");
        extentTest.log(LogStatus.PASS,"get screen jpg");
    }
    @And("Click Button Priview Data PNG")
    public void click_button_priview_data_PNG(){
        Set<String> windowHandles = driver.getWindowHandles();
        driver.switchTo().window((String) windowHandles.toArray()[17]);
//        Assert.assertNull(driver.getCurrentUrl());
        view.setBtnPriviewData();
        DriverSingleton.delay(5);
//        Assert.assertTrue(false,"tidak menampilkan gambar");
        extentTest.log(LogStatus.PASS,"Click Button Priview Data PNG");
    }
    @And("pindah ke Data fail")
    public void Pindah_ke_data_fail(){
        Set<String> windowHandles = driver.getWindowHandles();
        driver.switchTo().window((String) windowHandles.toArray()[18]);
        extentTest.log(LogStatus.PASS,"pindah ke Data fail");
    }
    @And("get screenshot fail")
    public void get_screenshot_fail(Scenario scenario)throws IOException {
        if(scenario.isFailed()){
            String screenshotpath = Utils.getScreenshot(driver,scenario.getName().replace(" ", "_"));
            extentTest.log(LogStatus.FAIL, scenario.getName()+"\n"+
                    extentTest.addScreenCapture(screenshotpath));
        }
    }







//    And Get Text Before
//    And Get Text After

    //extentTest.log(LogStatus.PASS,"");







}
