/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inner_join;

import java.awt.event.ActionListener;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        
        //DameLaHora oyente = new DameLaHora();
        ActionListener oyente = new DameLaHora();
        Timer miTemporizador = new Timer(5000,oyente);
        
        miTemporizador.start();//Con esto hacemos que comience.
        JOptionPane.showMessageDialog(null, "pulsa aceptar para detener");
        System.exit(0);
    
    }
    
}
