[![Build Status](https://travis-ci.org/anishsmc/mebankanishcodechallenge.svg?branch=master)](https://travis-ci.org/anishsmc/mebankanishcodechallenge.svg?branch=master)
[![Coverage Status](https://coveralls.io/repos/github/anishsmc/mebankanishcodechallenge/badge.svg?branch=master)](https://coveralls.io/github/anishsmc/mebankanishcodechallenge?branch=master)
# MeBank Coding Challenge

This repository contains code that is a solution to the Relative Balance Calculator Coding Test as part of MeBank's interview process.

## Getting Started

Checkout the Git Repository on `master`. This program has been built following the [Trunk-Based Development](https://trunkbaseddevelopment.com). As such the latest production copy will always be on `master`.

### Prerequisites

There needs to be a `JDK 1.8` or higher version install to build and run this program locally. This program is build in Java using `JDK 11`.
_Note: No 11 specific features have been used_

The program uses `Apache Maven 3.6` to build. Please ensure you have a Maven installation of `3.6 +` on your local environment.

What things you need to install the software and how to install them

### Installing

The program is packaged as an executable `JAR` file.

Code needs to be compiled and the `JAR` file created by running the maven install command at the project root.

```
mvn clean install
```

The program produces a JAR file in the `target` directory and the local `maven repo`.

### Running

The JAR file is executable and the program can be run by executing it. Use the command:
```
java -jar codechallenge-0.0.1-SNAPSHOT-jar-with-dependencies.jar <absolute-path-to-input-csv>
```

**Note:** The program assumes there are no headers in the CSV file. Data starts at Line 1.

The program takes a CSV list of transactions as input specified in the challenge requirements.

Once run, the program requests User Input:

- `accountID` - The account to calculate the balance for
- `fromDate` - The From Date to begin the calculation at. Input Format `dd/MM/yyyy HH:mm:ss`
- `toDate` - The To Date to begin the calculation at. Input Format `dd/MM/yyyy HH:mm:ss`

The program outputs the relative balance and number of transactions in the calculation as per the challenge requirements

### Running the tests

Tests with coverage reports can be obtained by running the below command on the project root

```
mvn clean test jacoco:report
```

Reports are produced using `JoCoCo` and are available under `/target/site`

### Built With

* [Maven](https://maven.apache.org/) - Dependency Management
* [JaCoCo](https://www.jacoco.org) - Code Coverage
* [TravisCI](https://travis-ci.org/) - Builds

### Contributing

This project is not open to active contribution as it is part of a coding challenge for an interview.
