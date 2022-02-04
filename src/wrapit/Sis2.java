package wrapit;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Sis2 extends javax.swing.JFrame {

    //ESTE ES EL COMPRIMIDO wrapit(3), solo Ciclos2 normal
    public Sis2() {
       
        initComponents();
        setSize(500, 746);
        setTitle("Wrap It");
        setLocationRelativeTo(null);}

    
    public Tiempos2 t = new Tiempos2();
    public Ciclos2  c;
    public Regalos2 reg;
   
    public boolean stop;
    
    public int cuentacc = 0;
    public int cuentacm = 0;
    public int cuentacg = 0;
    public int cuentapa = 0;
    public int cuentaci = 0;
    public int cuentamo = 0;
    public int cuentata = 0;
    
    public JButton biniciar;
   
    public boolean e;
   
    Ciclos2 eservice;
    
//DIRECTO DESDE CICLOS:---------------------------------------    
     //regalos pedidos
    public int rC,rM,rG;
    //recursos sobrantes
    public int cuentacc2, cuentacm2, cuentacg2,cuentapa2,cuentaci2,cuentamo2,cuentata2;
    //recursos usados
    int cantRC, cantRM, cantRG, cantCC, cantCM, cantCG, cantPA, cantCI, cantMO, cantTA;
    //tiempos totales
    double tiempoChico;  
    double tiempoMediano;
    double tiempoGrande;
    double tiempoSim;
//-----------------------------------------------------------    
   
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cajac = new javax.swing.JButton();
        cajam = new javax.swing.JButton();
        cajag = new javax.swing.JButton();
        papel = new javax.swing.JButton();
        cinta = new javax.swing.JButton();
        moño = new javax.swing.JButton();
        tarjeta = new javax.swing.JButton();
        binicio = new javax.swing.JButton();
        breiniciar = new javax.swing.JButton();
        monita = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        bdetener = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        monito = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        act2 = new javax.swing.JLabel();
        act1 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        listo1 = new javax.swing.JLabel();
        listo2 = new javax.swing.JLabel();
        listoDos = new javax.swing.JLabel();
        listoUno = new javax.swing.JLabel();
        ccinta = new javax.swing.JLabel();
        ccajac = new javax.swing.JLabel();
        cpapel = new javax.swing.JLabel();
        ccajam = new javax.swing.JLabel();
        ccajag = new javax.swing.JLabel();
        cmoño = new javax.swing.JLabel();
        ctarjeta = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 800));
        setResizable(false);
        getContentPane().setLayout(null);

        cajac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boxchica.png"))); // NOI18N
        cajac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajacActionPerformed(evt);
            }
        });
        getContentPane().add(cajac);
        cajac.setBounds(50, 420, 50, 50);

        cajam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boxmed.png"))); // NOI18N
        cajam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajamActionPerformed(evt);
            }
        });
        getContentPane().add(cajam);
        cajam.setBounds(110, 420, 50, 50);

        cajag.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/box.png"))); // NOI18N
        cajag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajagActionPerformed(evt);
            }
        });
        getContentPane().add(cajag);
        cajag.setBounds(170, 420, 50, 50);

        papel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gift-wrapping.png"))); // NOI18N
        papel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                papelActionPerformed(evt);
            }
        });
        getContentPane().add(papel);
        papel.setBounds(230, 420, 50, 50);

        cinta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tape.png"))); // NOI18N
        cinta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cintaActionPerformed(evt);
            }
        });
        getContentPane().add(cinta);
        cinta.setBounds(290, 420, 50, 50);

        moño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ribbon.png"))); // NOI18N
        moño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moñoActionPerformed(evt);
            }
        });
        getContentPane().add(moño);
        moño.setBounds(350, 420, 50, 50);

        tarjeta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/invitation.png"))); // NOI18N
        tarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tarjetaActionPerformed(evt);
            }
        });
        getContentPane().add(tarjeta);
        tarjeta.setBounds(410, 420, 50, 50);

        binicio.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        binicio.setText("INICIO");
        binicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                binicioActionPerformed(evt);
            }
        });
        getContentPane().add(binicio);
        binicio.setBounds(60, 550, 190, 40);

        breiniciar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        breiniciar.setText("REINICIAR VALORES");
        breiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                breiniciarActionPerformed(evt);
            }
        });
        getContentPane().add(breiniciar);
        breiniciar.setBounds(270, 550, 170, 40);

        monita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/girl.png"))); // NOI18N
        monita.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        monita.setMaximumSize(new java.awt.Dimension(50, 50));
        monita.setMinimumSize(new java.awt.Dimension(50, 50));
        monita.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(monita);
        monita.setBounds(60, 120, 50, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gift-wrapping.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(130, 50, 50, 50);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/box.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(70, 50, 60, 50);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tape.png"))); // NOI18N
        jLabel6.setToolTipText("");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(190, 50, 47, 50);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ribbon.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(310, 50, 50, 50);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/invitation.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(370, 50, 40, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/wrap.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(47, 47));
        jLabel1.setMinimumSize(new java.awt.Dimension(47, 47));
        jLabel1.setPreferredSize(new java.awt.Dimension(47, 47));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(250, 50, 60, 50);

        bdetener.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        bdetener.setText("DETENER SIMULACIÓN");
        bdetener.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bdetener.setEnabled(false);
        bdetener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdetenerActionPerformed(evt);
            }
        });
        getContentPane().add(bdetener);
        bdetener.setBounds(60, 610, 190, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Recursos:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(220, 390, 90, 17);

        monito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boy.png"))); // NOI18N
        monito.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        monito.setMaximumSize(new java.awt.Dimension(50, 50));
        monito.setMinimumSize(new java.awt.Dimension(50, 50));
        monito.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(monito);
        monito.setBounds(60, 310, 50, 50);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gift-wrapping.png"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(130, 240, 50, 50);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/box.png"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(70, 240, 60, 50);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tape.png"))); // NOI18N
        jLabel11.setToolTipText("");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(190, 240, 47, 50);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ribbon.png"))); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(310, 240, 50, 50);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/invitation.png"))); // NOI18N
        getContentPane().add(jLabel13);
        jLabel13.setBounds(370, 240, 40, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/wrap.png"))); // NOI18N
        jLabel3.setText("jLabel1");
        jLabel3.setMaximumSize(new java.awt.Dimension(47, 47));
        jLabel3.setMinimumSize(new java.awt.Dimension(47, 47));
        jLabel3.setPreferredSize(new java.awt.Dimension(47, 47));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(250, 240, 60, 50);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Usuario 2");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(70, 200, 90, 17);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Usuario 1");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(70, 10, 90, 17);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Actividad:");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(290, 220, 70, 16);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Actividad:");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(290, 30, 70, 16);

        act2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        act2.setText("...");
        getContentPane().add(act2);
        act2.setBounds(370, 220, 90, 17);

        act1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        act1.setText("...");
        getContentPane().add(act1);
        act1.setBounds(370, 30, 100, 17);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Regalos listos:");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(265, 200, 90, 16);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Regalos listos:");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(265, 10, 90, 17);
        getContentPane().add(listo1);
        listo1.setBounds(370, 10, 0, 0);
        getContentPane().add(listo2);
        listo2.setBounds(370, 200, 0, 0);

        listoDos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        listoDos.setText("0");
        getContentPane().add(listoDos);
        listoDos.setBounds(370, 200, 48, 17);

        listoUno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        listoUno.setText("0");
        getContentPane().add(listoUno);
        listoUno.setBounds(370, 10, 48, 17);

        ccinta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ccinta.setText("0");
        getContentPane().add(ccinta);
        ccinta.setBounds(310, 480, 30, 17);

        ccajac.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ccajac.setText("0");
        getContentPane().add(ccajac);
        ccajac.setBounds(70, 480, 30, 17);

        cpapel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cpapel.setText("0");
        getContentPane().add(cpapel);
        cpapel.setBounds(250, 480, 30, 17);

        ccajam.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ccajam.setText("0");
        getContentPane().add(ccajam);
        ccajam.setBounds(130, 480, 20, 16);

        ccajag.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ccajag.setText("0");
        getContentPane().add(ccajag);
        ccajag.setBounds(190, 480, 30, 17);

        cmoño.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmoño.setText("0");
        getContentPane().add(cmoño);
        cmoño.setBounds(370, 480, 20, 17);

        ctarjeta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ctarjeta.setText("0");
        getContentPane().add(ctarjeta);
        ctarjeta.setBounds(430, 480, 30, 17);

        jButton2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButton2.setText("INSTRUCCIONES");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(270, 610, 170, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void tarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tarjetaActionPerformed
        cuentata++;
        String numcc = String.valueOf(cuentata);
        ctarjeta.setText(numcc);
        
    }//GEN-LAST:event_tarjetaActionPerformed

    private void cajacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajacActionPerformed
        cuentacc++;
        String numcc = String.valueOf(cuentacc);
        ccajac.setText(numcc);

    }//GEN-LAST:event_cajacActionPerformed

    private void cajamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajamActionPerformed
        cuentacm++;
        String numcc = String.valueOf(cuentacm);
        ccajam.setText(numcc);
    }//GEN-LAST:event_cajamActionPerformed

    private void cajagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajagActionPerformed
        cuentacg++;
        String numcc = String.valueOf(cuentacg);
        ccajag.setText(numcc);
    }//GEN-LAST:event_cajagActionPerformed

    private void papelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_papelActionPerformed
        cuentapa++;
        String numcc1 = String.valueOf(cuentapa);
        cpapel.setText(numcc1);
    }//GEN-LAST:event_papelActionPerformed

    private void cintaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cintaActionPerformed
        cuentaci++;
        String numcc = String.valueOf(cuentaci);
        ccinta.setText(numcc);
    }//GEN-LAST:event_cintaActionPerformed

    private void moñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moñoActionPerformed
        cuentamo++;
        String numcc = String.valueOf(cuentamo);
        cmoño.setText(numcc);
    }//GEN-LAST:event_moñoActionPerformed

    private void breiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_breiniciarActionPerformed
       
        ccajac.setText("0");
        ccajam.setText("0");
        ccajag.setText("0");
        cpapel.setText("0");
        ccinta.setText("0");
        cmoño.setText("0");
        ctarjeta.setText("0");
       
        cuentacc = 0;
        cuentacm = 0;
        cuentacg = 0;
        cuentapa = 0;
        cuentaci = 0;
        cuentamo = 0;
        cuentata = 0;
        
        listoUno.setText("0");
        listoDos.setText("0");
        
        act1.setText("...");
        act2.setText("...");
        
        monita.setBounds(60, 120, 47,47);       
        monito.setBounds(60, 300, 47,47);       
        
       t = new Tiempos2(); 
       c = new Ciclos2();
      
    }//GEN-LAST:event_breiniciarActionPerformed

    private void binicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_binicioActionPerformed
        if (ccajac.getText().equals("0") || ccajam.getText().equals("0")
                || ccajag.getText().equals("0") || cpapel.getText().equals("0")
                || ccinta.getText().equals("0") || cmoño.getText().equals("0")
                || ctarjeta.getText().equals("0")) {
            JOptionPane.showMessageDialog(null, "Tiene que haber al menos 1 recurso de cada uno");
        } else {      
        //abres la ventana de Tiempos2        
           //t = new Tiempos2();
           //le pasas todo a Tiempos2 y de Tiempos2 a Regalos2 y de Regalos2 a Ciclos2, finally
            t.cuentacc = cuentacc;
            t.cuentacm = cuentacm;
            t.cuentacg = cuentacg;
            t.cuentapa = cuentapa;
            t.cuentaci = cuentaci;
            t.cuentamo = cuentamo;
            t.cuentata = cuentata;           
            t.monita   = monita;
            t.monito   = monito;
           
            t.ccajac   = ccajac;
            t.ccajam   = ccajam;
            t.ccajag   = ccajag;
            t.cpapel   = cpapel;
            t.ccinta   = ccinta;
            t.cmoño    = cmoño;
            t.ctarjeta = ctarjeta;
             
            t.biniciar = binicio;
            t.breiniciar = breiniciar;
            t.bdetener = bdetener;
          
        
            t.stop = stop;
            
            t.listoUno = listoUno;
            t.listoDos = listoDos;
            
            t.act1 = act1;
            t.act2 = act2;
            
            c = new Ciclos2();
            t.c = c;
            
            binicio.setEnabled(false);            
            breiniciar.setEnabled(false);
            bdetener.setEnabled(true);
           // t.setVisible(true);
        
            
             t.addWindowListener(new WindowAdapter() {
             @Override
             public void windowClosing(WindowEvent e) {
              bdetener.setEnabled(false);
              
              binicio.setEnabled(true);
              breiniciar.setEnabled(true);
              
              t = new Tiempos2();
              
             }});
              
              t.setVisible(true);
                     }
                   
        
 
 
    
        
        
    }//GEN-LAST:event_binicioActionPerformed
   
    private void bdetenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdetenerActionPerformed
       c.stopHilo();
        
    }//GEN-LAST:event_bdetenerActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     //boton instrucciones
        Inst2 in = new Inst2();
        in.setVisible(true); 
    }//GEN-LAST:event_jButton2ActionPerformed
    
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
            java.util.logging.Logger.getLogger(Sis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sis2().setVisible(true);

                
                
            }
        });
        
         
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel act1;
    private javax.swing.JLabel act2;
    private javax.swing.JButton bdetener;
    private javax.swing.JButton binicio;
    private javax.swing.JButton breiniciar;
    private javax.swing.JButton cajac;
    private javax.swing.JButton cajag;
    private javax.swing.JButton cajam;
    private javax.swing.JLabel ccajac;
    private javax.swing.JLabel ccajag;
    private javax.swing.JLabel ccajam;
    private javax.swing.JLabel ccinta;
    private javax.swing.JButton cinta;
    private javax.swing.JLabel cmoño;
    private javax.swing.JLabel cpapel;
    private javax.swing.JLabel ctarjeta;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel listo1;
    private javax.swing.JLabel listo2;
    private javax.swing.JLabel listoDos;
    private javax.swing.JLabel listoUno;
    private javax.swing.JLabel monita;
    private javax.swing.JLabel monito;
    private javax.swing.JButton moño;
    private javax.swing.JButton papel;
    private javax.swing.JButton tarjeta;
    // End of variables declaration//GEN-END:variables

    
}
