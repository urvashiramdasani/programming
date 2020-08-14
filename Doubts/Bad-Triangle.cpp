#include <iostream>
using namespace std;
int main() {
  int t; cin>>t;
  while(t--) {
    long int n; cin>>n;
    long long int a[n];
    for(long int i=0;i<n;i++) cin>>a[i];
    long int i=0, j=1, k=2, f = 0;
    while(k<=n-1) {
      if(a[i] + a[j] < a[k]) {
        f = 1;
        break;
      }
      else {
        if(k == n-1) {
          i++; j = i+1; k = i+2;
        }
        else j++; k++;
      }
    }
    if(f == 1) cout<<i+1<<" "<<j+1<<" "<<k+1<<endl;
    else cout<<"-1"<<endl;
  }
}
