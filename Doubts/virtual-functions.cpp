#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
class Person {
    string name;
    int age;
    public:
    virtual void getdata() {
        cin>>name>>age;
    }
    virtual void putdata() {
        cout<<name<<" "<<age<<" ";
    }
};
class Professor: public Person {
    int publications, cur_id=1;
    Person p;
    public:
        void getdata() {
            p.getdata();
            cin>>publications;
        }
        void putdata() {
            p.putdata();
            cout<<publications<<" "<<cur_id<<endl;
        }
};
class Student: public Person {
    int marks[6],cur_id=2;
    Person p;
    public:
        void getdata() {
            p.getdata();
            for(int i=0;i<6;i++) {
                cin>>marks[i];
            }
        }
        void putdata() {
            p.putdata();
            int sum=0;
            for(int i=0;i<6;i++) {
                sum = sum+marks[i];
            }
            cout<<sum<<" "<<cur_id<<endl;
        }
};
int main(){

    int n, val;
    cin>>n; //The number of objects that is going to be created.
    Person *per[n];

    for(int i = 0;i < n;i++){

        cin>>val;
        if(val == 1){
            // If val is 1 current object is of type Professor
            per[i] = new Professor;

        }
        else per[i] = new Student; // Else the current object is of type Student

        per[i]->getdata(); // Get the data from the user.

    }

    for(int i=0;i<n;i++)
        per[i]->putdata(); // Print the required output for each object.

    return 0;

}
