package udla.jriofrio.pooabstractas.modelo;

import java.util.ArrayList;
import java.util.List;

public  class Curriculum extends Hoja  {
    private String persona;
    private String carrera;
    private List<String> experiencia;//LISTA

   //CONSTRUCTOR
   public Curriculum(String persona, String carrera, String contenido){
       super(contenido);
       this.carrera = carrera;
       this.persona = persona;
       this.experiencia = new ArrayList<>();

   }
   //CLASE ABSTRACTA
    public Curriculum addExperiencia(String exp ){

       experiencia.add(exp);
       return this;
    }

    @Override
    public String imprimir() {
       StringBuilder sb = new StringBuilder("Nombre: ");

       sb.append(persona).append("\n")
               .append("Resume: ").append(this.contenido)
               .append("Profesion: ").append(this.carrera).append("\n")
               .append("Experiencia Laboral: \n");

       for (String exp: this.experiencia)
           sb.append("-").append(exp).append("\n");



        return sb.toString();
    }
}
