package ejerciciosunidad2.ejerciciohorarios.services;

import ejerciciosunidad2.ejerciciohorarios.domain.Materia;
import ejerciciosunidad2.ejerciciohorarios.domain.Estudiante;

public class GestionHorarios {

    
    public void inscribirEstudiante(Estudiante est, Materia mat, String horario) {
        est.inscribir(mat.getNombre(), horario);
        System.out.println("Inscripción realizada correctamente.");
    }
}