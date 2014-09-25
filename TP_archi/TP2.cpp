#include<iostream>
#include<string>

using  namespace std;

char add_bin(char nb1, char nb2) {
	if ((nb1=='1' && nb2=='1') || (nb1 == '0' && nb2 == '0')) {
		return '0';
	} else {
		return '1';
	}
}

string bin2brgc(string binary) {
	string gray = "";
	gray += binary.at(0);
	for (int i = 0; i < binary.length()-1; i++) {
		gray = gray + add_bin((binary.at(i)), (binary.at(i+1)));
	}
	//cout << gray << endl;
}
int main() {
	string str = "1001";
	bin2brgc(str);
	return 0;
	
}
