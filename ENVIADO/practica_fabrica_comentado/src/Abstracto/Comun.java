/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstracto;
//que pasa gente
/**
 *
 * @author jorge malaver
 */
public abstract class Comun {//clase abstracta, dado que tiene un metodo ya implementado, debe ser abstract, si no lo tuviera implementado deberia ser interface
    
    public Comun(){};//Constructor sin parametros
    
    
    public String Escojer(){//metodo que las subclases heredan
        return "Escojer almacen preferido";//este mensaje no se mostrará, dado que las subclases implementan este metodo, y envian un mensaje correspodiente al nombre de cada almacen
    }
}
//heeeey