package Org.IesLosRemedios.Prog.actividades.actividad1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Gui {

    public static void main(String args[]) {

        Gui awt_obj = new Gui();
    }

    Gui () {

        Frame frame1 = new Frame();
        frame1.setBackground(Color.lightGray);

        Frame frame2 = new Frame();
        frame1.setBackground(Color.lightGray);


        Label nombre = new Label("Nombre:");
        Label contra = new Label("Contraseña:");
        nombre.setBackground(Color.gray);
        contra.setBackground(Color.gray);

        Button cancelar = new Button("Cancelar");
        Button acceder = new Button("Acceder");
        cancelar.setBackground(Color.BLUE);
        acceder.setBackground(Color.blue);


        TextField textoNombre = new TextField();
        TextField textoContra = new TextField();


        nombre.setBounds(90, 80, 70, 30);
        textoNombre.setBounds(210, 85, 100, 20);
        contra.setBounds(90, 140, 70, 30);
        textoContra.setBounds(210, 145, 100, 20);
        cancelar.setBounds(100,250,80,30);
        acceder.setBounds(210,250,80,30);


        frame1.add(nombre);
        frame1.add(textoNombre);
        frame1.add(contra);
        frame1.add(textoContra);
        frame1.add(cancelar);
        frame1.add(acceder);


        frame1.setSize(400, 300);

        frame1.setTitle("Login");

        frame1.setLayout(null);

        frame1.setVisible(true);

        Dialog dialogo = new Dialog(frame2 , "¡Bienvenido!", false);
        dialogo.setLayout(null);
        dialogo.setSize(200, 200);
        Label label1 = new Label("¡Bienvenido!");
        label1.setBounds(20, 20, 100,100);
        label1.setVisible(true);
        dialogo.add(label1);
        dialogo.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dialogo.dispose();

            }
        });

        acceder.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dialogo.setVisible(true);
                frame1.dispose();
            }
        });

        cancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textoNombre.setText(null);
                textoContra.setText(null);
            }
        });
        frame1.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame1.dispose();
            }
        });
    }
}
