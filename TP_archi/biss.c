#include<stdio.h>

int main(void) {
	printf("Année ?\n");
	int c = getc(stdin);
	printf("Vous avez tapé :");
	putc(c, stdout);
}

