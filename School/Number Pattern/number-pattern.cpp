//{ Driver Code Starts
#include<bits/stdc++.h> 
using namespace std; 

// } Driver Code Ends
class Solution
{
public:
    vector<string> numberPattern(int N)
    {
        // Write Your Code here
        string c="";
        vector<string> v1;
        for(int i=1; i<=N; i++){
            c="";
            for(int j=1; j<=i; j++){
                c+=to_string(j);
            }
            for(int j=i-1; j>0; j--){
                c+=to_string(j);
            }
            v1.push_back(c);
        }
        return v1;
    }
};

//{ Driver Code Starts.
int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        int N;
        cin>>N;
       
        Solution ob;
        vector<string> res = ob.numberPattern(N);
        for(int i = 0; i < res.size(); i++){
            cout << res[i] << " ";
        }
        cout << endl;
    
    }
    return 0;
}
// } Driver Code Ends