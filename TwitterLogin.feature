Feature: To test Twitter

  Scenario Outline: To login twitter
    Given The Twitter website is Launched
    When username is visible
    Then Enter userName text "<userName>"
    When next button is visible
    Then click on next
    When TwitterPassword is visible
    Then enter Password text "<password>"

    Examples: 
      | userName | password |
      | name1    | nimiefn  |
      | name2    | ininio   |
