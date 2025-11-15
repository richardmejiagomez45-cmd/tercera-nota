package ejerciciosunidad1.ejerciciohorarios.services;

import ejerciciosunidad1.ejerciciohorarios.domain.Materia;
import ejerciciosunidad1.ejerciciohorarios.domain.Estudiante;

public class GestionHorarios {

    
    public void inscribirEstudiante(Estudiante est, Materia mat, String horario) {
        est.inscribir(mat.getNombre(), horario);
        System.out.println("Inscripción realizada correctamente.");
    }
}