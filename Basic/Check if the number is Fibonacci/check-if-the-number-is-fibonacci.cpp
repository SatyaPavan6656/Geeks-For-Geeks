//{ Driver Code Starts
#include<bits/stdc++.h> 
using namespace std; 

// } Driver Code Ends
class Solution{   
public:
    string checkFibonacci(int N){
        if(isperfect((5*(N*N)+4)) || isperfect((5*(N*N)-4))){
            return "Yes";
        }
        else{
            return "No";
        }
    }
    bool isperfect(long long n){
        long long sq=sqrt(n);
        if(sq*sq==n){
            return true;
        }
        else{
            return false;
        }
    }
 
// } Driver Code Ends
};


//{ Driver Code Starts.
int main() 
{ 
    int t;
    cin>>t;
    while(t--)
    {
        int N;
        cin >> N;
        Solution ob;
        cout << ob.checkFibonacci(N) << endl;
    }
    return 0; 
} 
// } Driver Code Ends