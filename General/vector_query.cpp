#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int n;
    vector<int> v;
    cin>>n;
    for(int i=0;i<n;i++) {
        int val;
        cin>>val;
        v.push_back(val);
    }
    int q;
    cin>>q;
    for(int i=0;i<q;i++) {
        int val;
        cin>>val;
        auto low = std::lower_bound(v.begin(),v.end(),val);
        if(*low!=val) {
            cout<<"No "<<(low-v.begin()+1)<<endl;
        }
        else {
            cout<<"Yes "<<(low-v.begin()+1)<<endl;
        }
    }
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    return 0;
}
