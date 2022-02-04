package wrapit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Regalos2 extends javax.swing.JFrame {

     public Regalos2() {
        initComponents();
        setTitle("Cantidad regalos");
        setLocationRelativeTo(null);
        setSize(358, 375);
    }

    //public String tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9,tf10,tf11,tf12;
   public  double t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12;
    
   public int cuentaRC = 0;
   public int cuentaRM = 0;
   public int cuentaRG = 0;
    
   public int cuentacc, cuentacm, cuentacg,cuentapa,cuentaci,cuentamo,cuentata;
    
   public JLabel ccajac,cpapel,ccinta,ctarjeta, ccajam, ccajag, cmoño;
   
   public JLabel monita,monito, listoUno,listoDos, act1,act2;
   public JButton bdetener;
   public JButton breiniciar;
   public JButton biniciar;
   public JButton btnRes;
   
   public boolean stop;
   
    int cantRC, cantRM, cantRG, cantCC, cantCM, cantCG, cantPA, cantCI, cantMO, cantTA;
    public int rC,rM,rG;
    double tiempoChico, tiempoMediano, tiempoGrande, tiempoSim; 
  
    public Ciclos2 c;
    public Tiempos2 t;
  
     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        regaloChico = new javax.swing.JButton();
        regaloMediano = new javax.swing.JButton();
        regaloGrande = new javax.swing.JButton();
        cregaloC = new javax.swing.JTextField();
        cregaloM = new javax.swing.JTextField();
        cregaloG = new javax.swing.JTextField();
        aceptarRegalos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(419, 254));
        setResizable(false);

        jLabel1.setText("¿Cuántos regalos chicos, medianos y grandes quiere?");

        regaloChico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/chica.png"))); // NOI18N
        regaloChico.setMaximumSize(new java.awt.Dimension(79, 55));
        regaloChico.setMinimumSize(new java.awt.Dimension(79, 55));
        regaloChico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regaloChicoActionPerformed(evt);
            }
        });

        regaloMediano.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mediana.png"))); // NOI18N
        regaloMediano.setMaximumSize(new java.awt.Dimension(79, 55));
        regaloMediano.setMinimumSize(new java.awt.Dimension(79, 55));
        regaloMediano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regaloMedianoctionPerformed(evt);
            }
        });

        regaloGrande.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/grande.png"))); // NOI18N
        regaloGrande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regaloGrandeActionPerformed(evt);
            }
        });

        cregaloC.setEditable(false);
        cregaloC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cregaloC.setText("0");
        cregaloC.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cregaloC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cregaloCActionPerformed(evt);
            }
        });

        cregaloM.setEditable(false);
        cregaloM.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cregaloM.setText("0");
        cregaloM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cregaloMActionPerformed(evt);
            }
        });

        cregaloG.setEditable(false);
        cregaloG.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cregaloG.setText("0");
        cregaloG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cregaloGActionPerformed(evt);
            }
        });

        aceptarRegalos.setText("Ok, iniciar simulación");
        aceptarRegalos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarRegalosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(regaloChico, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                            .addComponent(cregaloC))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(regaloMediano, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cregaloM, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(regaloGrande, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cregaloG, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(aceptarRegalos)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(regaloGrande, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(regaloMediano, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(regaloChico, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cregaloC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cregaloG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cregaloM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(aceptarRegalos)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regaloChicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regaloChicoActionPerformed
        
        cuentaRC++;
        String numcc = String.valueOf(cuentaRC);
        cregaloC.setText(numcc);
        
        
    }//GEN-LAST:event_regaloChicoActionPerformed

    private void regaloMedianoctionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regaloMedianoctionPerformed
        cuentaRM++;
        String numcc = String.valueOf(cuentaRM);
        cregaloM.setText(numcc);

    }//GEN-LAST:event_regaloMedianoctionPerformed

    private void regaloGrandeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regaloGrandeActionPerformed
        cuentaRG++;
        String numcc = String.valueOf(cuentaRG);
        cregaloG.setText(numcc);
    }//GEN-LAST:event_regaloGrandeActionPerformed

    private void cregaloCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cregaloCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cregaloCActionPerformed

    
    private void aceptarRegalosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarRegalosActionPerformed
     
        //aqui se supone que se va a iniciar a ejecutar el thread, al picar Ok
        setVisible(false);
       
        c.t1 = t1;
        c.t2 = t2;
        c.t3 = t3;
        c.t4 = t4;
        c.t5 = t5;
        c.t6 = t6;
            
        c.t7 = t7;
        c.t8 = t8;
        c.t9 = t9;
        c.t10 = t10;
        c.t11 = t11;
        c.t12 = t12;
        
        c.rC = cuentaRC;
        c.rM = cuentaRM;
        c.rG = cuentaRG;
      
        c.cuentacc = cuentacc;
        c.cuentacm = cuentacm; 
        c.cuentacg  = cuentacg;
        c.cuentapa  = cuentapa;
        c.cuentaci  = cuentaci;
        c.cuentamo  = cuentamo;
        c.cuentata  = cuentata;
       
        c.monita    = monita;
        c.monito    = monito;
        
      
        c.ccajac   = ccajac;
        c.ccajam   = ccajam;
        c.ccajag   = ccajag;
        c.cpapel   = cpapel;
        c.ccinta   = ccinta;
        c.cmoño    = cmoño;
        c.ctarjeta = ctarjeta;
        c.stop     = stop;
      
        
        c.bdetener = bdetener;
        c.breiniciar = breiniciar;
        c.biniciar = biniciar;
        c.btnRes = btnRes;
        
        c.listoUno = listoUno;
        c.listoDos = listoDos;
   
        c.act1 = act1;
        c.act2 = act2;
  
        
   //     c.iniciarHilo(c); 
   c.myExecute();
 
   
    }//GEN-LAST:event_aceptarRegalosActionPerformed

    private void cregaloGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cregaloGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cregaloGActionPerformed

    private void cregaloMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cregaloMActionPerformed
        
    }//GEN-LAST:event_cregaloMActionPerformed

   
   
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
            java.util.logging.Logger.getLogger(Regalos2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Regalos2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Regalos2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Regalos2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Regalos2().setVisible(true);
            }
        });
    
       
       
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarRegalos;
    private javax.swing.JTextField cregaloC;
    private javax.swing.JTextField cregaloG;
    private javax.swing.JTextField cregaloM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton regaloChico;
    private javax.swing.JButton regaloGrande;
    private javax.swing.JButton regaloMediano;
    // End of variables declaration//GEN-END:variables
}
