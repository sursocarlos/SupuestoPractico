/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Laboral;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

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
         
        
        Nomina nomina1 = new Nomina();
        
        BufferedReader br = new BufferedReader(new FileReader("empleados.txt"));
        String linea;
        
        while ((linea = br.readLine()) != null){
            String[] partes = linea.split(",");
            
            int categoria = Integer.parseInt(partes[0]);
            int anyos = Integer.parseInt(partes[1]);
            String nombre = partes[2];
            String dni = partes[3];
            char sexo = partes[4].charAt(0);
            
            
            /*
            int categoria, int anyos, String nombre, String dni, char sexo
            */
            Empleado Empleado3;
            Empleado3 = new Empleado (categoria, anyos, nombre, dni, sexo);
            
            
            /*
            System.out.println("Este es la nomina del empleado3: " + nomina1.sueldo(Empleado3));
            */
            System.out.println("Esto es lo ultimo que hemos hecho: " + Empleado3.toString());
            
        }
        
        
        escribe(Empleado1, nomina1.sueldo(Empleado1));
        escribe(Empleado2, nomina1.sueldo(Empleado2));
        
        Empleado2.incrAnyo();
        Empleado1.setCategoria(9);
        
        escribe(Empleado1, nomina1.sueldo(Empleado1));
        escribe(Empleado2, nomina1.sueldo(Empleado2));
        
        
        
        br.close(); 
        
        } catch (IOException e) {
            e.printStackTrace();
            
        }catch(DatosNoCorrectosException emple){
            System.out.println("Los datos del empleado no son correctos");
        }
        
        
        
        
    }
    
}
