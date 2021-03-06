/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principaltaxis;

import javax.swing.*;


// Constructor de los apuntadores inicio y final
public class ColaTaxis {
    private NodoTaxis principio;
    private NodoTaxis fin;

// Constructor: Crea cola vacía
    public ColaTaxis() {
   
    principio =null;
    fin=null;
   
    }
    // Metodo para inicializar la cola
public void inicializarCola(){
    principio =null;
    fin=null;
}
public boolean colaVacia(){
   return  principio==null;
    
}
public void encolar (int t,String n) {
// El ultimo nodo en ingresar esta en la ultima posición de la cola
    NodoTaxis aux = new NodoTaxis(t,n,null);
    
    if(principio==null){
    principio =aux;
    fin=aux;
    }
    else
    {
    fin.siguiente = aux;
    fin =aux;
    }
}
// Método para desencolar (desencolar pasajeros que están en lista de espera)

public  void desencolar(){
if (colaVacia())
    JOptionPane.showMessageDialog(null, "La cola esta vacia");
principio=principio.siguiente;
if(principio==null)
    fin=null;
 
JOptionPane.showMessageDialog(null, "Taxi asignado a: "+ principio.Nombre +"  Teléfono: " 
        + principio.Telefono );
}
public void numElemCola(){
NodoTaxis aux;
int resul;
aux=principio;
resul=0;
while (aux !=null)
{
++resul;
aux=aux.siguiente;
}
JOptionPane.showMessageDialog(null, "cantidad en espera: "+ resul );
}
}
