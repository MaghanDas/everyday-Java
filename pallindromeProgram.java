
public class pallindromeProgram {
    public static void main(String[] args) {

        String palindrome = "namani";
        int len = palindrome.length();           // 6
        char[] tempCharArray = new char[len];    
        char[] charArray = new char[len];

        // put original string in an
        // array of chars
        for (int i = 0; i < len; i++) {
            tempCharArray[i] = palindrome.charAt(i);  
        }

        // reverse array of chars
        for (int j = 0; j < len; j++) {
            charArray[j] = tempCharArray[len - 1 - j];
        }

        String reversePalindrome = new String(charArray);
        System.out.println(reversePalindrome);
        // to accomplish the string reversal, the program had to convert the string to an array of characters 
        // (first for loop), reverse the array into a second array (second for loop), and then convert back to a string.
        //  The String class includes a method, getChars(), 
        // to convert a string, or a portion of a string, into an array of characters so we could
        //  replace the first for loop in the program above with
    }
}
