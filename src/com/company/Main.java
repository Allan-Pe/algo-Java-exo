package com.company;

public class Main {


	/**
	 *Calcul de la moyenne en fonction de []tb
	 * @param tb intègre les scores du tableau
	 * @return le calcul moyenne/tb.length
	 */
	public static int moyenne(int [] tb){

 	 	int moyenne =0;
 	 	// Pour m < au nombre de score du tb
		 for (int m = 0 ; m< tb.length;m++ ) {
			// s = score par case du tb
		 	int s = tb [m];
		 	//moyenne = somme du tb
			 moyenne = moyenne + s;
			 System.out.println(s);
		 }
		 //Moyenne retourner avec la valeur diviser par le nombre de score
		 return moyenne/ tb.length;
	}

	/**
	 * Prendre la plus grande valeur du tableau
	 * @param tb intègre les scores du tableau
	 * @return le score le plus élevé
	 */
	public static int max (int [] tb){
 	 	int max = 0;
 	 	//Pour i < au nombre de score du tb
 	 	for (int i=0 ; i < tb.length; i ++){
 	 		//Si le score est supérieur au precedent ...
 	 		if (tb[i] > max)
 	 			//...alors le max= ce score
 	 			max = tb[i];
		}
 	 	return max;
	}

	/**
	 * Repondre si un/des score(s) sont inférieur a 10
	 * @param tb intègre les scores du tableau
	 * @return vrai ou faux si un score inf a 10
	 */
	public static boolean inf (int [] tb){
 	 	//Inf = faux
 	 	boolean inf = false;
 	 	//Pour m < au nombre de score du tb
 	 	for(int i = 0; i< tb.length; i++){
 	 		//Si le score est inférieur a 10 ...
 	 		if (tb[i] < 10)
 	 			//... alors Inf = vrai
 	 			inf = true;
 	 	}
 	 	return inf;
	}


	public static void main(String[] args) {

    	// Déclaration TB
		int [] scores = new int [7];
		//Affectation valeur du tb
		scores[0] = 22;
		scores[1] = 1;
		scores[2] = 44;
		scores[3] = 70;
		scores[4] = 12;
		scores[5] = 15;
		scores[6] = 22;

		System.out.println("La moyenne des scores est de "+(moyenne(scores))+".");
		System.out.println("Et le score maximum est de "+max(scores)+".");
		System.out.println("      ");
		System.out.println(" C'est "+inf(scores));
    }
}
