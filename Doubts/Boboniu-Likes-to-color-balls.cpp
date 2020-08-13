#include <iostream>
using namespace std;

int countOdd(long long int r, long long int g, long long int b, long long int w) {
  int count = 0;
  if(r%2==1) count++;
  if(g%2==1) count++;
  if(b%2==1) count++;
  if(w%2==1) count++;
  return count;
}

int main() {
  int t; cin>>t;
  while(t--) {
    long long int r,g,b,w; cin>>r>>g>>b>>w;
    int f = 0;
    int count = countOdd(r, g, b, w);
    if(count>1) {
      if(r == 0 || g == 0 || b == 0 || w == 0) cout<<"No"<<endl;
      else {
        while(count>1) {
          r--; g--; b--; w += 3;
          count = countOdd(r, g, b, w);
          if(r == 0 || g == 0 || b == 0) {
            f = 1;
            break;
          }
        }
        if(f == 1){
          if(count>1) cout<<"No"<<endl;
          else cout<<"Yes"<<endl;
        } 
        else if(f == 0) cout<<"Yes"<<endl;
      }
    } else if(count == 0 || count == 1) cout<<"Yes"<<endl;
  }
}