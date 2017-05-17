import java.lang.Math;

public class Show
{
    public static void main(String[] args)
    {
        //declaro los objetos que heredan de tipo vehículo
        Auto auto = new Auto();
        Moto moto= new Moto();
        Bus bus = new Bus();
        Camion camion = new Camion();
        
        //declaro el objeto peaje para identificar y cobrar el peaje de acuerdo al tipo de vehículo
        Peaje peaje= new Peaje();
        //cobrar peaje auto
        peaje.cobrarPeaje(auto);
        System.out.println();
        //cobrar peaje bus
        peaje.cobrarPeaje(bus);
        System.out.println();
        //cobrar peaje camion
        peaje.cobrarPeaje(camion);
        System.out.println();
        //cobrar peaje moto
        peaje.cobrarPeaje(moto);
    }
}

//clase padre Vehiculo (Clase base)
public class Vehiculo {
    public void mostrarTipoVehiculo(){
        System.out.println("Soy un Vehiculo");
        System.out.println("Cobrar peaje Vheículo");
    }
}

//clase hija Auto (SubClase)
public class Auto extends Vehiculo {
    @Override
    public void mostrarTipoVehiculo() {
        System.out.println("Soy un auto");
        System.out.println("Cobrar peaje auto");
    }
}

//clase hija moto (SubClase)
public class Moto extends Vehiculo {
    @Override
    public void mostrarTipoVehiculo() {
        System.out.println("Soy una moto");
        System.out.println("Cobrar peaje moto");
    }
}

//clase hija camion (SubClase)
public class Camion extends Vehiculo {
    @Override
    public void mostrarTipoVehiculo() {
        System.out.println("Soy un camion");
        System.out.println("Cobrar peaje camion");
    }
}

//clase hija bus (SubClase)
public class Bus extends Vehiculo {
    @Override
    public void mostrarTipoVehiculo() {
        System.out.println("Soy un bus");
        System.out.println("Cobrar peaje bus");
    }
}

public class Peaje {
    
    //método para cobrar peaje para cualquier vehículo
    public void cobrarPeaje(Vehiculo vehiculo){
        vehiculo.mostrarTipoVehiculo();
    }   

}