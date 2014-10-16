%%
Yacc						printf("Yacc \n");
^From						printf("From \n");
^((.*\+.*){3,10})\n 			printf("+ \n");
.|[\n]	;
%%
main() {
	yylex();
}

