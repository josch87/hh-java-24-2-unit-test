import org.junit.jupiter.api.Test;

public class CalculateTests {
    @Test
    void getSumWhenTwoAndThreeThenReturnFive() {
        //GIVEN
        int a = 2;
        int b = 3;

        //WHEN
        int actual = calculate.getSum(a, b);

        //THEN
        int expected = 5;
    }

    @Test
    void isOddOrEvenWhenThreeThenReturnFalse() {
        //GIVEN
        int a = 3;

        //WHEN
        int actual = calculate.isOddOrEven(a);

        //THEN
        boolean expected = false;
    }

    @Test
    void getProductWhenThreeAndFourThenReturnTwelve() {
        //GIVEN
        int a = 3;
        int b = 4;

        //WHEN
        int actual = calculate.getProduct(a, b);

        //THEN
        int expected = 12;
    }

    @Test
    void convertToUppercaseWhenAljoschaThenReturnALJOSCHA() {
        //GIVEN
        String a = "Aljoscha";

        //WHEN
        String actual = calculate.convertToUppercase(a);

        //THEN
        String expected = "ALJOSCHA";
    }

    @Test
    void isPositiveWhenThreeThenReturnTrue() {
        //GIVEN
        int a = 3;

        //WHEN
        boolean actual = calculate.isPositive(a);

        //THEN
        boolean expected = true;
    }
}

