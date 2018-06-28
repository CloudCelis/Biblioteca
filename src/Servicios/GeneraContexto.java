/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Vista.RegistraPrestamo;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 *
 * @author marco
 */
public class GeneraContexto 
{
    RegistraPrestamo f = new RegistraPrestamo();
    
    public void configuraAlumno(JMenuBar barra)
    {
        JMenu menu;
        JMenuItem jm1;
        JMenuItem jm2;
        
        
        menu = new JMenu("Alumno");
        
        jm1 = new JMenuItem("Mantenedor 1");
        jm1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                JMenuItem menuItem = (JMenuItem) e.getSource();
                String text = menuItem.getText();
                javax.swing.JOptionPane.showMessageDialog(null
                    , "Bienvenido al menu " +  jm1.getText()
                    , "Conectado"
                    , JOptionPane.ERROR_MESSAGE);
            }
        });
        
        jm2 = new JMenuItem("Mantenedor 2");
        jm2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JMenuItem menuItem = (JMenuItem) e.getSource();
                String text = menuItem.getText();
                javax.swing.JOptionPane.showMessageDialog(null
                    , "Bienvenido al menu " +  jm2.getText()
                    , "Conectado"
                    , JOptionPane.ERROR_MESSAGE);
            }
        });

        menu.add(jm1);
        menu.add(jm2);
                
        barra.add(menu);
    }

    //Configura el menu de Docente
    public void configuraDocente(JMenuBar barra)
    {
        JMenu menu;
        JMenuItem jm1;
        JMenuItem jm2;
        
        menu = new JMenu("Docente");
        
        jm1 = new JMenuItem("Mantenedor 1");
        jm1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                JMenuItem menuItem = (JMenuItem) e.getSource();
                String text = menuItem.getText();
                javax.swing.JOptionPane.showMessageDialog(null
                    , "Bienvenido al menu " +  jm1.getText()
                    , "Conectado"
                    , JOptionPane.ERROR_MESSAGE);
            }
        });
        
        jm2 = new JMenuItem("Mantenedor 2");
        jm2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JMenuItem menuItem = (JMenuItem) e.getSource();
                String text = menuItem.getText();
                javax.swing.JOptionPane.showMessageDialog(null
                    , "Bienvenido al menu " +  jm2.getText()
                    , "Conectado"
                    , JOptionPane.ERROR_MESSAGE);
            }
        });

        menu.add(jm1);
        menu.add(jm2);
                
        barra.add(menu);
    }
    
    //configura el menu de Funcionaria
    public void configuraFuncionario(JMenuBar barra)
    {
        JMenu menu;
        JMenuItem jm1;
        JMenuItem jm2;
        JMenuItem jm3;
        JMenuItem jm4;
        JMenu jm5;
        
        JMenuItem sm1;
        JMenuItem sm2;

        menu = new JMenu("Funcionario");
        
        jm1 = new JMenuItem("Registrar prestamo");
        jm1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                JMenuItem menuItem = (JMenuItem) e.getSource();
                String text = menuItem.getText();
                
                if(!f.isVisible())
                {
                    f.setAlwaysOnTop(true); //Esto nos permite que el jFrame sea un modal
                    f.setVisible(true);
                }

            }
        });
        
        jm2 = new JMenuItem("Renovar prestamos");
        jm2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JMenuItem menuItem = (JMenuItem) e.getSource();
                String text = menuItem.getText();
                javax.swing.JOptionPane.showMessageDialog(null
                    , "Bienvenido al menu " +  jm2.getText()
                    , "Conectado"
                    , JOptionPane.ERROR_MESSAGE);
            }
        });
        
        jm3 = new JMenuItem("Gestionar ingresos");
        jm3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JMenuItem menuItem = (JMenuItem) e.getSource();
                String text = menuItem.getText();
                javax.swing.JOptionPane.showMessageDialog(null
                    , "Bienvenido al menu " +  jm3.getText()
                    , "Conectado"
                    , JOptionPane.ERROR_MESSAGE);
            }
        });
        
        jm4 = new JMenuItem("Registrar devoluciones");
        jm4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JMenuItem menuItem = (JMenuItem) e.getSource();
                String text = menuItem.getText();
                javax.swing.JOptionPane.showMessageDialog(null
                    , "Bienvenido al menu " +  jm4.getText()
                    , "Conectado"
                    , JOptionPane.ERROR_MESSAGE);
            }
        });
        
        jm5 = new JMenu("Registrar devoluciones");
        
        sm1 = new JMenuItem("Busqueda simple");
        sm1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JMenuItem menuItem = (JMenuItem) e.getSource();
                String text = menuItem.getText();
                javax.swing.JOptionPane.showMessageDialog(null
                    , "Bienvenido al menu " +  sm1.getText()
                    , "Conectado"
                    , JOptionPane.ERROR_MESSAGE);
            }
        });
        sm2 = new JMenuItem("Busqueda avanzada");
        sm2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JMenuItem menuItem = (JMenuItem) e.getSource();
                String text = menuItem.getText();
                javax.swing.JOptionPane.showMessageDialog(null
                    , "Bienvenido al menu " +  sm2.getText()
                    , "Conectado"
                    , JOptionPane.ERROR_MESSAGE);
            }
        });
        
        jm5.add(sm1);
        jm5.add(sm2);

        menu.add(jm1);
        menu.add(jm2);
        menu.add(jm3);
        menu.add(jm4);
        menu.add(jm5);
                
        barra.add(menu);
    }
    
    public void configuraAdministrador(JMenuBar barra)
    {
        JMenu menu;
        JMenuItem jm1;
        JMenuItem jm2;

        menu = new JMenu("Administrador");
        
        jm1 = new JMenuItem("Mantenedor 1");
        jm1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                JMenuItem menuItem = (JMenuItem) e.getSource();
                String text = menuItem.getText();
                javax.swing.JOptionPane.showMessageDialog(null
                    , "Bienvenido al menu " +  jm1.getText()
                    , "Conectado"
                    , JOptionPane.ERROR_MESSAGE);
            }
        });
        
        jm2 = new JMenuItem("Mantenedor 2");
        jm2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JMenuItem menuItem = (JMenuItem) e.getSource();
                String text = menuItem.getText();
                javax.swing.JOptionPane.showMessageDialog(null
                    , "Bienvenido al menu " +  jm2.getText()
                    , "Conectado"
                    , JOptionPane.ERROR_MESSAGE);
            }
        });

        menu.add(jm1);
        menu.add(jm2);
                
        barra.add(menu);
    }
}
