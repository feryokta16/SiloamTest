package com.juaracoding;

import com.juaracoding.Driver.DriverSingleton;
import com.juaracoding.pages.InputDataPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.openqa.selenium.JavascriptExecutor;


public class InputTestJava {

    private static WebDriver driver;
    private static InputDataPage inputDataPage = new InputDataPage();
    private ExtentTest extentTest;

    JavascriptExecutor js = (JavascriptExecutor) driver;

    public InputTestJava() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("Sales click Button Input")
    public void sales_click_button_input() {
        inputDataPage.setBtnInput();
        extentTest.log(LogStatus.PASS, "Sales click Button Input");
    }

    @When("Sales Get Txt Input Data")
    public void sales_get_txt_input_data() {
        inputDataPage.getTxtInput();
        extentTest.log(LogStatus.PASS, "Sales Get Txt Input Data");
    }

    @Given("Masukan Nama lengkap")
    public void masukan_nama_lengkap() {
        inputDataPage.setFullName();
        extentTest.log(LogStatus.PASS, "Masukan Nama lengkap");
    }

    @When("Masukan nomor BPJS")
    public void masukan_nomor_bpjs() {
        inputDataPage.setNoBpjs();
        extentTest.log(LogStatus.PASS, "Masukan nomor BPJS");
    }

    @And("Masukan nomor KTP")
    public void masukan_nomor_KTP() {
        inputDataPage.setNoKTP();
        extentTest.log(LogStatus.PASS, "Masukan nomor KTP");
    }

    @And("Masukan alamat Pasien")
    public void masukan_alamat_pasien() {
        inputDataPage.setAlamatPasien();
        extentTest.log(LogStatus.PASS, "Masukan alamat Pasien");
    }

    @And("Masukan Kota KTP")
    public void masukan_kota_ktp() {
        inputDataPage.setKotaKptp();
        extentTest.log(LogStatus.PASS, "Masukan Kota KTP");
    }

    @And("Klick Search Kota KTP")
    public void masukan_search_kota_ktp() {
        inputDataPage.Search();
        DriverSingleton.delay(2);
        extentTest.log(LogStatus.PASS, "Klick Search Kota KTP");
    }

    @And("Masukan Faskes awal")
    public void masukan_faskes_awal() {
        inputDataPage.setFaskesAwal();
        DriverSingleton.delay(3);
        extentTest.log(LogStatus.PASS, "Masukan Faskes awal");
    }

    @And("Masukan Faskes Tujuan")
    public void masukan_faskes_tujuan() {
        inputDataPage.setFaskesTujuan();
        extentTest.log(LogStatus.PASS, "Masukan Faskes Tujuan");
    }

    @And("Klick Seach Faskes Tujuan")
    public void klick_search_faskes_tujuan() {
        inputDataPage.setSearchTujuan();
        extentTest.log(LogStatus.PASS, "Klick Seach Faskes Tujuan");
    }

    @And("Masukan Alasan Pasien")
    public void masukan_alasan_pasien() {
        inputDataPage.setAlasanPasien();
        extentTest.log(LogStatus.PASS, "Masukan Alasan Pasien");
    }

    @And("Klick Button Submit")
    public void klick_button_submit() {
        inputDataPage.setBtnSubmit();
        extentTest.log(LogStatus.PASS, "Klick Button Submit");
    }

    @And("Klick Kota Bogor")
    public void klinick_kota_bogor() {
        inputDataPage.kotaBogor();
        extentTest.log(LogStatus.PASS, "lick Kota Bogor");
    }

    @And("Klick Klinik Bogor Selatan")
    public void klick_klinik_bogor_selatan() {
        inputDataPage.clickBogorSelatan();
        extentTest.log(LogStatus.PASS, "Klick Klinik Bogor Selatan");
    }

    @And("Masukan nomor BPJS Sudah Ada")
    public void masukan_nomor_bpjs_sudah_ada() {
        inputDataPage.setNoBpjsSudahAda();
        extentTest.log(LogStatus.PASS, "Masukan nomor BPJS Sudah Ada");
    }

    @And("User Mendapatkan Text BPJS Sudah Ada")
    public void user_mendapatkan_text_BPJS_sudah_Ada() {
        Assert.assertEquals(inputDataPage.getTxtBPJSSudahAda(), "The Nomor BPJS already exist.");
        extentTest.log(LogStatus.PASS, "User Mendapatkan Text BPJS Sudah Ada");
    }

    @Given("Clear Halaman Login Form")
    public void clear_halaman_login_form() {
        inputDataPage.clearHalamanFormInput();
        extentTest.log(LogStatus.PASS, "User Mendapatkan Text BPJS Sudah Ada");
    }

    @And("Masukan nomor BPJS kurang dari Tiga Belas")
    public void masukan_nomor_bpjs_kurang_dari_tigabelas() {
        inputDataPage.setNoBpjsKurang();
        extentTest.log(LogStatus.PASS, "Masukan nomor BPJS kurang dari Tiga Belas");
    }

    @And("Masukan nomor BPJS kosong")
    public void masukan_nomor_BPJS_kosong() {
        inputDataPage.bpjsKosong();
        extentTest.log(LogStatus.PASS, "Masukan nomor BPJS kosong");
    }

    @And("user get bpjs kurang 13")
    public void user_get_bpjs_kurang_tigabelas() {
        Assert.assertTrue(true, inputDataPage.getTextKurang13());
        extentTest.log(LogStatus.PASS, "user get bpjs kurang 13");
    }

    @And("user get required no BPJS")
    public void user_get_required_no_BPJS() {
        Assert.assertTrue(true, inputDataPage.getRequirednoBPJS());
        extentTest.log(LogStatus.PASS, "user get required no BPJS");
    }

    @And("Masukan Nama lengkap dengan Angka")
    public void masukan_nama_lengap_dengan_angka() {
        inputDataPage.setFullNameAngka();
        extentTest.log(LogStatus.PASS, "Masukan Nama lengkap dengan Angka");
    }

    @And("Tidak berhasil menuju tahap selanjutnya")
    public void tidak_berhasil_menuju_tahap_selanjutnya() {
        Assert.assertTrue(false, "gaada foto");
        DriverSingleton.delay(2);
        extentTest.log(LogStatus.PASS, "Tidak berhasil menuju tahap selanjutnya");
    }

    @Given("Masukan Nama lengkap kosong")
    public void masukan_nama_lengkap_kosong() {
        inputDataPage.setFullNameKosong();
        extentTest.log(LogStatus.PASS, "Masukan Nama lengkap kosong");
    }

    @And("User mendapatkan text Masukan Nama Lengkap")
    public void user_mendapatkan_text_nama_lengkap_kosong() {
        Assert.assertTrue(true, inputDataPage.getTxtNameKosong());
        extentTest.log(LogStatus.PASS, "User mendapatkan text Masukan Nama Lengkap");
    }

    @And("Masukan nomor KTP Kurang dari Enam Belas")
    public void masukan_nomor_ktp_kurang_dari_15() {
        inputDataPage.setNoKTPKurangEnamBelas();
        extentTest.log(LogStatus.PASS, "Masukan nomor KTP Kurang dari Enam Belas");
    }

    @And("user get ktp kurang Enam Belas")
    public void user_get_ktp_kurang_enam_belas() {
        Assert.assertTrue(true, inputDataPage.getTxtKTPKurangEnamBelas());
        extentTest.log(LogStatus.PASS, "user get ktp kurang Enam Belas");
    }

    @And("Masukan nomor KTP Kosong")
    public void masukan_nomor_ktp_kosong() {
        inputDataPage.setNoKTPKosong();
        extentTest.log(LogStatus.PASS, "Masukan nomor KTP Kosong");
    }

    @And("user get ktp kosong")
    public void user_get_ktp_kosong() {
        Assert.assertTrue(true, inputDataPage.getTxtKTPRequired());
        extentTest.log(LogStatus.PASS, "user get ktp kosong");
    }

    @Then("user get Alamat kosong")
    public void user_get_alamat_kosong() {
        Assert.assertEquals(inputDataPage.getTxtAlamatkosong(), "Field Alamat Harus Diisi!");
        extentTest.log(LogStatus.PASS, "user get Alamat kosong");
    }

    @Then("user get kota Kosong")
    public void user_get_kota_kosong() {
        Assert.assertTrue(true, inputDataPage.getTxtKotaKosong());
        extentTest.log(LogStatus.PASS, "user get kota Kosong");
    }

    @Then("user get faskes awal kosong")
    public void user_get_faskes_awal_kosong() {
        Assert.assertTrue(true, inputDataPage.getFaskesAwalKosong());
        extentTest.log(LogStatus.PASS, "user get faskes awal kosong");
    }

    @And("Masukan Kota KTP kosong")
    public void masukan_kota_ktp_kosong() {
        inputDataPage.clearkotaktp();
        extentTest.log(LogStatus.PASS, "Masukan Kota KTP kosong");
    }

    @And("Masukan Faskes Tujuan Kosong")
    public void masukan_faskes_tujuan_kosong() {
        inputDataPage.kosongkanFaskestujuan();
        extentTest.log(LogStatus.PASS, "Masukan Faskes Tujuan Kosong");
    }

    @Then("user get faskes Tujuan kosong")
    public void user_get_faskes_tujuan_kosong() {
        Assert.assertTrue(true, inputDataPage.getTxtFaskesTujuanKosong());
        extentTest.log(LogStatus.PASS, "user get faskes Tujuan kosong");
    }

    @And("Masukan Alasan Pasien kosong")
    public void masukan_alasan_pasien_kosong() {
        inputDataPage.alasankosong();
        DriverSingleton.delay(5);
        extentTest.log(LogStatus.PASS, "Masukan Alasan Pasien kosong");
    }

    @Then("user get Alasan kosong")
    public void user_get_alasan_kosong() {
        Assert.assertEquals(inputDataPage.getTxtAlasanKosong(), "Field Alasan Harus Diisi!");
        extentTest.log(LogStatus.PASS, "user get Alasan kosong");
    }

    @And("Klick Button Submit dengan scroll")
    public void klick_button_submit_dengan_scroll() {
        inputDataPage.setBtnSubmit();
        js.executeScript("window.scrollBy(0,900)");
        DriverSingleton.delay(5);
        extentTest.log(LogStatus.PASS, "Klick Button Submit");
    }
    @And("User Mendapatkan Text berhsil di Simpan")
    public void user_mendapatkan_text_berhasil_disimpan(){
        Assert.assertEquals(inputDataPage.gettxtBerhasilDisimapan(),"Data berhasil Di Simpan\n" +
                "×");
        extentTest.log(LogStatus.PASS,"User Mendapatkan Text berhsil di Simpan");
    }


}
