public class buelleOpti {

    class  Main  
{
    public static void main(String[] args) {
        int[] tableau = { 53, 17, 33, 5, 1, 90, 85, 300, 99, 65, 74, 236, 879 }; 
        boolean ordre = false; 
        int temp; 

        int affectation = 0;
        int comparaison = 0;
        int echange = 0;

        while (!ordre) 
        {
            ordre = true; 

             
            comparaison += 1; 

            for (int j = 0; j < tableau.length - 1; j++) 
            {
                affectation += 1; 
                comparaison += 1; 

                if (tableau[j] > tableau[j + 1]) 
                {
                    ordre = false; 

                    temp = tableau[j]; 
                    tableau[j] = tableau[j + 1]; 
                    tableau[j + 1] = temp; 

                    affectation += 3; 
                    comparaison += 1; 
                    echange +=  1;
                }
            }
        }

        for (int x : tableau)
        {
            System.out.println(x); 
        }

        System.out.println("Affectations : " + affectation);
        System.out.println("Comparaisons : " + comparaison);
        System.out.println("Echanges : " + echange);
    }
 }



}