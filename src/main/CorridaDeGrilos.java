package main;

public class CorridaDeGrilos extends Thread  {
    

    public static int MAX;// numero de grilos
    public static int[] Grilo; 
    public static int[] Pulos; 
    public static int[] Colocacao;
    public static int cont=0;
    public static int tamPista;
    public static boolean Fim;
    public static int Time[];
    

public CorridaDeGrilos(int _MAX, int _Grilo[], int _Pulos[],int _Colocacao[],int tam_Pista, boolean _Fim, int[] _Time) {
		
            MAX= _MAX;
            Grilo = _Grilo;
            Pulos = _Pulos;
            Colocacao = _Colocacao;
            tamPista = tam_Pista;
            Fim = _Fim;
            Time = _Time;
          
 
}
public void run() {
	super.run();

	while(!Fim){	
           

            for(int indice=0;indice <MAX; indice++){// verifica se o indice não ultrapassa a quantidade de grilos
              
                int sorteio = (int) (Math.random()*5);// sorteando os times
                
                if(Time[indice] ==0)Time[indice] = sorteio+1;// colocando o grilo no time aleatório de 1 a 5
                
                
		if (Grilo [indice]<tamPista){ // verifica se a distancia percorrida do grilo é menor que o tamanho da pista

                    int pulinho = (int) (Math.random()*40);// sorteia um valor aleatorio para o pulo
				
                    Grilo [indice]+=pulinho;
                    Pulos[indice]+=1;

                    System.out.println("O Grilo_"+(indice+1)+" do time: "+Time[indice]+" pulou "+pulinho+"cm e já percorreu "+Grilo[indice]+"cm");
        
               }if (Grilo[indice]>=tamPista){ //verificando se o grilo chegou na reta final
            	   
            	   
                    
                  if(Colocacao[indice]==0){
                       
                    cont +=1;
                    Colocacao[indice] = cont ;
                   }
                  
                  

               }
               if (Grilo[indice] >= Grilo.length && Grilo[indice]>= tamPista)Fim=true;
            }
          
        }
   
    }
}

