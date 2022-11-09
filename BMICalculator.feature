Feature: To test BMI calculation

@Regression
Scenario Outline: To Test BMI Calculation

Given the calculator website is launched
Then validate the title of page
When BMI calculator visible
Then click on BMI calculator
Then Validate the titile of page again
Then set Age "<Age>"
Then set Height "<Height>"
Then set Weight "<Weight>"
Then click on calculate BMI
When the BMI results visible
Then Capture the BMI results
Then Close driver

Examples:
|Age|Height|Weight|
|10|127|40|
|30|156|70|
|25|152|55|
|20|160|45|
|35|160|70|