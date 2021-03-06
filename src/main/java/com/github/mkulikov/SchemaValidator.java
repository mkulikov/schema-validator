package com.github.mkulikov;

import com.fasterxml.jackson.databind.JsonNode;
import com.github.fge.jackson.JsonLoader;
import com.github.fge.jsonschema.core.exceptions.ProcessingException;
import com.github.fge.jsonschema.core.report.ProcessingReport;
import com.github.fge.jsonschema.main.JsonSchema;
import com.github.fge.jsonschema.main.JsonSchemaFactory;
import java.io.IOException;

public class SchemaValidator {

    public static String validate(String schemaPath, String responseString) throws IOException, ProcessingException {

        final JsonNode schemaFile = JsonLoader.fromPath(schemaPath);
        JsonNode response = JsonLoader.fromString(responseString);

        final JsonSchemaFactory factory = JsonSchemaFactory.byDefault();
        final JsonSchema schema = factory.getJsonSchema(schemaFile);

        ProcessingReport report = schema.validate(response);

        return report.toString();
    }

    public static String validateByString(String schemaString, String responseString) throws IOException, ProcessingException {

        final JsonNode schemaFile = JsonLoader.fromString(schemaString);
        JsonNode response = JsonLoader.fromString(responseString);

        final JsonSchemaFactory factory = JsonSchemaFactory.byDefault();
        final JsonSchema schema = factory.getJsonSchema(schemaFile);

        ProcessingReport report = schema.validate(response);

        return report.toString();
    }

}