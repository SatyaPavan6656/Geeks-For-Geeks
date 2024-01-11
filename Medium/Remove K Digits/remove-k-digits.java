//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String S = sc.next();
            int K = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.removeKdigits(S, K));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public String removeKdigits(String S, int K) {
        // code here
        Stack<Character> stack = new Stack<>();

        for (char digit : S.toCharArray()) {
            while (K > 0 && !stack.isEmpty() && stack.peek() > digit) {
                stack.pop();
                K--;
            }
            stack.push(digit);
        }

        // Remove remaining K digits from the end
        while (K > 0) {
            stack.pop();
            K--;
        }

        // Convert the stack to a string and remove leading zeros
        StringBuilder result = new StringBuilder();
        for (char ch : stack) {
            result.append(ch);
        }
        int startIndex = 0;
        while (startIndex < result.length() && result.charAt(startIndex) == '0') {
            startIndex++;
        }

        // If the result is empty, return "0"
        return (startIndex < result.length()) ? result.substring(startIndex) : "0";
    }
}