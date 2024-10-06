#StringProcessor Class
isStrongPassword(String password) Method:
This method checks if a given password is strong based on several criteria:
At least one uppercase letter ([A-Z]).
At least one lowercase letter ([a-z]).
At least one digit ([0-9]).
At least one special character ([!@#&()–[{}]:;',?/*~$^+=<>]).
Minimum length of 8 characters.
It uses the matches method of the String class, which utilizes regular expressions to perform pattern matching.

calculateDigits(String sentence) Method:
This method calculates the number of digits in the provided string using the chars method of the String class.
The filter method is used with Character::isDigit to count the digits in the stream of characters and returns the count as an integer.

calculateWords(String sentence) Method:
This method counts the number of words in a given sentence. Words are defined as sequences of non-space characters separated by one or more spaces.
The split("\\s+") method splits the sentence into an array of words based on spaces. If the input string is empty or contains only spaces, the method returns 0.

calculateExpression(String expression) Method:
This method evaluates a mathematical expression and returns the result as a double.
It uses the built-in JavaScript engine (ScriptEngine) to evaluate the expression, which can include addition, subtraction, multiplication, division, and parentheses.
If the expression is invalid, it throws an IllegalArgumentException with an error message.

#Maven pom.xml Configuration
groupId: Specifies the unique identifier of the organization or group that is developing the project.
artifactId: Specifies the unique name of the project.
version: Defines the version of the project.
dependencies:
Includes the junit-jupiter dependency, which is required for running JUnit 5 tests. This dependency is included with a test scope, meaning it's only needed at testing time.
build:
Configures the maven-compiler-plugin to specify the Java source and target version (22).
Adds the maven-surefire-plugin to run tests during the build process.

