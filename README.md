Schema validator is a library that allows to validate according to the JSON Schema

# Build
To build a library run the following command:
`$ bash gradlew fatjar`

Also you can use gradle:
`$ gradle clean fatjar`

# Usage
```java
import com.github.mkulikov.SchemaValidator;

String result = SchemaValidator.validate(schemaPath, responseString);

or

String result = SchemaValidator.validateByString(schemaString, responseString);
```
All you need is a path to the file with JSON Schema (or JSON Schema as String) and a validating String
