//{ Driver Code Starts
#include <bits/stdc++.h>

using namespace std;

// } Driver Code Ends
//User function template for C++
class Solution{
public:	
	int longSubarrWthSumDivByK(int arr[], int n, int k)
	{
	    // Complete the function
	     long long pref[n];
    pref[0]=(1ll*arr[0]);
    for(int i=1;i<n;i++){
        pref[i]=(pref[i-1]+(arr[i]*1ll));
    }
    long long ans = 0;
    map<long long ,long long> mp;
    for(int i=0;i<n;i++){
        if(( pref[i] % k)  == 0 ){
            ans=max(ans,(1ll*i+1));
        }
 
        if( mp.find( (pref[i]%k +k)%k ) != mp.end() ){
            long long  ind=mp[(pref[i]%k+k)%k];
            ans=max(ans,1ll*(i-ind ) );
        }
        else{
            mp[ (pref[i]%k +k)%k  ]=i;
        }
    }
    return ans;

	}
};

//{ Driver Code Starts.

int main()
{
	int t;
	cin>>t;
	while(t--)
	{
	int n,k,i;
	cin>>n>>k; int arr[n];
	for(i=0;i<n;i++)
	cin>>arr[i];
	Solution ob;
	cout<<ob.longSubarrWthSumDivByK(arr, n, k)<<"\n";
	}
	return 0;	 
}

// } Driver Code Ends