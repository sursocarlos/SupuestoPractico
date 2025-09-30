    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Laboral;


/**
 *
 * @author usuario
 */
public class Empleado extends Persona{
    private int categoria;
    public int anyos;
    
    public Empleado(String nombre, String dni, char sexo) {
        super(nombre, dni, sexo);
    }
    
    public Empleado(int categoria, int anyos, String nombre, String dni, char sexo) throws DatosNoCorrectosException {
        super(nombre, dni, sexo);
        if((categoria>0 && categoria<11) && (anyos > 0)){
           this.categoria = categoria;
           this.anyos = anyos;
        }else{
            throw new DatosNoCorrectosException("La categoria debe ser un numero entre 1 y 10 y los años deben ser mayor que 0");
        }
    }
    
    public void setCategoria (int nuevaCategoria)throws DatosNoCorrectosException{
        if(categoria>0 && categoria<11){
            categoria = nuevaCategoria;
        }else{
            throw new DatosNoCorrectosException("La categoria debe ser un numero entre 1 y 10");
        }
    }
    
    public int getCategoria (){
        return categoria; 
    }
    
    public void incrAnyo(){
        anyos = anyos + 1;
    }
    
    @Override
    public void imprime(){
        System.out.println("El nombre es: " + nombre + ". El DNI es: "  + dni + ". La categoria es: " + categoria + ". Los anos son: " + anyos + " ");
    }
    
}
