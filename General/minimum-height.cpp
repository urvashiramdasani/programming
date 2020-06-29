#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include<iomanip>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    long int a,b;
    cin>>b>>a;
    //cout<<a;
    double h = (double) 2*a/b;
    cout<<fixed;
    cout<<setprecision(0)<<ceil(h);
    return 0;
}
