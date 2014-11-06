#include<iostream>
#include<string>

using namespace std;

int main() {
	int mois[] = {0,3,2,5,0,3,5,1,4,6,2,4};
	// 1 4 4 0 2 5 0 3 6 1 4 6
	string jours[] = {"dim", "lun", "mar", "mer", "jeu", "ven", "sam"};
	cout << "Quel jour ?" << endl;
	int n;
	cin >> n;
	cout << "Quel mois ?" << endl;
	int m;
	cin >> m;
	cout << "Quelle année ?" << endl;
	int a;
	cin >> a;
	
	if (m < 3) {
		--a;
	}
	
	int codemois, codejour, codeannee;
	codemois = t[m];
	
	int tt = (codemois + codejour + n);
	tt = tt % 7;
	
	
	return 0;
}

/*
	li $v0, 4 			$v0 <- 4
	la $a0, qjour		cout "quel jour"
	syscall				appel systeme v0 = 4 -> afficher une string
	li $v0, 5			$v0 <- 5
	syscall				appel systeme v0 = 5 -> lire un entier
	move $t2, $v0		$t2 <- $v0

	li $v0, 4			$v0 <- 4
	la $a0, qmois		cout "quel mois"
	syscall				appel systeme 
	li $v0, 5			$v0 <- 5
	syscall
	move $t1, $v0		$t1 <- v0 

	li $v0, 4
	la $a0, qannee
	syscall
	li $v0, 5
	syscall
	move $t0, $v0 		$t0 <- $v0 l'année


// T2 : Jour, T1 : Mois, T0 : année //	
JOUR DE LA SEMAINE = ( CODEANNEE + CODEMOIS + CODEJOUR ) MODULO 7
if:	bge $t1, 3, endif			if (Mois < 3 ) {
then:	sub $t0, $t0, 1				année -- }
endif:

	CALCUL DU CODEANNEE
	move $t3, $t0		t3 = t0   			t3 = 2000
	srl $t4, $t0, 2		t4 = t0 / 4			t4 = 2000 / 4 = 500
	add $t3, $t3, $t4	t3 = t3+t4			t3 = 2000 + 500 = 2500
	div $t4, $t0, 100	t4 = t0/100			t4 = 2000 / 100 = 20
	sub $t3, $t3, $t4	t3 = t3 - t4		t3 = 2500 - 20 = 2480
	srl $t4, $t4, 2		t4 = t4/4			t4 = 20 / 4 = 5
	add $t3, $t3, $t4	t3 += t4			t3 = 2485
	
	CALCUL DU CODEMOIS
	la $t5, t			t5 = @t
	sub $t4, $t1, 1		t4 = t1 - 1
	add $t4, $t4, $t5	t4 = t4+t5
	lb $t4, ($t4)		t4 = mem(t4)
	T4 adresse du codemois
	mois - 1 ; EX : mois = 2 -> t4 = 1
				t4 = t4 + adresse du tableau de codemois
				t4 = codemois
				février = 2. 2 - 1 = 1, mem(t4+1 octet) = 3
				t3 
	add $t3, $t3, $t4	t3 += t4
	add $t3, $t3, $t2	t3 += t2
	rem $t3, $t3, 7		t3 = t3 % 7
	sll $t3, $t3, 2		t3 = t3 * 4

	la $t5, jour_str	t5 = @jourstr
	add $t5, $t5, $t3	t5 += t3
	lw $a0, ($t5)		a0 = mem(t5)
	li $v0, 4			cout a0
	syscall				
	
	li $v0, 10			exit
	syscall
	*/
