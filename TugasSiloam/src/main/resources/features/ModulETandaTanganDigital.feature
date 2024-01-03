Feature: halaman upload Data

  # Foto Faskes Awal
  #Scenario 1
  Scenario: Ganti nama Pasien
    Given Sales click Button Input
    When Sales Masukan data diri
    And Unggah Documen Pendukung
    And click button edit
    And Ganti Nama Pasien
    Then Simpan Perubahan Data
    And user get nama baru