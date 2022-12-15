package clases;

import com.elrincon.estudiante;
import com.elrincon.persona;

/**
 * Esta clase está peensada para programar las fucnionalidades del rpofesor
 *
 * @author IES El Rincón
 */
public class teacherClass extends persona {
    public teacherClass() {}				// Constructor

    // Hace la pregunta al estudiante sobre el color
    public String preguntaColor(){

        String colorRec = getColorName();
        int valor;
        // este es m,i segundo comentario

        
        return colorRec;

    }

    private static String getColorName() {
        estudiante alumno = new estudiante();
        String colorRec = alumno.preguntacolor();
        return colorRec;
    }
}
