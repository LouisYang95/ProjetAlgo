package ProjetAlgo;

public class algo {
    class  ApplicationTriBulle  
{
  static  int [] table  =  new  int [10]  ;  // le tableau a trier en attribut
  
   static void  TriBulle  ( )    {
    int  l  =  table.length - 1 ;
   for (  int  i  =  l ;  i >= 1 ;  i -- )
    for (  int  j  =  2 ;  j <= i ;  j ++ ) 
     if ( table[j - 1]  >  table[j] )
     {
       int  temp  =  table[j - 1] ;
       table[j - 1]  =  table[j] ;
       table[j]  =  temp ;
     }
  }
  
  static void  Impression  ( )   {
    // Affichage du tableau 
    int  l  =  table.length - 1 ;
   for (  int  i  =  1 ;  i <= l ;  i ++ ) 
     System.out.print ( table[i] + " , ");
    System.out.println ();
  }
  
  static void  Initialisation   ( )    {
    // remplie le tableau avec des chiffres aléatoire  
    int  l  =  table.length - 1 ;
   for (  int  i  =  1 ;  i <= l ;  i ++ ) 
     table[i]  =  ( int )( Math.random () * 15 );
  }
  
  public static void  main ( String [ ] args )    {
    Initialisation  ( );
    System.out.println ("Tableau non trié :");
    Impression  ( );
    TriBulle  ( );
    System.out.println ("Tableau une fois trié :");
    Impression  ( );
  } 
 }
}
