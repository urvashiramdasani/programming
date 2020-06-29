#include<iostream>
#include<cmath>
using namespace std;
int main() {
	int t;
	cin>>t;
	while(t--) {
		int a,b,c,r,ans,x;
    cin>>a>>b>>c>>r;
    x = abs(a-b);
		if(a>b) {
			if(a<0 && b<0){
        
      }
      else{
      int tmp = a;
			a = b;
			b = tmp;}
		}
			if(a<c && c<b) {
				if(c+r<b) {
					if(c-r>=a) {
						ans = x - 2*r;
					}
					else ans = b-c-r;
				}
				else {
					if(c-r>=a) {
						ans = c-a-r;
					}
					else ans = 0;
				}
			}
			else if(c<a){
				if(c+r<=a) {
					ans = x;
				}
				else if(c+r>a && c+r<b) {
					ans = b - c - r;
				}
				else {
					ans = 0;
				}
			}
			else if(c>b){
				if(c-r>=b) {
					ans = x;
				}
				else if(c-r<b && c-r>a) {
					ans = c - a - r;
				}
				else {
					ans = 0;
				}
			}
      else
      {
        if(c==a) {
          if(c+r<b) {
            ans = x-r;
          }
          else {
            ans = 0;
          }
        }
        else if(b==c) {
          if(b-r>a) {
            ans = x-r;
          }
          else {
            ans =0;
          }
        }
      }
      cout<<ans<<endl;
		}
	}
