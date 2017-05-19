import java.io.*;

public class Excepciones{

   	public static void main(String args[]){
      	simple();
      	capturarTipos();
  	}

  	public static void simple() {
  		System.out.println("====== Simple =======");
		try{         
        	int a[] = new int[2];
        	System.out.println("El elemento tres es :" + a[3]);
      	}catch(Exception e){
        	System.out.println("La excepcion es :" + e);
      	}
  	}

  public static void capturarTipos() {
		int a[] = new int[2];	
		System.out.println("====== Capturar Tipos =======");
		try{
			System.out.println("El elemento tres es :" + a[3]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("La excepcion es  :" + e);
		}
		finally{
			a[0] = 6;
			System.out.println("El primer elemento es : " + a[0]);
			System.out.println("El bloque de finally fue ejecutado");
		}
  	}
}