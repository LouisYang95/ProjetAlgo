

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
    int operation = 0;          //Represente les comparaisons + affectations
    int l  =  tab.length-1 ;

  for (  int  i  =  0 ;  i  <= l ;  i++)
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
  //-----------------------------AFFICHER-----------------------------------//
  operation = comparaison + affectation;

  System.out.println ("Il y a eu : " + affectation + " affections");
  System.out.println ("Il y a eu : " + comparaison + " comparaisons");
  System.out.println ("Il y a eu : " + echange + " echanges");
  System.out.println ("Il y a eu : " + operation + " operations");
 }
 //---------------TRI tri_insertion------------------------//
 public static void tri_insertion(int T[]) 
 {  
      int comparaison1 = 0;
      int affectation1 = 0;
      int echange1 = 0;
      int operation = 0; 
      int n = T.length;  
    
      for (int i = 1; i < n; i++)
      { 
            comparaison1 ++;
           int m = T[i];  
           int j = i-1;  
           affectation1 +=2;
        
           while(j >= 0 && T[j] > m)  
           {
            comparaison1 ++;
                T[j+1] = T[j];
                affectation1 ++;  
                echange1 ++;
                j--;  
           }  
           T[j+1] = m; 
           affectation1 ++;
    }
    operation = comparaison1 + affectation1; 
    //---------------AFFICHER--------------------//
    System.out.println ("Il y a eu : " + affectation1 + " affections");
    System.out.println ("Il y a eu : " + comparaison1 + " comparaisons");
    System.out.println ("Il y a eu : " + echange1 + " echanges");
    System.out.println ("Il y a eu : " + operation + " operations");
  } 
  //------------------------------TRI BULLE----------------------------------//
  static void  TriBulle  (int table[])    
  {
    int affectation = 0;
    int comparaison = 0;
    int echange = 0;
    int operation = 0; 

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
    operation = comparaison + affectation;
//---------------AFFICHER--------------------//
    System.out.println ("Il y a eu : " + affectation + " affections");
    System.out.println ("Il y a eu : " + comparaison + " comparaisons");
    System.out.println ("Il y a eu : " + echange + " echanges");
    System.out.println ("Il y a eu : " + operation + " operations");
}
//==========================TRI BULLE OPTIMISE======================================//
static void TriBulleOpti  (int table []){
  boolean ordre = false; 
 int comparaison1=0;
 int echange1 = 0;
 int affectation1=0;
 int operation = 0; 


  while (!ordre) 
  {
      ordre = true; 
      comparaison1 += 1; 

      int l = table.length - 1 ;
      for (int j = 0; j <l ; j++) 
      {
          affectation1 += 1; 
          comparaison1 += 1; 

          if (table[j] > table[j + 1]) 
          {
              ordre = false; 

              int temp = table[j]; 
              table[j] = table[j + 1]; 
              table[j + 1] = temp; 

              affectation1 += 3; 
              comparaison1 += 1; 
              echange1 +=  1;
          }
        }
      }
      operation = comparaison1 + affectation1;
//---------------AFFICHER--------------------//
      System.out.println ("Il y a eu : " + affectation1 + " affections");
      System.out.println ("Il y a eu : " + comparaison1 + " comparaisons");
      System.out.println ("Il y a eu : " + echange1 + " echanges");
      System.out.println ("Il y a eu : " + operation + " operations");
}

 
//--------------- RUN DU CODE ----------------//
 public static void  main ( String [] args ) 
 {     //int [] tab = {1,1231,65,54,3,4124,421,5435,7657,223};      //VALEUR A METTRE DANS LE TABLEAU
       //int[] tab = {10,9,8,7,6,5,4,3,2,1};
       int[] tab = {6,10,9,8,7,5,4,3,2,1};
   System.out.println ("Tableau sans le tri:");
   AfficheTableau(tab);
   TriSelect (tab);
   //tri_insertion (tab);
   //TriBulle (tab);
   //TriBulleOpti (tab);
   System.out.println ("Tableau trié :");
   AfficheTableau  (tab);
   
 }  
}