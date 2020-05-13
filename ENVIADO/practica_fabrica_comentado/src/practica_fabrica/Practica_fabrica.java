/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_fabrica;

/**
 *
 * @author jorge malaver
 */
import Fabrica.fabrica;//importa las clases del paquete Fabrica, especificamente la clase del mismo nombre, para su posterior uso
import java.util.Scanner;//importa el paquete util.Scanner usado para la lectura de datos
import Abstracto.Comun;//importa las clases del paquete Abstracto, para el posterior uso del objeto padre Comun
public class Practica_fabrica {

  
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =new Scanner(System.in);//crea un objeto de tipo Scanner para leer lo que ingrese el usuario
        Comun Micomun;//objeto de tipo Comun, la clase padre en la logica del negocio
        fabrica Mifabrica;//objeto perteneciente a la clase Fabrica que organiza el tipo de objeto correspondiente a un almacen
        
        System.out.println("Digite el almacen seleccionado:   ");//se pide al usuario el nombre del almacen
        String  seleccion=sc.nextLine();//se asigna el nombre del almacen
        Mifabrica = new fabrica(seleccion);//se crea un objeto de tipo fabrica con un parametro que es el string que corresponde al nombre del almacen
        Micomun =  Mifabrica.crear_selecion();//Con este metodo se asigna, al objeto de tipo Comun creado previamente, el almacen que corresponde al string que previamente el usuario ingreso (el string seleccion)
        String salir="Seleccione el almacen....:" + Micomun.Escojer();//este string almacena el metodo Escojer que heredan las clases Exito, Jumbo y Metro
        
        System.out.println(salir);//imprime el string 
        
    }
    
}
