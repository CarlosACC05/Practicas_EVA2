/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_23_polimorfismo_vehiculos;

/**
 *
 * @author carlo
 */
public class EVA2_23_POLIMORFISMO_VEHICULOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Automovil auto = new Automovil("X", 2020, "Tesla", 0);
        cambiarVelocidad(auto,20);
        Bicicleta bici = new Bicicleta("Montaña", "XXX", "Harley Davison", 0);
        cambiarVelocidad(bici,20);

    }

    public static void cambiarVelocidad(DatosVehiculo vehi, int vel) {
        vehi.acelerar(vel);
        vehi.tablero();

    }
}

interface DatosVehiculo {

    public abstract void acelerar(int cambio);

    void tablero();

}

class Vehiculo {

    private String marca;
    protected int velocidad;

    public Vehiculo() {
        this.marca = "-----";
        this.velocidad = 0;
    }

    public Vehiculo(String marca, int velocidad) {
        this.marca = marca;
        this.velocidad = velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidad() {
        return velocidad;
    }

}

class Automovil extends Vehiculo implements DatosVehiculo {

    private String modelo;
    private int año;

    public Automovil() {
        super();
        this.modelo = "-----";
        this.año = 0;
    }

    public Automovil(String modelo, int año, String marca, int velocidad) {
        super(marca, velocidad);
        this.modelo = modelo;
        this.año = año;

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public void acelerar(int cambio) {
        int cambioVel = velocidad + cambio;
        if ((cambioVel) >= 0)//aceptar solo velocidad positivas o cero
        {
            velocidad = cambioVel;//velocidad = velocidad+cambio;<-- acumulado
        }
    }

    @Override
    public void tablero() {
        System.out.println("Velocidad del automovil: " + velocidad);
    }

}

class Bicicleta extends Vehiculo implements DatosVehiculo {

    private String tipo;//montaña, pista, etc
    private String rodada;//tipo de llanta

    public Bicicleta() {
        super();
        this.tipo = "----";
        this.rodada = "----";

    }

    public Bicicleta(String tipo, String rodada, String marca, int velocidad) {
        super(marca, velocidad);
        this.tipo = tipo;
        this.rodada = rodada;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRodada() {
        return rodada;
    }

    public void setRodada(String rodada) {
        this.rodada = rodada;
    }

    @Override
    public void acelerar(int cambio) {
        int cambioVel = velocidad + cambio;
        if ((cambioVel) >= 0)//aceptar solo velocidad positivas o cero
        {
            velocidad = cambioVel;//velocidad = velocidad+cambio;<-- acumulador
        }
    }

    @Override
    public void tablero() {
        System.out.println("Velocidad de la bicicleta: " + velocidad);
    }
}
