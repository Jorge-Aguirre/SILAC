/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.PacienteCtrl;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Paciente;

/**
 *
 * @author Marcelo
 */
public class BuscadorPaciente extends javax.swing.JFrame {
    private PacienteCtrl pacienteCtrl = new PacienteCtrl();
    private HashMap<String, String> atributos = new HashMap<String, String>();
    
    /**
     * Creates new form BuscadorPaciente
     */
    public BuscadorPaciente() {
        initComponents();
        atributos.put("Id", "id_Persona");
        atributos.put("Nombre", "nombre");
        atributos.put("Ap. Paterno", "ap_paterno");
        atributos.put("Ap. Materno", "ap_materno");   
        atributos.put("Direccion", "direccion");
        atributos.put("CI", "ci");
        atributos.put("EMail", "correo");
        atributos.put("Telefono", "telefono");
        atributos.put("G. Sangre", "fnac");
    }
    
    

    
    public void llenarComboBox(){
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmb_Atributos = new javax.swing.JComboBox();
        txtF_Criterio = new javax.swing.JTextField();
        btn_Buscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_Pacientes = new javax.swing.JTable();
        btn_Eliminar = new javax.swing.JButton();
        btn_Modificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Buscador Paciente");

        jLabel2.setText("Buscar por:");

        cmb_Atributos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Id", "Nombre", "Ap. Paterno", "Ap. Materno", "Telefono", "Direccion", "EMail", "CI", " " }));
        cmb_Atributos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_AtributosActionPerformed(evt);
            }
        });

        txtF_Criterio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtF_CriterioActionPerformed(evt);
            }
        });

        btn_Buscar.setText("Buscar");
        btn_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarActionPerformed(evt);
            }
        });

        table_Pacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Ap. Paterno", "Ap. Materno", "Direccion", "CI", "EMail", "Telefono", "F. Nac", "G. Sangre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_Pacientes);

        btn_Eliminar.setText("Eliminar");
        btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarActionPerformed(evt);
            }
        });

        btn_Modificar.setText("Modificar");
        btn_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(298, 298, 298))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmb_Atributos, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtF_Criterio, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Buscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Modificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Eliminar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(31, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtF_Criterio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Buscar)
                    .addComponent(cmb_Atributos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Eliminar)
                    .addComponent(btn_Modificar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_AtributosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_AtributosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_AtributosActionPerformed

    private void txtF_CriterioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtF_CriterioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtF_CriterioActionPerformed

    private void btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarActionPerformed
        updateTable();
            
        
        
    }//GEN-LAST:event_btn_BuscarActionPerformed

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
        int row = table_Pacientes.getSelectedRow();
        if (row == -1){
            JOptionPane.showMessageDialog(this, "No se ha seleccionada ningun Paciente", "No se pudo Eliminar", JOptionPane.ERROR_MESSAGE);
        }
        else {
           String id = (String)table_Pacientes.getValueAt(row, 0);
           pacienteCtrl.deletePaciente(id);
           updateTable();
        }
    }//GEN-LAST:event_btn_EliminarActionPerformed

    private void btn_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ModificarActionPerformed
                    int row = table_Pacientes.getSelectedRow();
        if (row == -1){
            JOptionPane.showMessageDialog(this, "No se ha seleccionada ningun Paciente", "No se pudo Modificar", JOptionPane.ERROR_MESSAGE);
        }
        else {
           String id = (String)table_Pacientes.getValueAt(row, 0);
           Paciente paciente = pacienteCtrl.buscarPaciente(id);
           RegistroPaciente rp =  new RegistroPaciente();
          rp.setVisible(true);
          rp.setTitle("Actualizar Paciente");
           rp.modificarPaciente(paciente);   
        }
    }//GEN-LAST:event_btn_ModificarActionPerformed

    private void updateTable() {
        DefaultTableModel model = (DefaultTableModel) table_Pacientes.getModel();
        String column = (String)cmb_Atributos.getSelectedItem();
        column = atributos.get(column);
        String criterio = txtF_Criterio.getText();
        ArrayList<Paciente> p = (ArrayList)pacienteCtrl.executePacienteQuery(column, criterio);
       cleanTable(model);
        for (Paciente p1 : p) {
            model.insertRow(0, new Object[]{p1.getIdPaciente(),
            p1.getNombre(), p1.getApPaterno(), p1.getApMaterno(),
            p1.getDireccion(), p1.getCi(), 
            p1.getCorreo(),p1.getTelefono(), p1.getFnac(), p1.getTipoSangre()});
        }
    }
    
    private void cleanTable(DefaultTableModel model) {
        while(model.getRowCount() != 0)
        {
            model.removeRow(model.getRowCount() - 1);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BuscadorPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscadorPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscadorPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscadorPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscadorPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Buscar;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Modificar;
    private javax.swing.JComboBox cmb_Atributos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_Pacientes;
    private javax.swing.JTextField txtF_Criterio;
    // End of variables declaration//GEN-END:variables
}
