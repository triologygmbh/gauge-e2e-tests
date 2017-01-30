## About gauge-e2e-tests

This repo contains a small example on how to use the Gauge test framework for end-to-end tests using Selenium inside a Maven project.

Read the tutorial here: [Gauge - a lightweight behavior-driven testing tool ](https://www.triology.de/en/blog-entries/gauge-ein-leichtgewichtiges-behavior-driven-testing-tool).

## Getting started

### Prerequisites

* Clone this project via `$ git clone <url>`
* Make sure you are running [Gauge](http://getgauge.io/get-started/index.html) on your system.
* You also need to install the Gauge Java Plugin with `$ gauge --install java`
* Make sure [HTML-Report](https://github.com/getgauge/html-report) plugin is installed with `$ gauge -v`, otherwise install it. 
* You also have to install [Maven](https://maven.apache.org/download.cgi).

#### Optionally for Chrome

* If you want to try another Browser, take a look into `env/default/browser.properties`. Possible browser entries are `CHROME`, `IE` or by default firefox.
* Selenium best runs with Chrome which requires [ChromeDriver](https://sites.google.com/a/chromium.org/chromedriver/) to be executed.

### Notice

**Some older Versions of Firefox might crash with Selenium!**

### Start the test

* After fullfilling the prerequisites you can start the test with `$ mvn test`.
* Now the test automation should start.
