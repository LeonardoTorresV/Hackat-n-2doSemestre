package view;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Juan Condori
 */
public class ClienteView extends javax.swing.JFrame {

    Conexion conexion = new Conexion();
    Connection con;
    DefaultTableModel model;
    Statement st;
    ResultSet rs;
    int id = 0;
    public String sexo = "";

    public ClienteView() {
        initComponents();
        setLocationRelativeTo(null);
        listar();
        btnGroupSexo.add(jRadioMasculino);
        btnGroupSexo.add(jRadioFemenino);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        btnGroupSexo = new javax.swing.ButtonGroup();
        jLabelRegistro = new javax.swing.JLabel();
        jLabelLista = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabeId = new javax.swing.JLabel();
        jTxtId = new javax.swing.JTextField();
        jLabelDni = new javax.swing.JLabel();
        jTxtDni = new javax.swing.JTextField();
        jLabelNombres = new javax.swing.JLabel();
        jTxtNombes = new javax.swing.JTextField();
        jLabelApellidos = new javax.swing.JLabel();
        jTxtApellidos = new javax.swing.JTextField();
        jLabelDireccion = new javax.swing.JLabel();
        jScrollPaneDireccion = new javax.swing.JScrollPane();
        jTextAreaDireccion = new javax.swing.JTextArea();
        jLabelCelular = new javax.swing.JLabel();
        jTxtCelular = new javax.swing.JTextField();
        jLabelSexo = new javax.swing.JLabel();
        jRadioMasculino = new javax.swing.JRadioButton();
        jRadioFemenino = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(615, 550));
        setMinimumSize(new java.awt.Dimension(615, 550));
        setPreferredSize(new java.awt.Dimension(660, 650));

        jLabelRegistro.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelRegistro.setText("REGISTRO DE CLIENTE");

        jLabelLista.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelLista.setText("LISTA DE CLIENTES");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabeId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabeId.setText("ID:");

        jTxtId.setEditable(false);
        jTxtId.setEnabled(false);

        jLabelDni.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelDni.setText("DNI:");

        jTxtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtDniActionPerformed(evt);
            }
        });

        jLabelNombres.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelNombres.setText("NOMBRES:");

        jLabelApellidos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelApellidos.setText("APELLIDOS:");

        jTxtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtApellidosActionPerformed(evt);
            }
        });

        jLabelDireccion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelDireccion.setText("DIRECCIÓN:");

        jTextAreaDireccion.setColumns(20);
        jTextAreaDireccion.setRows(5);
        jScrollPaneDireccion.setViewportView(jTextAreaDireccion);

        jLabelCelular.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCelular.setText("CELULAR:");

        jTxtCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCelularActionPerformed(evt);
            }
        });

        jLabelSexo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelSexo.setText("SEXO:");

        jRadioMasculino.setText("Masculino");

        jRadioFemenino.setText("Femenino");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabelApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelNombres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelDni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabeId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTxtId, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTxtDni, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                        .addComponent(jTxtNombes)
                                        .addComponent(jTxtApellidos))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabelSexo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelCelular, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelDireccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jRadioMasculino)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jRadioFemenino))
                                        .addComponent(jScrollPaneDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addComponent(jTxtCelular))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jTxtId)
                                                        .addComponent(jLabeId))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabelDni)
                                                        .addComponent(jTxtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(13, 13, 13)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jTxtNombes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabelNombres))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jTxtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabelApellidos)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabelDireccion)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jScrollPaneDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                                .addGap(18, 18, 18)))
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelCelular)
                                                        .addComponent(jTxtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelSexo)
                                                        .addComponent(jRadioMasculino)
                                                        .addComponent(jRadioFemenino))))
                                .addGap(14, 14, 14))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista"));

        TablaDatos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "ID", "DNI", "NOMBRES", "APELLIDOS", "DIRECCIÓN", "CELULAR", "SEXO"
                }
        ));
        TablaDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaDatos);
        if (TablaDatos.getColumnModel().getColumnCount() > 0) {
            TablaDatos.getColumnModel().getColumn(0).setMinWidth(50);
            TablaDatos.getColumnModel().getColumn(0).setPreferredWidth(50);
            TablaDatos.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Operaciones"));

        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        java.net.URL imgRegistrarURL = getClass().getResource("images/registrar.png");
        if (imgRegistrarURL != null) {
            btnRegistrar.setIcon(new javax.swing.ImageIcon(imgRegistrarURL)); // NOI18N
        } else {
            System.err.println("No se pudo encontrar el archivo: images/registrar.png");
        }
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        java.net.URL imgEditarURL = getClass().getResource("images/editar.png");
        if (imgEditarURL != null) {
            btnEditar.setIcon(new javax.swing.ImageIcon(imgEditarURL)); // NOI18N
        } else {
            System.err.println("No se pudo encontrar el archivo: images/editar.png");
        }
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        java.net.URL imgEliminarURL = getClass().getResource("images/eliminar.png");
        if (imgEliminarURL != null) {
            btnEliminar.setIcon(new javax.swing.ImageIcon(imgEliminarURL)); // NOI18N
        } else {
            System.err.println("No se pudo encontrar el archivo: images/eliminar.png");
        }
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        java.net.URL imgLimpiarURL = getClass().getResource("images/limpiar.png");
        if (imgLimpiarURL != null) {
            btnLimpiar.setIcon(new javax.swing.ImageIcon(imgLimpiarURL)); // NOI18N
        } else {
            System.err.println("No se pudo encontrar el archivo: images/limpiar.png");
        }
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        
        System.out.println(System.getProperty("java.class.path"));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap(150, Short.MAX_VALUE)
                                .addComponent(btnRegistrar)
                                .addGap(18, 18, 18)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar)
                                .addGap(18, 18, 18)
                                .addComponent(btnLimpiar)
                                .addGap(58, 58, 58))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnRegistrar)
                                        .addComponent(btnEditar)
                                        .addComponent(btnEliminar)
                                        .addComponent(btnLimpiar))
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(jLabelLista)
                                                                .addGap(179, 179, 179))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(jLabelRegistro)
                                                                .addGap(154, 154, 154))))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(42, Short.MAX_VALUE)
                                .addComponent(jLabelRegistro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(jLabelLista)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>                        

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {
        registrar();
        listar();
    }

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {
        editar();
        listar();
    }

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {
        eliminar();
        listar();
    }

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {
        limpiar();
    }

    private void TablaDatosMouseClicked(java.awt.event.MouseEvent evt) {
        int row = TablaDatos.getSelectedRow();
        if (row == -1) {
            System.out.println("No se Selecciono");
        } else {
            id = Integer.parseInt((String) TablaDatos.getValueAt(row, 0).toString());
            String dni = (String) TablaDatos.getValueAt(row, 1);
            String nombres = (String) TablaDatos.getValueAt(row, 2);
            String apellidos = (String) TablaDatos.getValueAt(row, 3);
            String direccion = (String) TablaDatos.getValueAt(row, 4);
            String celular = (String) TablaDatos.getValueAt(row, 5);
            String sexo = (String) TablaDatos.getValueAt(row, 6).toString();
            jTxtId.setText("" + id);
            jTxtDni.setText(dni);
            jTxtNombes.setText(nombres);
            jTxtApellidos.setText(apellidos);
            jTextAreaDireccion.setText(direccion);
            jTxtCelular.setText(celular);
            if (sexo.equals("M")) {
                jRadioMasculino.setSelected(true);
            } else {
                jRadioFemenino.setSelected(true);
            }
        }
    }

    private void jTxtDniActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTxtCelularActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTxtApellidosActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(ClienteView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteView().setVisible(true);
            }
        });
    }

    void listar() {
        String sql = "SELECT * FROM CLIENTE";
        try {
            con = conexion.Conexion();
            st = con.createStatement();
            rs = st.executeQuery(sql);
            Object[] cliente = new Object[7];
            model = (DefaultTableModel) TablaDatos.getModel();
            while (rs.next()) {
                cliente[0] = rs.getInt("ID");
                cliente[1] = rs.getString("DNI");
                cliente[2] = rs.getString("NOMBRES");
                cliente[3] = rs.getString("APELLIDOS");
                cliente[4] = rs.getString("DIRECCION");
                cliente[5] = rs.getString("CELULAR");
                cliente[6] = rs.getString("SEXO");
                model.addRow(cliente);
            }
            TablaDatos.setModel(model);
        } catch (Exception e) {
            System.out.println("Error Listar " + e);
        }
        limpiar();
    }

    void registrar() {
        String dni = jTxtDni.getText();
        String nombres = jTxtNombes.getText();
        String apellidos = jTxtApellidos.getText();
        String direccion = jTextAreaDireccion.getText();
        String celular = jTxtCelular.getText();
        if (jRadioMasculino.isSelected()) {
            sexo = "M";
        } else {
            sexo = "F";
        }
        try {
            String sql = "INSERT INTO CLIENTE(DNI, NOMBRES, APELLIDOS, DIRECCION, CELULAR, SEXO) values('" + dni + "','" + nombres + "','" + apellidos + "','" + direccion + "','" + celular + "','" + sexo + "')";
            con = conexion.Conexion();
            st = con.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(this, "Cliente Registrado con Exito");
            limpiarTabla(model);
        } catch (Exception e) {
            System.out.println("Error Registrar " + e);
        }
        limpiar();
    }

    void editar() {
        String dni = jTxtDni.getText();
        String nombres = jTxtNombes.getText();
        String apellidos = jTxtApellidos.getText();
        String direccion = jTextAreaDireccion.getText();
        String celular = jTxtCelular.getText();
        if (jRadioMasculino.isSelected()) {
            sexo = "M";
        } else {
            sexo = "F";
        }
        try {
            String sql = "UPDATE CLIENTE SET DNI='" + dni + "', NOMBRES='" + nombres + "', APELLIDOS='" + apellidos + "', DIRECCION='" + direccion + "', CELULAR='" + celular + "', SEXO='" + sexo + "' WHERE ID=" + id;
            con = conexion.Conexion();
            st = con.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(this, "Cliente Actualizado con Exito");
            limpiarTabla(model);
        } catch (Exception e) {
            System.out.println("Error Editar " + e);
        }
        limpiar();
    }

    void eliminar() {
        String sql = "DELETE FROM CLIENTE WHERE ID=" + id;
        int fila = TablaDatos.getSelectedRow();
        if (fila < 0) {
            System.out.println("Cliente no Seleccionado");
        } else {
            try {
                con = conexion.Conexion();
                st = con.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(this, "Cliente Eliminado");
                limpiarTabla(model);
            } catch (Exception e) {
                System.out.println("Error Eliminar " + e);
            }
        }
        limpiar();
    }

    void limpiarTabla(DefaultTableModel model) {
        int rowCount = TablaDatos.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
    }

    void limpiar() {
        jTxtId.setText("");
        jTxtDni.setText("");
        jTxtNombes.setText("");
        jTxtApellidos.setText("");
        jTextAreaDireccion.setText("");
        jTxtCelular.setText("");
        btnGroupSexo.clearSelection();
    }

    // Variables declaration - do not modify                     
    public static javax.swing.JTable TablaDatos;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    public static javax.swing.ButtonGroup btnGroupSexo;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabeId;
    private javax.swing.JLabel jLabelApellidos;
    private javax.swing.JLabel jLabelCelular;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelDni;
    private javax.swing.JLabel jLabelLista;
    private javax.swing.JLabel jLabelNombres;
    private javax.swing.JLabel jLabelRegistro;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JRadioButton jRadioFemenino;
    public static javax.swing.JRadioButton jRadioMasculino;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPaneDireccion;
    public static javax.swing.JTextArea jTextAreaDireccion;
    public static javax.swing.JTextField jTxtApellidos;
    public static javax.swing.JTextField jTxtCelular;
    public static javax.swing.JTextField jTxtDni;
    public static javax.swing.JTextField jTxtId;
    public static javax.swing.JTextField jTxtNombes;
    // End of variables declaration                   
}
