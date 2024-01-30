// 4. Learning about conditional statements in Java
import java.util.*;
public class If_Else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age >= 18) {
            System.out.println("You are an adult and eligible for vote");
        }
        else {
            System.out.println("You are not an adult and not eligible for vote");
        }
    }
}
