package controlador;
import java.awt.event.*;
import vista.*;
import modelo.*;

public class ContrCargaMenus extends WindowAdapter {

	public ContrCargaMenus(Marco_Aplicacion elmarco) {

		this.elmarco = elmarco;
	}

  public void windowOpened(WindowEvent e) {

		obj.ejecutaConsultas();

		try {

			while (obj.rs.next() && obj.rs2.next()) {
				elmarco.Nombre.addItem(obj.rs.getString(1));
        elmarco.telefono.addItem(obj.rs2.getString(1));

			}


		} catch (Exception e2) {
		    System.err.println("Fallo al rellenar el Combobox!");
		    e2.printStackTrace();
		}

	}

	CargaMenus obj = new CargaMenus();
	private Marco_Aplicacion elmarco;
}
