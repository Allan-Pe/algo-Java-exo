package com.company;

public class Main {

 	 static void moyenne(int [] tb){

 	 	int moyenne =0;
		 for (int m = 0 ; m< tb.length;m++ ) {
			 int s = tb [m];
			 moyenne = moyenne + s;
			 System.out.println(s);
		 }
		 System.out.println(moyenne/ tb.length);
	}

	public static void main(String[] args) {

    	// Déclaration TB
		int [] scores = new int [7];
		//Affectation valeur
		scores[0] = 22;
		scores[1] = 1;
		scores[2] = 44;
		scores[3] = 70;
		scores[4] = 12;
		scores[5] = 15;
		scores[6] = 22;

		moyenne(scores);



    }
}
