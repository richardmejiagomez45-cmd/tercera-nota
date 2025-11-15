package ejerciciosunidad1.ejercicioparqueadero.services;

import ejerciciosunidad1.ejercicioparqueadero.domain.Parqueadero;
import ejerciciosunidad1.ejercicioparqueadero.domain.Vehiculo;
import ejerciciosunidad1.ejercicioparqueadero.domain.Registro;

public class GestionParqueadero {

    public void registrarEntrada(Parqueadero parqueadero, Vehiculo v) {
        if (parqueadero.hayCupo()) {
            parqueadero.agregarRegistro(new Registro(v));
            System.out.println("Vehículo " + v.getPlaca() + " registrado.");
        } else {
            System.out.println("No hay cupo disponible.");
        }
    }
}