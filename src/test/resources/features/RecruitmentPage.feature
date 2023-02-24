Feature: Recruitment page validations 

Background: 
	Given User is on HRMLogin page "https://opensource-demo.orangehrmlive.com/" 
	When User enters username as "Admin" and password as "admin123" 
	Then User should be able to login successfully and new page open 
	
@RecruitmentOfNewCandidates 
Scenario: Add new Candidates 
	When User navigates to Recruitment page
	And User fills form to create new Candidate details
	Then User verifies new candidate is created
	
	
	
@CreatingNewVacancy 
Scenario: Add new Vacancy 
	When User navigates to Recruitment page
	And User fills form to create new Vacancy details
	Then User verifies new vacancy is created