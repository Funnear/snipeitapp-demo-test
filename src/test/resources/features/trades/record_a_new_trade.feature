Feature: Record a new trade

  Scenario: Each trade has a unique ID
    Given the following trade:
    | firstName | lastName | email               | phoneNumber               | countryCode | appContextId |
    | John      | Doe      | johndoe@example.com | +7 (917) 927-14-99        | IL          | 1            |
    When I record the trade
    Then the recorded trade should include the following details:
      | success |
      | true    |


