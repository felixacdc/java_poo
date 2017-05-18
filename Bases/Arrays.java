import java.lang.Math;

public class Arrays
{
    public static void main(String[] args)
    {
        int[] edad = {45, 23, 11, 9};  //Array de 4 elementos
        double[] estatura = {1.73, 1.67, 1.56}; //Array de 3 elementos
        String[] nombre = {"María", "Gerson"};   //Array de 2 elementos
        char[] sexo = {'m', 'f'};   //Array de 2 elementos
        boolean[] booleano = {true,false};    //Array de 2 elementos
        
        System.out.println("Array entero:");
        for(int i=0; i < edad.length; i++)
            System.out.println(edad[i]);
      
        System.out.println("Array double:");
        for(int i=0; i < estatura.length; i++)
            System.out.println(estatura[i]);
      
        System.out.println("Array String:");
        for(int i=0; i < nombre.length; i++)
            System.out.println(nombre[i]);
      
        System.out.println("Array char:");
        for(int i=0; i < sexo.length; i++)
            System.out.println(sexo[i]);
      
        System.out.println("Array booleano:");
        for(int i=0; i < booleano.length; i++)
            System.out.println(booleano[i]);

        //Array de objetos
        Rectangulo[] rectangulos;
        rectangulos=new Rectangulo[3];

        rectangulos[0]=new Rectangulo(10, 20);
        rectangulos[1]=new Rectangulo(30, 40);
        rectangulos[2]=new Rectangulo(50, 80);

        System.out.println("Array de objetos:");
        for(int i=0; i < rectangulos.length; i++)
            System.out.println(rectangulos[i].calcularArea());
        
    }
}

public class Rectangulo {
    
    private int ladosAB;
    private int ladosCD;

    public Rectangulo() {

    }

    public Rectangulo(int ladosAB, int ladosCD) {
        this.ladosAB = ladosAB;
        this.ladosCD = ladosCD;
    }

    public int calcularArea() {
        return ladosAB * ladosCD;
    }
}
