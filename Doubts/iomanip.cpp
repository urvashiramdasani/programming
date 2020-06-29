#include <iostream>
#include<iomanip>
using namespace std;
int main() {
  int t;
  std::cin>>t;
  for(int i=0;i<t;i++) {
    double a,b,c;
    std::cin>>a>>b>>c;
    int d = a;
    std::cout<<std::hex;
    std::cout<<std::setiosflags(std::ios::showbase|std::ios::uppercase);
    std::cout<<d<<std::endl;
    std::cout.width(15);
    std::cout<<std::fixed<<std::setprecision(2)<<std::showpos;
    cout.setf(ios::right);
    std::cout<<b<<endl;
    std::cout<<std::setprecision(9)<<std::noshowpos;
    std::cout<<std::scientific;
    std::cout<<std::uppercase;
    std::cout<<c<<endl;
  }

}