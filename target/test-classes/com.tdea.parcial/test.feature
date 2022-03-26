Feature: test

  Scenario: es "night" cuando es antes de 6 pero despues de 0
    Given si la hora es 3
    When verificar si es 'nigth'
    Then obtenemos "nigth"

  Scenario: es "morning" cuando es menos de 12 pero despues de 6
    Given si la hora es 9
    When verificar si es 'morning'
    Then obtenemos "Morning"

  Scenario: es "Afternoon" cuando es menos de 18 pero despues de 12
    Given si la hora es 15
    When verificar si es tarde 'Afternoon'
    Then obtenemos "Afternoon"

  Scenario: es "Evening" cuando es mas de 18 hasta 24
    Given si la hora es 22
    When verificar si es  'Evening'
    Then obtenemos "Evening"

  Scenario: Es "Invalid hour" cuando es mas de 24
    Given si la hora es 27
    When verificar si es invalida la hora 'invalid hour'
    Then obtenemos "invalid hour"