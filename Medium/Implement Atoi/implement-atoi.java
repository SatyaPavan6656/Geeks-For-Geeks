//{ Driver Code Starts
//Initial template for JAVA

import java.util.Scanner;

class aToi
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String str = sc.nextLine();
			
			Solution obj = new Solution();
			int num = obj.atoi(str);
			
			System.out.println(num);
		t--;
		}
	}
}
// } Driver Code Ends


//User function template for JAVA

/*You are required to complete this method */
class Solution
{
    int atoi(String s) {
	// Your code here
	boolean flag = false;
	int res = 0;
	if(s.charAt(0) == '-')flag = true;
	for(int i =0; i < s.length() ; i++){
	    int ch = (int)s.charAt(i);
	    if(ch >= 48 && ch <= 57){
	        res = res*10+(ch-48);
	    }else if(flag && i == 0)continue;
	    else return -1;
	}
	if(flag){
	    res = -res;
	    return res;
	}else return res;

    }
}
