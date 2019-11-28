@Tag0
Feature: As a user I want to evaluate the quality of the jobs section of the Choucair website, in
  this page I want to verify that the information is right, I want to search a job and register the required fields.

  @Tag1
  Scenario: Interact on the services section of the Choucair website
    Given That User wants to evaluate the quality on the jobs section of the Choucair website
    When The user enters and interacts with the existing sections on the page, and opens the Black box Techniques link.
    Then The User verifies the link contains the text right.
      | out  |
      | Foundation Level - ISTQB - Clases de Equivalencia  |

  @Tag2
  Scenario: Search a job, register but the registration is not successful
    Given That User wants to search a job and register the data on the jobs section of the Choucair website
    When The User searches a job but not registers all his data in the required fields
      | keyword  | location  | fullName         |  email            | phone      | studies             | experience    | knowAtumation                            | salary  | availableTime  | message |
      | Analista | Medellín  | Leidy Ruiz Rojas |  email@gmail.com  | 3004564333 | mechatronic systems | No Experience | I know a little but i would like to learn|  1      | Inmediata      | Nothing |
    Then The User sends the register but it is not successfully
      | errorOutput              |
      | campos tienen un error |

  @Pending
  Scenario: Checks the phone field
    Given That User wants to apply a job at the Choucair Testing
    When The User is registering his data he type your phone number wrong
    Then The User should see a message reporting the error

  @Pending
  Scenario: Checks the Salary field
    Given That User wants to apply a job at the Choucair Testing
    When The User is registering his data and he type the value of salary wrong
    Then The User should see a message reporting the error


  @Manual
  Scenario: Check for misspelling or drafting errors in the jobs webpage
    Given That User wants to read the jobs webPage
    When The User find a misspelling
    Then  User report that error to Choucair.

  @Manual
  Scenario: Functional correction about section what is be Choucair?
    Given That User wants to use the module
    When The User clicks on the section
    Then The User can't see the right information.

  @Manual
  Scenario: Functional correction about section Prepare to apply
    Given That User wants to use the module
    When The User clicks on the section Prepare to apply
    Then The User can't see it because the module is not functional.

