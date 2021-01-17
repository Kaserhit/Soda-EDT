/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import classes.ListaSimple;
import classes.ListaDoble;
import classes.Mesa;
import java.awt.HeadlessException;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Workstation
 */
public final class frmListaMesas extends javax.swing.JFrame {

    ListaSimple ListaSimple;
    ListaDoble ListaDoble;

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
             else if (ListaSimple.buscaState(i).equals("Libre")) {
                switch (i) {
                    case 1:
                        
                         mesaLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/available-table.png"))); // NOI18N

                    //    mesaLabel1.setIcon(new ImageIcon(table));
                        break;
                    case 2:
                        mesaLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/available-table.png")));
                        //mesaLabel2.setIcon(new ImageIcon(table));
                        break;
                    case 3:
                        mesaLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/available-table.png")));
                        //mesaLabel3.setIcon(new ImageIcon(table));
                        break;
                    case 4:
                        mesaLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/available-table.png")));
                        //mesaLabel4.setIcon(new ImageIcon(table));
                        break;
                    case 5:
                        mesaLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/available-table.png")));
                        //mesaLabel5.setIcon(new ImageIcon(table));
                        break;
                    case 6:
                        mesaLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/available-table.png")));
                        //mesaLabel6.setIcon(new ImageIcon(table));
                        break;
                    case 7:
                        mesaLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/available-table.png")));
                        //mesaLabel7.setIcon(new ImageIcon(table));
                        break;
                    case 8:
                        mesaLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/available-table.png")));
                        //mesaLabel8.setIcon(new ImageIcon(table));
                        break;
                    case 9:
                        mesaLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/available-table.png")));
                        //mesaLabel9.setIcon(new ImageIcon(table));
                        break;
                    default:
                        break;
                }
             }
               


        }
    }

    public frmListaMesas() {
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
        btnEditarMesas = new javax.swing.JLabel();
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
        btnSalir = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("BBQ Party Restaurant");
        setBackground(new java.awt.Color(102, 102, 102));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEditarMesas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit (2).png"))); // NOI18N
        btnEditarMesas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMesasMouseClicked(evt);
            }
        });
        jPanel1.add(btnEditarMesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(653, 21, -1, -1));

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/sanblas (1121).png"))); // NOI18N
        jPanel1.add(logoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 12, 220, -1));

        mesaLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/available-table.png"))); // NOI18N
        mesaLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        mesaLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mesaLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesaLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(mesaLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 178, -1, -1));

        mesaLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/available-table.png"))); // NOI18N
        mesaLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mesaLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesaLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(mesaLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 178, -1, -1));

        mesaLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/available-table.png"))); // NOI18N
        mesaLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mesaLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesaLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(mesaLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 178, -1, -1));

        mesaLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/available-table.png"))); // NOI18N
        mesaLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mesaLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesaLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(mesaLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 359, -1, -1));

        mesaLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/available-table.png"))); // NOI18N
        mesaLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mesaLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesaLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(mesaLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 359, -1, -1));

        mesaLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/available-table.png"))); // NOI18N
        mesaLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mesaLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesaLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(mesaLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 359, -1, -1));

        mesaLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/available-table.png"))); // NOI18N
        mesaLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mesaLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesaLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(mesaLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 538, -1, -1));

        mesaLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/available-table.png"))); // NOI18N
        mesaLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mesaLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesaLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(mesaLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 538, -1, -1));

        mesaLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/available-table.png"))); // NOI18N
        mesaLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mesaLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesaLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(mesaLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 538, -1, -1));

        btnCerrarSesion.setBackground(new java.awt.Color(226, 106, 106));
        btnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setText("Cerrar");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 735, 135, -1));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 20, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/bannerflorwers.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, 250, 160));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/bannerflorwers.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 240, 160));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/bannerflorwers.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 630, 290, 160));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/bannerflorwers.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 630, 180, 160));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICS/bannerflorwers.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 250, 160));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 793, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
//se encarga de validar si las mesas tienen clientes
    //en caso de que si mnmuetsra las ordenes y permite editar
    //en caso contrario muestra un msj de error
    //hace lo mismo para las 9 mesas
    private void mesaLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesaLabel1MouseClicked
        // TODO add your handling code here:
        int mesaNumero = 1;
        if (ListaSimple.buscaMesas(mesaNumero) == 0) {
            JOptionPane.showMessageDialog(null, "Mesa no disponible");
        } else if (ListaSimple.buscaState(mesaNumero).equals("Ocupada")) {
            JOptionPane.showMessageDialog(null, ListaDoble.printMesaCompleta(Integer.toString(mesaNumero)));
            String[] opciones = new String[]{"Editar", "Eliminar"};
            int respuesta = JOptionPane.showOptionDialog(null, "Seleccione la opcion que desea realizar:", "Opciones",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
            if (respuesta == 0) {
                try {
                    int opc = Integer.parseInt(JOptionPane.showInputDialog(null, ListaDoble.printMesa(Integer.toString(mesaNumero))));
                    if (Integer.toString(ListaDoble.getCantidadPedido(Integer.toString(mesaNumero), opc)).equals("0")) {
                        JOptionPane.showMessageDialog(null, "Orden no valida");
                    } else {
                        frmEditarPedido editar = new frmEditarPedido(opc, mesaNumero);
                        editar.setVisible(true);
                        this.dispose();
                    }

                } catch (HeadlessException | NumberFormatException e) {

                }

            } else if (respuesta == 1) {
                try {
                    int opc = Integer.parseInt(JOptionPane.showInputDialog(null, ListaDoble.printMesa(Integer.toString(mesaNumero))));
                    if (Integer.toString(ListaDoble.getCantidadPedido(Integer.toString(mesaNumero), opc)).equals("0")) {
                        JOptionPane.showMessageDialog(null, "Orden no valida");
                    } else {
                        int valor = JOptionPane.showConfirmDialog(this, "¿Desea eliminar el pedido?\n" + ListaDoble.printPedidoEspecifico(Integer.toString(mesaNumero), opc), "CONFIRMACION", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                        if (valor == JOptionPane.YES_OPTION) {
                            ListaDoble.eliminaOrden(opc, Integer.toString(mesaNumero));
                            JOptionPane.showMessageDialog(null, "Orden eliminada correctamente");
                        }
                    }

                } catch (HeadlessException | NumberFormatException e) {
                }

            }

        } else {
            JOptionPane.showMessageDialog(null, "Esta mesa se encuentra libre", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_mesaLabel1MouseClicked

    private void mesaLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesaLabel2MouseClicked
        // TODO add your handling code here:
        int mesaNumero = 2;

        if (ListaSimple.buscaMesas(mesaNumero) == 0) {
            JOptionPane.showMessageDialog(null, "Mesa no disponible");
        } else if (ListaSimple.buscaState(mesaNumero).equals("Ocupada")) {
            JOptionPane.showMessageDialog(null, ListaDoble.printMesaCompleta(Integer.toString(mesaNumero)));
            String[] opciones = new String[]{"Editar", "Eliminar"};
            int respuesta = JOptionPane.showOptionDialog(null, "Seleccione la opcion que desea realizar:", "Opciones",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
            if (respuesta == 0) {
                try {
                    int opc = Integer.parseInt(JOptionPane.showInputDialog(null, ListaDoble.printMesa(Integer.toString(mesaNumero))));
                    if (Integer.toString(ListaDoble.getCantidadPedido(Integer.toString(mesaNumero), opc)).equals("0")) {
                        JOptionPane.showMessageDialog(null, "Orden no valida");
                    } else {
                        frmEditarPedido editar = new frmEditarPedido(opc, mesaNumero);
                        editar.setVisible(true);
                        this.dispose();
                    }

                } catch (HeadlessException | NumberFormatException e) {

                }

            } else if (respuesta == 1) {
                try {
                    int opc = Integer.parseInt(JOptionPane.showInputDialog(null, ListaDoble.printMesa(Integer.toString(mesaNumero))));

                    if (Integer.toString(ListaDoble.getCantidadPedido(Integer.toString(mesaNumero), opc)).equals("0")) {
                        JOptionPane.showMessageDialog(null, "Orden no valida");
                    } else {
                        int valor = JOptionPane.showConfirmDialog(this, "¿Desea eliminar el pedido?\n" + ListaDoble.printPedidoEspecifico(Integer.toString(mesaNumero), opc), "CONFIRMACION", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                        if (valor == JOptionPane.YES_OPTION) {
                            ListaDoble.eliminaOrden(opc, Integer.toString(mesaNumero));
                            JOptionPane.showMessageDialog(null, "Orden eliminada correctamente");
                        }
                    }
                } catch (HeadlessException | NumberFormatException e) {
                }

            }

        } else {
            JOptionPane.showMessageDialog(null, "Esta mesa se encuentra libre", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_mesaLabel2MouseClicked

    private void mesaLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesaLabel3MouseClicked
        // TODO add your handling code here:
        int mesaNumero = 3;
        if (ListaSimple.buscaMesas(mesaNumero) == 0) {
            JOptionPane.showMessageDialog(null, "Mesa no disponible");
        } else if (ListaSimple.buscaState(mesaNumero).equals("Ocupada")) {
            JOptionPane.showMessageDialog(null, ListaDoble.printMesaCompleta(Integer.toString(mesaNumero)));
            String[] opciones = new String[]{"Editar", "Eliminar"};
            int respuesta = JOptionPane.showOptionDialog(null, "Seleccione la opcion que desea realizar:", "Opciones",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
            if (respuesta == 0) {
                try {
                    int opc = Integer.parseInt(JOptionPane.showInputDialog(null, ListaDoble.printMesa(Integer.toString(mesaNumero))));
                    if (Integer.toString(ListaDoble.getCantidadPedido(Integer.toString(mesaNumero), opc)).equals("0")) {
                        JOptionPane.showMessageDialog(null, "Orden no valida");
                    } else {
                        frmEditarPedido editar = new frmEditarPedido(opc, mesaNumero);
                        editar.setVisible(true);
                        this.dispose();
                    }

                } catch (HeadlessException | NumberFormatException e) {

                }

            } else if (respuesta == 1) {
                try {
                    int opc = Integer.parseInt(JOptionPane.showInputDialog(null, ListaDoble.printMesa(Integer.toString(mesaNumero))));
                    if (Integer.toString(ListaDoble.getCantidadPedido(Integer.toString(mesaNumero), opc)).equals("0")) {
                        JOptionPane.showMessageDialog(null, "Orden no valida");
                    } else {
                        int valor = JOptionPane.showConfirmDialog(this, "¿Desea eliminar el pedido?\n" + ListaDoble.printPedidoEspecifico(Integer.toString(mesaNumero), opc), "CONFIRMACION", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                        if (valor == JOptionPane.YES_OPTION) {
                            ListaDoble.eliminaOrden(opc, Integer.toString(mesaNumero));
                            JOptionPane.showMessageDialog(null, "Orden eliminada correctamente");
                        }
                    }
                } catch (HeadlessException | NumberFormatException e) {
                }

            }

        } else {
            JOptionPane.showMessageDialog(null, "Esta mesa se encuentra libre", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_mesaLabel3MouseClicked

    private void mesaLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesaLabel4MouseClicked
        // TODO add your handling code here:
        int mesaNumero = 4;

        if (ListaSimple.buscaMesas(mesaNumero) == 0) {
            JOptionPane.showMessageDialog(null, "Mesa no disponible");
        } else if (ListaSimple.buscaState(mesaNumero).equals("Ocupada")) {
            JOptionPane.showMessageDialog(null, ListaDoble.printMesaCompleta(Integer.toString(mesaNumero)));
            String[] opciones = new String[]{"Editar", "Eliminar"};
            int respuesta = JOptionPane.showOptionDialog(null, "Seleccione la opcion que desea realizar:", "Opciones",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
            if (respuesta == 0) {
                try {
                    int opc = Integer.parseInt(JOptionPane.showInputDialog(null, ListaDoble.printMesa(Integer.toString(mesaNumero))));

                    if (Integer.toString(ListaDoble.getCantidadPedido(Integer.toString(mesaNumero), opc)).equals("0")) {
                        JOptionPane.showMessageDialog(null, "Orden no valida");
                    } else {
                        frmEditarPedido editar = new frmEditarPedido(opc, mesaNumero);
                        editar.setVisible(true);
                        this.dispose();
                    }

                } catch (HeadlessException | NumberFormatException e) {

                }

            } else if (respuesta == 1) {
                try {
                    int opc = Integer.parseInt(JOptionPane.showInputDialog(null, ListaDoble.printMesa(Integer.toString(mesaNumero))));

                    if (Integer.toString(ListaDoble.getCantidadPedido(Integer.toString(mesaNumero), opc)).equals("0")) {
                        JOptionPane.showMessageDialog(null, "Orden no valida");
                    } else {
                        int valor = JOptionPane.showConfirmDialog(this, "¿Desea eliminar el pedido?\n" + ListaDoble.printPedidoEspecifico(Integer.toString(mesaNumero), opc), "CONFIRMACION", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                        if (valor == JOptionPane.YES_OPTION) {
                            ListaDoble.eliminaOrden(opc, Integer.toString(mesaNumero));
                            JOptionPane.showMessageDialog(null, "Orden eliminada correctamente");
                        }
                    }
                } catch (HeadlessException | NumberFormatException e) {
                }

            }

        } else {
            JOptionPane.showMessageDialog(null, "Esta mesa se encuentra libre", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_mesaLabel4MouseClicked

    private void mesaLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesaLabel5MouseClicked
        // TODO add your handling code here:
        int mesaNumero = 5;

        if (ListaSimple.buscaMesas(mesaNumero) == 0) {
            JOptionPane.showMessageDialog(null, "Mesa no disponible");
        } else if (ListaSimple.buscaState(mesaNumero).equals("Ocupada")) {
            JOptionPane.showMessageDialog(null, ListaDoble.printMesaCompleta(Integer.toString(mesaNumero)));
            String[] opciones = new String[]{"Editar", "Eliminar"};
            int respuesta = JOptionPane.showOptionDialog(null, "Seleccione la opcion que desea realizar:", "Opciones",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
            if (respuesta == 0) {
                try {
                    int opc = Integer.parseInt(JOptionPane.showInputDialog(null, ListaDoble.printMesa(Integer.toString(mesaNumero))));

                    if (Integer.toString(ListaDoble.getCantidadPedido(Integer.toString(mesaNumero), opc)).equals("0")) {
                        JOptionPane.showMessageDialog(null, "Orden no valida");
                    } else {
                        frmEditarPedido editar = new frmEditarPedido(opc, mesaNumero);
                        editar.setVisible(true);
                        this.dispose();
                    }

                } catch (HeadlessException | NumberFormatException e) {

                }

            } else if (respuesta == 1) {
                try {
                    int opc = Integer.parseInt(JOptionPane.showInputDialog(null, ListaDoble.printMesa(Integer.toString(mesaNumero))));

                    if (Integer.toString(ListaDoble.getCantidadPedido(Integer.toString(mesaNumero), opc)).equals("0")) {
                        JOptionPane.showMessageDialog(null, "Orden no valida");
                    } else {
                        int valor = JOptionPane.showConfirmDialog(this, "¿Desea eliminar el pedido?\n" + ListaDoble.printPedidoEspecifico(Integer.toString(mesaNumero), opc), "CONFIRMACION", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                        if (valor == JOptionPane.YES_OPTION) {
                            ListaDoble.eliminaOrden(opc, Integer.toString(mesaNumero));
                            JOptionPane.showMessageDialog(null, "Orden eliminada correctamente");
                        }
                    }
                } catch (HeadlessException | NumberFormatException e) {
                }

            }

        } else {
            JOptionPane.showMessageDialog(null, "Esta mesa se encuentra libre", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_mesaLabel5MouseClicked

    private void mesaLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesaLabel6MouseClicked
        // TODO add your handling code here:
        int mesaNumero = 6;

        if (ListaSimple.buscaMesas(mesaNumero) == 0) {
            JOptionPane.showMessageDialog(null, "Mesa no disponible");
        } else if (ListaSimple.buscaState(mesaNumero).equals("Ocupada")) {
            JOptionPane.showMessageDialog(null, ListaDoble.printMesaCompleta(Integer.toString(mesaNumero)));
            String[] opciones = new String[]{"Editar", "Eliminar"};
            int respuesta = JOptionPane.showOptionDialog(null, "Seleccione la opcion que desea realizar:", "Opciones",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
            if (respuesta == 0) {
                try {
                    int opc = Integer.parseInt(JOptionPane.showInputDialog(null, ListaDoble.printMesa(Integer.toString(mesaNumero))));
                    if (Integer.toString(ListaDoble.getCantidadPedido(Integer.toString(mesaNumero), opc)).equals("0")) {
                        JOptionPane.showMessageDialog(null, "Orden no valida");
                    } else {
                        frmEditarPedido editar = new frmEditarPedido(opc, mesaNumero);
                        editar.setVisible(true);
                        this.dispose();
                    }

                } catch (HeadlessException | NumberFormatException e) {

                }

            } else if (respuesta == 1) {
                try {
                    int opc = Integer.parseInt(JOptionPane.showInputDialog(null, ListaDoble.printMesa(Integer.toString(mesaNumero))));

                    if (Integer.toString(ListaDoble.getCantidadPedido(Integer.toString(mesaNumero), opc)).equals("0")) {
                        JOptionPane.showMessageDialog(null, "Orden no valida");
                    } else {
                        int valor = JOptionPane.showConfirmDialog(this, "¿Desea eliminar el pedido?\n" + ListaDoble.printPedidoEspecifico(Integer.toString(mesaNumero), opc), "CONFIRMACION", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                        if (valor == JOptionPane.YES_OPTION) {
                            ListaDoble.eliminaOrden(opc, Integer.toString(mesaNumero));
                            JOptionPane.showMessageDialog(null, "Orden eliminada correctamente");
                        }
                    }
                } catch (HeadlessException | NumberFormatException e) {
                }

            }

        } else {
            JOptionPane.showMessageDialog(null, "Esta mesa se encuentra libre", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_mesaLabel6MouseClicked

    private void mesaLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesaLabel7MouseClicked
        // TODO add your handling code here:
        int mesaNumero = 7;
        if (ListaSimple.buscaMesas(mesaNumero) == 0) {
            JOptionPane.showMessageDialog(null, "Mesa no disponible");
        } else if (ListaSimple.buscaState(mesaNumero).equals("Ocupada")) {
            JOptionPane.showMessageDialog(null, ListaDoble.printMesaCompleta(Integer.toString(mesaNumero)));
            String[] opciones = new String[]{"Editar", "Eliminar"};
            int respuesta = JOptionPane.showOptionDialog(null, "Seleccione la opcion que desea realizar:", "Opciones",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
            if (respuesta == 0) {
                try {
                    int opc = Integer.parseInt(JOptionPane.showInputDialog(null, ListaDoble.printMesa(Integer.toString(mesaNumero))));

                    if (Integer.toString(ListaDoble.getCantidadPedido(Integer.toString(mesaNumero), opc)).equals("0")) {
                        JOptionPane.showMessageDialog(null, "Orden no valida");
                    } else {
                        frmEditarPedido editar = new frmEditarPedido(opc, mesaNumero);
                        editar.setVisible(true);
                        this.dispose();
                    }

                } catch (HeadlessException | NumberFormatException e) {

                }

            } else if (respuesta == 1) {
                try {
                    int opc = Integer.parseInt(JOptionPane.showInputDialog(null, ListaDoble.printMesa(Integer.toString(mesaNumero))));

                    if (Integer.toString(ListaDoble.getCantidadPedido(Integer.toString(mesaNumero), opc)).equals("0")) {
                        JOptionPane.showMessageDialog(null, "Orden no valida");
                    } else {
                        int valor = JOptionPane.showConfirmDialog(this, "¿Desea eliminar el pedido?\n" + ListaDoble.printPedidoEspecifico(Integer.toString(mesaNumero), opc), "CONFIRMACION", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                        if (valor == JOptionPane.YES_OPTION) {
                            ListaDoble.eliminaOrden(opc, Integer.toString(mesaNumero));
                            JOptionPane.showMessageDialog(null, "Orden eliminada correctamente");
                        }
                    }
                } catch (HeadlessException | NumberFormatException e) {
                }

            }

        } else {
            JOptionPane.showMessageDialog(null, "Esta mesa se encuentra libre", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_mesaLabel7MouseClicked

    private void mesaLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesaLabel8MouseClicked
        // TODO add your handling code here:
        int mesaNumero = 8;

        if (ListaSimple.buscaMesas(mesaNumero) == 0) {
            JOptionPane.showMessageDialog(null, "Mesa no disponible");
        } else if (ListaSimple.buscaState(mesaNumero).equals("Ocupada")) {
            JOptionPane.showMessageDialog(null, ListaDoble.printMesaCompleta(Integer.toString(mesaNumero)));
            String[] opciones = new String[]{"Editar", "Eliminar"};
            int respuesta = JOptionPane.showOptionDialog(null, "Seleccione la opcion que desea realizar:", "Opciones",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
            if (respuesta == 0) {
                try {
                    int opc = Integer.parseInt(JOptionPane.showInputDialog(null, ListaDoble.printMesa(Integer.toString(mesaNumero))));

                    if (Integer.toString(ListaDoble.getCantidadPedido(Integer.toString(mesaNumero), opc)).equals("0")) {
                        JOptionPane.showMessageDialog(null, "Orden no valida");
                    } else {
                        frmEditarPedido editar = new frmEditarPedido(opc, mesaNumero);
                        editar.setVisible(true);
                        this.dispose();
                    }

                } catch (HeadlessException | NumberFormatException e) {

                }

            } else if (respuesta == 1) {
                try {
                    int opc = Integer.parseInt(JOptionPane.showInputDialog(null, ListaDoble.printMesa(Integer.toString(mesaNumero))));
                    if (Integer.toString(ListaDoble.getCantidadPedido(Integer.toString(mesaNumero), opc)).equals("0")) {
                        JOptionPane.showMessageDialog(null, "Orden no valida");
                    } else {
                        int valor = JOptionPane.showConfirmDialog(this, "¿Desea eliminar el pedido?\n" + ListaDoble.printPedidoEspecifico(Integer.toString(mesaNumero), opc), "CONFIRMACION", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                        if (valor == JOptionPane.YES_OPTION) {
                            ListaDoble.eliminaOrden(opc, Integer.toString(mesaNumero));
                            JOptionPane.showMessageDialog(null, "Orden eliminada correctamente");
                        }
                    }
                } catch (HeadlessException | NumberFormatException e) {
                }

            }

        } else {
            JOptionPane.showMessageDialog(null, "Esta mesa se encuentra libre", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_mesaLabel8MouseClicked

    private void mesaLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesaLabel9MouseClicked
        // TODO add your handling code here:
        int mesaNumero = 9;

        if (ListaSimple.buscaMesas(mesaNumero) == 0) {
            JOptionPane.showMessageDialog(null, "Mesa no disponible");
        } else if (ListaSimple.buscaState(mesaNumero).equals("Ocupada")) {

            JOptionPane.showMessageDialog(null, ListaDoble.printMesaCompleta(Integer.toString(mesaNumero)));
            String[] opciones = new String[]{"Editar", "Eliminar"};
            int respuesta = JOptionPane.showOptionDialog(null, "Seleccione la opcion que desea realizar:", "Opciones",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
            if (respuesta == 0) {
                try {
                    int opc = Integer.parseInt(JOptionPane.showInputDialog(null, ListaDoble.printMesa(Integer.toString(mesaNumero))));
                    if (Integer.toString(ListaDoble.getCantidadPedido(Integer.toString(mesaNumero), opc)).equals("0")) {
                        JOptionPane.showMessageDialog(null, "Orden no valida");
                    } else {
                        frmEditarPedido editar = new frmEditarPedido(opc, mesaNumero);
                        editar.setVisible(true);
                        this.dispose();
                    }
                } catch (HeadlessException | NumberFormatException e) {

                }

            } else if (respuesta == 1) {
                try {
                    int opc = Integer.parseInt(JOptionPane.showInputDialog(null, ListaDoble.printMesa(Integer.toString(mesaNumero))));
                    if (Integer.toString(ListaDoble.getCantidadPedido(Integer.toString(mesaNumero), opc)).equals("0")) {
                        JOptionPane.showMessageDialog(null, "Orden no valida");
                    } else {
                        int valor = JOptionPane.showConfirmDialog(this, "¿Desea eliminar el pedido?\n" + ListaDoble.printPedidoEspecifico(Integer.toString(mesaNumero), opc), "CONFIRMACION", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                        if (valor == JOptionPane.YES_OPTION) {
                            ListaDoble.eliminaOrden(opc, Integer.toString(mesaNumero));
                            JOptionPane.showMessageDialog(null, "Orden eliminada correctamente");
                        }
                    }
                } catch (HeadlessException | NumberFormatException e) {
                }

            }
        } else {
            JOptionPane.showMessageDialog(null, "Esta mesa se encuentra libre", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_mesaLabel9MouseClicked

    
    //navega a la ventana de menu
    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        // TODO add your handling code here:
        frmMenuAdm inicio = new frmMenuAdm();
        inicio.setVisible(true);
        this.dispose();


    }//GEN-LAST:event_btnSalirMouseClicked

    
    //navega a la ventana de inicio
    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        // TODO add your handling code here:
        frmMenuAdm inicio = new frmMenuAdm();
        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    
    //permite agregar o elimanr mesas
    //para eliminar muestra una lista en la cual valida cuales mesas tienen clientes
    //para agregar valida la cantidad de mesas existentes
    private void btnEditarMesasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMesasMouseClicked
        // TODO add your handling code here:

        String[] opciones = new String[]{"Agregar", "Eliminar"};
        int respuesta = JOptionPane.showOptionDialog(null, "Seleccione la opcion que desea realizar:", "Opciones",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
        if (respuesta == 0) {
            try {
                int totalMesas = ListaSimple.cuentaMesas();
                if (totalMesas > 9) {
                    JOptionPane.showMessageDialog(null, "Ya se tiene el maximo de mesas\nNo puede agregar mas!", "Error", JOptionPane.ERROR_MESSAGE);

                } else {
                    int numero = 0;
                    for (int i = 1; i < 10; i++) {
                        if (ListaSimple.buscaMesas(i) == 0) {
                            numero = i;
                            i = 10;
                        }
                    }
                    ListaSimple.inserta(new Mesa(numero, "Libre"));
                    JOptionPane.showMessageDialog(null, "Mesa #" + numero + " creada con exito!");
                }

            } catch (HeadlessException | NumberFormatException e) {

            }

        } else if (respuesta == 1) {
            try {
                int opc = Integer.parseInt(JOptionPane.showInputDialog(null, ListaSimple.printMesasLibresaEliminar()));
                if (ListaSimple.validaMesasLibresaEliminar(opc) == 0) {
                    JOptionPane.showMessageDialog(null, "Valor no permitido a eliminar");
                } else {
                    ListaSimple.elimina(opc);
                    JOptionPane.showMessageDialog(null, "Mesa #" + opc + " eliminada con exito!");
                }

            } catch (HeadlessException | NumberFormatException e) {
            }

        }

        estadoDeMesas();
    }//GEN-LAST:event_btnEditarMesasMouseClicked

    
    //cierra todo
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
        } catch (HeadlessException | NumberFormatException e) {
        }
    }

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
            java.util.logging.Logger.getLogger(frmListaMesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
            new frmListaMesas().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JLabel btnEditarMesas;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
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
