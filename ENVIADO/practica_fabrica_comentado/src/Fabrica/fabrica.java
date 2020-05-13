/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabrica;

/**
 *
 * @author jorge malaver
 */
import Almacenes.*;//importa todas las clases del paquete Fabrica, puesto que en el metodo mas abajo crea un objeto de cada almacen (clase)
//import Almacenes.Jumbo;
import Abstracto.Comun;
public class fabrica {//en esta clase se maneja el tipo de objeto que el cliente desea, uasndo el string seleccion
    protected String seleccion;//este string corresponde al nombre del almacen que el cliente ingresa
    
    public fabrica(String sel){//constructor con el nombre del almacen
        seleccion=sel;
    }
   
    public Comun crear_selecion(){//este metodo de tipo Comun(la clase abstracta) retorna un objeto que corresponde al almacen deseado por el cliente, usando el parametro seleccion y usando comparacion logica
        if(seleccion.equalsIgnoreCase("Exito")){//comapra si el string qeu ingreso el cliente corresponde al nombre del almacen Exito, el metodo ignorecase funciona para obviar las mayusculas y minusculas
            return new Exito();//no se usan parametros en el constructor
        }else if(seleccion.equalsIgnoreCase("Metro")){//comapra si el string qeu ingreso el cliente corresponde al nombre del almacen Exito
            return new Metro();//no se usan parametros en el constructor
        }
        else {//comapra si el string qeu ingreso el cliente corresponde al nombre del almacen Exito
            return new Jumbo();//no se usan parametros en el constructor
        }
    }
    
  
}

