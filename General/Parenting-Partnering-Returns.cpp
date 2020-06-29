#include <bits/stdc++.h>
#define all(a) (a).begin(),(a).end()
#define x first
#define y second
using namespace std;
int main() {
  int t; cin>>t;
  for(int test=0;test<t;test++) {
    int n; cin>>n;
    int a,b;
    vector< pair<int,int> > v;
    for(int i=0;i<n;i++) {
      cin>>a>>b;
      v.push_back({a,b});
    }

    // sorting with respect to first element x
    sort(all(v));
    // for(auto i=v.begin();i!=v.end();i++) cout<<i->x<<" "<<i->y<<endl;

    int f=0;
    string s="";
    int sum=0;
    int last = v[0].y;
    for(int i=0;i<n;i++) {
      if(i!=0) last = v[i-1].y;
      sum += v[i].y - v[i].x; 
      if(sum >=1440 && i!=n-1) {
        cout<<"Case #"<<test+1<<": "<<"IMPOSSIBLE"<<endl;
        f=1;
        break;
      }
      else if(i>0 && v[i].x<last) {
        int l = s.length();
        char ch = s.at(l-1);
        if(ch == 'C') s +="J";
        else s +="C";
      }
      else if(i>0 && v[i].x>last) {
        int l = s.length();
        char ch = s.at(l-1);  
        s +=ch;
      }
      else s +="C";
    }
    if(f == 0) cout<<"Case #"<<test+1<<": "<<s<<endl;
  }
}