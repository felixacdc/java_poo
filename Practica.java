import java.lang.Math;

public class Show
{
    public static void main(String[] args)
    {
        // Instancia
        Celular celular = new Celular();
        celular.setMarca("Nokia");
        celular.setModelo("1100");
        celular.setColor("Rojo");

        celular.llamar("Pablo");
        celular.cortarLlamada();
        System.out.println();
        celular.informarCaracteristicas();

        // Herencia
        SmartPhone smartPhone = new SmartPhone();
        // Asignacion de valores
        smartPhone.setMarca("Samsug");
        smartPhone.setModelo("S3 Mini");
        smartPhone.setColor("Negro");
        smartPhone.setPixelesCamara(5);
        smartPhone.setTamanioMemoriaInterna(4);
        smartPhone.setTamanioMemoriaExterna(4);

        smartPhone.llamar("Felix");
        smartPhone.cortarLlamada();
        System.out.println();
        smartPhone.informarCaracteristicas();       
    }
}

public class Celular {
    //Abributos de la clase
    private String marca;
    private String modelo;
    private String color;
  
    // constructor con parametros
    public Celular(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }
    
    public Celular() {
        
    }
  
    public void llamar(String nombre) {
        System.out.println("Llamado a " + nombre);
    }
    
    public void cortarLlamada(){
        System.out.println("Llamada finalizada");
    }

    public void informarCaracteristicas() {
        System.out.println(String.format("Celular Marca: %s", marca));
        System.out.println(String.format("Celular Modelo: %s", modelo));
        System.out.println(String.format("Celular Color: %s", color));
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

public class SmartPhone extends Celular {
    private float pixelesCamara;
    private float tamanioMemoriaInterna;
    private float tamanioMemoriaExterna;

    public SmartPhone() {

    }

    //constructor con los atributos de la clase incluso los heredados
    public SmartPhone(String marca, String modelo, String color, float pixelesCamara, float tamanioMemoriaRam, float tamaoDisco) {
        super(marca, modelo, color);
        this.pixelesCamara = pixelesCamara;
        this.tamanioMemoriaInterna = tamanioMemoriaRam;
        this.tamanioMemoriaExterna = tamaoDisco;
    }

    // método sobrescrito (override), utilizo código de la clase Celular y añado código que necesito 
    @Override
    public void informarCaracteristicas() {
        // TODO Auto-generated method stub
        super.informarCaracteristicas();
        System.out.println(String.format("SmartPhone calidad cámara: %s pixeles", pixelesCamara));
        System.out.println(String.format("SmartPhone tamaño memoria interna: %s GB", tamanioMemoriaInterna));
        System.out.println(String.format("SmartPhone tamaño memoria externa: %s GB", tamanioMemoriaExterna));
    }

    public float getPixelesCamara() {
        return pixelesCamara;
    }

    public void setPixelesCamara(float pixelesCamara) {
        this.pixelesCamara = pixelesCamara;
    }

    public float getTamanioMemoriaInterna() {
        return tamanioMemoriaInterna;
    }

    public void setTamanioMemoriaInterna(float tamanioMemoriaInterna) {
        this.tamanioMemoriaInterna = tamanioMemoriaInterna;
    }

    public float getTamanioMemoriaExterna() {
        return tamanioMemoriaExterna;
    }

    public void setTamanioMemoriaExterna(float tamanioMemoriaExterna) {
        this.tamanioMemoriaExterna = tamanioMemoriaExterna;
    }
}