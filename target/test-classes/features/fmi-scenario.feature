Feature: Finnish Meteorological Institute Navigation

  @testExercise
  Scenario: A user is able to open webpage of Finnish Meteorological Institute and check local weather
    Given The user has a webpage URL
    When  The user opens the home page successfully
    Then  The user is able to check local weather successfully