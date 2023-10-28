//{ Driver Code Starts
//Initial template for C++

#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution{
    public:
    vector <int> nFibonacci(int N){
        //code here
        vector<int> ans;
       int a=0 , b=1;
       ans.push_back(0);
       
       while(b<=N)
       {
           ans.push_back(b);
           int next = a+b;
           a = b ;
           b = next;
       }
        

    return ans;

    }
};

//{ Driver Code Starts.
int main(){
    int t;
    cin>>t;
    while(t--){
        int N;
        cin>>N;
        Solution ob;
        vector <int> ans=ob.nFibonacci(N);
        for(int u:ans)
         cout<<u<<" ";
        cout<<"\n"; 
    }
}
// } Driver Code Ends