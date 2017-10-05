import java.util.*;



public class PalindromeCheck
{

    //this method allows you to recursively check if a word is a palindrome
    public static boolean isPalindrome(String word)
    {

// only one letter words are a palindrome
        if( word.length() == 1)
            return true;

        if(word.charAt(0) == word.charAt(word.length()-1))
            return isPalindrome(word.substring(1, word.length()-1)); // compares the rest of the letters after the first and
        // last letters of the word are the same recursively
        return false;


    }

    //this method allows you to non-recursively check if a word is a palindrome
    public static boolean isPalindrome_nr(String word)
    {
        int low = 0; // first element per se at point 0

        int high = (word.length() -1);  // last element per se at last point length -1



        while( low < high)
        {
            if (word.charAt(low) != word.charAt(high)) // this algorithim will compare the first and last letters

                return false;

            low ++;  // keep going higher from low
            high --;  // keep going lower from high
        }

        return true; // if the above loop terminates, then it is true, and we have a palindrome.
    }









    public static void main(String[] args)
    {

        String s1 = new String ("level");

        String s2 = new String ("radar");
        String s3 = new String ("alias");


        System.out.println("Is " +s1+ " a palindrome? "+isPalindrome(s1));
        System.out.println("Is " +s2+ " a palindrome? "+isPalindrome(s2));
        System.out.println("Is "+s3+" a palindrome? "+isPalindrome(s3));
        System.out.println("Is "+s1+" a palindrome? "+isPalindrome_nr(s1));
        System.out.println("Is "+s2+" a palindrome? "+isPalindrome_nr(s2));
        System.out.println("Is "+s3+" a palindrome? "+isPalindrome_nr(s3));

    }

} 