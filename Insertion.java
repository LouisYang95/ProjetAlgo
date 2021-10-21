public class Insertion {
     
    public static void tri_insertion(int T[]) 
    {  
         int n = T.length;  
       
         for (int i = 1; i < n; i++)
         { 
              int m = T[i];  
              int j = i-1;  
           
              while(j >= 0 && T[j] > m)  
              {
                   T[j+1] = T[j];  
                   j--;  
              }  
              T[j+1] = m; 
       }  
    }
    public static void main(String str[])
    {   
         int[] tab = {1,12,4,5,93,21,8,11};  
       
         System.out.println("Avant le tri par insertion"); 

         for(int i=0; i < tab.length; i++)
         {  
              System.out.print(tab[i] + " ");  
         } 
         System.out.println();
           
         //trie un tableau en utilisant le tri par insertion
         tri_insertion(tab); 
          
         System.out.println("Apres le tri par insertion");
         
         for(int i=0; i < tab.length; i++)
         {  
              System.out.print(tab[i] + " ");  
         } 
         System.out.println();
   } 
}