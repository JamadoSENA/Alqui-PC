/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.util.Scanner;

/**
 *
 * @author Aprendiz
 */
public class Usuario {
    
    //VARIABLE SCANNER PARA LOS DATOS INGRESADOS POR EL USUARIO
    Scanner l = new Scanner(System.in);
    
    //ATRIBUTOS PROPIOS DE LA CLASE
    String nombre, numero, correo;
    int id_usuario, asignadorId=1;

    //Metodo Constructor
    
    public Usuario() {
    }

    //METODOS DE ENCAPSULAMIENTO (INICIO)
    
    public int getAsignadorId() {
        return asignadorId;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getCorreo() {
        return correo;
    }

    public int getId_usuario() {
        return id_usuario;
    }
    
    public String getNumero() {
        return numero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public void setAsignadorId(int asignadorId) {
        this.asignadorId = asignadorId;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    //METODOS DE ENCAPSULAMIENTO (FIN)
    
    
    //METODO PARA EL REGISTRO DE USUARIOS
    public void registrarUsuario (){
   
        System.out.println("---REGISTRO USUARIO---");
        System.out.println("Ingrese el ID de la persona: ");
        this.id_usuario = l.nextInt();
        System.out.println("Ingrese el nombre de la persona: ");
        this.nombre = l.next();
        System.out.println("Ingrese el numero telefonico: ");
        this.numero = l.next();
        System.out.println("Ingrese el correo electronico: ");
        this.correo = l.next();

        
    }
    
    //METODO PARA MOSTRAR LA INFORMACION DEL REGISTRO AL USUARIO
    public void imprimirInformacion (){
        
        System.out.println("---IMPRIMIR INFORMACION---");
        System.out.println("1. ID Cliente: " + this.getId_usuario());
        System.out.println("2. Nombre: " + this.getNombre());
        System.out.println("3. Telefono: " + this.getNumero());
        System.out.println("4. Correo: " + this.getCorreo());

    }
    
    

    
    
}
