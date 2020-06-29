#include<iostream>
using namespace std;
int main() {
	int t,max;
	cin>>t;
	while(t--) {
		int n;
		cin>>n;
		int a[n],flag=1;
		for(int i=0;i<n;i++) {
			cin>>a[i];
			if(a[i]%2==0) {
				flag=0;
				break;
			}
			else flag=1;
			if(a[i]%2==0)
			{
				max=a[i];
			}
		}

		if(flag == 1) cout<<"0"<<endl;
		
		for(int i=0;i<n;i++) {
			if(a[i]%2==0 && max<a[i]) max = a[i]; 
		}

		for(int i=0;i<n;i++) {
			if(a[i] == max) a[i] = max/2;
		}
	}
}