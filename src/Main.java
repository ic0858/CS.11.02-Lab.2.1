public class Main {

    public static void main(String[] args) {

        ;
    }

    // 1. add
    public static int add(int numOne, int numTwo) {
        return numOne+numTwo;
    }
    
    // 2. add
    public static int add(int numOne, int numTwo, int numThree, int numFour) {
        return add(add(numOne,numTwo),add(numThree,numFour));
    }


    // 3. morningGreeting
    public static String morningGreeting(String name) {
        return "早上好, "+name+"!";
    }
    // 4. afternoonGreeting
    public static String afternoonGreeting(String name) {
        return "下午好, "+name+"!";
    }
    // 5. triple
    public static String triple(String name) {
        return name.repeat(3);
    }
    // 6. half
    public static double half(int value) {
        return value/2.0;
    }
    // 7. roundPositiveValueToNearestInteger
    public static double roundPositiveValueToNearestInteger(double value) {
        return (int) (value+0.5);
    }
    // 8. roundNegativeValueToNearestInteger
    public static double roundNegativeValueToNearestInteger(double value) {
        return (int)  (value-0.5);
    }
}
