#include <iostream>
#include<bits/stdc++.h>
using namespace std;
int main() {
  int t;
        cin>>t;
        for(int i=0;i<t;i++) {
            double a,b,c;
            cin>>a>>b>>c;
            int d = a;
            stringstream ss;
            ss<<hex<<d;
            string res = ss.str();
            cout<<"0x"<<res<<endl;
            std::cout.width(15); 
            cout<<fixed<<setprecision(2);
            std::cout<<b<<endl;
            std::cout.width(9);
            std::cout<<std::scientific<<uppercase;
            std::cout<<c<<endl;
        }
}