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
    int comparaison = 0;        //Lorsqu'il y a comparaison entre 2 valeurs
    int echange = 0;            //Lorsqu'il y a 3 affectations
    int affectation =0;         //Lorsqu'on attribut une valeur
    int l  =  tab.length-1 ;

  for (  int  i  =  1 ;  i  <= l ;  i++)
  {
        comparaison +=1;  
        affectation +=1;

    int  m  =  i ;                                      
    for (  int  j  =  i + 1 ;  j  <= l ;  j++)  
     if ( tab[j]  <  tab[m] )                   
        m  =  j ;

        comparaison +=1;
        affectation +=1;

    int  temp  =  tab[ m ];
      tab[ m ]  =  tab[ i ];
      tab[ i ] =  temp;
        affectation +=3;
        echange +=1;
  } 
  int operation = comparaison + affectation;
  System.out.println ("Il y a eu : " + affectation + " affections");
  System.out.println ("Il y a eu : " + comparaison + " comparaisons");
  System.out.println ("Il y a eu : " + echange + " echanges");
  System.out.println ("Il y a eu : " + operation + " operations");
 }
 
 
//--------------- RUN DU CODE ----------------//
 public static void  main ( String [] args ) 
 {     int [] tab = {1,1231,65,54,3,4124,421,5435,7657,223};      //VALEUR A METTRE DANS LE TABLEAU
   System.out.println ("Tableau sans le tri:");
   AfficheTableau(tab);
   TriSelect (tab);
   System.out.println ("Tableau trié :");
   AfficheTableau  (tab);
 }  
}