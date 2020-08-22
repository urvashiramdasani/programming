#include <iostream>
using namespace std;
int main() {
  // Atcoder Contest 176

  // Problem A
  // int n,x,t;
  // cin>>n>>x>>t;
  // if(n%x == 0) cout<<n/x * t;
  // else {
  //   int tmp = n/x;
  //   cout<<(tmp+1) * t;
  // }

  // Problem C
  long int n; cin>>n;
  long long int a[n];
  for(long int i=0;i<n;i++) cin>>a[i];
  long long int diff = 0, pad = 0;
  for(long int i=1;i<n;i++) {
    for(long int j=i-1; j>=0; j--) {
      diff = a[i] - a[j];
      if(diff > 0 && diff > pad) pad = diff;
    }
  }
  cout<<pad;
}
