#gherkin has it's specific syntax that we need to follow
  # hashtag is a comment
  #first keyword in a feature should be Feature:
  #Feature: is a title of this Feature: file
  # a Feature is like on test class
  #one feature file will consist of all tests cases related to one particular functionality

Feature: Deposit Test
  # wee also have on ability to add more explanation about this feature file
  Here we would write the extra details about the feature
  Here we would write the extra details about the feature
  Here we would write the extra details about the feature

  #Scenario:  is like 1 test case
  Scenario: we give scenario name here
    #Given  - is used to define pre -conditional steps
    #Given  sentences should be in past tense
    Given Bank account 1 exists with $1000 balance
    #When - is used to define action steps. This is where we actually call
    #the functionality that we are testing
    When Bankk account 1 deposits $100 dollars

    #Then - is used for validations/assertions.
    Then Bank account 1 should have $1100 dollars in balance

    Scenario: Money Transfer with enough balance
      # user or learners or trader, patient ets
      Given User with number 123456 is registered
      #And  is a keyword that helps you repeating the same words
      And User account number 123456 deposited $500
      When User with account number 123456 transfers $300
      And User with account number 123456 transfers $200
      Then  User with account number 123456 should have $0 in balance

