class   ProjetAlgo   
{
 static  int [] table  =  new  int [10]  ;  // CREATION TABLEAU ET NB DE TAILLE
 

  //--------------- AFFICHER LES NB ET LES TABLEAU -----------------------//
  static void AfficheTableau ( )  
 {
   int  l  =  table.length - 1 ;
  for (  int  i  =  1 ;  i <= l ;  i ++ ) 
    System.out.print ( table[i] + " , ");
    System.out.println ();
 }

 //--------------- CODE POUR LES VALEURS DANS LE TABLEAU ----------------//
 
 static void  ValeurTableau ( )  
 {
    int  l  =  table.length - 1 ;
    for (  int  i  =  1 ;  i <= l ;  i ++ ) 
      table[i]  =  ( int )( Math.random () * 20 );
 }

 //--------------- CODE POUR LA TRI SELECTION -------------------// 

 static void  TriSelect  ( ) 
 {
   int  l =  table.length - 1 ;
  for (  int  i  =  1 ;  i  <=  l - 1 ;  i ++ )
  {                                                     // recommence une sous-suite 
    int  m  =  i ;                                      // élément frontière ai = table[ i ]
    for (  int  j  =  i + 1 ;  j  <=  l ;  j ++ )       // (ai+1, a2, ... , an) 
     if ( table[ j ]  <  table[ m ] )                   // aj = nouveau minimum partiel
      m  =  j  ;                                        // indice mémorisé
  
          int  temp  =  table[ m ] ;
      table[ m ]  =  table[ i ] ;
      table[ i ] =  temp ;              
  } 

 }
 
 
//--------------- RUN DU CODE ----------------//
 public static void  main ( String [ ] args ) 
 {
   ValeurTableau  ( );
   System.out.println ("Tableau initial :");
   AfficheTableau  ( );
   TriSelect  ( );
   System.out.println ("Tableau une fois trié :");
   AfficheTableau  ( );
 }  
}