%{
int nombres;
int mots;
%}
D [0-9]
E [DEde][-+]?{D}+
%%
{D}+\.?{D}*{E}*	|
\.{D}+{E}? 		nombres++; 
lex				ECHO;
[A-Za-z]+ 		{ mots++; }
.|[\n]			;
%%
main() {
	nombres = 0;
	mots = 0;
	yylex();
	printf("\nNombres : %d, Mots: %d\n", nombres, mots);
}
