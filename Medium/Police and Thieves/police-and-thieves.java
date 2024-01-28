//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 


// } Driver Code Ends
//User function Template for Java

class Solution 
{ 
    static int catchThieves(char arr[], int n, int k) 
	{ 
        // Code here
        ArrayList<Integer> arrp=new ArrayList<Integer>();
        ArrayList<Integer> arrt=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            if(arr[i]=='P')
            arrp.add(i);
            else
            arrt.add(i);
        }
        int l=0,r=0,res=0;
        while(l<arrp.size() && r<arrt.size()){
            int diff = Math.abs(arrp.get(l) - arrt.get(r));

            if (diff <= k) {
            res++;
            l++;
            r++;
            }
            else if(arrt.get(r)<arrp.get(l))
            r++;
            else
            l++;
        }
        return res;
	} 
} 



//{ Driver Code Starts.
class GFG{
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
			char arr[] = new char[n];
			for(int i=0; i<n; i++)
         		arr[i] = sc.next().charAt(0);

			Solution ob = new Solution();
            System.out.println(ob.catchThieves(arr, n, k));
            t--;
        }
    }
}       
// } Driver Code Ends