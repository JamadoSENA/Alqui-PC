/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
//CLASES IMPORTADAS PARA LA DECLARACION DE OBJETOS
import Controlador.Alquiler;
import Controlador.Usuario;
import java.util.Scanner;

/**
 *
 * @author Aprendiz
 */
public class Interfaz {
    
    //METODO QUE SE IMPLEMENTARA EN LA CLASE MAIN PARA SU EJECUCION Y FUNCIONAMIENTO
    public void iniciarPrograma (){

        //ATRIBUTOS PROPIOS DE LA CLASE
        String comentario;
        int opcion, respuesta, calificacion;
        char respuestas = 'Y' | 'y';
        //DECLARACION DEL SCANNER PARA LA ENTRADA DE DATOS
        Scanner l = new Scanner (System.in);
        //DECLARACION DE OBJETOS APARTIR DE LAS CLASES IMPORTADAS
        Alquiler objAlquiler = new Alquiler();
        Usuario objUsuario = new Usuario();
        
        try{
        
        do{//CICLO PARA QUE SE REPITA EL NUMERO DE VECES QUE INDIQUE EL USUARIO
        
            
            System.out.println("---BIENVENIDO A ALQUIPC---");
            System.out.println("PARA REALIZAR UN ALQUILER DEBES ESTAR REGISTRADO. "
                    + "\nLOS ALQUILERES SE MANEJARAN UNICAMENTE POR DIAS, NO POR HORAS, CADA UNO TIENE UN COSTO DE 35.000, "
                    + "\nSIN EMBARGO PUEDE LLEGAR A VARIAR SI HACES UN DOMICILIO DENTRO DE LA CIUDAD DONDE SE ENCUENTRA LA EMPRESA EL PRECIO SEGUIRA IGUAL, "
                    + "\nMIENTRAS QUE SI EL ALQUILER ES FUERA DE LA CIUDAD SE EL INCREMENTA UN 5% AL PRECIO, "
                    + "\nPOR ULTIMO SI ELIGES EL ALQUILER DENTRO DE LA EMPRESA TENDRA UN DESCUENTO DEL 5%.");
            System.out.println("ALQUIPC CUENTA CON LAS SIGUIENTES OPCIONES.");
            System.out.println("1. Registrar Usuario. ");
            System.out.println("2. Realizar Alquiler. ");
            System.out.println("3. Solicitar Dias Adicionales. ");
            System.out.println("4. Calificar Servicio. ");
            System.out.println("5. Salir. ");
            System.out.println("");
            System.out.println("Ingrese una opcion: ");
            opcion = l.nextInt();
            
            if(opcion==5){//CASE 5 PARA SALIR DEL PROGRAMA
                break;
            }else if(opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4 && opcion != 5){//POR SI SE DIGITA UNA DIFERENTE A LOS CASE ME RETORNE EL MENU NUEVAMENTE HASTA QUE SEA CORRECTA LA OPCION
                
            System.out.println("---BIENVENIDO A ALQUIPC---");
            System.out.println("PARA REALIZAR UN ALQUILER DEBES ESTAR REGISTRADO. "
                    + "\nLOS ALQUILERES SE MANEJARAN UNICAMENTE POR DIAS, NO POR HORAS, CADA UNO TIENE UN COSTO DE 35.000, "
                    + "\nSIN EMBARGO PUEDE LLEGAR A VARIAR SI HACES UN DOMICILIO DENTRO DE LA CIUDAD DONDE SE ENCUENTRA LA EMPRESA EL PRECIO SEGUIRA IGUAL, "
                    + "\nMIENTRAS QUE SI EL ALQUILER ES FUERA DE LA CIUDAD SE EL INCREMENTA UN 5% AL PRECIO, "
                    + "\nPOR ULTIMO SI ELIGES EL ALQUILER DENTRO DE LA EMPRESA TENDRA UN DESCUENTO DEL 5%.");
            System.out.println("ALQUIPC CUENTA CON LAS SIGUIENTES OPCIONES.");
            System.out.println("1. Registrar Usuario. ");
            System.out.println("2. Realizar Alquiler. ");
            System.out.println("3. Solicitar Dias Adicionales. ");
            System.out.println("4. Calificar Servicio. ");
            System.out.println("5. Salir. ");
            System.out.println("");
            System.out.println("Ingrese una opcion: ");
            opcion = l.nextInt();
            
            }
            
            switch (opcion) {
            
                case 1:
                    
                   do{
                    
                     objUsuario.registrarUsuario();//METODO REGISTRO DE USUARIO
                     System.out.println("Desea visualizar la informacion: 1 = SI | 0 = NO");
                     respuesta = l.nextInt();
                    
                        if(respuesta == 1){
                     
                        objUsuario.imprimirInformacion();//METODO PARA MOSTRAR LA INFORMACION DEL USUARIO
                     
                            System.out.println("¿Desea resgistrar un alquiler para el usuario " + objUsuario.getNombre() + "?  1 = SI ó 0 = NO");
                            respuesta = l.nextInt();
                    
                            if(respuesta == 1){
                        
                            objAlquiler.registrarAlquiler();//METODO PARA REGISTRAR UN ALQUILER SI LO DESEA
                            objAlquiler.calcularAlquiler();//METODO PARA CALCULAR EL TOTAL DEL ALQUILER Y MOSTRAR LA FACTURA DE ESTE
                            System.out.println("---INFORMACION DEL CLIENTE---");
                            objUsuario.imprimirInformacion();
                            System.out.println("");
                         
                       }else if(respuesta == 0){
                    
                        break;
                        
                       }
                    
                        System.out.println("Quieres resgistrar otro usuario: Y ó N");
                        respuestas = l.next().charAt(0);
                    
                    } 
                
                    }while(respuestas == 'Y' || respuestas == 'y'); 
                    
                   break;
                   
                case 2:
                    
                    do{
                    
                    System.out.println("¿Desea antes registrar un usuario? 1 = SI ó 0 = NO");
                    respuesta = l.nextInt();
                    
                    if(respuesta == 1){
                    
                    objUsuario.registrarUsuario();
                    System.out.println("---ALQUILER---");
                    System.out.println("REGISTRANDO ALQUILER DE LA PERSONA " + objUsuario.getNombre() + "...");
                    objAlquiler.registrarAlquiler();
                    objAlquiler.calcularAlquiler();
                    System.out.println("---INFORMACION DEL CLIENTE---");
                    objUsuario.imprimirInformacion();
                    System.out.println("¿DESEA AGREGAR DIAS ADICIONALES AL ALQUILER? 1 = SI ó 0 = NO");
                    respuesta = l.nextInt();
                    
                        if(respuesta == 1){
                        
                            objAlquiler.solicitarDiasAdicionales();
                        
                        }else if(respuesta == 0){
                    
                        break;
                        
                       }
                    
                    }else if(respuesta == 0){
                    
                        break;
                        
                    }
                    
                    System.out.println("Desea registrar algun otro alquiler: Y ó N");
                    respuestas = l.next().charAt(0);
                    }while(respuestas == 'Y' || respuestas == 'y');
                    
                    break;
                    
                case 3:
                    do{ 
                    System.out.println("¿Desea antes registrar un alquiler? 1 = SI ó 0 = NO");
                    respuesta = l.nextInt();
                    
                    if(respuesta == 1){
                    
                        objAlquiler.registrarAlquiler();
                        objAlquiler.calcularAlquiler();
                        System.out.println("---INFORMACION DEL CLIENTE---");
                        objUsuario.imprimirInformacion();
                        System.out.println("¿Desea agregar dias adicionales para el pedido " + objAlquiler.getIdAlquiler() + " ? 1 = SI ó 0 = NO");
                        respuesta = l.nextInt();
                        
                        if(respuesta == 1){
                        
                            objAlquiler.solicitarDiasAdicionales();
                            
                        }else if(respuesta == 0){
                        
                            break;
                            
                        }
                    
                    }else if(respuesta == 0){
                    
                        break;
                    
                    }
                    
                    System.out.println("Desea adicionarle mas dias a alguna alquiler: Y ó N");
                    respuestas = l.next().charAt(0);
                    }while(respuestas == 'Y' || respuestas == 'y');
                    
                    break;
                    
                case 4:
                    
                    do{ 
                    System.out.println("¿Desea registrar una calificacion? 1 = SI ó 0 = NO");
                    respuesta = l.nextInt();
                    
                    if(respuesta == 1){
                    
                        System.out.println("---CALIFICACION SERVICIO---");
                        System.out.println("1. Ingrese del 1 al 5 (5 siendo la calificacion mas alta) del servicio: ");
                        calificacion = l.nextInt();
                        
                        if(calificacion <= 5){
                                
                            System.out.println("Agradecemos tu calificacion.");
                            System.out.println("Justifica la calificacion para que podamos mejorar el servicio: ");
                            comentario = l.next();
                        
                        }else if(calificacion >= 6){
                        
                            break;
                        
                        }
                        
                    }else if(respuesta == 0){
                    
                        break;
                    
                    }
                    
                    System.out.println("Desea registrar alguna otra novedad: Y ó N");
                    respuestas = l.next().charAt(0);
                    }while(respuestas == 'Y' || respuestas == 'y');
                    
                    break;
            
            }
        
        
        
        
        
        }while(opcion <= 5);
            
        }catch (Exception e) {
        System.out.println("Solo debe ingresar numeros.");
        }
            
            
        }
    }
    
