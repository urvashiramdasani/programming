#include <iostream>
using namespace std;
int main() {
  // std::cout << "Hello World!\n";
  int t;
  cin>>t;
  while(t--) {
    int a,b,x,y;
    cin>>a>>b>>x>>y;
    int a1 = a*y;
    int a2 = b*x;
    int a3 = a*(b-y-1);
    int a4 = b*(a-x-1);
    int ans = max(max(a1,a2),max(a3,a4));
    cout<<ans<<endl;
  }
}
