import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculateTest {
    @Test
    void getSumWhenTwoAndThreeThenReturnFive() {
        //GIVEN
        int a = 2;
        int b = 3;

        //WHEN
        int actual = Calculate.getSum(a, b);

        //THEN
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void isEvenWhenThreeThenReturnFalse() {
        //GIVEN
        int a = 3;

        //WHEN
        boolean actual = Calculate.isEven(a);

        //THEN
        assertFalse(actual);
    }

    @Test
    void isEvenWhenFourThenReturnTrue() {
        //GIVEN
        int a = 4;

        //WHEN
        boolean actual = Calculate.isEven(a);

        //THEN
        assertTrue(actual);
    }

    @Test
    void getProductWhenThreeAndFourThenReturnTwelve() {
        //GIVEN
        int a = 3;
        int b = 4;

        //WHEN
        int actual = Calculate.getProduct(a, b);

        //THEN
        int expected = 12;
        assertEquals(expected, actual);
    }

    @Test
    void convertToUppercaseWhenAljoschaThenReturnALJOSCHA() {
        //GIVEN
        String a = "Aljoscha";

        //WHEN
        String actual = Calculate.convertToUppercase(a);

        //THEN
        String expected = "ALJOSCHA";
        assertEquals(expected, actual);
    }

    @Test
    void isPositiveWhenThreeThenReturnTrue() {
        //GIVEN
        int a = 3;

        //WHEN
        boolean actual = Calculate.isPositive(a);

        //THEN
        assertTrue(actual);
    }

    @Test
    void isPositiveWhenMinusThreeThenReturnFalse() {
        //GIVEN
        int a = -3;

        //WHEN
        boolean actual = Calculate.isPositive(a);

        //THEN
        assertFalse(actual);
    }

    @Test
    void isPositiveWhenZeroThenReturnFalse() {
        //GIVEN
        int a = 0;

        //WHEN
        boolean actual = Calculate.isPositive(a);

        //THEN
        assertFalse(actual);
    }
}

