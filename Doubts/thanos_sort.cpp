#include <iostream>
using namespace std;
int main() {
  int div=2;
  int n;
  cin>>n;
  int arr[n];
  for(int i=0;i<n;i++) {
    cin>>arr[i];
  }
  int flag = 0;
  for(int i=0;i<n;i++) {
    if(arr[i]>arr[i+1]) {
      flag = 1;
      break;
    }
  }
  if(flag!=0) {
    n = n/div;
    if(n==1) cout<<"1";
    else {
      while(n!=1) {
        
      }
    }
  }
}
