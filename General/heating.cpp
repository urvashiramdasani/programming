#include <iostream>
using namespace std;
int main() {
  int t;
  cin>>t;
  while(t--) {
  	int c,s;
  	cin>>c>>s;
  	if(c==1) {
  		cout<<s*s<<endl;
  	}
  	else if(s<=c) {
  		cout<<s<<endl;
  	}
  	else{
  		int arr[c]={0};
  		int y=s%c;
  		int x=(s-y)/c;
  		for(int i=0;i<c;i++)
  			{
  			arr[i]+=x;
  			if(i<y)
  			{
  				arr[i]+=1;
  			}
  			}
  	}
  	int sum=0;
  	for(int i=0;i<c;i++)
  	{
  		sum+=arr[i]*arr[i];
  	}
  	cout<<sum<<endl;
  }
  	}