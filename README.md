# Mutation testing by example

This repository demonstrates the concept of mutation testing using Java, Maven, and PIT (PITest).

## Prerequisites

- Java 17
- Maven 3.6.3 or higher

## Running the Project

### Compile the Project

To compile the project, run the following command:

```sh
mvn compile
```
## Running Unit Tests

To run the unit tests, execute the following command:

```sh
mvn test
```

### Running Mutation Tests

```sh
mvn org.pitest:pitest-maven:mutationCoverage
```

This command will generate a mutation testing report in the target/pit-reports directory.