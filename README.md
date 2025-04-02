# Carrefour Java Kata

Ce projet est une kata Java implémentant une API RESTful pour gérer les commandes et les demandes de remboursement d'un client. Il utilise Spring Boot, Spring Data JPA et une base de données H2 en mémoire pour les tests.


## Prérequis

- Java 21  
- Maven 3.5 ou supérieur

---

## Installation

Clonez le dépôt :

```bash
git clone https://github.com/votre-repo/carrefour-kata.git
cd carrefour-kata
```

Installez les dépendances :

```bash
mvn clean install
```

---

## Structure du Projet

```
carrefour-kata/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com.carrefour.carrefour_kata/
│   │   │       ├── CarrefourKataApplication.java
│   │   │       ├── controller/
│   │   │       ├── model/
│   │   │       ├── repository/
│   │   │       └── service/
│   │   └── resources/
│   │       ├── application.properties
│   └── test/
│       ├── java/
│       └── resources/
└── pom.xml

```

---

## Dépendances

- **Spring Boot Starter Web** – API REST
- **Spring Boot Starter Data JPA** – Persistance
- **H2 Database** – BDD en mémoire
- **Spring Boot DevTools** – Redémarrage automatique
- **JUnit 5** – Tests
- **Hibernate Validator** – Validation

---


## Exécution de l'Application

En ligne de commande :

```bash
mvn spring-boot:run
```

## Tests

### Lancer tous les tests :

```bash
mvn test
```

### Tests d'intégration :

- `OrderControllerIntegrationTest.java`
- `RefundControllerIntegrationTest.java`

Utilisent `@SpringBootTest`.

### Tests unitaires :

- `OrderServiceTest.java`
- `RefundServiceTest.java`

Utilisent `@ExtendWith(MockitoExtension.class)`.

---
