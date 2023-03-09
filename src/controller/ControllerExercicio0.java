package controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ControllerExercicio0 extends Thread {
	
	private int[] Vetor = new int [1000];
	private int N, y,x,i;

	public ControllerExercicio0(int[] Vetor, int N) {
		this.Vetor = Vetor;
		this.N=N;

	}

	private void Calcular() {
		int i;
     
		//Verifica Número Par ou Impar 
		
		if (N % 2 == 0) {
			
			double tempoInicial = System.nanoTime();
			for (i=0; i <Vetor.length;i++) {
				Vetor [i] = Vetor[i];	
			}
			 double tempoFinal = System.nanoTime();
			 double tempoTotal = tempoFinal - tempoInicial;
			 // tempoTotal ns - 10^-9 s
			 tempoTotal= tempoTotal / Math.pow(10, 9);
			 System.out.println("Vetor Inteiro 10.000 ==> " +tempoTotal+" segundos");	
			 
			 
	//	for (i = 0; i < Vetor.length; i++) {
		//	Vetor[i] = (int) (1 + Math.random() * 100);
      //  }
		
		
		} else {
			
		   int soma = 0;
			int[] num;
			
			double tempoInicial = System.nanoTime();
			for(int i1 : Vetor){
              //System.out.println(i1);
            }
            
			double tempoFinal = System.nanoTime();
			 double tempoTotal = tempoFinal - tempoInicial;
			 // tempoTotal ns - 10^-9 s
			 tempoTotal= tempoTotal / Math.pow(10, 9);
			 System.out.println("Vetor Inteiro foreach 10.000 ==> " +tempoTotal+" segundos");
       
	  
			
			
		}
		
	}

	public void run() {
		Calcular();
	}

}
