@SmokeTest @Regression
Feature: onlinebanking login feature
description:

@Positive_scenario @TC_LP-18

Scenario: Login function with valid credential.

Given Go to application URL
When put valid username 
And put valid password
And Click login
Then Logout button should visible for successful login


@Negative_Scenario @TC_LP-19
Scenario: Check login with invalid credential

Given Go to application
When put invalid username
And put invalid password
And click login 
Then Logout button should not visible for successful login

