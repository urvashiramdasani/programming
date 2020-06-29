#include<iostream>
using namespace std;
int main() {
	int n;
	cin>>n;
	int a[n],b[n];
	int test[n],a1[n],sum=0;

	if(n==1) {
		int d;
		cin>>d;
		cout<<d<<endl;
	}
	else {
		for(int i=0;i<n;i++) {
			cin>>b[i];
			a[i] = i+1;
			test[i] = b[i];
		}

		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(b[i]>b[j]) {
					int tmp = b[i];
					b[i] = b[j];
					b[j] = tmp;

					tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}
	// b.sort();
		int max = sum;
		for(int i=0;i<n;i++) {
			sum = b[i];
			for(int j=i+1;j<n;j++) {
				if(b[i] - b[j] ==  a[i] - a[j]) {
					sum += b[j];
				}
			}
			if(max<sum) max = sum;
		}
		if(max<b[n-1]) cout<<b[n-1]<<endl;
		else cout<<max<<endl;
	}
}