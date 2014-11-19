#include<iostream>
#include<cstdlib>
#include<cstdint>
#include<string>

using namespace std;

int main() {
	string str = "e ee eee lole ";
	int nb(0);
	for (int i = 0; i < str.length(); i++) {
		if (str.at(i) == 'e') {
			++nb;
		}
	}
	
	cout << nb << endl;
}
