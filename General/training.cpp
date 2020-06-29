#include <iostream>
#include<map>
using namespace std;
int main() {
  std::map<string,int> mymap;
   std::map<string,int>::iterator it;
  int t;
  cin>>t;
  for (int i=0;i<t;i++) {
    int size;
    cin>>size;
    int count[size];
    count[i]=size;
    for(int j=0;j<size;j++) {
      string str;
      int value;
      cin>>str>>value;
      //std::pair<std::map<char,int>::iterator,bool> ret;
      mymap.insert(std::pair<string,int>(str,value));
      if(j!=0) {
        it = mymap.find(str);
        if(it!=mymap.end()) {
          if(value==mymap.find(str)->second) {
          count[i]--;
        }
      }
      }
    }
    cout<<count[i]<<endl;
  }
}
