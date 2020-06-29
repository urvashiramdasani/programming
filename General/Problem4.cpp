#include<bits/stdc++.h>
using namespace std;
int main() {
    int t,b; cin>>t>>b;
    for(int test=0;test<t;test++) {
        int p = 1;
        char c;
        string s="";
        for(int i=1;i<=150;i++) {
            if(p>b) {
                p=1;
                s = "";
            }
            cout<<p<<endl;
            p++;
            cin>>c;
            s +=c;
        }
        cout<<s<<endl;
        char ch;
        cin>>ch;
        if(ch == 'N') break;
    }
}