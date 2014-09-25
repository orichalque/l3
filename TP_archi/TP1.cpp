#include<string>
#include<iostream>
#include <sstream>
#define maximum 50
using namespace std;

string nbtostring(int nb) {
	ostringstream ss;
	ss << nb;
	return ss.str();
}


int to_10(int *tab, int taille, int base) {
	int total = tab[0];
	for (int i = 1; i < taille; i++) {
		total = total*base + tab[i];
	}
	return total;
}

string to_base(int total_10, int base) {
	string result = "";
	int reste = total_10;
	int tmp = 0;
	string liste = "0123456789abcdefghijklmnopqrstuvwxyz";
	string mod = "";
	while(reste != 0) {
		tmp = reste % base;
		result = liste.at(tmp) + result;
		reste = reste / base;
	}

	return result;
}
 
void base_converter(string s, int base_depart, int base_arrivee) {
	string converted = "";
	string base_10 = "";
	int pos;
	int tab[s.length()];
	int k;
	string liste = "0123456789abcdefghijklmnopqrstuvwxyz";
	string charac = "";
	
	//Conversion en un tableau d'entier
	for (int i = 0; i < s.length(); i++) {
		charac = s.at(i);
		pos = liste.find(charac);
		tab[i] = pos;
	}
	
	k = to_10(tab, s.length(), base_depart);
	converted = to_base(k, base_arrivee);
	cout << converted << endl;	
}


int main() {
	
	base_converter("3eh12", 18,30);
	return 0;
}
