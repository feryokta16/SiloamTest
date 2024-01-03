Feature: View
#TCC.HRM 0.0.2
 Scenario: Home screen
    Given Admin click button View
    And Admin get text view


#TCC.HRM 0.0.3 Filter Data
 Scenario: Filter Data
    Given Masukan Tanggal Start
     And click tombol back
     And click tombol next
    Then  Masukan Tanggal dua
    And Masukan Tanggal End
   And click tombol back End
   And click tombol next End
    And  Masukan Tanggal delapan
    And klick Button Filter
   Then Admin get Data

#TCC HRM 0.0.4 Refresh Data
 Scenario: refresh data
    Given Klick Button Refresh
    Then Masukan Tanggal Start
    And Masukan Tanggal Satu
    And  Masukan Tanggal End
    And Masukan Tanggal dua
    And Klick Button Refresh
   Then data berhasil di Refresh

#TCC HRM 0.0.5 Blank Start Date
 Scenario: Input tanpa Start Date
    Given Klick Button Refresh
    Then Masukan Tanggal Start
    And Masukan Send Tanggal dua
    And  Masukan Tanggal End
    And Masukan Tanggal dua
    And klick Button Filter
   Then Menampilkan Alert Start Date Please Fill Out This Field

 #TCC HRM 0.0.6 Blank End Date
   Scenario: Input Tanpa End Date
      Given Klick Button Refresh
      Then Masukan Tanggal Start
      And Masukan Tanggal Satu
      And  Masukan Tanggal End
      And klick Button Filter
     Then Menampilkan Alert End Date Please Fill Out This Field


#TCC HRM 0.0.7 Blank Start Date And And Date
   Scenario:  Input Tanpa Start Date And End Date
      Given Klick Button Refresh
      Then Masukan Tanggal Start
      And Masukan Send Tanggal dua
      And Masukan Tanggal End
      And Masukan Send Tanggal dua
      And klick Button Filter
     Then Menampilkan Alert Start Date Please Fill Out This Field

#TCC HRM 0.0.8 Export Data
 Scenario: Export data
    Given Klick Button Refresh
    Then Masukan Tanggal Start
    And Masukan Tanggal Sepuluh Start
    And  Masukan Tanggal End
    And Masukan Tanggal Sepuluh End
    And klick Button Filter
    And Klick Button Export
   Then Admin berhasil Export Data

 #TCC HRM 0.0.9 Export Data tanpa Melakukan Filter
    Scenario: Export Data Tanpa Filter
   Given Klick Button Refresh
    And Klick Button Export
    Then Admin Get Text Danger

 #TCC HRM 0.0.10 Export Data Dengan menggunakan Tanggal yang Tidak memiliki Data
  Scenario:  Export Data menggunakan Tanggal Tanpa Data
  Given Klick Button Refresh
  And Masukan Tanggal Start
  And Masukan Tanggal Empat
  And Masukan Tanggal End
  And Masukan Tanggal Empat
  And klick Button Filter
  And Klick Button Export
  Then Admin get text Data Kosong

#TCC HRM 0.0.11 Download Data
 Scenario: download data
    Given Klick Button Refresh
    Then Masukan Tanggal Start
    And Masukan Tanggal Sepuluh Start
    And  Masukan Tanggal End
    And Masukan Tanggal Sepuluh End
    And klick Button Filter
    And Klick Button Download
   Then Data Berhasil DiDownload

#TCC HRM 0.0.12 Download Data Tanpa Filter
  Scenario: Download Data Tanpa Filter
    Given Klick Button Refresh
    And Klick Button Download
    Then Admin Get Text Danger

#TCC HRM 0.0.13 Download Data  Dengan menggunakan Tanggal yang Tidak memiliki Data
  Scenario:Download Data menggunakan Tanggal Tanpa Data
    Given Klick Button Refresh
    And Masukan Tanggal Start
    And Masukan Tanggal Empat
    And Masukan Tanggal End
    And Masukan Tanggal Empat
    And klick Button Filter
    And Klick Button Download
    Then Admin get text Data Kosong


#TCC HRM 0.0.14 View Foto Awal dengan Format JPEG
  Scenario: View Foto Awal Format JPEG
    Given Klick Button Refresh
    And Masukan Tanggal Start
    And Masukan Tanggal Sepuluh Start
    And Masukan Tanggal End
    And Masukan Tanggal Sepuluh End
    And klick Button Filter
    And Klick Button Foto Awal JPEG
    And Berhasil menampilkan Foto Awal JPEG
    Then Swich Page


#TCC HRM 0.0.15 View Foto Tujuan dengan Format JPEG
  Scenario: View Foto Tujuan Format JPEG
    Given Klick Button Refresh
    And Masukan Tanggal Start
    And Masukan Tanggal Sepuluh Start
    And Masukan Tanggal End
    And Masukan Tanggal Sepuluh End
    And klick Button Filter
    And Klick Button Foto Tujuan JPEG
    And Berhasil menampilkan Foto Akhir JPEG
    Then Swich Page

#TCC HRM 0.0.16 View PDF Agrement dengan Format JPEG
  Scenario: View Foto PDF Agreement JPEG
    Given Klick Button Refresh
    And Masukan Tanggal Start
    And Masukan Tanggal Sepuluh Start
    And Masukan Tanggal End
    And Masukan Tanggal Sepuluh End
    And klick Button Filter
    And Klick Button PDF Agreement JPEG
    And Berhasil menampilkan PDF Agreement JPEG
    Then Swich Page

  #TCC HRM 0.0.17 View Foto Awal dengan Format JPG
  Scenario: View Foto Awal Format JPG
    Given Klick Button Refresh
    And Masukan Tanggal Start
    And Masukan Tanggal Sepuluh Start
    And Masukan Tanggal End
    And Masukan Tanggal Sepuluh End
    And klick Button Filter
    And Klick Button Foto Awal JPG
    And Berhasil menampilkan Foto Awal JPG
    Then Swich Page


#TCC HRM 0.0.18 View Foto Tujuan dengan Format JPG
  Scenario: View Foto Tujuan Format JPG
    Given Klick Button Refresh
    And Masukan Tanggal Start
    And Masukan Tanggal Sepuluh Start
    And Masukan Tanggal End
    And Masukan Tanggal Sepuluh End
    And klick Button Filter
    And Klick Button Foto Tujuan JPG
    And Berhasil menampilkan Foto Tujuan JPG
    Then Swich Page

#TCC HRM 0.0.19 View PDF Agreement dengan Format JPG
  Scenario: View PDF Agreement Format JPG
    Given Klick Button Refresh
    And Masukan Tanggal Start
    And Masukan Tanggal Sepuluh Start
    And Masukan Tanggal End
    And Masukan Tanggal Sepuluh End
    And klick Button Filter
    And Klick Button PDF Agreement JPG
    And Berhasil menampilkan PDF Agreement JPG
    Then Swich Page

  #TCC HRM 0.0.20 View Foto Awal dengan Format PNG
  Scenario: View Foto Awal Format PNG
    Given Klick Button Refresh
    And Masukan Tanggal Start
    And Masukan Tanggal Sepuluh Start
    And Masukan Tanggal End
    And Masukan Tanggal Sepuluh End
    And klick Button Filter
    And Klick Button Foto Awal PNG
    And Berhasil menampilkan Foto Awal PNG
    Then Swich Page


#TCC HRM 0.0.21 View Foto Tujuan dengan Format PNG
  Scenario: View Foto tujuan Format PNG
    Given Klick Button Refresh
    And Masukan Tanggal Start
    And Masukan Tanggal Sepuluh Start
    And Masukan Tanggal End
    And Masukan Tanggal Sepuluh End
    And klick Button Filter
    And Klick Button Foto Tujuan PNG
    And Berhasil menampilkan Foto Akhir PNG
    Then Swich Page

#TCC HRM 0.0.22 View Foto Tujuan dengan Format PNG
  Scenario: View Foto PDF Agreement Format PNG
    Given Klick Button Refresh
    And Masukan Tanggal Start
    And Masukan Tanggal Sepuluh Start
    And Masukan Tanggal End
    And Masukan Tanggal Sepuluh End
    And klick Button Filter
    And Klick Button PDF Agreement PNG
    And berhasil menampilkan PDF Agreement PNG
    Then Swich Page


 #TCC HRM 0.0.23 View data JPEG
  Scenario: View Foto Awal Format JPEG
    Given Klick Button Refresh
    And Masukan Tanggal Start
    And Masukan Tanggal Sepuluh Start
    And Masukan Tanggal End
    And Masukan Tanggal Sepuluh End
    And klick Button Filter
    And Klick Button View JPEG
    And Pindah ke halaman JPEG
    And Get Text Before
    And Get Text After
    Then Swich Page


#TCC HRM 0.0.24 View data JPG
  Scenario: View Foto Awal Format JPG
    Given Klick Button Refresh
    And Masukan Tanggal Start
    And Masukan Tanggal Sepuluh Start
    And Masukan Tanggal End
    And Masukan Tanggal Sepuluh End
    And klick Button Filter
    And Klick Button View JPG
    And Pindah ke halaman JPG
    And Get Text Before
    And Get Text After
    Then Swich Page

#TCC HRM 0.0.25 View data PNG
  Scenario: View Foto Awal Format PNG
    Given Klick Button Refresh
    And Masukan Tanggal Start
    And Masukan Tanggal Sepuluh Start
    And Masukan Tanggal End
    And Masukan Tanggal Sepuluh End
    And klick Button Filter
    And Klick Button View PNG
    And Pindah ke halaman PNG
    And Get Text Before
    And Get Text After
    Then Swich Page

#TCC HRM 0.0.26 PreView data JPEG
  Scenario: View Foto Awal Format JPEG
    Given Klick Button Refresh
    And Masukan Tanggal Start
    And Masukan Tanggal Sepuluh Start
    And Masukan Tanggal End
    And Masukan Tanggal Sepuluh End
    And klick Button Filter
    And Klick Button View JPEG
    And Click Button Priview Data JPEG
    And pindah ke Data jpeg
    And get screen jpeg
    Then Swich Page

#TCC HRM 0.0.27 PreView data JPG
  Scenario: View Foto Awal Format JPG
    Given Klick Button Refresh
    And Masukan Tanggal Start
    And Masukan Tanggal Sepuluh Start
    And Masukan Tanggal End
    And Masukan Tanggal Sepuluh End
    And klick Button Filter
    And Klick Button View JPG
    And Click Button Priview Data JPG
    And pindah ke Data jpg
    And get screen jpg
    Then Swich Page

 #TCC HRM 0.0.28 PreView data PNG
  Scenario: View Foto Awal Format PNG
    Given Klick Button Refresh
    And Masukan Tanggal Start
    And Masukan Tanggal Sepuluh Start
    And Masukan Tanggal End
    And Masukan Tanggal Sepuluh End
    And klick Button Filter
    And Klick Button View PNG
    And Click Button Priview Data PNG
    And pindah ke Data fail
    And get screenshot fail


    Scenario: Logout
    Then Swich Page
    Then Click logut












##TCC HRM 0.0.9 Foto
# Scenario: Foto Faskes Awal
#    Given click Button Faskes Foto Awal
#    Then Close Faskes
#    And click Button Faskes Foto Akhir
#    Then Close Faskes
#    And Click Pdf Agreement
#    Then Close Faskes
