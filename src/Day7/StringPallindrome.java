package Day7;

import java.util.Scanner;

public class StringPallindrome {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String str = sc.nextLine().toLowerCase();

            StringBuilder cleaned = new StringBuilder();

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                if (Character.isLetterOrDigit(ch)) {
                    cleaned.append(ch);
                }
            }

            String text = cleaned.toString();

            int left = 0;
            int right = text.length() - 1;
            boolean isPalindrome = true;

            while (left < right) {
                if (text.charAt(left) != text.charAt(right)) {
                    isPalindrome = false;
                    break;
                }

                left++;
                right--;
            }

            if (isPalindrome) {
                System.out.println("The string is a palindrome.");
            } else {
                System.out.println("The string is not a palindrome.");
            }

            sc.close();
        }
    }

