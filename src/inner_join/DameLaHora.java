/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inner_join;

import java.awt.Toolkit;
import java.awt.event.*;
import java.util.*;

/**
 *
 * @author aldemaro
 */
public class DameLaHora implements ActionListener {
    
    @Override
    public void actionPerformed(ActionEvent e){
        Date ahora = new Date();
        System.out.println("Te coloco la hora cada 5s: "+ahora);
        Toolkit.getDefaultToolkit().beep(); 
    }
}
