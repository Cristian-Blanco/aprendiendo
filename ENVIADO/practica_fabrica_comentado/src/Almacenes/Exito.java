/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Almacenes;

/**
 *
 * @author jorge malaver
 */
import Abstracto.Comun;//importa las clases del paquete Abstracto, para su posterior uso
public class Exito extends Comun{//dado que la clase Comun no es una interface, se usa la palabra reservada extends
 
    @Override
    public String Escojer(){// metodo que hereda (a traves de agregacion) de la clase abstracta Comun,
                            //retorna el nombre de el almacen, que en este caso corresponde al nombre de la clase
        return " exito";//mensaje string
    }
}
