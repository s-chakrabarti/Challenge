import java.util.Scanner;
public class firstchallenge{
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Enter Choice 1 for Addition \n 2 For Subtraction \n 3 for Multiplication\n 4 for Division");
        int ch = sc.nextInt();
        switch(ch){
            case 1:System.out.println(a+b);
            break;
            case 2:System.out.println(a-b);
            break;
            case 3:System.out.println(a*b);
            break;
            case 4:System.out.println(a/b);
            break;
            default:System.out.println("Put Correct Entry");
            break;
        }

    }
}