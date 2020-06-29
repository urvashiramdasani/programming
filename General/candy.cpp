#include<iostream>
#include<iomanip>
#include<cmath>
using namespace std;
int main() {
	int n,k,t;
	cin>>t;
	while(t--) {
		cin>>n>>k;
    if(n%k==0) {
      cout<<n<<endl;
    }
    else if(k>n){
      cout<<n<<endl;
    }
    else {
      int tmp = ((int) n/k)*k;
      int x = tmp + (int) k/2;
      cout<<x<<endl;
    }
	}
  // cout<<(int)11.74;
}