/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: 
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {

        int firstMethod = add(5, 8);
        System.out.println(firstMethod);

        int secondMethod = add(5,6,6,6);
        System.out.println(secondMethod);

        String thirdMethod = morningGreeting("Jessia");
        System.out.println(thirdMethod);

        String fourthMethod = afternoonGreeting("Avery");
        System.out.println(fourthMethod);

        String fifthMethod = triple("lala");
        System.out.println(fifthMethod);

        double sixthMethod = half(9);
        System.out.println(sixthMethod);

        double seventhMethod = roundPositiveValueToNearestInteger(1.1);
        System.out.println(seventhMethod);

        double eighthMethod = roundNegativeValueToNearestInteger(-1.9);
        System.out.println(eighthMethod);

    }
    // 1. add
    public static int add(int a, int b){
        return a + b;
    }
    // 2. add
    public static int add(int a, int b, int c, int d){
        int e = add(a, b);
        int f = add(c, d);
        return add(e, f);
    }
    // 3. morningGreeting
    public static String morningGreeting(String name){
        return "早上好, " + name + "!";
    }
    // 4. afternoonGreeting
    public static String afternoonGreeting(String name){
        return "下午好, " + name + "!";
    }
    // 5. triple
    public static String triple(String word){
        return word + word + word;
    }

    // 6. half
    public static double half(int a){
        return (double) a / 2;
    }
    // 7. roundPositiveValueToNearestInteger
    public static double roundPositiveValueToNearestInteger(double a){
        a += 0.5;
        return (int) a;
    }
    // 8. roundNegativeValueToNearestInteger
    public static double roundNegativeValueToNearestInteger(double a){
        a -= 0.5;
        return(int) a;
    }
}