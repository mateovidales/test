Feature: test

  Scenario: es "night" cuando es antes de 6 pero despues de 0
    Given si la hora es 3
    When verificar si es valida
    Then obtener 'Night'

  Scenario: es "Morning" cuando es antes de 12 pero despues de 6
    Given si la hora es 9
    When verificar si es valida
    Then obtener 'Morning'

  Scenario: es "Afternoon" cuando es antes de 18 pero despues de 12
    Given si la hora es 16
    When verificar si es valida
    Then obtener 'Afternoon'

  Scenario: es "Evening" cuando es antes de 24 pero despues de 18
    Given si la hora es 22
    When verificar si es valida
    Then obtener 'Evening'

  Scenario: es "Invalid hour" cuando es despues de las 24
    Given si la hora es 26
    When verificar si es valida
    Then obtener 'Invalid hour'




