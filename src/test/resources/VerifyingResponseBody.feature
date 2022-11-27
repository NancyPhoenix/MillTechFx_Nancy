@api
Feature:Verifying Response Body

  Background:
    Given User makes a GET request to "https://api.zippopotam.us/"
  # 1.	GIVEN I am searching for a postcode
  # WHEN I make a valid request
  # THEN the request contains the following fields and types
  # post code -> string
  #country -> string
  #country abbreviation -> string
  # places -> array

@wip
  Scenario Outline:

    When  User enters  "<countryCode>" and "<postalCode>" as parameters
    Then  User gets Status code 200
    And   User gets content type application json
    And   User gets postCode country countryAbbrevation and places in response body
    Examples:
      | countryCode | postalCode |
      | GB          | AB1        |
      | US          | 00210      |
      | FR          | 01000      |


  # 2.	GIVEN I am searching for a postcode
  # WHEN I make a valid request
  # THEN the post code returned in the response matches the postcode I pass as a request parameter

  Scenario:

    When  User enters "<postalCode>" as pathParam
    Then User gets  postCode in response body

      | postalCode |
      | AB1        |
      | 00210      |
      | 01000      |


   #3.	GIVEN I am searching for a postcode
   #WHEN I use the wrong country code
   #THEN no data is returned and I receive a 404 error

  Scenario Outline:

    When  User enters "<postalCode>" as pathParam
    And  User enters wrong "<countryCode>"
    Then User gets 404 error

    Examples:
      | countryCode | postalCode |
      | FR          | AB1        |
      | GB          | 00210      |
      | US          | 01000      |

  # 4.	GIVEN I searching for a postcode
  # WHEN I search for ‘GU22’ for Great Britain
  #THEN 4 places are returned
  # AND they are all in the state of England
  # AND each one has a place name, longitude, state, state abbreviation and latitude

  Scenario:

    When  User searches for GU22 for Great Britain
    Then 4 places are returned
    And  they are all in the state of England
    And  each one has a place name, longitude, state, state abbreviation and latitude

