import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MenuPrincipal extends javax.swing.JFrame {
    ListaParticipantes carrera2023 = new ListaParticipantes();
    public MenuPrincipal() {
        initComponents();
        carrera2023.cargarParticipantes();
        cargarTabla();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        inputNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        inputApellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        inputCorreoElectronico = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        inputNumeroTelefono = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        radioButtonMasculino = new javax.swing.JRadioButton();
        radioButtonFemenino = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        inputEdad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        inputNumeroCarne = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        comboBoxFacultades = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        comboBoxTallas = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        inputTextoPlayera = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        radioButtonCaminadora = new javax.swing.JRadioButton();
        radioButtonJardin = new javax.swing.JRadioButton();
        radioButtonOtro = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaParticipantes = new javax.swing.JTable();
        buttonRegresar = new javax.swing.JButton();
        inputBuscar = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        jToggleButton1.setText("jToggleButton1");

        jLabel4.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Talla de playera");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(226, 226, 255));

        jPanel3.setBackground(new java.awt.Color(95, 95, 243));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Verdana", 3, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre");

        inputNombre.setForeground(new java.awt.Color(0, 0, 0));
        inputNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNombreActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 3, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Apellido");

        jLabel3.setFont(new java.awt.Font("Verdana", 3, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Correo Electronico");

        jLabel5.setFont(new java.awt.Font("Verdana", 3, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Numero de Telefono");

        inputNumeroTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNumeroTelefonoActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Verdana", 2, 14)); // NOI18N
        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Verdana", 3, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sexo");

        buttonGroup1.add(radioButtonMasculino);
        radioButtonMasculino.setText("Masculino");
        radioButtonMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonMasculinoActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioButtonFemenino);
        radioButtonFemenino.setText("Femenino");
        radioButtonFemenino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonFemeninoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Verdana", 3, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Edad");

        inputEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputEdadActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Verdana", 3, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Numero de Carne");

        inputNumeroCarne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNumeroCarneActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Verdana", 3, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Facultad en la que Estudio");

        comboBoxFacultades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingenieria en Sistemas", "Psicologia", "Derecho" }));

        jLabel10.setFont(new java.awt.Font("Verdana", 3, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Talla de Playera");

        comboBoxTallas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S", "L", "M" }));

        jLabel11.setFont(new java.awt.Font("Verdana", 3, 10)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Texto en la Playera");

        jLabel12.setFont(new java.awt.Font("Verdana", 3, 10)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Modalidad de Carrera");

        buttonGroup2.add(radioButtonCaminadora);
        radioButtonCaminadora.setText("Caminadora");
        radioButtonCaminadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonCaminadoraActionPerformed(evt);
            }
        });

        buttonGroup2.add(radioButtonJardin);
        radioButtonJardin.setText("Jardin");

        buttonGroup2.add(radioButtonOtro);
        radioButtonOtro.setText("Otro");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(radioButtonCaminadora)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioButtonJardin, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(radioButtonOtro, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(comboBoxTallas, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputTextoPlayera, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputNumeroCarne, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxFacultades, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jButton1))
                            .addComponent(inputEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputNumeroTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(radioButtonMasculino, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(radioButtonFemenino, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(inputApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {inputApellido, inputCorreoElectronico, inputEdad, inputNombre, inputNumeroCarne, inputNumeroTelefono, inputTextoPlayera});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputNumeroTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioButtonMasculino)
                    .addComponent(radioButtonFemenino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputNumeroCarne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBoxFacultades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBoxTallas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputTextoPlayera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioButtonCaminadora)
                    .addComponent(radioButtonJardin)
                    .addComponent(radioButtonOtro))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(0, 44, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {inputApellido, inputCorreoElectronico, inputEdad, inputNombre, inputNumeroCarne, inputNumeroTelefono, inputTextoPlayera});

        jPanel1.setBackground(new java.awt.Color(226, 226, 255));

        tablaParticipantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Email", "Telefono", "Sexo", "Edad", "Carne", "Facultad", "Talla", "Texto en Playera", "Modalidad", "Corredor No", "Tiempo"
            }
        ));
        jScrollPane1.setViewportView(tablaParticipantes);

        buttonRegresar.setIcon(new javax.swing.ImageIcon("C:\\Users\\samue\\OneDrive\\Pictures\\return.png")); // NOI18N
        buttonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegresarActionPerformed(evt);
            }
        });

        inputBuscar.setText("Buscar");
        inputBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inputBuscarMouseClicked(evt);
            }
        });
        inputBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputBuscarKeyPressed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\samue\\OneDrive\\Pictures\\win.png")); // NOI18N
        jButton2.setText("Ganadores");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(buttonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(171, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE))
        );

        jMenu1.setText("Configuracion");

        jMenuItem1.setText("Grabar en Base de Datos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Cargar desde Base de Datos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Cargar Archivo");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioButtonCaminadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonCaminadoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioButtonCaminadoraActionPerformed

    private void inputNumeroCarneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNumeroCarneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNumeroCarneActionPerformed

    private void inputEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputEdadActionPerformed

    private void radioButtonFemeninoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonFemeninoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioButtonFemeninoActionPerformed

    private void radioButtonMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonMasculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioButtonMasculinoActionPerformed

    public void actualizarArchivoTexto() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("participantes.txt"));
            for (int j = 0; j <= carrera2023.getIndiceParticipantes() - 1; j++) {
                String nombre = carrera2023.participantes.get(j).getNombre();
                String apellido = carrera2023.participantes.get(j).getApellido();
                String correoElectronico = carrera2023.participantes.get(j).getCorreoElectronico();
                String numeroTelefono = carrera2023.participantes.get(j).getNumeroTelefono();
                String sexo = carrera2023.participantes.get(j).getSexo();
                String edad = carrera2023.participantes.get(j).getEdad();
                String numeroCarne = carrera2023.participantes.get(j).getNumeroCarne();
                String facultad = carrera2023.participantes.get(j).getFacultad();
                String talla = carrera2023.participantes.get(j).getTallaPlayera();
                String texto = carrera2023.participantes.get(j).getTextoPlayera();
                String modalidad = carrera2023.participantes.get(j).getModalidadCarrera();
                String numeroCorredor = carrera2023.participantes.get(j).getNumeroCorredor();
                String tiempoCarrera = carrera2023.participantes.get(j).getTiempoCarrera();

                writer.write(nombre + "|" + apellido + "|" + correoElectronico + "|" + numeroTelefono + "|" + sexo + "|" + edad + "|" + numeroCarne +
                "|" + facultad + "|" + talla + "|" + texto + "|" + modalidad + "|" + numeroCorredor + "|" + tiempoCarrera + "|\n");
                }
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
        }
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String nombre = inputNombre.getText();
        String apellido = inputApellido.getText();
        String correoElectronico = inputCorreoElectronico.getText();
        String numeroTelefono = inputNumeroTelefono.getText();
        String sexo = "";

        if (radioButtonMasculino.isSelected()) {
            sexo = "Masculino";
        } else if (radioButtonFemenino.isSelected()) {
            sexo = "Femenino";
        }

        String edad = inputEdad.getText();
        String numeroCarne = inputNumeroCarne.getText();
        String facultad = comboBoxFacultades.getSelectedItem().toString();
        String talla = comboBoxTallas.getSelectedItem().toString();
        String texto = inputTextoPlayera.getText();
        String modalidad = "";

        if (radioButtonCaminadora.isSelected()) {
            modalidad = "Caminadora";
        } else if (radioButtonJardin.isSelected()) {
            modalidad = "Jardin";
        } else if (radioButtonOtro.isSelected()) {
            modalidad = "Otro";
        }

        String numeroCorredor = "";
        String tiempoCarrera = "";
        if (nombre.isEmpty() || apellido.isEmpty() || correoElectronico.isEmpty() || numeroTelefono.isEmpty() || sexo.isEmpty() ||
            edad.isEmpty() || numeroCarne.isEmpty() || facultad.isEmpty() || talla.isEmpty() || texto.isEmpty() || modalidad.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los datos son obligatorios", "", JOptionPane.ERROR_MESSAGE);
        } else {
            Participante participante = new Participante(nombre, apellido, correoElectronico, numeroTelefono, sexo, edad, numeroCarne, facultad,
                talla, texto, modalidad, numeroCorredor, tiempoCarrera);
            carrera2023.ingresarParticipantes(participante);
            
            actualizarArchivoTexto();
            cargarTabla();
            
            inputNombre.setText("");
            inputApellido.setText("");
            inputCorreoElectronico.setText("");
            inputNumeroTelefono.setText("");
            inputEdad.setText("");
            inputNumeroCarne.setText("");
            inputTextoPlayera.setText("");
            radioButtonMasculino.setSelected(false);
            radioButtonFemenino.setSelected(false);
            radioButtonCaminadora.setSelected(false);
            radioButtonJardin.setSelected(false);
            radioButtonOtro.setSelected(false);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void inputNumeroTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNumeroTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNumeroTelefonoActionPerformed

    private void inputNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNombreActionPerformed

    private void inputBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputBuscarMouseClicked
        // TODO add your handling code here:
        inputBuscar.setText("");
        DefaultTableModel model = (DefaultTableModel) tablaParticipantes.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_inputBuscarMouseClicked

    private void buttonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegresarActionPerformed
        // TODO add your handling code here:
        cargarTabla();
        inputBuscar.setText("Buscar");
    }//GEN-LAST:event_buttonRegresarActionPerformed

    private void inputBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputBuscarKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String textoIngresado = inputBuscar.getText();
            textoIngresado = textoIngresado.replaceAll("[^\\p{Print}]", "");
            DefaultTableModel model = (DefaultTableModel) tablaParticipantes.getModel();
            boolean encontrado = false;
            
            for (int j = 0; j <= carrera2023.getIndiceParticipantes() - 1; j++) {
                    
            String nombre = carrera2023.participantes.get(j).getNombre();
            String apellido = carrera2023.participantes.get(j).getApellido();
            String correoElectronico = carrera2023.participantes.get(j).getCorreoElectronico();
            String numeroTelefono = carrera2023.participantes.get(j).getNumeroTelefono();
            String sexo = carrera2023.participantes.get(j).getSexo();
            String edad = carrera2023.participantes.get(j).getEdad();
            String numeroCarne = carrera2023.participantes.get(j).getNumeroCarne();
            String facultad = carrera2023.participantes.get(j).getFacultad();
            String talla = carrera2023.participantes.get(j).getTallaPlayera();
            String texto = carrera2023.participantes.get(j).getTextoPlayera();
            String modalidad = carrera2023.participantes.get(j).getModalidadCarrera();
            
            
            nombre = nombre.replaceAll("[^\\p{Print}]", "");
            apellido = apellido.replaceAll("[^\\p{Print}]", "");
            numeroCarne = numeroCarne.replaceAll("[^\\p{Print}]", "");
            
            if (nombre.equals(textoIngresado) || apellido.equals(textoIngresado) || numeroCarne.equals(textoIngresado)) {
                encontrado = true;
                
                Actulizacion ventanaActualizacion = new Actulizacion();
                ventanaActualizacion.setVisible(true);
                
                String numeroCorredor = null;
                String tiempoCarrera = null;
                
                try {
                    BufferedReader reader = new BufferedReader(new FileReader("datos_actualizacion.txt"));
                    String linea;
                    int contador = 1;
                    while((linea = reader.readLine()) != null) {
                        if (contador == 1) {
                            numeroCorredor = linea;
                            contador++;
                        } else {
                            tiempoCarrera = linea;
                        }
                    }
                    reader.close();
                } catch(IOException e) {
                    e.printStackTrace();
                }
                numeroCorredor = numeroCorredor.replaceAll("[^\\p{Print}]", "");
                tiempoCarrera = tiempoCarrera.replaceAll("[^\\p{Print}]", "");
                carrera2023.participantes.get(j).setNumeroCorredor(numeroCorredor);
                carrera2023.participantes.get(j).setTiempoCarrera(tiempoCarrera);
                actualizarArchivoTexto();
                numeroCorredor = carrera2023.participantes.get(j).getNumeroCorredor();
                tiempoCarrera = carrera2023.participantes.get(j).getTiempoCarrera();
                
                
                
                model.insertRow(model.getRowCount(), new Object[] {nombre, apellido, correoElectronico, numeroTelefono, 
                sexo, edad, numeroCarne, facultad, talla, texto, modalidad, numeroCorredor, tiempoCarrera});
                
            } 
            }
            if (encontrado == false) {
                JOptionPane.showMessageDialog(this, "Todos los datos son obligatorios", "", JOptionPane.ERROR_MESSAGE);
            } 
            actualizarArchivoTexto();
        }
    }//GEN-LAST:event_inputBuscarKeyPressed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        String jdbcUrl = "jdbc:mysql://localhost:3306/carrera2023";
        String username = "root";
        String password = "";

        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            // Perform database operations here
            String insertSql = "INSERT INTO participantes (nombre, apellido, correoElectronico, numeroTelefono, sexo, edad, numeroCarne, facultad, tallaPlayera, textoPlayera, modalidadCarrera, numeroCorredor, tiempoCarrera) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(insertSql)) {
            for (Participante participante : carrera2023.participantes) {
            preparedStatement.setString(1, participante.getNombre());
            preparedStatement.setString(2, participante.getApellido());
            preparedStatement.setString(3, participante.getCorreoElectronico());
            preparedStatement.setString(4, participante.getNumeroTelefono());
            preparedStatement.setString(5, participante.getSexo());
            preparedStatement.setString(6, participante.getEdad());
            preparedStatement.setString(7, participante.getNumeroCarne());
            preparedStatement.setString(8, participante.getFacultad());
            preparedStatement.setString(9, participante.getTallaPlayera());
            preparedStatement.setString(10, participante.getTextoPlayera());
            preparedStatement.setString(11, participante.getModalidadCarrera());
            preparedStatement.setString(12, participante.getNumeroCorredor());
            preparedStatement.setString(13, participante.getTiempoCarrera());
            preparedStatement.executeUpdate();
            }
            System.out.println("Data inserted into the database successfully.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        String jdbcUrl = "jdbc:mysql://localhost:3306/carrera2023";
        String username = "root";
        String password = "";

        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            String selectSql = "SELECT * FROM participantes"; // Adjust the query as needed

            try (PreparedStatement preparedStatement = connection.prepareStatement(selectSql);
                ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    // Retrieve data from the result set and create a Participante object
                    String nombre = resultSet.getString("nombre");
                    String apellido = resultSet.getString("apellido");
                    String correoElectronico = resultSet.getString("correoElectronico");
                    String numeroTelefono = resultSet.getString("numeroTelefono");
                    String sexo = resultSet.getString("sexo");
                    String edad = resultSet.getString("edad");
                    String numeroCarne = resultSet.getString("numeroCarne");
                    String facultad = resultSet.getString("facultad");
                    String tallaPlayera = resultSet.getString("tallaPlayera");
                    String textoPlayera = resultSet.getString("textoPlayera");
                    String modalidadCarrera = resultSet.getString("modalidadCarrera");
                    String numeroCorredor = resultSet.getString("numeroCorredor");
                    String tiempoCarrera = resultSet.getString("tiempoCarrera");
                    
                    // Retrieve other attributes similarly

                    // Create a Participante object
                    System.out.println(nombre);
                    Participante participante = new Participante(nombre, apellido, correoElectronico, numeroTelefono, sexo, edad, numeroCarne, facultad, tallaPlayera, textoPlayera, modalidadCarrera, numeroCorredor, tiempoCarrera);
                    carrera2023.ingresarParticipantes(participante);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        actualizarArchivoTexto();
        cargarTabla();
        for (int j = 0; j <= carrera2023.getIndiceParticipantes() - 1; j++) {
                    
            String nombre = carrera2023.participantes.get(j).getNombre();
            String apellido = carrera2023.participantes.get(j).getApellido();
            String correoElectronico = carrera2023.participantes.get(j).getCorreoElectronico();
            String numeroTelefono = carrera2023.participantes.get(j).getNumeroTelefono();
            String sexo = carrera2023.participantes.get(j).getSexo();
            String edad = carrera2023.participantes.get(j).getEdad();
            String numeroCarne = carrera2023.participantes.get(j).getNumeroCarne();
            String facultad = carrera2023.participantes.get(j).getFacultad();
            String talla = carrera2023.participantes.get(j).getTallaPlayera();
            String texto = carrera2023.participantes.get(j).getTextoPlayera();
            String modalidad = carrera2023.participantes.get(j).getModalidadCarrera();
            String numeroCarrera = carrera2023.participantes.get(j).getNumeroCorredor();
            String tiempoCarrera = carrera2023.participantes.get(j).getTiempoCarrera();
                    
            System.out.println(nombre);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        try {
            BufferedReader reader = new BufferedReader(new FileReader("importacion.txt"));
            String linea;
            while((linea = reader.readLine()) != null) {
                char[] letras = linea.toCharArray();
                char[] atributos = new char[50];
                
                String atributo;
                
                String nombre = null;
                String apellido = null;
                String correoElectronico = null;
                String numeroTelefono = null;
                String sexo = null;
                String edad = null;
                String numeroCarne = null;
                String facultad = null;
                String tallaPlayera = null;
                String textoPlayera = null;
                String modalidadCarrera = null;
                String numeroCorredor = null;
                String tiempoCarrera = null;
                
                int atributoNo = 1;
                int indiceAtributos = 0;
                
                for (int i = 0; i < letras.length; i++) {
                    if (letras[i] != '|') {
                        atributos[indiceAtributos] = letras[i];
                        indiceAtributos++;
                    } else {
                        atributo = new String(atributos);
                        switch (atributoNo) {
                            case 1:
                                nombre = atributo;
                                break;
                            case 2:
                                apellido = atributo;
                                break;
                            case 3:
                                correoElectronico = atributo;
                                break;
                            case 4:
                                numeroTelefono = atributo;
                                break;
                            case 5:
                                sexo = atributo;
                                break;
                            case 6:
                                edad = atributo;
                                break;
                            case 7:
                                numeroCarne = atributo;
                                break;
                            case 8:
                                facultad = atributo;
                                break;
                            case 9:
                                tallaPlayera = atributo;
                                break;
                            case 10:
                                textoPlayera = atributo;
                                break;
                            case 11:
                                modalidadCarrera = atributo;
                                break;
                            case 12:
                                numeroCorredor = atributo;
                                break;
                            case 13:
                                tiempoCarrera = atributo;
                                break;
                        }
                        atributoNo++;
                        indiceAtributos = 0;
                        atributos = new char[50];
                    }
                }
                nombre = nombre.replaceAll("[^\\p{Print}]", "");
                apellido = apellido.replaceAll("[^\\p{Print}]", "");
                correoElectronico = correoElectronico.replaceAll("[^\\p{Print}]", "");
                numeroTelefono = numeroTelefono.replaceAll("[^\\p{Print}]", "");
                sexo = sexo.replaceAll("[^\\p{Print}]", "");
                edad = edad.replaceAll("[^\\p{Print}]", "");
                numeroCarne = numeroCarne.replaceAll("[^\\p{Print}]", "");
                facultad = facultad.replaceAll("[^\\p{Print}]", "");
                tallaPlayera = tallaPlayera.replaceAll("[^\\p{Print}]", "");
                textoPlayera = textoPlayera.replaceAll("[^\\p{Print}]", "");
                modalidadCarrera = modalidadCarrera.replaceAll("[^\\p{Print}]", "");
                numeroCorredor = numeroCorredor.replaceAll("[^\\p{Print}]", "");
                tiempoCarrera = tiempoCarrera.replaceAll("[^\\p{Print}]", "");
                
                Participante participante = new Participante(nombre, apellido, correoElectronico, numeroTelefono, sexo, edad, numeroCarne, facultad, 
                tallaPlayera,textoPlayera, modalidadCarrera, numeroCorredor, tiempoCarrera);    
                carrera2023.ingresarParticipantes(participante); 
            }
            reader.close();
            actualizarArchivoTexto();
            cargarTabla();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tablaParticipantes.getModel();
        model.setRowCount(0);
        model.setColumnCount(5);
        model.setColumnIdentifiers(new Object[] {"Nombre", "Apellido", "Corredor No.", "Tiempo", "Facultad"});
        
        
        boolean todosRegistrados = false;
        
        int contadorHombres = 1;
        int contadorMujeres = 1;
        
        for (int j = 0; j <= carrera2023.getIndiceParticipantes() - 1; j++) {
            
            String numeroCarrera = carrera2023.participantes.get(j).getNumeroCorredor();
            
            if (numeroCarrera.isBlank()) {
                JOptionPane.showMessageDialog(this, "No todos los participantes han", "terminado la carrera", JOptionPane.ERROR_MESSAGE);
                break;
            } else {
                todosRegistrados = true;
            }
        }
        
        if (todosRegistrados) {
            carrera2023.ordenar();
            // IMPRIMIR LOS PRIMEROS 3 GANADORES
            for (int j = 0; j <= carrera2023.getIndiceParticipantes() - 1; j++) {
                    
                String nombre = carrera2023.participantes.get(j).getNombre();
                String apellido = carrera2023.participantes.get(j).getApellido();
                String facultad = carrera2023.participantes.get(j).getFacultad();
                String numeroCarrera = carrera2023.participantes.get(j).getNumeroCorredor();
                String tiempoCarrera = carrera2023.participantes.get(j).getTiempoCarrera() + " minutos";
                String sexo = carrera2023.participantes.get(j).getSexo();
                
                if (sexo.equals("Masculino")) {
                    switch (contadorHombres) {
                        case 1:
                            model.insertRow(model.getRowCount(), new Object[] {nombre, apellido, numeroCarrera, tiempoCarrera, facultad});
                            contadorHombres++;
                            break;
                        case 2:
                            model.insertRow(model.getRowCount(), new Object[] {nombre, apellido, numeroCarrera, tiempoCarrera, facultad});
                            contadorHombres++;
                            break;
                        case 3:
                            model.insertRow(model.getRowCount(), new Object[] {nombre, apellido, numeroCarrera, tiempoCarrera, facultad});
                            contadorHombres++;
                            break;
                        default:
                            break;
                    }
                }
                
            }
            // IMPRIMIR LAS PRIMERAS 3 GANADORAS
            for (int j = 0; j <= carrera2023.getIndiceParticipantes() - 1; j++) {
                    
                String nombre = carrera2023.participantes.get(j).getNombre();
                String apellido = carrera2023.participantes.get(j).getApellido();
                String facultad = carrera2023.participantes.get(j).getFacultad();
                String numeroCarrera = carrera2023.participantes.get(j).getNumeroCorredor();
                String tiempoCarrera = carrera2023.participantes.get(j).getTiempoCarrera();
                String sexo = carrera2023.participantes.get(j).getSexo();

                if (sexo.equals("Femenino")) {
                    switch (contadorMujeres) {
                        case 1:
                            model.insertRow(model.getRowCount(), new Object[] {nombre, apellido, numeroCarrera, tiempoCarrera, facultad});
                            contadorMujeres++;
                            break;
                        case 2:
                            model.insertRow(model.getRowCount(), new Object[] {nombre, apellido, numeroCarrera, tiempoCarrera, facultad});
                            contadorMujeres++;
                            break;
                        case 3:
                            model.insertRow(model.getRowCount(), new Object[] {nombre, apellido, numeroCarrera, tiempoCarrera, facultad});
                            contadorMujeres++;
                            break;
                        default:
                            break;
                    }
                }
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    public void cargarTabla() {
        DefaultTableModel model = (DefaultTableModel) tablaParticipantes.getModel();
        model.setRowCount(0);
        model.setColumnCount(13);
        
        model.setColumnIdentifiers(new Object[] {"Nombre", "Apellido", "Correo", "Numero", "Sexo", "Edad", "Carne", "Facultad", "Talla", "Texto", "Modalidad", "Carrera", "Tiempo"});
        for (int j = 0; j <= carrera2023.getIndiceParticipantes() - 1; j++) {
                    
            String nombre = carrera2023.participantes.get(j).getNombre();
            String apellido = carrera2023.participantes.get(j).getApellido();
            String correoElectronico = carrera2023.participantes.get(j).getCorreoElectronico();
            String numeroTelefono = carrera2023.participantes.get(j).getNumeroTelefono();
            String sexo = carrera2023.participantes.get(j).getSexo();
            String edad = carrera2023.participantes.get(j).getEdad();
            String numeroCarne = carrera2023.participantes.get(j).getNumeroCarne();
            String facultad = carrera2023.participantes.get(j).getFacultad();
            String talla = carrera2023.participantes.get(j).getTallaPlayera();
            String texto = carrera2023.participantes.get(j).getTextoPlayera();
            String modalidad = carrera2023.participantes.get(j).getModalidadCarrera();
            String numeroCarrera = carrera2023.participantes.get(j).getNumeroCorredor();
            String tiempoCarrera = carrera2023.participantes.get(j).getTiempoCarrera();
                    
            model.insertRow(model.getRowCount(), new Object[] {nombre, apellido, correoElectronico, numeroTelefono, 
            sexo, edad, numeroCarne, facultad, talla, texto, modalidad, numeroCarrera, tiempoCarrera});
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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton buttonRegresar;
    private javax.swing.JComboBox<String> comboBoxFacultades;
    private javax.swing.JComboBox<String> comboBoxTallas;
    private javax.swing.JTextField inputApellido;
    private javax.swing.JTextField inputBuscar;
    private javax.swing.JTextField inputCorreoElectronico;
    private javax.swing.JTextField inputEdad;
    private javax.swing.JTextField inputNombre;
    private javax.swing.JTextField inputNumeroCarne;
    private javax.swing.JTextField inputNumeroTelefono;
    private javax.swing.JTextField inputTextoPlayera;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JRadioButton radioButtonCaminadora;
    private javax.swing.JRadioButton radioButtonFemenino;
    private javax.swing.JRadioButton radioButtonJardin;
    private javax.swing.JRadioButton radioButtonMasculino;
    private javax.swing.JRadioButton radioButtonOtro;
    private javax.swing.JTable tablaParticipantes;
    // End of variables declaration//GEN-END:variables
}
