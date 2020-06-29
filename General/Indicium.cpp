#include<bits/stdc++.h>
using namespace std;
int main() {
    int t; cin>>t;
    for(int test=0;test<t;test++) {
      int n,k,j; cin>>n>>k;
      if(n==2) cout<<"Case #"<<test+1<<": IMPOSSIBLE"<<endl;
      else if(k>n*n) 
        cout<<"Case #"<<test+1<<": IMPOSSIBLE"<<endl;
      else {
        int a[n][n];
        for(int i=0;i<n;i++) a[0][i] = i+1;
        for(int i=1;i<n;i++) {
          for(j=0;j<n-1;j++) {
            a[i][j] = a[i-1][j+1];
          }
          a[i][j] = a[i-1][0];
        }
        int sum = 0;
        for(int i=0;i<n;i++) sum +=a[i][i];
        if(sum == k) {
          cout<<"Case #"<<test+1<<": POSSIBLE"<<endl;
          for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) cout<<a[i][j]<<" ";
            cout<<endl;
          }
        }
      }
    }    
}
