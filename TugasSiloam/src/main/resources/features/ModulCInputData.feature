Feature:halaman input Data
  #TCC 0.0.1 Validasi Button input
  Scenario: button Input
    Given Sales click Button Input
    When Sales Get Txt Input Data

  Scenario: Input valid data menggunan SendKey
    Given Masukan Nama lengkap
    When Masukan nomor BPJS
    And Masukan nomor KTP
    And Masukan alamat Pasien
    And Masukan Kota KTP
    And Klick Search Kota KTP
    And Masukan Faskes awal
    And Masukan Faskes Tujuan
    And Klick Seach Faskes Tujuan
#    And Masukan Alasan Pasien
    And Klick Button Submit
    And User Mendapatkan Text berhsil di Simpan
    And Click logut


  Scenario: Input valid data menggunan klick
    Given Input Valid username Sales
    When Input Valid password Sales
    And Admin click button login
    And Sales click Button Input
    And Masukan Nama lengkap
    And Masukan nomor BPJS
    And Masukan nomor KTP
    And Masukan alamat Pasien
    And Masukan Kota KTP
    And Klick Kota Bogor
    And Masukan Faskes awal
    And Masukan Faskes Tujuan
    And Klick Klinik Bogor Selatan
    And Masukan Alasan Pasien
    And Klick Button Submit
    And Click logut

  Scenario: Input valid data menggunan klick
    Given Input Valid username Sales
    When Input Valid password Sales
    And Admin click button login
    And Sales click Button Input
    And Masukan Nama lengkap
    And Masukan nomor BPJS Sudah Ada
    And Masukan nomor KTP
    And Masukan alamat Pasien
    And Masukan Kota KTP
    And Klick Kota Bogor
    And Masukan Faskes awal
    And Masukan Faskes Tujuan
    And Klick Klinik Bogor Selatan
    And Masukan Alasan Pasien
    And Klick Button Submit
    And User Mendapatkan Text BPJS Sudah Ada

  Scenario: Input Bpjs kurang dari 13 Angka
    Given Clear Halaman Login Form
    And Masukan Nama lengkap
    And Masukan nomor BPJS kurang dari Tiga Belas
    And Masukan nomor KTP
    And Masukan alamat Pasien
    And Masukan Kota KTP
    And Klick Search Kota KTP
    And Masukan Faskes awal
    And Masukan Faskes Tujuan
    And Klick Klinik Bogor Selatan
    And Masukan Alasan Pasien
    And Klick Button Submit
    And user get bpjs kurang 13

  Scenario: Nomor BPJS Kosong
    Given Clear Halaman Login Form
    And Masukan Nama lengkap
    And Masukan nomor BPJS kosong
    And Masukan nomor KTP
    And Masukan alamat Pasien
    And Masukan Kota KTP
    And Klick Search Kota KTP
    And Masukan Faskes awal
    And Masukan Faskes Tujuan
    And Klick Klinik Bogor Selatan
    And Masukan Alasan Pasien
    And Klick Button Submit
    And user get required no BPJS

  Scenario: Masukan Nama Menggunakan Angka
    Given Clear Halaman Login Form
    And Masukan Nama lengkap dengan Angka
    And Masukan nomor BPJS
    And Masukan nomor KTP
    And Masukan alamat Pasien
    And Masukan Kota KTP
    And Klick Search Kota KTP
    And Masukan Faskes awal
    And Masukan Faskes Tujuan
    And Klick Klinik Bogor Selatan
    And Masukan Alasan Pasien
    And Klick Button Submit
    And Tidak berhasil menuju tahap selanjutnya

  Scenario: Masukan Nama Menggunakan kosong
    And Click logut
    Given Input Valid username Sales
    When Input Valid password Sales
    And Admin click button login
    And Sales click Button Input
    And Masukan Nama lengkap kosong
    And Masukan nomor BPJS
    And Masukan nomor KTP
    And Masukan alamat Pasien
    And Masukan Kota KTP
    And Klick Kota Bogor
    And Masukan Faskes awal
    And Masukan Faskes Tujuan
    And Klick Klinik Bogor Selatan
    And Masukan Alasan Pasien
    And Klick Button Submit
    And User mendapatkan text Masukan Nama Lengkap

  Scenario: Input Ktp kurang dari 16 Angka
    Given Clear Halaman Login Form
    And Masukan Nama lengkap
    And Masukan nomor BPJS
    And Masukan nomor KTP Kurang dari Enam Belas
    And Masukan alamat Pasien
    And Masukan Kota KTP
    And Klick Kota Bogor
    And Masukan Faskes awal
    And Masukan Faskes Tujuan
    And Klick Klinik Bogor Selatan
    And Masukan Alasan Pasien
    And Klick Button Submit
    And user get ktp kurang Enam Belas

  Scenario: Input Ktp kurang Kosong
    Given Clear Halaman Login Form
    And Masukan Nama lengkap
    And Masukan nomor BPJS
    And Masukan nomor KTP Kosong
    And Masukan alamat Pasien
    And Masukan Kota KTP
    And Klick Kota Bogor
    And Masukan Faskes awal
    And Masukan Faskes Tujuan
    And Klick Klinik Bogor Selatan
    And Masukan Alasan Pasien
    And Klick Button Submit
    And user get ktp kosong

  Scenario: Alamat Kosong
    Given Clear Halaman Login Form
    And Masukan Nama lengkap
    And Masukan nomor BPJS
    And Masukan nomor KTP
    And Masukan Kota KTP
    And Klick Kota Bogor
    And Masukan Faskes awal
    And Masukan Faskes Tujuan
    And Klick Klinik Bogor Selatan
    And Masukan Alasan Pasien
    And Klick Button Submit
    Then user get Alamat kosong

  Scenario: Kota Kosong
    Given Clear Halaman Login Form
    And Masukan Nama lengkap
    And Masukan nomor BPJS
    And Masukan nomor KTP
    And Masukan alamat Pasien
    And Masukan Kota KTP kosong
    And Masukan Faskes awal
    And Masukan Faskes Tujuan
    And Klick Klinik Bogor Selatan
    And Masukan Alasan Pasien
    And Klick Button Submit
    Then user get kota Kosong

  Scenario: faskes awal kosong
    Given Clear Halaman Login Form
    And Masukan Nama lengkap
    And Masukan nomor BPJS
    And Masukan nomor KTP
    And Masukan alamat Pasien
    And Masukan Kota KTP
    And Klick Kota Bogor
    And Masukan Faskes Tujuan
    And Klick Klinik Bogor Selatan
    And Masukan Alasan Pasien
    And Klick Button Submit
    Then user get faskes awal kosong

  Scenario: faskes awal kosong
    Given Clear Halaman Login Form
    And Masukan Nama lengkap
    And Masukan nomor BPJS
    And Masukan nomor KTP
    And Masukan alamat Pasien
    And Masukan Kota KTP
    And Klick Kota Bogor
    And Masukan Faskes awal
    And Masukan Faskes Tujuan Kosong
    And Klick Button Submit
    Then user get faskes Tujuan kosong

  Scenario: Alasan Kosong
    Given Click logut
    And Input Valid username Sales
    When Input Valid password Sales
    And Admin click button login
    And Sales click Button Input
    And Masukan Nama lengkap
    And Masukan nomor BPJS
    And Masukan nomor KTP
    And Masukan alamat Pasien
    And Masukan Kota KTP
    And Klick Kota Bogor
    And Masukan Faskes awal
    And Masukan Faskes Tujuan
    And Klick Klinik Bogor Selatan
    And Masukan Alasan Pasien kosong
    And Klick Button Submit dengan scroll
    Then user get Alasan kosong






