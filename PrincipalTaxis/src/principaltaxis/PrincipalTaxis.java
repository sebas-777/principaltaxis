/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principaltaxis;

/**
 *
 * @author Shebas
 */
import javax.swing.*;

public class PrincipalTaxis {
// Programa principal que invoca a los métodos

    public static void main(String[] args) {
        int opcion, tel,lim, l,i;
        String nom, placa;
        ColaTaxis nuevo=new ColaTaxis();      
        
        do 
        {
             opcion=Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a TaxiFlash\n"
                + "Seleccione su opción\n"
                + "1. Poner usuario en lista de espera\n"
                + "2. Asignar taxis desocupados\n"
                + "3. Contar usuarios en cola\n"
                + "0. Salir"));    
        switch (opcion)
// Instrucciones para llamar los metodos
        {
            case 1:
                 nom=JOptionPane.showInputDialog("Ingrese Nombre");
                 tel=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Telefono"));
                 nuevo.encolar(tel,nom);
                 break;
            case 2:
                lim=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de taxis disponibles: "));
                for (i = 0; i < lim; i++) {
                    nuevo.desencolar();                    
                }
                break;
          case 3:
                nuevo.numElemCola();
                break;                    
        }         
                         
        } while (opcion!=0);
    }
}
