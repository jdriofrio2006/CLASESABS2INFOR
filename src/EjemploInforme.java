import udla.jriofrio.pooabstractas.modelo.Hoja;
import udla.jriofrio.pooabstractas.modelo.Informe;
import udla.jriofrio.pooabstractas.modelo.Curriculum;


public class EjemploInforme {
    public static void main(String[]args){

        Curriculum cv = new Curriculum("JJ","Ing en Musica","Resumen CV....");

        //Adicion de lemtmos a la lista

        cv.addExperiencia("Licor Patito");
        cv.addExperiencia("Oracle OBA");
        cv.addExperiencia("R full Stack");

        Informe inf = new Informe("Juan Riofrio","Victor Gomez", ".......");

        //imprimir(cv);
    }

    public static void imprimir(Hoja imprimible){
        System.out.println(imprimible.imprimir()); // Llamamiento de la clase abstracta
    }
}
