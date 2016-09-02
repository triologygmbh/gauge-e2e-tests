## About gauge-e2e-tests

This repo contains a small example on how to use the Gauge test framework for end-to-end tests using Selenium inside a Maven project.

## Getting started

### Prerequisites

* Clone this project via `$ git clone <url>`
* Make sure you are running [Gauge](http://getgauge.io/get-started/index.html) on your system.
* You also need to install the Gauge Java Plugin with `$ gauge --install java`
* You also have to install [Maven](https://maven.apache.org/download.cgi).

#### Optional

* If you want to try another Browser, take a look into `env/default/browser.properties`. Possible browser entries are `CHROME`, `IE` or by default firefox.
* Selenium best runs with Chrome which requires [ChromeDriver](https://sites.google.com/a/chromium.org/chromedriver/) to be executed.

### Start the test

* After fullfilling the prerequisites you can start the test with `$ mvn test`.
* Now the test automation should start.
