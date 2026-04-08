# OrangeHRM Automation Suite

A robust, enterprise-grade automated testing framework for the [OrangeHRM Open Source](https://opensource-demo.orangehrmlive.com/) platform. This project leverages the Page Object Model (POM) design pattern with Selenium WebDriver, Java, and TestNG to ensure comprehensive test coverage and maintainability.

---

## Tech Stack and Dependencies

- **Programming Language:** Java 11
- **Testing Framework:** TestNG 7.9.0
- **Automation Tool:** Selenium WebDriver 4.19.1
- **Driver Management:** WebDriverManager 5.7.0
- **Build Tool:** Maven
- **Logging:** SLF4J (SimpleLogger)

---

## Project Architecture

The framework follows the Page Object Model (POM) pattern to separate the UI actions from the test logic, enhancing code reusability and simplifying maintenance.

```text
src/test/java/
├── base/
│   └── BaseClass.java          # Setup and teardown for WebDriver (Chrome/Firefox)
├── pages/                      # Page Object Classes
│   ├── AdminPage.java
│   ├── DashboardPage.java
│   ├── LeavePage.java
│   ├── LoginPage.java
│   ├── PIMPage.java
│   └── TimePage.java
└── tests/                      # Test Implementation Classes
    ├── AdminTest.java
    ├── DashboardTest.java
    ├── EndToEndTest.java
    ├── LeaveTest.java
    ├── LoginTest.java
    ├── PIMTest.java
    └── TimeTest.java
```

---

## Key Features

- **Cross-Browser Support:** Configured for Chrome and Firefox.
- **Headless Execution:** Support for headless mode via BaseClass configuration for CI/CD environments.
- **Modular Test Suites:** Organized XML suite files (testng.xml, testng-login.xml) for granular test execution.
- **Implicit Waits:** Global wait management for stable execution.
- **Clean Reports:** Integration with TestNG default reports for analysis.

---

## Getting Started

### Prerequisites

1.  **JDK 11+** installed and configured in system PATH.
2.  **Maven** installed and configured.
3.  **Chrome/Firefox** browser installed.

### Installation

1.  Clone the repository:
    ```bash
    git clone <repository-url>
    ```
2.  Navigate to the project directory:
    ```bash
    cd selenium_and_testNG
    ```
3.  Install dependencies:
    ```bash
    mvn clean install
    ```

---

## Running Tests

### Execute via Maven (Default Suite)
To run all tests defined in the default testng.xml:
```bash
mvn test
```

### Execute Specific Suite
To run a specific XML configuration:
```bash
mvn test -DsuiteXmlFile=testng-login.xml
```

### Headless Mode
To toggle headless mode, modify the headless boolean in src/test/java/base/BaseClass.java:
```java
boolean headless = true; // Set to true for headless, false for UI mode
```

---

## Reporting

After test execution, reports are automatically generated in the test-output/ directory:
- **HTML Report:** test-output/index.html (Viewable in any browser)
- **Emailable Report:** test-output/emailable-report.html

---

## Test Coverage

| Module | Description |
| :--- | :--- |
| **Login** | Validates successful login and error handling for invalid credentials. |
| **Dashboard** | Verifies dashboard components and navigation. |
| **Admin** | Automates administrative tasks like user management. |
| **PIM** | Personnel Information Management - Employee records and search. |
| **Leave** | Leave application and tracking workflows. |
| **Time** | Time tracking and timesheet management. |
| **End-to-End** | Comprehensive flows spanning multiple modules. |

---

## Author
Created with precision to ensure high-quality automation standards.
