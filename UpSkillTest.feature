Feature: To test elearning Upskill page

Scenario: To Test elearning Upskill page

Given Launch the elearning website
When the Signup button visible
Then click on Signup button
And set the FirstName
And set the LastName
And set the e-mail
And set the Username
And set the Pass
And set the ConfirmPass
When the Register button visible
Then click on Register
When the Next button is visible
Then click on Next button
When userName dropdown vissible
Then click on DropDown
Then Click on Profile
When the Messages button visible
Then Click on MessagesBtn
When the ComposeMessage button visible 
Then Click on CompMsg button
And set the SendTo field
And set the Subject
When the SendMessage button visible
Then click on SendMessage
Then check the errorMessage

@Regression
Scenario: To Test UpSkill Edit Profile
Given Launch the elearning website
When the Signup button visible
Then click on Signup button
And set the FirstName
And set the LastName
And set the e-mail
And set the Username
And set the Pass
And set the ConfirmPass
When the Register button visible
Then click on Register
When the Next button is visible
Then click on Next button
When userName dropdown vissible
Then click on DropDown
Then Click on Profile
When Edit Profile is visible
Then click on editProfile
Then enter firstname
Then enter lastname
Then enter phoneNum
When Save button is visible
Then click on Save
Then close brwdriver
