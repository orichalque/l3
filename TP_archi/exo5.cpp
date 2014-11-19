#include<iostream>
#include<cmath>

using namespace std;

int pgdc(int a, int b) {
	return (b=0) ? a : pgdc(b, a%b) ;
}

int main() {
	return 0;
}
