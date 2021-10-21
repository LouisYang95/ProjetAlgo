public class Insertion {
     
    public static void tri_insertion(int T[]) 
    {  
         int comparaison = 0;
         int affectation = 0;
         int echange = 0;
         int n = T.length;  
       
         for (int i = 1; i < n; i++)
         { 
               comparaison ++;
              int m = T[i];  
              int j = i-1;  
              affectation +=2;
           
              while(j >= 0 && T[j] > m)  
              {
               comparaison ++;
                   T[j+1] = T[j];
                   affectation ++;  
                   echange ++;
                   j--;  
              }  
              T[j+1] = m; 
              affectation ++;
       }  

       //afficher le tableau trié
       for(int i=0; i < T.length; i++)
         {  
              System.out.print(T[i] + " ");  
         } 
         System.out.println();
         System.out.println("Il y a eu " + comparaison + " comparaisons, " + affectation +" affectations et "+ echange + " echanges.");

    }

    public static void main(String str[])
    {   
          int[] tab = {10,9,8,7,6,5,4,3,2,1};
          // int[] tab = {1,2,3,4,5,6,7,8,9,10};
          // int[] tab = {1,12,4,5,93,21,8,11};  
       
         tri_insertion(tab); 
         System.out.println("Apres le tri par insertion");
     
   } 
}