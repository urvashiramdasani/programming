#include <iostream>
using namespace std;
int main() {
  // std::cout << "Hello World!\n";
  int t;
  cin>>t;
  while(t--) {
    string a,b,c;
    cin>>a>>b>>c;
    int num_swap=0;
    for(int i=0;i<a.length();i++) {
      if(a.at(i) == c.at(i)) {
        b.at(i) = c.at(i);
        num_swap++;
      }
      else if(c.at(i) == b.at(i)) {
        a.at(i) = c.at(i);
        num_swap++;
      }
    }
    if(a == b && num_swap==a.length()) {
      cout<<"YES"<<endl;
    }
    else cout<<"NO"<<endl;
  }
}