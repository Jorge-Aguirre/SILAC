package vista;

import Utilitarios.EmailValidator;
import controlador.PacienteCtrl;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Paciente;

/**
 * @author Daniel
 */
public class RegistroPaciente extends javax.swing.JFrame {

    /**
     * Creates new form RegistroPaciente
     */
    datechooser.beans.DateChooserCombo today = new datechooser.beans.DateChooserCombo();
    static datechooser.beans.DateChooserCombo selectedDate;
    public RegistroPaciente() {
        initComponents();
        setLocationRelativeTo(null);
        updateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_idpaciente = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_apPat = new javax.swing.JTextField();
        txt_apMat = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        txt_carnet = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_telf = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        dateChooserCombo1 = new datechooser.beans.DateChooserCombo();
        btn_guardarPaciente = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrar Pacientes");
        setName("Registro de Paciente"); // NOI18N
        setResizable(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id_Paciente", "Nombre", "Ap. Paterno", "Ap. Materno", "Teléfono", "Dirección", "Carnet", "Email", "Fec. Nacimiento", "Tipo de Sangre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Personales"));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setText("* Id_Paciente:");

        jLabel2.setText("* Nombre:");

        jLabel3.setText("* Ap. Paterno:");

        jLabel4.setText("Ap. Materno:");

        jLabel5.setText("Dirección:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txt_idpaciente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_idpacienteKeyPressed(evt);
            }
        });

        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_nombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreKeyTyped(evt);
            }
        });

        txt_apPat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_apPatKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_apPatKeyTyped(evt);
            }
        });

        txt_apMat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_apMatKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_apMatKeyTyped(evt);
            }
        });

        txt_direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_direccionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_idpaciente, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                    .addComponent(txt_nombre)
                    .addComponent(txt_apPat)
                    .addComponent(txt_apMat)
                    .addComponent(txt_direccion))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_idpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_apPat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_apMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Adicionales"));

        txt_carnet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_carnetKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_carnetKeyTyped(evt);
            }
        });

        txt_email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_emailKeyPressed(evt);
            }
        });

        txt_telf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_telfKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_telfKeyTyped(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jLabel6.setText("Carnet:");

        jLabel7.setText("* Email:");

        jLabel8.setText("* Teléfono:");

        jLabel9.setText("Fec. Nac:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dateChooserCombo1.setCurrentView(new datechooser.view.appearance.AppearancesList("Light",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    dateChooserCombo1.setFormat(2);
    dateChooserCombo1.setNavigateFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 11));
    dateChooserCombo1.addSelectionChangedListener(new datechooser.events.SelectionChangedListener() {
        public void onSelectionChange(datechooser.events.SelectionChangedEvent evt) {
            dateChooserCombo1OnSelectionChange(evt);
        }
    });
    dateChooserCombo1.addCommitListener(new datechooser.events.CommitListener() {
        public void onCommit(datechooser.events.CommitEvent evt) {
            dateChooserCombo1OnCommit(evt);
        }
    });

    btn_guardarPaciente.setText("Registrar Paciente");
    btn_guardarPaciente.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_guardarPacienteActionPerformed(evt);
        }
    });

    jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " O +", " O -", " A +", " A -", " B +", " B -", " AB +", " AB -" }));

    jLabel10.setText("Grupo Sanguineo:");

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_email, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_telf, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dateChooserCombo1, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                    .addComponent(txt_carnet, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jLabel10)
                    .addGap(18, 18, 18)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(btn_guardarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(txt_carnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(4, 4, 4)
            .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txt_telf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(dateChooserCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel10))
            .addGap(35, 35, 35)
            .addComponent(btn_guardarPaciente)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(40, 40, 40)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(39, 39, 39))
        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents
PacienteCtrl pacienteCtrl = new PacienteCtrl();
    private void btn_guardarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarPacienteActionPerformed
        EmailValidator email = new EmailValidator();
        if (!camposEmpty()) {
            if(validarFecha())
                if(!email.validate(txt_email.getText().trim())){
                    JOptionPane.showMessageDialog(this, "Por Favor, Ingrese un Email Valido", "Error de Formulario", JOptionPane.ERROR_MESSAGE);
                    txt_email.setBackground(Color.red);
                }
                else{
                    countDigitCI = 0;
                    countDigit = 0;
                    Paciente paciente = getPaciente();
                    if (pacienteCtrl.buscarPaciente(txt_idpaciente.getText().trim()) != null) {
                        int opcion = JOptionPane.showConfirmDialog(this, "El Id_Paciente: " 
                                + txt_idpaciente.getText() + " Ya existe.\nDesea Actualizar Sus Datos?",
                                "Seleccione una opción", JOptionPane.YES_NO_OPTION);
                        if(opcion == 0){
                            pacienteCtrl.updatePaciente(paciente);
                            cleanFormulario();
                            updateTable();
                        }

                    } else {
                        pacienteCtrl.insertarPaciente(paciente);
                        JOptionPane.showMessageDialog(this, "Se ha guardado el Paciente : " + txt_idpaciente.getText() + " \ncorrectamente");
                        cleanFormulario();
                        updateTable();
                    }
                }
            else
                JOptionPane.showMessageDialog(this, "Por Favor, Ingrese una Fecha Valida", "Error de Formulario", JOptionPane.ERROR_MESSAGE);
        }else {
            JOptionPane.showMessageDialog(this, "Por Favor, ingrese los campos Requeridos con *", "Error de Formulario", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_guardarPacienteActionPerformed

    private void txt_direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_direccionActionPerformed
    int countDigitCI = 0;
    private void txt_carnetKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_carnetKeyPressed
        if (evt.getKeyCode() == 8 && countDigitCI != 0) //el cod 8 es delete
        {
            countDigitCI -= 1;
        }
        txt_carnet.setBackground(Color.white);
    }//GEN-LAST:event_txt_carnetKeyPressed

    private void txt_carnetKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_carnetKeyTyped
        char c=evt.getKeyChar();
        if(Character.isDigit(c) && countDigitCI < 8) {
           countDigitCI++;
        }
        else{
             getToolkit().beep(); 
             evt.consume();
        }  
    }//GEN-LAST:event_txt_carnetKeyTyped
    int countDigit = 0; // controla que la cantidad de digitos sea 8
    private void txt_telfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telfKeyTyped
        char c=evt.getKeyChar();
        if(Character.isDigit(c) && countDigit < 8) {
           countDigit++;
        }
        else{
             getToolkit().beep(); 
             evt.consume();
        }  
    }//GEN-LAST:event_txt_telfKeyTyped

    private void txt_telfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telfKeyPressed
         if (evt.getKeyCode() == 8 && countDigit != 0) //el cod 8 es delete
        {
            countDigit -= 1;
        }
        txt_telf.setBackground(Color.white);
    }//GEN-LAST:event_txt_telfKeyPressed

    private void txt_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyTyped
        char c=evt.getKeyChar();
        if(Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
          }
    }//GEN-LAST:event_txt_nombreKeyTyped

    private void txt_apPatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apPatKeyTyped
        char c=evt.getKeyChar();
        if(Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
          }
    }//GEN-LAST:event_txt_apPatKeyTyped

    private void txt_apMatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apMatKeyTyped
        char c=evt.getKeyChar();
        if(Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
          }
    }//GEN-LAST:event_txt_apMatKeyTyped

    private void txt_idpacienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_idpacienteKeyPressed
        txt_idpaciente.setBackground(Color.white);
    }//GEN-LAST:event_txt_idpacienteKeyPressed

    private void txt_nombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyPressed
        txt_nombre.setBackground(Color.white);
    }//GEN-LAST:event_txt_nombreKeyPressed

    private void txt_apPatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apPatKeyPressed
        txt_apPat.setBackground(Color.white);
    }//GEN-LAST:event_txt_apPatKeyPressed

    private void txt_apMatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apMatKeyPressed
        txt_apMat.setBackground(Color.white);
    }//GEN-LAST:event_txt_apMatKeyPressed

    private void txt_emailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_emailKeyPressed
        txt_email.setBackground(Color.white);
    }//GEN-LAST:event_txt_emailKeyPressed

    public static boolean validarFech(String today, String selected)
    {
        boolean res = false;
        int todayYear = Integer.valueOf(today.substring(6));
        int todayMonth = Integer.valueOf(today.substring(3, 5));
        int todayDay = Integer.valueOf(today.substring(0, 2));
        
        int selectYear = Integer.valueOf(selected.substring(6));
        int selectMonth = Integer.valueOf(selected.substring(3, 5));
        int selectDay = Integer.valueOf(selected.substring(0, 2));
        System.out.println("selected test " + selectDay  + " " + selectMonth + " " + selectYear);
        System.out.println("Today " + todayDay + " " + todayMonth + " " + todayYear);
        
        if(selectYear <= todayYear)
        {
            if(selectYear == todayYear)
            {
                if(selectMonth <= todayMonth)
                {
                    if(selectMonth == todayMonth)
                    {
                        if(selectDay <= todayDay)
                        {
                            res = true;
                        }
                    }
                    else{
                        res = true;
                    }
                }
            }
            else{
                res = true;
            }
        }
        return res;
    }
    
    private boolean validarFecha()
    {
        boolean res = false;
        int todayYear = Integer.valueOf(today.getText().substring(6));
        int todayMonth = Integer.valueOf(today.getText().substring(3, 5));
        int todayDay = Integer.valueOf(today.getText().substring(0, 2));
        
        int selectYear = Integer.valueOf(dateChooserCombo1.getText().substring(6));
        int selectMonth = Integer.valueOf(dateChooserCombo1.getText().substring(3, 5));
        int selectDay = Integer.valueOf(dateChooserCombo1.getText().substring(0, 2));
        System.out.println("selected " + selectDay  + " " + selectMonth + " " + selectYear);
        System.out.println("Today " + todayDay + " " + todayMonth + " " + todayYear);
        
        if(selectYear <= todayYear)
        {
            if(selectYear == todayYear)
            {
                if(selectMonth <= todayMonth)
                {
                    if(selectMonth == todayMonth)
                    {
                        if(selectDay <= todayDay)
                        {
                            res = true;
                        }
                    }
                    else{
                        res = true;
                    }
                }
            }
            else{
                res = true;
            }
        }
        return res;
    }
    private void dateChooserCombo1OnCommit(datechooser.events.CommitEvent evt) {//GEN-FIRST:event_dateChooserCombo1OnCommit
    }//GEN-LAST:event_dateChooserCombo1OnCommit

    private void dateChooserCombo1OnSelectionChange(datechooser.events.SelectionChangedEvent evt) {//GEN-FIRST:event_dateChooserCombo1OnSelectionChange
       
    }//GEN-LAST:event_dateChooserCombo1OnSelectionChange

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
            java.util.logging.Logger.getLogger(RegistroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_guardarPaciente;
    private datechooser.beans.DateChooserCombo dateChooserCombo1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_apMat;
    private javax.swing.JTextField txt_apPat;
    private javax.swing.JTextField txt_carnet;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_idpaciente;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telf;
    // End of variables declaration//GEN-END:variables

    private Paciente getPaciente() {
        Paciente paciente = new Paciente();
        paciente.setIdPaciente(txt_idpaciente.getText().trim());
        paciente.setNombre(txt_nombre.getText().trim());
        paciente.setDireccion(txt_direccion.getText().trim());
        paciente.setTelefono(txt_telf.getText().trim());
        paciente.setApPaterno(txt_apPat.getText().trim());
        paciente.setApMaterno(txt_apMat.getText().trim());
        paciente.setCi(txt_carnet.getText().trim());
        paciente.setCorreo(txt_email.getText().trim());
        paciente.setFnac(dateChooserCombo1.getText().replace('-', '/'));
        paciente.setTipoSangre(jComboBox1.getSelectedItem().toString().trim());
        return paciente;
    }

    private boolean camposEmpty() {
        boolean res = false;
        if (txt_email.getText().trim().isEmpty()) {
            res = true;
            txt_email.setBackground(Color.red);
        }
        if (txt_idpaciente.getText().trim().isEmpty()) {
            res = true;
            txt_idpaciente.setBackground(Color.red);
        }
        if (txt_nombre.getText().trim().isEmpty()) {
            res = true;
            txt_nombre.setBackground(Color.red);
        }
        if (txt_apPat.getText().trim().isEmpty()) {
            res = true;
            txt_apPat.setBackground(Color.red);
        }
        if (txt_telf.getText().trim().isEmpty()) {
            res = true;
            txt_telf.setBackground(Color.red);
        }
        return res;
    }

    private void cleanFormulario() {
        txt_idpaciente.setText("");
        txt_nombre.setText("");
        txt_apPat.setText("");
        txt_apMat.setText("");
        txt_direccion.setText("");
        txt_carnet.setText("");
        txt_email.setText("");
        txt_telf.setText("");
    }

    private void updateTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        ArrayList<Paciente> p = (ArrayList)pacienteCtrl.getAllPacientes();
        cleanTable(model);
        for (Paciente p1 : p) {
            model.insertRow(0, new Object[]{p1.getIdPaciente(),
            p1.getNombre(), p1.getApPaterno(), p1.getApMaterno(),
            p1.getTelefono(), p1.getDireccion(), p1.getCi(), 
            p1.getCorreo(), p1.getFnac(), p1.getTipoSangre()});
        }
    }

    private void cleanTable(DefaultTableModel model) {
        while(model.getRowCount() != 0)
        {
            model.removeRow(model.getRowCount() - 1);
        }
    }
}
