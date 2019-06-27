package br.com.arrays;

import java.util.Arrays;

public class TesteArrays {

	public static void main(String[] args) {
		int[] numeros = new int[] {4,3,6,2};
		double media=0.0;
		int maiorNumero = 0;
		for(int num:numeros) {
			System.out.println(num);
		}
		Arrays.sort(numeros);
		System.out.println("ordenados: ");
		for(int num:numeros) {
			System.out.println(num);
		}
		
		for(int i=0; i<numeros.length;i++) {
			media+=numeros[i];
			//pegando maior numero (ultimo é o maior)
			maiorNumero=numeros[i];
			media/=numeros.length;			
		}
		System.out.println("media: " +media);		
		System.out.println("maior numero: " + maiorNumero);
		
		
		
	}

}
