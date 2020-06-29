#include <iostream>
using namespace std;
int main() {
  int t;
  cin>>t;
  while(t--) {
    int x;
    cin>>x;
    int num_dice = (int) x/14;
    // cout<<num_dice;
    if(num_dice>0) {
      if(x>=14*num_dice+1 && x<=14*num_dice+6)        {cout<<"YES"<<endl;}
    else {cout<<"NO"<<endl;}}
    else{cout<<"NO"<<endl;}
  }
}