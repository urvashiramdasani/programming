#include <bits/stdc++.h>

using namespace std;

vector<string> split_string(string);

/*
 * Complete the gameWithCells function below.
 */
int gameWithCells(int n, int m) {
    /*
     * Write your code here.
     */
    if(m==1 && n==1) return m*n;
    else if(m%2==0 && m!=2) {
        int m1 = m/2;
        cout<<m1;
        if(n==1) return n*(m1-1);
        else return (m1-1)*(n-1); 
    }
    else if(n%2==0 && n!=2) {
        int n1 = n/2;
        if(m==1) return m*(n1-1);
        else return (m-1)*(n1-1);
    }
    else if(m==1) return m*(n-1);
    else if(n==1) return n*(m-1);
    else return (m-1)*(n-1);
}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    string nm_temp;
    getline(cin, nm_temp);

    vector<string> nm = split_string(nm_temp);

    int n = stoi(nm[0]);

    int m = stoi(nm[1]);

    int result = gameWithCells(n, m);

    fout << result << "\n";

    fout.close();

    return 0;
}

vector<string> split_string(string input_string) {
    string::iterator new_end = unique(input_string.begin(), input_string.end(), [] (const char &x, const char &y) {
        return x == y and x == ' ';
    });

    input_string.erase(new_end, input_string.end());

    while (input_string[input_string.length() - 1] == ' ') {
        input_string.pop_back();
    }

    vector<string> splits;
    char delimiter = ' ';

    size_t i = 0;
    size_t pos = input_string.find(delimiter);

    while (pos != string::npos) {
        splits.push_back(input_string.substr(i, pos - i));

        i = pos + 1;
        pos = input_string.find(delimiter, i);
    }

    splits.push_back(input_string.substr(i, min(pos, input_string.length()) - i + 1));

    return splits;
}
