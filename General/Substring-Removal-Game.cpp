#include <iostream>
#include<vector>
#include<algorithm>
using namespace std;
int main() {
  int t; cin>>t;
  while(t--) {
    string s; cin>>s;
    int count = 0, f = 0;
    vector<int> v;
    for(int i=0;i<=s.length();i++) {
      if(s[i] == '1') count++;
      else {
        f = 1;
        v.push_back(count);
        count = 0;
      }
    }
    if(f == 0) v.push_back(count);
    sort(v.begin(), v.end(), greater<int>());
    // for(int i=0;i<v.size(); i++) cout<<v[i]<<" ";
    int score = 0;
    for(int i=0;i<v.size(); i++) {
      if(i%2==0) score += v[i];
    }
    cout<<score<<endl;
  }
}
