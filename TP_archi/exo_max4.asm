	.text
	.globl __start
	.globl __max
	

__start:
	sub $sp, $sp, 32
	
	li $a0, 11
	li $a1, 7
	li $a2, 22
	li $a3, 4
	
	jal __max4
	
	
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

__max4:
	sub $sp, $sp, 16
	
	lb $a0, 4($sp)
	lb $a1, 8($sp)
	
	jal __max
	
	move $a0, $v0
	li $v0, 1
	syscall
	
	jr $ra	
