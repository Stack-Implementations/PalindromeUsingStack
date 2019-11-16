package academy.learnprogramming.stackschallenge;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
         // should return false
         System.out.println(checkForPalindrome("hello"));
         // should return true
        System.out.println(checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String input) {
        String transformString = input.replaceAll("[^a-zA-Z]", "");
        System.out.println("Transformed Input String is : "+transformString);
        char[] inputArr = transformString.toCharArray();
        LinkedList<Character> stack = new LinkedList<Character>();
        for(int i = 0; i < inputArr.length; i++){
            stack.push(inputArr[i]);
        }
        StringBuilder sb = new StringBuilder(stack.size());
        while (!(stack.isEmpty())){
            sb.append(stack.pop());
        }
        System.out.println("Popped String is : "+sb.toString());
        return sb.toString().equalsIgnoreCase(transformString);
    }
}
