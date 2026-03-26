import java.util.*;
public class Palindrome{
    public static void main(String[] args){
        String str="madam";
        StringBuilder sb=new StringBuilder(str);
        if(str.equals(sb.reverse().toString())){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}

// public class Palindrome2 {
//     public static void main(String[] args) {
//         String str = "madam";
//         boolean isPalindrome = true;

//         int left = 0;
//         int right = str.length() - 1;

//         while (left < right) {
//             if (str.charAt(left) != str.charAt(right)) {
//                 isPalindrome = false;
//                 break;
//             }
//             left++;
//             right--;
//         }

//         if (isPalindrome) {
//             System.out.println("Palindrome");
//         } else {
//             System.out.println("Not Palindrome");
//         }
//     }
// }

// public class Palindrome3 {
//     public static void main(String[] args) {
//         String str = "madam";
//         String reversed = "";

//         for (int i = str.length() - 1; i >= 0; i--) {
//             reversed += str.charAt(i);
//         }

//         if (str.equals(reversed)) {
//             System.out.println("Palindrome");
//         } else {
//             System.out.println("Not Palindrome");
//         }
//     }
// }
