#User function Template for python3
import itertools
class Solution:
    def uniquePerms(self, arr, n):
        # code here 
        permutations = itertools.permutations(arr)
        ans = set()
        for perm in permutations:
            ans.add(perm)
        ans = list(ans)
        ans.sort()
        return ans


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__': 
    t = int (input ())
    for _ in range (t):
        n=int(input())
        arr=list(map(int,input().split()))
        
        ob = Solution()
        res = ob.uniquePerms(arr,n)
        for i in range(len(res)):
            for j in range(n):
                print(res[i][j],end=" ")
            print()
# } Driver Code Ends