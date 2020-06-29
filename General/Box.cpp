//#include<stdc++>
#include<iostream>
#include<stdio.h>
using namespace std;
//Implement the class Box  
class Box {
    private:
        int l,b,h;
    public: 
        Box(int length=0, int breadth=0, int height=0) {
            l=length;
            b=breadth;
            h=height;
        }
        Box(const Box& B) {
            l = B.l;
            b = B.b;
            h = B.h;
        }
        int get_length() {
            return l;
        }
        int get_breadth() {
            return b;
        }
        int get_height() {
            return h;
        }
        long long int CalculateVolume() {
			long long int vol = long(l)*long(b)*long(h);
            return vol;   
        }
        bool operator<(Box& B) {
    if(get_length()<B.get_length()) return true;
    else if(get_breadth()<B.get_breadth() && get_length()==B.get_length()) return true;
    else if(get_height()<B.get_height()&& get_length()==B.get_length() && get_breadth()==B.get_breadth()) return true;
    else return false;
}
};
ostream& operator<<(ostream& out, Box& B) {
    out<<B.get_length()<<" "<<B.get_breadth()<<" "<<B.get_height();
    return out;
}
//Overload operator < as specified

//Overload operator << as specified

void check2()
{
	int n;
	cout<<"Enter a value: ";
	cin>>n;
	Box temp;
	for(int i=0;i<n;i++)
	{
		int type;
		cin>>type;
		if(type ==1)
		{
			cout<<temp<<endl;
		}
		if(type == 2)
		{
			int l,b,h;
			cin>>l>>b>>h;
			Box NewBox(l,b,h);
			temp=NewBox;
			cout<<temp<<endl;
		}
		if(type==3)
		{
			int l,b,h;
			cin>>l>>b>>h;
			Box NewBox(l,b,h);
			if(NewBox<temp)
			{
				cout<<"Lesser\n";
			}
			else
			{
				cout<<"Greater\n";
			}
		}
		if(type==4)
		{
			cout<<temp.CalculateVolume()<<endl;
		}
		if(type==5)
		{
			Box NewBox(temp);
			cout<<NewBox<<endl;
		}

	}
}

int main()
{
	check2();
    return 0;
}
