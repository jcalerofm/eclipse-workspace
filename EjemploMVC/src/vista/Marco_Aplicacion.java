package vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import controlador.*;

public class Marco_Aplicacion extends JFrame {

	public JButton botonConsulta;
	public JComboBox<String> Nombre, telefono;
	public JTextArea resultado;

	public Marco_Aplicacion() {
		setTitle("Consulta a Bases de Datos"); //Pongo titulo a la aplicacion
		setBounds(500,300,400,400);// X, Y, ancho, alto
		setLayout(new BorderLayout());
		JPanel menus = new JPanel();
		menus.setLayout(new FlowLayout()); // Lo hacemos flotante para poder mover los elementos de la ventana

		Nombre = new JComboBox<String>();
		Nombre.setEditable(false); // Evitamos que se pueda escribir dentro del ComboBox
		Nombre.addItem("Todos");

		telefono = new JComboBox<String>();
		telefono.setEditable(false); // Evitamos que se pueda escribir dentro del ComboBox
		telefono.addItem("Todos");

		// resultado = new JTextArea(4,50);
		// resultado.setEditable(false);
		// add(resultado); //este add referencia directamente a Marco_Aplicacion
		// menus.add(NombreCliente);
		// menus.add(telefono);

        
        DefaultTableModel model = new DefaultTableModel();
        JTable resultado = new JTable(model);
        model.addColumn("Nombre");
        model.addColumn("Telefono");
        add(resultado, BorderLayout.CENTER);
        menus.add(Nombre);
        menus.add(telefono);
//
		add(menus,BorderLayout.NORTH);
		add(resultado,BorderLayout.CENTER);

		botonConsulta = new JButton("Consulta");
		add(botonConsulta,BorderLayout.SOUTH);
		botonConsulta.addActionListener(new ContrBtnEjecuta(this));
		addWindowListener(new ContrCargaMenus(this));

	}


}

