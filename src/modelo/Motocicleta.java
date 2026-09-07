package modelo;

public class Motocicleta extends Vehiculo {
    private final int cilindraje;

    public Motocicleta(String marca, String modelo, int anio,
                       double precio, int cilindraje) {
        super(marca, modelo, anio, precio);
        this.cilindraje = cilindraje;
    }

    @Override
    protected String getCaracteristica() {
        return "Cilindraje: " + cilindraje + " cc";
    }
}