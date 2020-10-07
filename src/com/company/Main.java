package com.company;

public class Main {


	/**
	 * Calcul de la moyenne en fonction de []tb
	 * @param tb intègre les scores du tableau
	 * @return le calcul moyenne/tb.length
	 */
	public static int moyenne(int[] tb) {

		int moyenne = 0;
		// Pour m < au nombre de score du tb
		for (int m = 0; m < tb.length; m++) {
			// s = score par case du tb
			int s = tb[m];
			//moyenne = somme du tb
			moyenne = moyenne + s;
			System.out.println(s);
		}
		//Moyenne retourner avec la valeur diviser par le nombre de score
		return moyenne / tb.length;
	}

	/**
	 * Prendre la plus grande valeur du tableau
	 * @param tb intègre les scores du tableau
	 * @return le score le plus élevé
	 */
	public static int max(int[] tb) {
		int max = 0;
		//Pour i < au nombre de score du tb
		for (int i = 0; i < tb.length; i++) {
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
	public static boolean inf(int[] tb) {
		//Inf = faux
		boolean inf = false;
		//Pour m < au nombre de score du tb
		for (int i = 0; i < tb.length; i++) {
			//Si le score est inférieur a 10 ...
			if (tb[i] < 10)
				//... alors Inf = vrai
				inf = true;
		}
		return inf;
	}

	/**
	 * Search the values inside the sorted array tab.
	 * @param tab a sorted array
	 * @param num the number to find
	 * @return index of the array if found, else -1
	 */
	static int binaire(int[] tab, int num,int min ,int max) {


			int middle = (min + max) / 2;
			if (max>=min){
			// J'ai trouver ma valeur a  l'indice middle
			if (num == tab[middle]) {
				return middle;
			}

			// Est-ce que num est plus petit que la valeur a l'indice middle
			else if (num < tab[middle]) {
				return binaire(tab , num,min , middle-1);
			} else {
				return binaire(tab, num, middle + 1, max);
			}
		}
		return -1;
	}




	static void countDownLoop(int start) {
		for (int i = start; i > 0; i--) {
			System.out.println(i + "...");
		}
		System.out.println("FINISHED");
	}
	static void countDownRecursive(int start) {
		if (start > 0) {
			System.out.println(start + "...");
			countDownRecursive(start - 1);
		} else {
			System.out.println("FINISHED");
		}
	}





	public static void main(String[] args) {

    	// Déclaration TB
		int [] scores = new int [7];
		//Affectation valeur du tb
		scores[0] = 1;
		scores[1] = 2;
		scores[2] = 3;
		scores[3] = 4;
		scores[4] = 5;
		scores[5] = 6;
		scores[6] = 7;

		System.out.println("La moyenne des scores est de "+(moyenne(scores))+".");
		System.out.println("Et le score maximum est de "+max(scores)+".");
		System.out.println("      ");
		System.out.println(" C'est "+inf(scores));

		System.out.println("En binaire " + binaire(scores,5,0, scores.length-1));
		System.out.println("  " );
		countDownLoop(3); // 3, 2, 1, FINISHED
		countDownRecursive(3); // 3, 2, 1, FINISHED
		System.out.println("    ");

    }
}
