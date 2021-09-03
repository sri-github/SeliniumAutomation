a==================================================================================
BDD Cucumber Selenium Webdriver Java Test Automation Framework
==================================================================================
This project is a template test automation framework, which provides structured and standard way of 
creating automated test scripts for GUI in multiple browsers using Cucumber , Maven

This is a reusable automation framework that blends together Selenium WebDriver with Cucumber features(incorporating Gherkin and the BDD 'Given, When Then' testing construct)   

This framework supports automation of : - 
*Web Browsers (Firefox, Chrome, Internet Explorer)

The framework incorporates design principle of BDD (Behaviour driven development) which promotes
 writing acceptance tests by describing behaviour of application under test in simple english language from
 the perspective of its stakeholders. 
 Having test written in Natural language helps the Project Team 
 (Product Owners, Business Analysts, Development and QA team) to understand and track the requirements

Tools & libraries
=================
The test automation framework is comprised of following tools and libraries  

*Cucumber-JVM:- BDD Framework  
*Custom Page Object Pattern and utility functions  
*Selenium WebDriver: - Browser automation framework
*JAVA: - Programming language  
*Maven: - Build tool  
*Git OR SVN: - Version Control  
*Intellij Or Eclipse: - Integrated Development Environment  
*Loggers: - Cucumber Extent Report

Machine Configuration
====================
Configure Windows and setup: -   
*Java 8  
*Git  / SVN  
*Maven  


Get the latest Source Code
===========================
Open Terminal or command line
cd to the desired folder where the test automation source code needs to be checkout

Run command
git clone https://github.com/sri-github/SeliniumAutomation.git

This will download the latest template source code

IDE Configuration
==================
Intellij plugins  
----------------
Configure and Install Following Plugins  
File >> Setting >> Plugins >> Browser Repositories>

*Cucumber for Java
*Gherkin
*Git Integration/ SVN Integration  
*Maven Integration

Eclipse plugins  
----------------
Configure and Install Following Plugins  
Help>>Install new software
*Cucumber for Java
http://cucumber.github.com/cucumber-eclipse/update-site  

*TestNg  

*Git Integration

Plugin configuration for Cucumber Feature
Open Run Configurations
Select Cucumber Feature and create one new configuration
Project: ShopAutomation
Feature: src/automationFramework/src/test/resources/features
Glue:  com.gk.test.step_definitions
Reports:  monochrome, pretty

File >> Setting >>  
Search for Annotation Processing  
(Java Compiler ... Annotation Processing>> Enable the check box


Import Project into Intellij
----------------------------
File>Import Project>
Browse to ShopAutomation

Import Project into Eclipse
--------------------------
File>Import>Maven>Existing Maven Projects>Next>
Browse to ShopAutomation
Ensure pom.xml is found
Finish

open terminal
cd to test root directory
run "mvn clean eclipse:eclipse" 


Framework Setup steps
============================
The URL, Browser Configuration, jdbc connections etc are defined in the respective config.properties file under each desired profile which you want to run.
In pom.xml we use the relative path within <profile.path> as shown below to invoke or make use of these profiles. 
src/main/resources/profiles

Open "pom.xml" 

Compile Build or Run Tests
==========================

Command Line

cd to root ot automationFramework project directory

To run all tests parallel
------------------------

mvn clean install

To run a single test with tags
------------------------

mvn clean install -Dcucumber.options="--tags @smoke

** Note "~" before tag means this specific tag will not run

Report
======

Local reports
-------------
Standard HTML Report  
A report will be generated at /target/cucumber-report/report.html  

Other ways to run the tests or Test Suite
---------------------------------------------
*IDE Plugins: - Eclipse or Intellij via TestNg plugin or Maven plugin or Cucumber-Java plugin  
*IDE TestNg Suite xml: - file located at "src/test/java" testRunner.java (Right click and run as JUnit)
  

