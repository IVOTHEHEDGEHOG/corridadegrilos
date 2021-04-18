package main;
import java.util.Scanner;


public class ThreadGrilo {
    
	
	 public static int Ngrilos;
	 
	 

	 public static int MAX;
   
   public static int[] Grilo = new int [MAX]; 
   public static int[] Pulos = new int [MAX]; 
   public static int[] Colocacao = new int[MAX];   
   public static int tamPista;
   public static boolean Fim = false;
   public static int[] Time= new int[MAX];
   
   public void EntradaGrilo() {
	   
		 Scanner in = new Scanner(System.in);
		    
		 System.out.println("Informe o número de grilos: ");
		 Ngrilos = in.nextInt();
		 MAX = Ngrilos;
   }
   
   public void EntradaTamPista() {
	   
		 Scanner in = new Scanner(System.in);
		    
		 System.out.println("Informe o tamanho da pista: ");
		 tamPista = in.nextInt();
		
 }
  
public void Executar( ){
	

   CorridaDeGrilos [] threads = new CorridaDeGrilos[Ngrilos];
        
    for (int i = 0; i < Ngrilos; i++){
	threads[i] = new CorridaDeGrilos(Ngrilos,Grilo = new int [Ngrilos], Pulos= new int [Ngrilos],Colocacao= new int [Ngrilos], tamPista, Fim, Time= new int [Ngrilos]);
	threads[i].start();                             
    }
		
    for (int i = 0; i < Ngrilos; i++){
        
	try {
		threads[i].join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
            }
	}
    }
}

