Feature: Testing Login Functionaly

  Scenario Outline: Login Functionality
   Given: User enter opened instagram
   When: User Enter "<Username>" and "<password>"
   Then: User Entered in Insta Page

    Examples:
      |Username|passowrd|
      |Nani|success|
      |P|Fail|
