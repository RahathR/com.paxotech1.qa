Feature: Broadleaf Commerce Login Functionality

Scenario: 1. Valid User Valid Password
Given As a  validated user

	When Browse to the application
	Then Broadleaf HomePage should show
	When User click login button
	And Enter "rahath43@gmail.com" as email address
	And Enter "abcdefg" as password
	And Click login
	Then valid email or password message display
	And Welcome message shows