/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inner_join;

import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;

public class Main {

    public static void main(String[] args) {

        Reloj reloj = new Reloj(3000,false);
        reloj.enMarcha();
        JOptionPane.showMessageDialog(null,"Pulsa Aceptar para terminar");
        System.exit(0);
    
    }
    
}

class Reloj{
    
    public Reloj(int intervalo, boolean sonido){
        this.intervalo = intervalo;
        this.sonido = sonido;
        
    }
    
    public void enMarcha(){
         ActionListener oyente = new DameLaHora2();
         Timer miTemporizador = new Timer(intervalo,oyente);
         miTemporizador.start();
    }
    private int intervalo;
    private boolean sonido;
    
    private class DameLaHora2 implements ActionListener {
    
    @Override
    public void actionPerformed(ActionEvent e){
        Date ahora = new Date();
        System.out.println("Te coloco la hora cada 3s: "+ahora);
        if(sonido)
        Toolkit.getDefaultToolkit().beep(); 
    }
}
    
}
