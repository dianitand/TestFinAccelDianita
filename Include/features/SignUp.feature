
Feature: Testing

  Scenario Outline: Sign Up
    Given Open Gramedia
    Then Click Masuk
    Then Click Daftar on Login Form
    When Sign Up Input <name> and Input <email> and Input <password> and checklist
    Then Click Daftar on SignUp Page

    Examples: 
      | name | email                | password |
      | lala | lalalili@yopmail.com |   112233 |

  Scenario Outline: Sign In
    Given Open Gramedia
    Then Click Masuk
    When Login Input <email> and Input <password>
    Then Click Login on Login Page

    Examples: 
      | email                | password |
      | testergramedia.satu@gmail.com |   112233 |

  Scenario Outline: Search Product
    Given Search book <booktitle>
    When Pick the first product appear

    Examples: 
      | booktitle |
      | One Piece 100     |

  Scenario Outline: Select Store
    When Go to detail and choose Softcover
    Then Search store <location>
    And Click the first store

    Examples: 
      | location |
      | Jakarta  |
      
   Scenario: Add To Cart
   When Click Keranjang
   Then Successfull add to cart and see cart
