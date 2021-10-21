package ProjetAlgo;

public class algo {
    class  ApplicationTriBulle  
{
  static  int [] table  =  new  int [10]  ;  // le tableau a trier en attribut
  
  static void TriBulle() {

    int  f  =  table.length - 1 ;
   for (  int  i  =  f ;  i >= 1 ;  i -- )
    for (  int  j  =  2 ;  j <= i ;  j ++ ) 
     if ( table[j - 1]  >  table[j] )
     {
       int  temp  =  table[j - 1] ;
       table[j - 1]  =  table[j] ;
       table[j]  =  temp ;
     }

  }
 
public static void  main ( String [ ] args )    {
  int [] table = {12,1,4,456,76,34};

  System.out.println ("Tableau non trié :");

  int  l  =  table.length - 1 ;
  for (  int  i  =  1 ;  i <= l ;  i ++ ) 
  System.out.print ( table[i] + " , ");
  System.out.println ();

  TriBulle();

  System.out.println ("Tableau une fois trié :");
     
  int  m  =  table.length - 1 ;
  for (  int  i  =  1 ;  i <= m ;  i ++ ) 
  System.out.print ( table[i] + " , ");
  System.out.println ();
  } 
 }
}
