package com.vitorcamara.projetos;

import java.util.Scanner;

public class Operacoes2Numeros {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Entre com o primeiro número:");
		double num1 = scan.nextDouble();
		System.out.println("Entre com o segundo número:");
		double num2 = scan.nextDouble();
		
		System.out.println("Qual operação deseja realizar? Digite '+' para somar, '-' para subtrair, '*' para multiplicar ou '/' para dividir:");
		String operac = scan.next();
		
		double soma = num1 + num2;
		double divi = num1 / num2;
		double sub = num1 - num2;
		double mult = num1 * num2;
		
		
		if (operac.equals("+")) {
			System.out.println("A soma dos numeros e igual a: " + soma);
			
			if (soma % 2 == 0){
				System.out.println("Numero par");
			} else {System.out.println("Numero impar");}
			
			if (soma > 0) {
				System.out.println("Numero positivo");} 
			else {System.out.println("Numero negativo");}
			
			if ((soma) == Math.ceil(soma)){ 
				System.out.println("Numero inteiro");}
				else {System.out.println("Numero decimal");}
			
			
			}
			
		if (operac.equals("-")) {
			System.out.println("A subtraçao dos numeros e igual a: " + sub);
			
			if (sub % 2 == 0){
				System.out.println("Numero par.");
			} else {System.out.println("Numero ímpar.");}
			
			if (sub > 0) {
				System.out.println("Número positivo.");} 
			else {System.out.println("Número negativo.");}
			
			if ((sub) == Math.ceil(sub)){
				System.out.println("Número inteiro");}
				else {System.out.println("Número decimal");}
			
			
			}
			
		if (operac.equals("*")) {
			System.out.println("A multiplicaçao dos numeros e igual a: " + mult);
			
			if (mult % 2 == 0){
				System.out.println("Numero par");
			} else {System.out.println("Numero impar");}
			
			if (mult > 0) {
				System.out.println("Numero positivo");} 
			else {System.out.println("Numero negativo");}
			
			if ((mult) == Math.ceil(mult)){
				System.out.println("Numero inteiro");}
				else {System.out.println("Numero decimal");}
			
			
			}
			
		if (operac.equals("/")) {
			System.out.println("A subtraçao dos numeros e igual a: " + divi);
			
			if (divi % 2 == 0){
				System.out.println("Numero par");
			} else {System.out.println("Numero impar");}
			
			if (divi > 0) {
				System.out.println("Numero positivo");} 
			else {System.out.println("Numero negativo");}
			
			if ((divi) == Math.ceil(divi)){
				System.out.println("Numero inteiro");}
				else {System.out.println("Numero decimal");}
			
			
			}
		}

	}


