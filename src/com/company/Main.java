package com.company;

public class Main {

 	 static int moyenne(int [] tb){

 	 	int moyenne =0;
		 for (int m = 0 ; m< tb.length;m++ ) {
			 int s = tb [m];
			 moyenne = moyenne + s;
			 System.out.println(s);
		 }
		 return moyenne/ tb.length;
	}

	static int max (int [] tb){
 	 	int max = 0;
 	 	for (int i=0 ; i < tb.length; i ++){
 	 		if (tb[i] > max)
 	 		max = tb[i];
		}
 	 	return max;
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

		System.out.println((moyenne(scores)));
		System.out.println(max(scores));


    }
}
