Feature: Test login
 
	Scenario: Login Failure
    Given I open the Vodafone website
    When I navigate to MyVodafone page
    And I navigate to Login page
    And I try to login with invalid credentials
    Then I should see the following error message
    """
	Your email address is not registered for My Vodafone.
	"""