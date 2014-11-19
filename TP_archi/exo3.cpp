#include<iostream>
#include<cstdlib>
#include<cstdint>


using namespace std;

int main() {
	srand (time(NULL));
	int32_t number_to_find = rand()%100;
	int32_t number_tmp;
	cout << "Entrez un nombre" << endl;
	cin >> number_tmp;
	int nb = 1;
	while (number_to_find != number_tmp) {
		if (number_tmp < number_to_find || number_tmp > number_to_find) {
			(number_tmp < number_to_find) ? cout << " plus " : cout << " moins ";
			cout << endl;
			cout << "Entrez un nombre" << endl;
			cin >> number_tmp;
			++nb;
		}
	}
	cout << "trouvé !" << endl;
	cout << "En: " << nb << " essais !" << endl; 
	
	return 0;
		
}
