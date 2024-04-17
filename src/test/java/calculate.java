import org.junit.jupiter.api.Test;

public class calculate {
    @Test
    void getSumWhenTwoAndThreeThenReturnFive() {
        //GIVEN
        int a = 2;
        int b = 3;

        //WHEN
        int actual = getSum(a, b);

        //THEN
        int expected = 5;
    }

    @Test
    void isOddOrEvenWhenThreeThenReturnFalse() {
        //GIVEN
        int a = 3;

        //WHEN
        int actual = isOddOrEven(a);

        //THEN
        boolean expected = false;
    }

    @Test
    void getProductWhenThreeAndFourThenReturnTwelve() {
        //GIVEN
        int a = 3;
        int b = 4;

        //WHEN
        int actual = getProduct(a, b);

        //THEN
        int expected = 12;
    }

    @Test
    void convertToUppercaseWhenAljoschaThenReturnALJOSCHA() {
        //GIVEN
        String a = "Aljoscha";

        //WHEN
        String actual = convertToUppercase(a);

        //THEN
        String expected = "ALJOSCHA";
    }

    @Test
    void isPositiveWhenThreeThenReturnTrue() {
        //GIVEN
        int a = 3;

        //WHEN
        boolean actual = isPositive(a);

        //THEN
        boolean expected = true;
    }
}

