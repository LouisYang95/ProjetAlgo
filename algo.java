package ProjetAlgo;

public class algo 
{
    class  ApplicationTriBulle  
    {
  
      static void  TriBulle  (int table[])    
      {
        int affectation = 0;
        int comparaison = 0;
        int echange = 0;

        int  l  =  table.length - 1 ;
       for (  int  i  =  l ;  i >= 1 ;  i -- ){
       affectation += 1;
       comparaison += 1;
        for (  int  j  =  2 ;  j <= i ;  j ++ ) 
         if ( table[j - 1]  >  table[j] )
         {
           int  temp  =  table[j - 1] ;
           table[j - 1]  =  table[j] ;
           table[j]  =  temp ;

           affectation += 2;
           comparaison += 3;
           echange += 1;
         }
         }
         System.out.println("Affectations : " + affectation);
         System.out.println("Comparaisons : " + comparaison);
         System.out.println("Echanges : " + echange);
      }
      static void AfficheTableau (int[] table){
      int  l  =  table.length - 1;
      for (  int  i  =  0 ;  i <= l ;  i ++ ) 
      System.out.print ( table[i] + " , ");
      System.out.println ();
      }

public static void  main ( String [ ] args ) 
  {
      int [] table = {1,5,8,2,4,9,6,3,7,10};

      System.out.println ("Tableau non trié :");

      AfficheTableau(table);

      TriBulle(table);

      System.out.println ("Tableau une fois trié :");
     
      AfficheTableau(table);
  } 
}
}