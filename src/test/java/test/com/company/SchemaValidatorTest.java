package test.com.company;

import com.company.SchemaValidator;
import org.junit.Test;

public class SchemaValidatorTest {

    @Test(expected = java.io.FileNotFoundException.class)
    public void exceptionOnWrongPath() throws Exception {
        SchemaValidator.validate("doesn't matter", "don't care");
    }
}