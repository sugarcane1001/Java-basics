/*
Java program to check if a string is palindrome.
*/

public class palindrome {

    public static void main(String[] args) {
        String [] s = {"palindrome", "noon", "Madam I'm Adam", "A man, a plan, a canal, Panama", "A Toyota", "Don't nod!", "Never odd or even"};

        for (int i = 0; i < s.length; ++i) {
            if (isPalindrome(s[i]))
                System.out.println("\"" + s[i] + "\"\t IS a palindrome.");
            else
                System.out.println("\"" + s[i] + "\"\t is NOT a palindrome.");
        }

    }
    
    public static boolean isPalindrome(String s) {
        if (s.length() == 0 || s.length() == 1) return true; // base case
        
        char first = s.charAt(0);
        char last = s.charAt(s.length()-1);
        int start = 1; 
        int end = s.length()-1;
        
        while(!Character.isLetter(first)) first = s.charAt(start++);
        while(!Character.isLetter(last)) last = s.charAt(--end);
        
        if(Character.toUpperCase(first)==Character.toUpperCase(last)) {
           if(start >= end) return true;
           return isPalindrome(s.substring(start,end));
        }
        
        return false;
    }

}
