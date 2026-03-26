import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        String reversed = new StringBuilder(str).reverse().toString();
        
        System.out.println("Reversed string: " + reversed);
    }
}

// import java.util.Scanner;

// public class Reverse2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter a string: ");
//         String str = sc.nextLine();
        
//         String reversed = "";
        
//         for (int i = str.length() - 1; i >= 0; i--) {
//             reversed += str.charAt(i);
//         }
        
//         System.out.println("Reversed string: " + reversed);
//     }
// }

// import java.util.Scanner;

// public class Reverse3 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter a string: ");
//         String str = sc.nextLine();
        
//         char[] arr = str.toCharArray();
        
//         System.out.print("Reversed string: ");
//         for (int i = arr.length - 1; i >= 0; i--) {
//             System.out.print(arr[i]);
//         }
//     }
// }

// import java.util.Scanner;

// public class ReverseString4 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter a string: ");
//         String str = sc.nextLine();
        
//         char[] arr = str.toCharArray();
        
//         int left = 0;
//         int right = arr.length - 1;
        
//         while (left < right) {
//             char temp = arr[left];
//             arr[left] = arr[right];
//             arr[right] = temp;
            
//             left++;
//             right--;
//         }
        
//         System.out.println("Reversed string: " + new String(arr));
//     }
// }
