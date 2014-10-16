#include<iostream>
#include<algorithm>
#include <cmath>
#include<vector>
#include <stdint.h>
using namespace std;

bool adecroissant(double i, double j); 
bool acroissant(double i, double j);
bool croissant(double i, double j);
bool decroissant(double i, double j);

const uint32_t szT = 31;
const double T[szT] = 
  { 9007199254740992.0, 999999999999.9, -999999999998.9, 3.56, 12.8766, 
    0.0123, 999394.4453, 1265356.434536, 23.53, 7889.123, 0.00002145, 0.5, 
    0.06456, 1254534536.4574, -1254534536.4575, -9007199254740992.0, 
    -999999999999.9, 999999999998.9, -3.56, -12.8766, -0.0123, 
    -999394.4453, -1265356.434536, -23.53, -7889.123, -0.00002145, 
    -0.5, -0.06456, -1254534536.4574, 1254534536.4575, 2.6 };

/* SOMMES */
double somme_recursive(const double t[], uint32_t szT) {
	double sum = 0;
	for (uint32_t i = 0; i < szT; i++) {
		sum += t[i];
	}
	return sum;
}

double somme_croissante(const double T[], uint32_t szT) {
	double sum = 0;
	vector<double> V(T, T+szT);
	sort(V.begin(), V.end(), croissant); //croissant
	for( vector<double>::const_iterator i = V.begin(); i != V.end(); ++i) {
		sum = sum + *i;
	}
	return sum;
}

double somme_decroissante(const double T[], uint32_t szT) {
	double sum = 0;
	vector<double> V(T, T+szT);
	sort(V.begin(), V.end(), decroissant); //decroissant
	for( vector<double>::const_iterator i = V.begin(); i != V.end(); ++i) {
		sum = sum + *i;
	}
	return sum;
}

double somme_abs_croissante(const double T[], uint32_t szT) {
	double sum = 0;
	vector<double> V(T, T+szT);
	sort(V.begin(), V.end(), acroissant); 
	for( vector<double>::const_iterator i = V.begin(); i != V.end(); ++i) {
		sum = sum + *i;
	}
	return sum;
}

double somme_abs_decroissante(const double T[], uint32_t szT) {
	double sum = 0;
	vector<double> V(T, T+szT);
	sort(V.begin(), V.end(), adecroissant); 
	for( vector<double>::const_iterator i = V.begin(); i != V.end(); ++i) {
		sum = sum + *i;
	}
	return sum;
}

/* ------- */


void affiche_tab(const double t[], uint32_t szT) {
	for (uint32_t i = 0; i < szT; i++) {
		cout << t[i] << ' ';
	}		
	cout << endl;
}


void affiche_vec(vector<double> v) {
	for( vector<double>::const_iterator i = v.begin(); i != v.end(); ++i)
    cout << *i << ' ';
}

bool adecroissant(double i, double j) { return (fabs(i) > fabs(j)) ; }
bool acroissant(double i, double j) { return (fabs(i) < fabs(j)) ; }
bool decroissant(double i, double j) { return (i > j) ; }
bool croissant(double i, double j) { return (i < j) ; }

/* ~~~~~~~~~~~~~~~~~~~~~~~MAINE ~~~~~~~~~~~~~~~~~~~~~~*/
int main() {
	cout << somme_recursive(T,szT) << endl;
	cout << somme_croissante(T, szT) << endl;
	cout << somme_decroissante(T, szT) << endl;
	cout << somme_abs_croissante(T, szT) << endl;
	cout << somme_abs_decroissante(T, szT) << endl;
}
