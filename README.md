# Santander Dev Week 2023
Java RESTful API criada para a Santander Dev Week.

## Diagrama de Classes

```mermaid
classDiagram
    class User {
        - String name
        - Account account
        - Features features
        - Card card
        - News news
    }

    class Account {
        - String number
        - String agency
        - float balance
        - float limit
    }

    class Features {
        - String icon
        - String description
    }

    class Card {
        - String number
        - float limit
    }

    class News {
        - String icon
        - String description
    }

    User "1" *-- "1" Account
    User "1" *-- "N" Features
    User "1" *-- "1" Card
    User "1" *-- "N" News
```
