package com.juaracoding.utils;

public enum TestCases {
    //Upload Data

    T1("Login succes"), //gaboleh diganti
//    T2("Upload Data Faskes Awal Menggunakan Format JPG"), //Dimodul scenario 1
//    T3("Upload Data Faskes Awal Menggunakan Format JPEG"),
//    T4("Upload Data Faskes Awal Menggunakan Format PNG"),
//    T5("Upload Data Faskes Awal Menggunakan Format PDF"),
//    T6("Upload Data Faskes Awal Menggunakan dengan Ukuran Lebih Dari 5MB"),
//    T7("Upload Data Faskes Awal kemudian Klick Cancel"),
//    T8("Upload Data Faskes Awal kemudian Klick button close"),
//    T9("Upload Foto Faskes Tujuan Jpg"),
//    T10("Upload Foto Faskes Tujuan Jpeg"),
//    T11("Upload Foto Faskes Tujuan Png"),
//    T12("Upload Foto dengan Tema PDF"),
//    T13("Upload Foto dengan ukuran lebih besar"),
//    T14("Upload Data Faskes Awal kemudian Klick Cancel"),
//    T15("Upload Data Faskes Awal kemudian Klick button"),
//    T16("Upload Foto tanda Tangan Jpg"),
//    T17("Upload Foto Faskes Tujuan Jpeg"),
//    T18("Upload Foto Faskes Tujuan Png"),
//    T19("Upload Foto dengan Tema PDF"),
//    T20("Upload Foto dengan ukuran lebih besar"),
//    T21("Upload Data Faskes Awal kemudian Klick Cancel"),
//    T22("Upload Data Faskes Awal kemudian Klick button"),
//    T23("Masukin semua bareng");

//    T1("Login Valid Test"),
//    T2("Validasi Button input"),
//    T3("input valid data"),
//    T4("Input valid data klick"),
//    T5("Nomor BPJS Sudah Ada"),
//    T6("BPJS Kurang 13 Angka"),
//    T7("Nomor BPJS KOSONG"),
//    T8("Masukan nama denngan angka"),
//    T9("input dengan nama kosong"),
//    T10("Input Ktp Kurang dari 16"),
//    T11("Input Ktp kosong"),
//    T12("Alamat Kosong"),
//    T13("Kota Kosong"),
//    T14("faskes awal kosong"),
//    T15("Faskes Tujuan kosong"),
//    t16("tujuan kosong")
//    ;




    //Test case Halaman Login
//    T2("Login Tanpa Username"),
//    T3("Login Tanpa Password "),
//    T4("Login invalid Username"),
//    T5("Login invalid Password"),
//    T6("Login valid Username"),
//    T7("Halaman Logout");


//Test Case halaman View Admin
    T2("Home screen"),
    T3("Filter Data"),
    T4("Refresh data"),
    T5("Blank Start Date"),
    T6("Blank End Date"),
    T7("Input Tanpa Start Date And End Date"),
    T8("Export data"),
    T9("Export Data tanpa Melakukan Filter"),
    T10("Export Data menggunakan Tanggal Tanpa Data"),
    T11("download data"),
    T12("Download Data Tanpa Filter"),
    T13("Download Data Tanpa Tanggal Tanpa Data"),
    T14("View Foto Awal Format JPEG"),
    T15("View Foto Awal Tujuan JPEG"),
    T16("View PDF Agreement Format JPEG"),
    T17("View Foto Awal Format JPG"),
    T18("View Foto Awal Tujuan JPG"),
    T19("View PDF Agreement Format JPG"),
    T20("View Foto Awal Format PNG"),
    T21("View Foto  Tujuan Format PNG"),
    T22("View PDF Agreement Format PNG"),
    T23("View Data JPEG"),
    T24("View Data JPG"),
    T25("View Data PNG"),
    T26("Preview Data JPEG"),
    T27("Priview Data JPG"),
    T28("Priview Data PNG"),
    T29("Logout");




    private String testCaseName;

    TestCases(String value){
        testCaseName = value;
    }

    public  String getTestCaseName(){
        return testCaseName;
    }
}
