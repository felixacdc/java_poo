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
        peaje.cobrarPeajeAuto(auto);
        System.out.println();
        //cobrar peaje bus
        peaje.cobrarPeajeBus(bus);
        System.out.println();
        //cobrar peaje camion
        peaje.cobrarPeajeCamion(camion);
        System.out.println();
        //cobrar peaje moto
        peaje.cobrarPeajeMoto(moto);
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
    
    //método para cobrar peaje a la moto
    public void cobrarPeajeMoto(Moto moto){
        moto.mostrarTipoVehiculo();
    }
    //método para cobrar peaje al bus
    public void cobrarPeajeBus(Bus bus){
        bus.mostrarTipoVehiculo();
    }
    //método para cobrar peaje al auto
    public void cobrarPeajeAuto(Auto auto){
        auto.mostrarTipoVehiculo();
    }
    //método para cobrar peaje al camión
    public void cobrarPeajeCamion(Camion camion){
        camion.mostrarTipoVehiculo();
    }   
}