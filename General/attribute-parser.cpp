#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

vector<string> split(string str) {
    vector<string>arr;
    string word="";
    for(int i=0;i<str.size();i++) {
      char ch = str.at(i);
        if (ch==' ') {
            arr.push_back(word);
            word="";
        }
        else {
            word = word+str.at(i);
        }
    }
    return arr;
}

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
    int n,q;
    cin>>n>>q;
    while(n>0) {
        string str;
        cin>>str;
        vector<string>arr;
        arr = split(str);
        n--;
    } 
    return 0;
}
