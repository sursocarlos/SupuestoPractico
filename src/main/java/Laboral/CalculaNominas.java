/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Laboral;

/**
 *
 * @author usuario
 */
public class CalculaNominas {
    
    
    private static void escribe (Empleado emple, int sueldo){
        System.out.println("El empleado " + emple.nombre + " con dni " + emple.dni + " y categoria " + emple.getCategoria() + " y sueldo " + sueldo);
    }
    
    

    public static void main(String[] args) {
        
        try{
         
        Empleado Empleado1;
        Empleado Empleado2;
        
        Empleado1 = new Empleado (4, 7, "James Cosling", "32000032G", 'M');
        Empleado2 = new Empleado ("Ada Lovelace", "32000031R", 'F');
         
        
        Nomina nomina1;
        
        nomina1 = new Nomina();
        
        
        escribe(Empleado1, nomina1.sueldo(Empleado1));
        escribe(Empleado2, nomina1.sueldo(Empleado2));
        
        Empleado2.incrAnyo();
        Empleado1.setCategoria(9);
        
        escribe(Empleado1, nomina1.sueldo(Empleado1));
        escribe(Empleado2, nomina1.sueldo(Empleado2));
        
        
        }catch(DatosNoCorrectosException emple){
            System.out.println("Los datos del empleado no son correctos");
        }
        
    }
    
}
