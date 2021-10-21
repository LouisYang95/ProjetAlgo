import java.util.Arrays;

class   ProjetAlgo1   
{
 

  //--------------- AFFICHER LE TABLEAU GRACE A ARRAY -----------------------//
 static void AfficheTableau  (int [] tab){
        System.out.println(Arrays.toString(tab));
}
 

 //--------------- CODE POUR LA TRI SELECTION -------------------// 

 static void  TriSelect  (int [] tab)
 {
    int comparaison = 0;
    int echange = 0;
    int affectation =0;
    int l  =  tab.length - 1 ;
  for (  int  i  =  1 ;  i  <=  l - 1 ;  i++)
  {
      comparaison +=1;                                                     
    int  m  =  i ;                                      
    for (  int  j  =  i + 1 ;  j  <=  l ;  j++)  
     if ( tab[j]  <  tab[m] )                   
        m  =  j ;                                       
      comparaison +=1;
      affectation +=1;
    int  temp  =  tab[ m ];
    tab[ m ]  =  tab[ i ];
    tab[ i ] =  temp;
      affectation +=2;
      echange +=1;
  } 
  System.out.println (affectation);
  System.out.println (comparaison);
  System.out.println (echange);
 }
 
 
//--------------- RUN DU CODE ----------------//
 public static void  main ( String [] args ) 
 {     int [] tab = {1,2,45,66,777,2326,9};      //VALEUR A METTRE DANS LE TABLEAU
   System.out.println ("Tableau sans le tri:");
   AfficheTableau(tab);
   TriSelect (tab);
   System.out.println ("Tableau trié :");
   AfficheTableau  (tab);
 }  
}