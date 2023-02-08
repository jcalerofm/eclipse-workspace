package controlador;

import java.awt.event.*;
import java.sql.*;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import modelo.*;
import vista.*;

public class ContrBtnEjecuta implements ActionListener {
    public ContrBtnEjecuta(Marco_Aplicacion elmarco) {
        this.elmarco = elmarco;
    }

    @Override
    public void actionPerformed(ActionEvent e){
        String selecNombre = (String)elmarco.Nombre.getSelectedItem();
        String selecTelefono = (String)elmarco.telefono.getSelectedItem();
        resulConsul = obj.filtraBBDD(selecNombre, selecTelefono);

        try{
          //elmarco.resultado.setText("");
          

          DefaultTableModel model = new DefaultTableModel();
          JTable resultado = new JTable(model);
//          JScrollPane jScrollPane_alumno = new JScrollPane(resultado);
//          jScrollPane_alumno.setBounds(40, 40, 400, 200);

          model.addColumn("Nombre");
          model.addColumn("Telefono");

          elmarco.add(resultado);

          while(resulConsul.next()){
            // elmarco.resultado.append(resulConsul.getString(1));
            // elmarco.resultado.append(", ");
            // elmarco.resultado.append(resulConsul.getString(2));
            // elmarco.resultado.append(". ");
            // elmarco.resultado.append("\n");
            Object[] fila = new Object[2];
            for (int i = 0; i < 2; i++) {
              fila[i] = resulConsul.getObject(i + 1);
            }
            model.addRow(fila);
          }
        }catch (SQLException e1) {
          System.err.println("Fallo al cargar la consulta" + e1.getMessage());
        }
    }



    private Marco_Aplicacion elmarco;
    private EjecutaConsultas obj = new EjecutaConsultas();
    private ResultSet resulConsul;
}
