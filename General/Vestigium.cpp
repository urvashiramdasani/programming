#include <iostream>
using namespace std;
int main() {
  int t; cin>>t;
  for(int i=0;i<t;i++) {
    int n; cin>>n;
    int a[n][n];
    for(int j=0;j<n;j++) {
      for(int k=0;k<n;k++) cin>>a[j][k];
    }
    int trace = 0;
    for(int j=0;j<n;j++) {
      trace += a[j][j];
    }
    int rcount = 0;
    int sum;
    for(int j=0;j<n;j++) {
      for(int k=0;k<n;k++) {
        for(int z=1;z<n-k;z++) {
          sum = 0;
          if(a[j][k] == a[j][k+z]) {
            sum++;
            break;
          }
        }
        if(sum >0) {
          rcount +=sum;
          break;
        }
      }
    }
    int ccount = 0;
    for(int j=0;j<n;j++) {
      for(int k=0;k<n;k++) {
        for(int z=1;z<n-k;z++) {
          sum=0;
          if(a[k][j] == a[k+z][j]) {
            sum++;
            break;
          }
        }
        if(sum>0) {
          ccount +=sum;
          break;
        }
      }
    }
    cout<<"Case #"<<(i+1)<<": "<<trace<<" "<<rcount<<" "<<ccount<<endl; 
  }
}