Feature: halaman upload Data

  # Foto Faskes Awal
  #Scenario 1
  Scenario: Upload Data Faskes Awal Menggunakan Format JPG
    Given Sales click Button Input
    When Sales Masukan data diri
    And Sales click button foto faskes awal
    And user memilih foto faskes awal dengan format jpg
    And User click button simpan upload foto
    And User get text berhasil upload data
    And User click btn ok upload data

  #Scenario 2
  Scenario: Upload Data Faskes Awal Menggunakan Format JPEG
    Given Sales click button foto faskes awal
    And user memilih foto faskes awal dengan format jpeg
    And User click button simpan upload foto
    And User get text berhasil upload data
    And User click btn ok upload data

  #Scenario 3
  Scenario: Upload Data Faskes Awal Menggunakan Format PNG
    Given Sales click button foto faskes awal
    And user memilih foto faskes awal dengan format png
    And User click button simpan upload foto
    And User get text berhasil upload data
    And User click btn ok upload data

  #Scenario 4
  Scenario: Upload Foto dengan Tema PDF
    Given Sales click button foto faskes awal
    And user memilih foto faskes awal dengan format pdf
    And User click button simpan upload foto
    And User get text DissAlow Data
    And User click btn cancel

  #Scenario 5
  Scenario: Upload Foto dengan ukuran lebih besar
    Given Sales click button foto faskes awal
    And user memilih foto faskes awal dengan lebih besar
    And User click button simpan upload foto
    And User get text large Data
    And User click btn cancel

  #Scenario 6
  Scenario: Upload Data Faskes Awal kemudian Klick Cancel
    Given Sales click button foto faskes awal
    And user memilih foto faskes awal dengan format jpg
    And User click btn cancel
    And User get text Form Input

  #Scenario  7
  Scenario: Upload Data Faskes Awal kemudian Klick button close
    Given Sales click button foto faskes awal
    And user memilih foto faskes awal dengan format jpg
    And User click btn close
    And User get text Form Input

    ## Foto Faskes Tujuan

    #Scenario 8
  Scenario: Upload Foto Faskes Tujuan Jpg
      Given Sales click button foto faskes Tujuan
      And user memilih foto faskes awal dengan format jpg
      And User click button simpan upload foto
      And User get text berhasil upload data
      And User click btn ok upload data

  #Scenario 9
  Scenario: Upload Foto Faskes Tujuan Jpeg
    Given Sales click button foto faskes Tujuan
    And user memilih foto faskes awal dengan format jpeg
    And User click button simpan upload foto
    And User get text berhasil upload data
    And User click btn ok upload data

  #Scenario 10
  Scenario: Upload Foto Faskes Tujuan Png
    Given Sales click button foto faskes Tujuan
    And user memilih foto faskes awal dengan format png
    And User click button simpan upload foto
    And User get text berhasil upload data
    And User click btn ok upload data

    #Scenario 11
  Scenario: Upload Foto dengan Tema PDF
    Given Sales click button foto faskes Tujuan
    And user memilih foto faskes awal dengan format pdf
    And User click button simpan upload foto
    And User get text DissAlow Data
    And User click btn cancel

    #Scenario 12
  Scenario: Upload Foto dengan ukuran lebih besar
    Given Sales click button foto faskes Tujuan
    And user memilih foto faskes awal dengan lebih besar
    And User click button simpan upload foto
    And User get text large Data
    And User click btn cancel

    #Scenario 13
  Scenario: Upload Data Faskes Awal kemudian Klick Cancel
    Given Sales click button foto faskes Tujuan
    And user memilih foto faskes awal dengan format jpg
    And User click btn cancel
    And User get text Form Input

    #Scenario 14
  Scenario: Upload Data Faskes Awal kemudian Klick button
    Given Sales click button foto faskes Tujuan
    And user memilih foto faskes awal dengan format jpg
    And User click btn close
    And User get text Form Input


    #Tanda Tangan Digital

  #Scenario 15
  Scenario: Upload Foto tanda Tangan Jpg
    Given Sales click button foto Tanda Tangan Digital
    And user memilih foto faskes awal dengan format jpg
    And User click button simpan upload foto
    And User get text berhasil upload data
    And User click btn ok upload data

    #Scenario 16
  Scenario: Upload Foto Faskes Tujuan Jpeg
    Given Sales click button foto Tanda Tangan Digital
    And user memilih foto faskes awal dengan format jpeg
    And User click button simpan upload foto
    And User get text berhasil upload data
    And User click btn ok upload data

    #Scenario 17
  Scenario: Upload Foto Faskes Tujuan Png
    Given Sales click button foto Tanda Tangan Digital
    And user memilih foto faskes awal dengan format png
    And User click button simpan upload foto
    And User get text berhasil upload data
    And User click btn ok upload data

    #Scenario 18
  Scenario: Upload Foto dengan Tema PDF
    Given Sales click button foto Tanda Tangan Digital
    And user memilih foto faskes awal dengan format pdf
    And User click button simpan upload foto
    And User get text DissAlow Data
    And User click btn cancel

    #Scenario 19
  Scenario: Upload Foto dengan ukuran lebih besar
    Given Sales click button foto Tanda Tangan Digital
    And user memilih foto faskes awal dengan lebih besar
    And User click button simpan upload foto
    And User get text large Data
    And User click btn cancel

    #Scenario 20
  Scenario: Upload Data Faskes Awal kemudian Klick Cancel
    Given Sales click button foto Tanda Tangan Digital
    And user memilih foto faskes awal dengan format jpg
    And User click btn cancel
    And User get text Form Input

    #Scenario 21
  Scenario: Upload Data Faskes Awal kemudian Klick button
    Given Sales click button foto Tanda Tangan Digital
    And user memilih foto faskes awal dengan format jpg
    And User click btn close
    And User get text Form Input
    And Click logut

#    #Scenario: 22
  Scenario:  Upload Data Secara bersama
    Given Input Valid username Sales
    When Input Valid password Sales
    And Admin click button login
    And Sales click Button Input
    And Sales Masukan data diri
    And Sales click button foto faskes awal
    And user memilih foto faskes awal dengan format jpg
    And User click button simpan upload foto
    And User get text berhasil upload data
    And User click btn ok upload data
    And Sales click button foto faskes Tujuan
    And user memilih foto faskes awal dengan format jpg
    And User click button simpan upload foto
    And User get text berhasil upload data
    And User click btn ok upload data
    And Sales click button foto Tanda Tangan Digital
    And user memilih foto faskes awal dengan format jpg
    And User click button simpan upload foto
    And User get text berhasil upload data
    And User click btn ok upload data
    And User get Text Complate
    And User Click Btn Selanjutnya

