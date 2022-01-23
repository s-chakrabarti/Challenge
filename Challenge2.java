import java.util.Scanner;
public class challenge2{
    public static void main(String[] args) {
        String s1= getInput("Enter a numeric value");
        String s2= getInput("Enter a numeric Value");
        String op= getInput("Choose a operation(+ - * /)");
        double result =0;
        try {
            switch (op) {
                case "+":
                    result=addValues(s1, s2);
                    break;
                case "-":
                    subtractValues(s1, s2);
                    break;
                case "*":
                    result = multipleValues(s1, s2);
                    break;
                case "/":
                    result = divideValues(s1, s2);
                    break;
                default:
                    System.out.println("unrecognised operation");
                    return;
            }
            System.out.println("the Answer is " + result);
        }
        catch(Exception e ){
            System.out.println("Number formatting exception "+e.getMessage());


            }
        }
        public static double addValues(String s1,String s2){
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1+d2;
    }

    private static double subtractValues(String s1,String s2){
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1-d2;

    }
    private static double multipleValues(String s1,String s2){
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1*d2;

    }
    private static double divideValues(String s1,String s2){
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1/d2;

    }
    private static String getInput(String prompt){
        System.out.println(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

}
