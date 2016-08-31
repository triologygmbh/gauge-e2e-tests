## About gauge-e2e-tests

This repo contains a small example on how to use the Gauge test framework for end-to-end tests using Selenium inside a Maven project.

## Getting started

### Prerequisites

* Clone this project via `$ git clone <url>`
* Make sure you are running [Gauge](http://getgauge.io/get-started/index.html) on your system.
* You also have to install [Maven](https://maven.apache.org/download.cgi).
* Selenium best runs with Chrome which requires [ChromeDriver](https://sites.google.com/a/chromium.org/chromedriver/) to be executed.
* If you want to try another Browser, take a look into `env/default/browser.properties`. Possible browser entries are `CHROME`, `IE` or by default firefox.

### Start the test

* After fullfilling the prerequisites you can start the test with `$ mvn test`.
* If there are some maven specific dependency errors just type `$ mvn test` a second time.
* Now the test automation should start.
