
@tag
Feature: Test Me
  I want to use this template for my feature file

  
  Scenario: registration
    Given the user opens the Testme app
   When  click on the signup button
    And user enters username "saravana222" 
    And user enters first name "dab" 
     And user enters last name "god" 
     And user enters password "qwerty" 
      And user enters confirm password "qwerty" 
     And user enters gender as male
      And user enters dob "28/02/1998"
     And user enters email "abcd@gmail.com" 
     And user enters mobile number "1234567890" 
     And enters adress "25/6 chennai" 
      And user enters selects security question
       And user enters answer "sydney" 
     When register button is clicked
  @sanity
Scenario Outline: login
   Given launch the chrome driver and launch the test me app
   When clicks on the signin button
   And user enters the "<username>" 
    When user enters "<password>" in step
    Then click in login button
    And search product by type
    Then add to cart and clickcart
    Then go to payment page

    Examples: 
      | username   | password     | 
      | Lalitha    |Password123   | 
      
  