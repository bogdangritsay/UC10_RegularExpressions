# UC10RegularExpressions

## Application Description
`UC10RegularExpressions` is a Java-based application designed to validate input strings based on certain criteria. It checks the input for the presence of uppercase letters, lowercase letters, digits, and special characters, while also ensuring the string adheres to a predefined length.

## Regex Implementation Description
The `RegexValidator` class uses a regular expression to perform validation on input strings. The regex pattern it utilizes has multiple components:
- It mandates the presence of at least one uppercase and one lowercase character.
- It requires at least one digit.
- It necessitates one of the predefined special characters.
- It ensures that the string does not contain any whitespace characters.

The length of the string is constrained between a minimum of 4 (to meet the basic criteria) and a user-specified maximum length. The list of special characters can be found in the `SPECIAL_CHARACTERS` constant within the class. Any modifications to this list should be accompanied by a corresponding update to the regex pattern.

## How to Run the Developed Application Locally

1. **Pre-requisites**: Ensure you have Java and Maven installed on your local machine.
2. **Clone**: Clone the repository to your local machine.
3. **Navigate**: Navigate to the project root directory where `pom.xml` is located.
4. **Compile**: Compile the code using the command:
   ```bash
   mvn compile
5. **TestRun** Run the tests (if any) with the following command:
      ```bash
   mvn test

6. **Execute** To execute the application, you may create a driver or main method that uses the **RegexValidator.validateString** method and then run it using your preferred IDE or command line.

**Note:** This application primarily serves as a utility for string validation and does not contain a standalone executable main method. The instructions provided focus on compilation and testing.