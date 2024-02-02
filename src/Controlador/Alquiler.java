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
public class Alquiler {
    
    //VARIABLE SCANNER PARA LOS DATOS INGRESADOS POR EL USUARIO
    Scanner l = new Scanner (System.in);

    //ATRIBUTOS PROPIOS DE LA CLASE
    String  direccion;
    int idAlquiler, asignadorIdAlquiler=1, dias,precio, computadores, total, diasAdicionales;
    float descuento, total_incrementado, total_adicional, total_adicional_normal, total_adicional_descuento, total_adicional_incrementado;
    int ciudad;
    
    //METODO CONSTRUCTOR
    public Alquiler(){
    }

    //METODOS DE ENCAPSULAMIENTO (INICIO)
    public int getDiasAdicionales() {
        return diasAdicionales;
    }
    
    public float getTotal_incrementado() {
        return total_incrementado;
    }

    public float getTotal_adicional_normal() {
        return total_adicional_normal;
    }

    public float getTotal_adicional_descuento() {
        return total_adicional_descuento;
    }
    
    public float getTotal_adicional_incrementado() {
        return total_adicional_incrementado;
    }
    
    public float getTotal_adicional() {
        return total_adicional;
    }
    
    public int getTotal() {
        return total;
    }
    
    public int getCiudad(){
        return ciudad;
    }
    
    public String getDireccion() {
        return direccion;
    }

    public int getIdAlquiler() {
        return idAlquiler;
    }

    public int getAsignadorIdAlquiler() {
        return asignadorIdAlquiler;
    }

    public int getDias() {
        return dias;
    }

    public int getPrecio() {
        return precio;
    }

    public int getComputadores() {
        return computadores;
    }

    public float getDescuento() {
        return descuento;
    }

    public float getValorIncrementado() {
        return total_incrementado;
    }
    
    public void setCiudad(int ciudad) {
        this.ciudad = ciudad;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setIdAlquiler(int idAlquiler) {
        this.idAlquiler = idAlquiler;
    }

    public void setAsignadorIdAlquiler(int asignadorIdAlquiler) {
        this.asignadorIdAlquiler = asignadorIdAlquiler;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setComputadores(int computadores) {
        this.computadores = computadores;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }
    
    public void setTotal(int total) {
        this.total = total;
    }
    
    public void setTotalIncrementado(float total_incrementado) {
        this.total_incrementado = total_incrementado;
    }
    
    public void setTotal_adicional(float total_adicional) {
        this.total_adicional = total_adicional;
    }

    public void setTotal_incrementado(float total_incrementado) {
        this.total_incrementado = total_incrementado;
    }

    public void setTotal_adicional_normal(float total_adicional_normal) {
        this.total_adicional_normal = total_adicional_normal;
    }

    public void setTotal_adicional_descuento(float total_adicional_descuento) {
        this.total_adicional_descuento = total_adicional_descuento;
    }

    public void setTotal_adicional_incrementado(float total_adicional_incrementado) {
        this.total_adicional_incrementado = total_adicional_incrementado;
    }

    public void setDiasAdicionales(int diasAdicionales) {
        this.diasAdicionales = diasAdicionales;
    }
    
    //METODOS DE ENCAPSULAMIENTO (FIN)
    
    
    //METODO REGISTRO DE ALQUILER
    public void registrarAlquiler() {
    
        System.out.println("---REGISTRO ALQUILER---");
        System.out.println("Ingrese el numero de la ciudad para el alquiler (|1|DENTRO DE LA CIUDAD. |2|DENTRO DEL ESTABLECIMIENTO. |3|FUERA DE LA CIUDAD.): ");
        this.ciudad = l.nextInt(); //FUNCIONA COMO OPCION PARA EL SWITCH
        System.out.println("Ingrese la ciudad y direccion para recibir el alquiler: ");
        this.direccion = l.next();
        System.out.println("Ingrese la cantidad de equipos: ");
        this.computadores = l.nextInt();
        System.out.println("Ingrese los dias del alquiler: ");
        this.dias = l.nextInt();
        setIdAlquiler(asignadorIdAlquiler++); //FUNCIONA PARA AUTOINCREMENTAR EL ID DEL REGISTRO DEL SQLUILER
        
    }
    
    
    //METODO DE CALCULAR ALQUILER CON EL FIN DE MOSTRAR LA FACTURA DE ULTIMO
    public void calcularAlquiler() {
        
        
        if(computadores < 2){ //SENTENCIA IF QUE GUARDA LA CONDICION DEL MODELO DE NEGOCIO, ES DECIR, QUE SI QUIERO HACER UN REGISTRO DEBE AL MENOS REGISTRAR DOS EQUIPOS
        
            System.out.println("Su prestamo debe tener mas computadores solicitados, al menos 2 equipos."); //AVISO AL USUARIO DEL REQUISITO
            System.out.println("---REGISTRO ALQUILER---"); //NUEVA SOLICITUD DE REGISTRO
            System.out.println("Ingrese el numero de la ciudad para el alquiler (|1|DENTRO DE LA CIUDAD. |2|DENTRO DEL ESTABLECIMIENTO. |3|FUERA DE LA CIUDAD.): ");
            this.ciudad = l.nextInt(); //FUNCIONA COMO OPCION PARA EL SWITCH
            System.out.println("Ingrese la ciudad y direccion para recibir el alquiler: ");
            this.direccion = l.next();
            System.out.println("Ingrese la cantidad de equipos: ");
            this.computadores = l.nextInt();
            System.out.println("Ingrese los dias del alquiler: ");
            this.dias = l.nextInt();
            setIdAlquiler(asignadorIdAlquiler++); //FUNCIONA PARA AUTOINCREMENTAR EL ID DEL REGISTRO DEL SQLUILER
            
        }else{ 
            switch (ciudad) {
                case 1: //EL CASE 1 SERA IMPLEMENTADO SI EL ALQUILER SERA DENTRO DE LA CIUDAD
                    total=(dias*35000); 
                    System.out.println("---FACTURA ALQUILER---");
                    System.out.println("Id Pedido: " + getIdAlquiler());
                    System.out.println("Direccion: " + getDireccion());
                    System.out.println("# de Equipos: " + getComputadores());
                    System.out.println("Precio Total: " + getTotal()); //VALOR FINAL SIN NADA AGREGADO || RESTADO
                    break;
                case 2: //EL CASE 2 SERA IMPLEMENTADO SI EL ALQUILER SERA DENTRO DEL ESTABLECIMIENTO
                    descuento=(float)((dias*35000)*0.95);
                    System.out.println("---FACTURA ALQUILER---");
                    System.out.println("Id Pedido: " + getIdAlquiler());
                    System.out.println("Direccion: " + getDireccion());
                    System.out.println("# de Equipos: " + getComputadores());
                    System.out.println("Precio Descuento con el 5%: " + getDescuento()); //VALOR FINAL CON EL DESCUENTO DEL 5%
                    break;
                case 3: //EL CASE 3 SERA IMPLEMENTADO SI EL ALQUILER SERA FUERA DE LA CIUDAD
                    total_incrementado=(float)((dias*35000)*1.05);
                    System.out.println("---FACTURA ALQUILER---");
                    System.out.println("Id Pedido: " + getIdAlquiler());
                    System.out.println("Direccion: " + getDireccion());
                    System.out.println("# de Equipos: " + getComputadores());
                    System.out.println("Precio Incrementado al 5%: " + getValorIncrementado()); //VALOR FINAL CON EL INCREMENTO DEL 5%
                    break;
                default:
                    break;
            }
        }
        
        if(computadores >= 2){ //SENTENCIA IF QUE GUARDA LA CONDICION DE QUE SE CUMPLEN LOS REQUISITOS DEL MODELO DE NEGOCIO, ES DECIR, QUE SE DEBE ALQUILAR 2 O MAS EQUIPOS
            
            switch (ciudad) {
                case 1: //EL CASE 1 SERA IMPLEMENTADO SI EL ALQUILER SERA DENTRO DE LA CIUDAD
                    total=(dias*35000); 
                    System.out.println("---FACTURA ALQUILER---");
                    System.out.println("Id Pedido: " + getIdAlquiler());
                    System.out.println("Direccion: " + getDireccion());
                    System.out.println("# de Equipos: " + getComputadores());
                    System.out.println("Precio Total: " + getTotal());//VALOR FINAL SIN NADA AGREGADO || RESTADO
                    break;
                case 2: //EL CASE 2 SERA IMPLEMENTADO SI EL ALQUILER SERA DENTRO DEL ESTABLECIMIENTO
                    descuento=(float)((dias*35000)*0.95);
                    System.out.println("---FACTURA ALQUILER---");
                    System.out.println("Id Pedido: " + getIdAlquiler());
                    System.out.println("Direccion: " + getDireccion());
                    System.out.println("# de Equipos: " + getComputadores());
                    System.out.println("Precio Descuento con el 5%: " + getDescuento());//VALOR FINAL CON EL DESCUENTO DEL 5%
                    break;
                case 3: //EL CASE 3 SERA IMPLEMENTADO SI EL ALQUILER SERA FUERA DE LA CIUDAD
                    total_incrementado=(float)((dias*35000)*1.05);
                    System.out.println("---FACTURA ALQUILER---");
                    System.out.println("Id Pedido: " + getIdAlquiler());
                    System.out.println("Direccion: " + getDireccion());
                    System.out.println("# de Equipos: " + getComputadores());
                    System.out.println("Precio Incrementado al 5%: " + getValorIncrementado());//VALOR FINAL CON EL INCREMENTO DEL 5%
                    break;
                default:
                    break;
            }
        
        }
   
    
    }
    
    //METODO PARA AGREGAR DIAS AL PEDIDO EXISTENTE    
    public void solicitarDiasAdicionales() {
    
    
    System.out.println("---DIAS ADICIONALES---");
    System.out.println("1. ID PEDIDO: " + getIdAlquiler()); //ATRIBUTO PREVIAMENTE ASIGNADO
    System.out.println("2. DIRECCION: " + getDireccion()); //ATRIBUTO PREVIAMENTE ASIGNADO
    System.out.println("3. DIGITE EL NUMERO PARA EL ALQUILER (|1|DENTRO DE LA CIUDAD. |2|DENTRO DEL ESTABLECIMIENTO. |3|FUERA DE LA CIUDAD.): ");
    ciudad = l.nextInt(); //FUNCIONA COMO OPCION PARA EL SWITCH
    System.out.println("4. DIGITE LOS DIAS ADICIONALES: ");
    diasAdicionales = l.nextInt(); //NUEVA VARIABLE PARA ASIGNAR LAS DIAS ADICIONALES
    total_adicional=(diasAdicionales*35000); //VARIABLE PARA ENCONTRAR EL TOTAL DE LOS DIAS ADICIONALES Y DESPUES SUMARLOS A LOS TOTALES PREVIAMENTE CALCULADOS
    
    switch (ciudad) {
                case 1:
                    total_adicional_normal=(int) ((dias*35000)+total_adicional);//TOTAL FINAL, ES DECIR, SE SUMA EL TOTAL DE LOS DIAS ADICIONALES Y EL TOTAL DE LOS DIAS PREVIAMENTE ASIGNADOS, ESTE ULTIMO SIN NADA AGREGADO || RESTADO
                    System.out.println("---FACTURA FINAL---");
                    System.out.println("Id Pedido: " + getIdAlquiler()); //ATRIBUTO PREVIAMENTE ASIGNADO
                    System.out.println("Direccion: " + getDireccion()); //ATRIBUTO PREVIAMENTE ASIGNADO
                    System.out.println("# de Equipos: " + getComputadores()); //ATRIBUTO PREVIAMENTE ASIGNADO
                    System.out.println("Dias Adicionales: " + getDiasAdicionales()); //ATRIBUTO NUEVO
                    System.out.println("Precio Total: " + getTotal_adicional_normal());//RESULTADO FINAL
                    break;
                case 2:
                    total_adicional_descuento=(float)(((dias*35000)+total_adicional)*0.95);//TOTAL FINAL, ES DECIR, SE SUMA EL TOTAL DE LOS DIAS ADICIONALES Y EL TOTAL DE LOS DIAS PREVIAMENTE ASIGNADOS, ESTE ULTIMO TENDRA UN DESCUENTO
                    System.out.println("---FACTURA FINAL---");
                    System.out.println("Id Pedido: " + getIdAlquiler()); //ATRIBUTO PREVIAMENTE ASIGNADO
                    System.out.println("Direccion: " + getDireccion()); //ATRIBUTO PREVIAMENTE ASIGNADO
                    System.out.println("# de Equipos: " + getComputadores()); //ATRIBUTO PREVIAMENTE ASIGNADO
                    System.out.println("Dias Adicionales: " + getDiasAdicionales()); //ATRIBUTO NUEVO
                    System.out.println("Precio Total: " + getTotal_adicional_descuento()); //RESULTADO FINAL
                    break;
                case 3:
                    total_adicional_incrementado=(float)(((dias*35000)+total_adicional)*1.05);//TOTAL FINAL, ES DECIR, SE SUMA EL TOTAL DE LOS DIAS ADICIONALES Y EL TOTAL DE LOS DIAS PREVIAMENTE ASIGNADOS, ESTE ULTIMO TENDRA UN INCREMENTO
                    System.out.println("---FACTURA FINAL---");
                    System.out.println("Id Pedido: " + getIdAlquiler());//ATRIBUTO PREVIAMENTE ASIGNADO
                    System.out.println("Direccion: " + getDireccion());//ATRIBUTO PREVIAMENTE ASIGNADO
                    System.out.println("# de Equipos: " + getComputadores());//ATRIBUTO PREVIAMENTE ASIGNADO
                    System.out.println("Dias Adicionales: " + getDiasAdicionales());//ATRIBUTO NUEVO
                    System.out.println("Precio Total: " + getTotal_adicional_incrementado());//RESULTADO FINAL
                    break;
                default:
                    break;
            }

    
}   

}
