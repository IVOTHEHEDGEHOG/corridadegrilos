
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;


public class Main {
    
public static int[] tPulo = new int[2];
    
    public static void main(String[] args) {
     
      ThreadGrilo t = new ThreadGrilo();
     
      t.EntradaGrilo();
     
      t.Executar();
      
        for (int j=0; j<t.Ngrilos;j++){
                
            System.out.println("Grilo_"+(j+1)+" do time: "+t.Time[j]+" foi o "+t.Colocacao[j]+"ยบ colocado com "+t.Pulos[j]+" pulos");
          
            if(t.Time[j]==1){
                
                 tPulo[0] += t.Pulos[j];  
                  System.out.println(" total de "+tPulo[0]+" pulos do time: "+t.Time[j]); 
            }
            if(t.Time[j]==2){
                
                 tPulo[1] += t.Pulos[j];  
                   System.out.println(" total de "+tPulo[1]+" pulos do time: "+t.Time[j]); 
            }
            
            if(t.Colocacao[j] ==1 ){
        
                System.out.println("O time: "+t.Time[j]+" venceu");
                
            }    
        }         
    }   
}