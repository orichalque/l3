	.text
	.globl __start
	

__start:
	
	li $a0, 11
	li $a1, 7
	jal __max
	
	move $a0, $v0
	li $v0, 1
	syscall
	
	li $v0, 10
	syscall
	

__max:

	if:	blt $a0, $a1, else 
	then:
		move $v0, $a0
		b endif	
	else:
		move $v0, $a1
	endif:
		jr $ra
		
