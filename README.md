# About Snipe It App demo test

This project is created for improving and proving Test Automation skills in Java.
Application under test is [https://demo.snipeitapp.com/](https://demo.snipeitapp.com/). It was seleced by occasion.

## Disclaimer
*This project is neither aiming to advertise Snipe It App nor to improve its quality.

## Executing the tests
To run the sample project, you can either just run the `CucumberTestSuite` test runner class, or run either `mvn verify` or `gradle test` from the command line.

By default, the tests will run using Chrome. You can run them in Firefox by overriding the `driver` system property, e.g.
```json
$ mvn clean verify -Ddriver=firefox
```
Or 
```json
$ gradle clean test -Pdriver=firefox
```

The test results will be recorded in the `target/site/serenity` directory.


## References

This project is forked from [Serenity BDD](https://serenity-bdd.github.io/theserenitybook/latest/index.html) kick starter project.

Checkout [Official Read me for Starter project](https://github.com/serenity-bdd/serenity-cucumber4-starter/blob/master/README.md) to find out more about Serenity and Cucumber 4 usage.
