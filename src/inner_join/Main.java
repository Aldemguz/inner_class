/*
 clases internas locales:
    Una clase dentro de un metodo.
    se utiliza cuando se instancia la clase interna 1 vez. el objetivo es simplificar
    aun mas el codigo
    las clases internas locales, no utilizan modificadores de acceso (private, public)
 */
package inner_join;

import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;

public class Main {

    public static void main(String[] args) {

        Reloj reloj = new Reloj();
        reloj.enMarcha(3000,true);
        JOptionPane.showMessageDialog(null,"Pulsa Aceptar para terminar");
        System.exit(0);
    
    }
    
}

class Reloj{
    //Para utilizar variables locales dentro de una clase local, tiene q ser final
    public void enMarcha(int intervalo, final boolean sonido){
        
         class DameLaHora2 implements ActionListener {
    
    @Override
    public void actionPerformed(ActionEvent e){
        Date ahora = new Date();
        System.out.println("Te coloco la hora cada 3s: "+ahora);
        if(sonido)
        Toolkit.getDefaultToolkit().beep(); 
    }
}
         ActionListener oyente = new DameLaHora2();
         Timer miTemporizador = new Timer(intervalo,oyente);
         miTemporizador.start();
         
    
    }
 
}
