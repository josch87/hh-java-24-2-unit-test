public class Main {
    public static void main(String[] args) {
        System.out.println("Program started");

        int a = 5;
        int b = 5;
        int sum = Calculate.getSum(a,b);
        String sumAsString = Convert.convertIntegerToString(sum);

        System.out.println(sumAsString);
    }
}
