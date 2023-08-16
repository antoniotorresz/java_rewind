import java.io.*;
import java.util.*;

public class Palindrome {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String A = "oso";
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder sb = new StringBuilder(A);
        String B = sb.reverse().toString();
        System.out.println(A.equals(B) ? "Yes" : "No");
    }
}