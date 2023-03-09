package view;

import controller.ControllerExercicio0;

public class PrincipalExercicio0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] Vetor = new int [1000];
		int N=11;
		
		for (int i = 0; i < Vetor.length; i++) {
			Vetor[i] = (int) (1 + Math.random() * 100);
			//System.out.println(Vetor[i]);
	      }
		 
		Thread t1 = new ControllerExercicio0(Vetor,N);
		Thread t2 = new ControllerExercicio0(Vetor,N);
		t1.start();
		t2.start();
	}

}
