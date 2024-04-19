import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConvertTest {

    @Test
    void convertIntegerToStringTest_positiveConvertInteger() {
        String actualResponse = Convert.convertIntegerToString(123);
        String expectedResponse = "123";
        assertEquals(expectedResponse, actualResponse);
    }

    @Test
    void convertIntegerToStringTest_zero() {
        String actualResponse = Convert.convertIntegerToString(0);
        String expectedResponse = "0";
        assertEquals(expectedResponse, actualResponse);
    }

    @Test
    void convertIntegerToStringTest_negativeConvertInteger() {
        String actualResponse = Convert.convertIntegerToString(-123);
        String expectedResponse = "-123";
        assertEquals(expectedResponse, actualResponse);
    }

    @Test
    void convertStringToIntegerTest_positiveInteger() {
        int actualResponse = Convert.convertStringToInteger("123");
        int expectedResponse = 123;
        assertEquals(expectedResponse, actualResponse);
    }

    @Test
    void convertStringToIntegerTest_zero() {
        int actualResponse = Convert.convertStringToInteger("0");
        int expectedResponse = 0;
        assertEquals(expectedResponse, actualResponse);
    }

    @Test
    void convertStringToIntegerTest_negativeInteger() {
        int actualResponse = Convert.convertStringToInteger("-123");
        int expectedResponse = -123;
        assertEquals(expectedResponse, actualResponse);
    }
}
