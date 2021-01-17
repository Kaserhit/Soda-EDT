/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import classes.Factura;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import classes.ListaSimple;
import javax.swing.ImageIcon;

/**
 *
 * @author Workstation
 */
public final class frmListaMesasCliente extends javax.swing.JFrame {

    ListaSimple ListaSimple;

    //coloca la imagen correspondiente de acuerdo con el estado de cada mesa
    public void estadoDeMesas() {
        //String cancel = "D:\\Usuarios\\Andres\\JavaProjects\\RestauranteProyectoFinalV3\\RestauranteProyectoFinalV2\\src\\images\\mesa_nueva.png";
        //String table = "D:\\Usuarios\\Andres\\JavaProjects\\RestauranteProyectoFinalV3\\RestauranteProyectoFinalV2\\src\\images\\mesa_ocupada.png";
        for (int i = 1; i < 10; i++) {
            if (ListaSimple.buscaMesas(i) == 0) {
                switch (i) {
                    case 1:
                           mesaLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/neutral-chair.png"))); // NOI18N

                      //  mesaLabel1.setIcon(new ImageIcon(cancel));
                        break;
                    case 2:
                        mesaLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/neutral-chair.png")));
                        //mesaLabel2.setIcon(new ImageIcon(cancel));
                        break;
                    case 3:
                        mesaLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/neutral-chair.png")));
                        //mesaLabel3.setIcon(new ImageIcon(cancel));
                        break;
                    case 4:
                        mesaLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/neutral-chair.png")));
                        //mesaLabel4.setIcon(new ImageIcon(cancel));
                        break;
                    case 5:
                        mesaLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/neutral-chair.png")));
                        //mesaLabel5.setIcon(new ImageIcon(cancel));
                        break;
                    case 6:
                        mesaLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/neutral-chair.png")));
                        //mesaLabel6.setIcon(new ImageIcon(cancel));
                        break;
                    case 7:
                        mesaLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/neutral-chair.png")));
                        //mesaLabel7.setIcon(new ImageIcon(cancel));
                        break;
                    case 8:
                        mesaLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/neutral-chair.png")));
                        //mesaLabel8.setIcon(new ImageIcon(cancel));
                        break;
                    case 9:
                        mesaLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/neutral-chair.png")));
                        //mesaLabel9.setIcon(new ImageIcon(cancel));
                        break;
                    default:
                        break;
                }
            } else if (ListaSimple.buscaState(i).equals("Ocupada")) {
                switch (i) {
                    case 1:
                        
                         mesaLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/reserved-table.png"))); // NOI18N

                    //    mesaLabel1.setIcon(new ImageIcon(table));
                        break;
                    case 2:
                        mesaLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/reserved-table.png")));
                        //mesaLabel2.setIcon(new ImageIcon(table));
                        break;
                    case 3:
                        mesaLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/reserved-table.png")));
                        //mesaLabel3.setIcon(new ImageIcon(table));
                        break;
                    case 4:
                        mesaLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/reserved-table.png")));
                        //mesaLabel4.setIcon(new ImageIcon(table));
                        break;
                    case 5:
                        mesaLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/reserved-table.png")));
                        //mesaLabel5.setIcon(new ImageIcon(table));
                        break;
                    case 6:
                        mesaLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/reserved-table.png")));
                        //mesaLabel6.setIcon(new ImageIcon(table));
                        break;
                    case 7:
                        mesaLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/reserved-table.png")));
                        //mesaLabel7.setIcon(new ImageIcon(table));
                        break;
                    case 8:
                        mesaLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/reserved-table.png")));
                        //mesaLabel8.setIcon(new ImageIcon(table));
                        break;
                    case 9:
                        mesaLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/reserved-table.png")));
                        //mesaLabel9.setIcon(new ImageIcon(table));
                        break;
                    default:
                        break;
                }

            }

        }
    }

    public frmListaMesasCliente() {
        initComponents();
        estadoDeMesas();
        cerrar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        mesaLabel1 = new javax.swing.JLabel();
        mesaLabel2 = new javax.swing.JLabel();
        mesaLabel3 = new javax.swing.JLabel();
        mesaLabel4 = new javax.swing.JLabel();
        mesaLabel5 = new javax.swing.JLabel();
        mesaLabel6 = new javax.swing.JLabel();
        mesaLabel7 = new javax.swing.JLabel();
        mesaLabel8 = new javax.swing.JLabel();
        mesaLabel9 = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("BBQ Party Restaurant");
        setBackground(new java.awt.Color(102, 102, 102));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/sanblas (1121).png"))); // NOI18N

        mesaLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/available-table.png"))); // NOI18N
        mesaLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        mesaLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mesaLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesaLabel1MouseClicked(evt);
            }
        });

        mesaLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/available-table.png"))); // NOI18N
        mesaLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mesaLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesaLabel2MouseClicked(evt);
            }
        });

        mesaLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/available-table.png"))); // NOI18N
        mesaLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mesaLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesaLabel3MouseClicked(evt);
            }
        });

        mesaLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/available-table.png"))); // NOI18N
        mesaLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mesaLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesaLabel4MouseClicked(evt);
            }
        });

        mesaLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/available-table.png"))); // NOI18N
        mesaLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mesaLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesaLabel5MouseClicked(evt);
            }
        });

        mesaLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/available-table.png"))); // NOI18N
        mesaLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mesaLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesaLabel6MouseClicked(evt);
            }
        });

        mesaLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/available-table.png"))); // NOI18N
        mesaLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mesaLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesaLabel7MouseClicked(evt);
            }
        });

        mesaLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/available-table.png"))); // NOI18N
        mesaLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mesaLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesaLabel8MouseClicked(evt);
            }
        });

        mesaLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/available-table.png"))); // NOI18N
        mesaLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mesaLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesaLabel9MouseClicked(evt);
            }
        });

        btnCerrarSesion.setBackground(new java.awt.Color(226, 106, 106));
        btnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setText("Cerrar");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(mesaLabel7)
                            .addGap(18, 18, 18)
                            .addComponent(mesaLabel8)
                            .addGap(18, 18, 18)
                            .addComponent(mesaLabel9))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(mesaLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(mesaLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(mesaLabel6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(logoLabel)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(mesaLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(mesaLabel2)))
                        .addGap(18, 18, 18)
                        .addComponent(mesaLabel3)))
                .addContainerGap(65, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(285, 285, 285))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mesaLabel3)
                    .addComponent(mesaLabel2)
                    .addComponent(mesaLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mesaLabel6)
                    .addComponent(mesaLabel5)
                    .addComponent(mesaLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mesaLabel9)
                    .addComponent(mesaLabel8)
                    .addComponent(mesaLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCerrarSesion)
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        // TODO add your handling code here:
        this.dispose();
        frmIniciar iniciar = new frmIniciar();
        iniciar.setVisible(true);
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    //valida si la mesa esta disponible para ser seleccionada
    private void mesaLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesaLabel1MouseClicked

        if (ListaSimple.buscaMesas(1) == 0) {
            JOptionPane.showMessageDialog(null, "Mesa no disponible");
        } else if (ListaSimple.buscaState(1).equals("Ocupada")) {
            JOptionPane.showMessageDialog(null, "Esta mesa se encuentra ocupada\nFavor seleccionar otras mesa", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Desea Reservar esta mesa?", "Warning", dialogButton);
            if (dialogResult == JOptionPane.YES_OPTION) {
                frmRegistroUsuario rgsUsuario = new frmRegistroUsuario(1);
                rgsUsuario.setVisible(true);
                cerrarVentana();
            }
        }
    }//GEN-LAST:event_mesaLabel1MouseClicked

    //valida si la mesa esta disponible para ser seleccionada
    private void mesaLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesaLabel2MouseClicked
        // TODO add your handling code here:

        if (ListaSimple.buscaMesas(2) == 0) {
            JOptionPane.showMessageDialog(null, "Mesa no disponible");
        } else if (ListaSimple.buscaState(2).equals("Ocupada")) {
            JOptionPane.showMessageDialog(null, "Esta mesa se encuentra ocupada\nFavor seleccionar otras mesa", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Desea Reservar esta mesa?", "Warning", dialogButton);
            if (dialogResult == JOptionPane.YES_OPTION) {
                frmRegistroUsuario rgsUsuario = new frmRegistroUsuario(2);
                rgsUsuario.setVisible(true);
                cerrarVentana();
            }
        }
    }//GEN-LAST:event_mesaLabel2MouseClicked

    //valida si la mesa esta disponible para ser seleccionada
    private void mesaLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesaLabel3MouseClicked
        // TODO add your handling code here:
        if (ListaSimple.buscaMesas(3) == 0) {
            JOptionPane.showMessageDialog(null, "Mesa no disponible");
        } else if (ListaSimple.buscaState(3).equals("Ocupada")) {
            JOptionPane.showMessageDialog(null, "Esta mesa se encuentra ocupada\nFavor seleccionar otras mesa", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Desea Reservar esta mesa?", "Warning", dialogButton);
            if (dialogResult == JOptionPane.YES_OPTION) {
                frmRegistroUsuario rgsUsuario = new frmRegistroUsuario(3);
                rgsUsuario.setVisible(true);
                cerrarVentana();
            }
        }
    }//GEN-LAST:event_mesaLabel3MouseClicked

    //valida si la mesa esta disponible para ser seleccionada
    private void mesaLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesaLabel4MouseClicked
        // TODO add your handling code here:
        if (ListaSimple.buscaMesas(4) == 0) {
            JOptionPane.showMessageDialog(null, "Mesa no disponible");
        } else if (ListaSimple.buscaState(4).equals("Ocupada")) {
            JOptionPane.showMessageDialog(null, "Esta mesa se encuentra ocupada\nFavor seleccionar otras mesa", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Desea Reservar esta mesa?", "Warning", dialogButton);
            if (dialogResult == JOptionPane.YES_OPTION) {
                frmRegistroUsuario rgsUsuario = new frmRegistroUsuario(4);
                rgsUsuario.setVisible(true);
                cerrarVentana();
            }
        }
    }//GEN-LAST:event_mesaLabel4MouseClicked

    //valida si la mesa esta disponible para ser seleccionada
    private void mesaLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesaLabel5MouseClicked
        // TODO add your handling code here:
        if (ListaSimple.buscaMesas(5) == 0) {
            JOptionPane.showMessageDialog(null, "Mesa no disponible");
        } else if (ListaSimple.buscaState(5).equals("Ocupada")) {
            JOptionPane.showMessageDialog(null, "Esta mesa se encuentra ocupada\nFavor seleccionar otras mesa", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Desea Reservar esta mesa?", "Warning", dialogButton);
            if (dialogResult == JOptionPane.YES_OPTION) {
                frmRegistroUsuario rgsUsuario = new frmRegistroUsuario(5);
                rgsUsuario.setVisible(true);
                cerrarVentana();
            }
        }
    }//GEN-LAST:event_mesaLabel5MouseClicked

    //valida si la mesa esta disponible para ser seleccionada
    private void mesaLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesaLabel6MouseClicked
        // TODO add your handling code here:
        if (ListaSimple.buscaMesas(6) == 0) {
            JOptionPane.showMessageDialog(null, "Mesa no disponible");
        } else if (ListaSimple.buscaState(6).equals("Ocupada")) {
            JOptionPane.showMessageDialog(null, "Esta mesa se encuentra ocupada\nFavor seleccionar otras mesa", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Desea Reservar esta mesa?", "Warning", dialogButton);
            if (dialogResult == JOptionPane.YES_OPTION) {
                frmRegistroUsuario rgsUsuario = new frmRegistroUsuario(5);
                rgsUsuario.setVisible(true);
                cerrarVentana();
            }
        }
    }//GEN-LAST:event_mesaLabel6MouseClicked

    //valida si la mesa esta disponible para ser seleccionada
    private void mesaLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesaLabel7MouseClicked
        // TODO add your handling code here:
        if (ListaSimple.buscaMesas(7) == 0) {
            JOptionPane.showMessageDialog(null, "Mesa no disponible");
        } else if (ListaSimple.buscaState(7).equals("Ocupada")) {
            JOptionPane.showMessageDialog(null, "Esta mesa se encuentra ocupada\nFavor seleccionar otras mesa", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Desea Reservar esta mesa?", "Warning", dialogButton);
            if (dialogResult == JOptionPane.YES_OPTION) {
                frmRegistroUsuario rgsUsuario = new frmRegistroUsuario(7);
                rgsUsuario.setVisible(true);
                cerrarVentana();
            }
        }
    }//GEN-LAST:event_mesaLabel7MouseClicked

    //valida si la mesa esta disponible para ser seleccionada
    private void mesaLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesaLabel8MouseClicked
        // TODO add your handling code here:
        if (ListaSimple.buscaMesas(8) == 0) {
            JOptionPane.showMessageDialog(null, "Mesa no disponible");
        } else if (ListaSimple.buscaState(8).equals("Ocupada")) {
            JOptionPane.showMessageDialog(null, "Esta mesa se encuentra ocupada\nFavor seleccionar otras mesa", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Desea Reservar esta mesa?", "Warning", dialogButton);
            if (dialogResult == JOptionPane.YES_OPTION) {
                frmRegistroUsuario rgsUsuario = new frmRegistroUsuario(8);
                rgsUsuario.setVisible(true);
                cerrarVentana();
            }
        }
    }//GEN-LAST:event_mesaLabel8MouseClicked

    //valida si la mesa esta disponible para ser seleccionada
    private void mesaLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesaLabel9MouseClicked
        // TODO add your handling code here:
        if (ListaSimple.buscaMesas(9) == 0) {
            JOptionPane.showMessageDialog(null, "Mesa no disponible");
        } else if (ListaSimple.buscaState(9).equals("Ocupada")) {
            JOptionPane.showMessageDialog(null, "Esta mesa se encuentra ocupada\nFavor seleccionar otras mesa", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Desea Reservar esta mesa?", "Warning", dialogButton);
            if (dialogResult == JOptionPane.YES_OPTION) {
                frmRegistroUsuario rgsUsuario = new frmRegistroUsuario(9);
                rgsUsuario.setVisible(true);
                cerrarVentana();
            }
        }
    }//GEN-LAST:event_mesaLabel9MouseClicked

    private void cerrarVentana() {
        this.dispose();
    }

    //validacion de ventana al cerrar
    public void cerrar() {
        try {
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    confirmarSalida();
                }
            });
            this.setVisible(true);
        } catch (Exception e) {
        }
    }
    
    //alerta al cerrar la ventana
    public void confirmarSalida() {
        int valor = JOptionPane.showConfirmDialog(this, "¿Está seguro que desea salir del programa?", "ALERTA", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (valor == JOptionPane.YES_OPTION) {
            System.exit(0);
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmListaMesasCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frmListaMesasCliente().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JLabel mesaLabel1;
    private javax.swing.JLabel mesaLabel2;
    private javax.swing.JLabel mesaLabel3;
    private javax.swing.JLabel mesaLabel4;
    private javax.swing.JLabel mesaLabel5;
    private javax.swing.JLabel mesaLabel6;
    private javax.swing.JLabel mesaLabel7;
    private javax.swing.JLabel mesaLabel8;
    private javax.swing.JLabel mesaLabel9;
    // End of variables declaration//GEN-END:variables
}
