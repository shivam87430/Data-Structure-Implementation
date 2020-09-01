package stack.questions;

import java.util.LinkedList;

public class CheckPalindromeUsingStack {

    public static boolean checkPalindrome(String value){
        LinkedList<Character> characters = new LinkedList<>();
        StringBuilder stringWithNoPunctuation = new StringBuilder(value.length());
        String lowerCase = value.toLowerCase();
        for(int i = 0; i<lowerCase.length();i++){
            char c = lowerCase.charAt(i);
            if(c >= 'a' && c <= 'z'){
                stringWithNoPunctuation.append(c);
                characters.push(c);
            }
        }

        StringBuilder reversedString = new StringBuilder(stringWithNoPunctuation.length());

        for(int j=0;j<stringWithNoPunctuation.length();j++){
            reversedString.append(characters.pop());
        }

        if(stringWithNoPunctuation.toString().equals(reversedString.toString())){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(checkPalindrome("abcba"));
        System.out.println(checkPalindrome("Was it a car or a cat I saw?"));
        System.out.println(checkPalindrome("I did, did I?"));
        System.out.println(checkPalindrome("hello"));
    }
}
