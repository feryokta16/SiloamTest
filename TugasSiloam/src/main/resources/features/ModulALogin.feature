Feature: Login Siloam PT Dika
  #TCC.HRM 0.0.1 Login Valid Username Sales
  Scenario: Login Valid Test
    Given Admin enter url Dika Siloam
    And Admin input valid username
    And Admin input valid password
    And Admin click button login
    And Admin menampilkan title page


#    #TCC.HRM 0.0.2 Login Without Username
#  Scenario: Login Invalid without username
#    Given Admin input valid password
#    And Admin click button login
#    Then Admin menampilkan required Username
#
#
#    #TCC.HRM 0.0.3 Login without Password
#  Scenario: Login Invalid Test without password
#    Given clear password
#    When Admin input valid username
#    And Admin click button login
#    Then Admin menampilkan required pass
#
#    #TCC.HRM. 0.0.4 Login Invalid Username
#  Scenario: Login Invalid Username
#    Given clear Username
#    When Admin input invalid username
#    And Admin input valid password
#    And Admin click button login
#    And menampilkan Tulisan Text Dika
#
#        #TCC.HRM. 0.0.5 Login Invalid Password
#  Scenario: Login Invalid Password
#    Given clear Username
#    And clear password
#    When Admin input valid username
#    And Admin input invalid password
#    And Admin click button login
#    And menampilkan Tulisan Text Dika
#
#    #TCC.HRM. 0.0.6 Login valid Admin
#  Scenario: Login Valid Test
#    Given clear username
  # And clear Password
#    When Admin input valid username
#    And Admin input valid password
#    And Admin click button login
#    And Admin menampilkan title page
#    And Click logut
#
#    #TCC.HRM. 0.0.6 Uji Coba Halaman Logout
#  Scenario: Login Valid Test
#    Given click profile
#    When click logout
#    And menampilkan Tulisan Text Dika


