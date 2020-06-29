#include <iostream>
using namespace std;
int main() {
  // std::cout << "Hello World!\n";
  int t;
  cin>>t;
  while(t--) {
    int A,B,C,n;
    cin>>A>>B>>C>>n;
    int largest = A > B ? (A > C ? A : C) : (B > C ? B : C);
    int count=0;
   	int x,y,z;
   	x=largest-A;
   	y=largest-B;
   	z=largest-C;
   	n -= (x+y+z);
   	if(n<0 || n%3!=0) cout<<"NO"<<endl;
   	else cout<<"YES"<<endl;
   }
 }