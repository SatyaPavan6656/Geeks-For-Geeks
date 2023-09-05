//{ Driver Code Starts
//Initial Template for C++

#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
//User function Template for C++

class Solution {
  public:
    vector<string> invIsoTriangle(int N) {
        // code here
        vector<string> v;
        string res;
        for(int i=N;i>0;i--){
            for(int k=N;k>i;k--){
                res+=" ";
            }
            for(int j=2*i-1;j>0;j--){
                res+="*";
            }
            for(int k=N;k>i;k--){
                res+=" ";
            }
            v.push_back(res);
            res="";
        }
        return v;
    }
};

//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        int N;
        
        cin>>N;

        Solution ob;
        vector<string> v = ob.invIsoTriangle(N);
        
        for(int i=0; i<v.size(); i++)
            cout<<v[i]<<endl;
    }
    return 0;
}
// } Driver Code Ends