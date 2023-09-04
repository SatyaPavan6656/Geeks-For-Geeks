//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;
void printPat(int n);

int main()
{
	int t;
	cin>>t;
	while(t--)
	{
	int n;
	cin>>n;
    printPat(n);
    cout<<endl;
	}
}
// } Driver Code Ends


/*You are required to complete this method*/
void printPat(int n)
{
//Your code here
    int c=n;
    while(c>0){
        int temp=n;
        while(temp>0){
            for(int i=1;i<=c;i++){
                cout<<temp<<" ";
            }
            temp--;
        }
        cout<<"$";
        c--;
    }
}