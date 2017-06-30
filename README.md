Schema validator is a library that allows to validate according to the JSON Schema

# Build
To build a library run the following command:
`$ bash gradlew fatjar`

Also you can use gradle:
`$ gradle clean fatjar`

# Usage
```java
import com.company.SchemaValidator;
String result = SchemaValidator.validate(schemaPath, responseString);
```
All you need is a path to the file with JSON Schema and a validating String
