#include<iostream>
#include<stdio.h>
int main() {
	int arr[1000];
	gets(arr);
	int sum=0,x;
	for(int i=0;i<arr.size();i++) {
			sum+=arr[i];
			if(arr[i]%2!=0) x=i;
	}
	if(sum%2==0) puts(arr);
	else {
			for(int i=0;i<arr.size;i++) {
				if(i==x) break;
				else {
					cout<<arr[i];
				}
			}
	}
}