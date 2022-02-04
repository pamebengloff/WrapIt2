package wrapit;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tiempos2 extends javax.swing.JFrame {

    boolean banderita;
    boolean numeric = true;
    boolean pase;
    public  double t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12;
    public int cuentacc, cuentacm, cuentacg,cuentapa,cuentaci,cuentamo,cuentata;
    public JLabel monita,monito, listoUno,listoDos, act1,act2;
    
    public JLabel ccajac, ccajam, ccajag,cpapel,ccinta,cmoño,ctarjeta;
    
    public boolean habilitar=false;
    public boolean stop;
    
    public Ciclos2  c;
    public Regalos2 r;
    public Tiempos2 t;
    
    public JButton bdetener;
    public JButton breiniciar;
    public JButton biniciar;
    public JButton btnRes;
    
    public String tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9,tf10,tf11,tf12;
        
     public Tiempos2() {
        initComponents();
        setTitle("Tiempos");
        setLocationRelativeTo(null);
        setSize(358, 375);
         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(737, 440));
        setMinimumSize(new java.awt.Dimension(737, 440));
        setPreferredSize(new java.awt.Dimension(0, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel1.setText("Elegir color papel/moño");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 140, -1));

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 54, -1));

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 54, -1));

        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 54, -1));

        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField4KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 54, -1));

        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField5KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 54, -1));

        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField6KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 54, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Tiempo (segundos)");
        jLabel9.setToolTipText("");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, 110, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel10.setText("Actividades");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 70, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel11.setText("Pegar tarjeta");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 70, 20));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel12.setText("Elegir caja");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 60, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel13.setText("Cortar cinta");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 70, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel14.setText("Envolver caja");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 70, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel15.setText("Pegar moño");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 70, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jButton1.setText("Aceptar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 80, 30));

        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField7KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, 54, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel2.setText("Elegir color papel/moño");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 140, 20));

        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel16.setText("Actividades");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 70, 20));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel17.setText("Pegar tarjeta");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 70, 20));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel18.setText("Elegir caja");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 60, 20));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel19.setText("Cortar cinta");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 70, 20));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel20.setText("Envolver caja");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 70, 20));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel21.setText("Pegar moño");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 70, 20));

        jLabel22.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Tiempo (segundos)");
        jLabel22.setToolTipText("");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 110, -1));

        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField8KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, 54, -1));

        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jTextField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField9KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, 54, -1));

        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        jTextField10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField10KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, 54, -1));

        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        jTextField11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField11KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, 54, -1));

        jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        jTextField12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField12KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 290, 54, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("USUARIO 2");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("USUARIO 1");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        tf1 = jTextField1.getText(); //arregloD[0]
        tf2 = jTextField2.getText(); //arregloD[1]
        tf3 = jTextField3.getText(); //arregloD[2]
        tf4 = jTextField4.getText(); //arregloD[3]
        tf5 = jTextField5.getText(); //arregloD[4]
        tf6 = jTextField6.getText(); //arregloD[5]
        
        tf7  = jTextField7.getText(); //arregloD[0]
        tf8  = jTextField8.getText(); //arregloD[1]
        tf9  = jTextField9.getText(); //arregloD[2]
        tf10 = jTextField10.getText(); //arregloD[3]
        tf11 = jTextField11.getText(); //arregloD[4]
        tf12 = jTextField12.getText(); //arregloD[5]
        
        String error= "No se aceptan caracteres, numeros negativos o espacios vacíos";
       
        if(       tf1.matches("[a-zA-Z]") || tf2.matches("[a-zA-Z]")||tf3.matches("[a-zA-Z]")
                ||tf4.matches("[a-zA-Z]") ||tf5.matches("[a-zA-Z]") ||tf6.matches("[a-zA-Z]")
                ||tf7.matches("[a-zA-Z]") ||tf8.matches("[a-zA-Z]") ||tf9.matches("[a-zA-Z]")
                ||tf10.matches("[a-zA-Z]")||tf11.matches("[a-zA-Z]")||tf12.matches("[a-zA-Z]")
                
                || tf1.isEmpty() || tf2.isEmpty() || tf3.isEmpty()
                || tf4.isEmpty() || tf5.isEmpty() || tf6.isEmpty()
                || tf7.isEmpty() || tf8.isEmpty() || tf9.isEmpty()
                || tf10.isEmpty()|| tf11.isEmpty()|| tf12.isEmpty()  ){
        //si cualquiera de los campos tiene letras o esta vacio:
            pase = false;
            JOptionPane.showMessageDialog(null,error);
            
        }
        if (   !tf1.matches("[a-zA-Z]")  && !tf2.matches("[a-zA-Z]") && !tf3.matches("[a-zA-Z]")
            && !tf4.matches("[a-zA-Z]")  && !tf5.matches("[a-zA-Z]") && !tf6.matches("[a-zA-Z]")
            && !tf7.matches("[a-zA-Z]")  && !tf8.matches("[a-zA-Z]") && !tf9.matches("[a-zA-Z]")
            && !tf10.matches("[a-zA-Z]") && !tf11.matches("[a-zA-Z]")&& !tf12.matches("[a-zA-Z]")
                 && !tf1.isEmpty()  && !tf2.isEmpty()  && !tf3.isEmpty()
                 && !tf4.isEmpty()  && !tf5.isEmpty()  && !tf6.isEmpty()
                 && !tf7.isEmpty()  && !tf8.isEmpty()  && !tf9.isEmpty()
                 && !tf10.isEmpty() && !tf11.isEmpty() && !tf12.isEmpty() ){
            
            pase = true;
           
         //que recorra los tres strings, si uno es false, todo es false  
            String[] arr = {tf1, tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9,tf10,tf11,tf12};
        for (int i = 0; i < 12; i++) {
         numeric = validarDouble(arr[i]);
         
         if(!numeric){
            pase = false;
               // System.out.println(numeric + " "+ arr[i]);
               i=12;  
              
               JOptionPane.showMessageDialog(null,error);
             banderita=true;  
         }else{//si numeric es true, siempre
             pase= true;
             
            }
        }
        //AQUÍ ABAJO DEBE IR fin if (letras o vacio):
        }
        
        
        if(pase){ //o sea, no vacio, no simbolos, solo numeros, seguimos con strings
        //aqui se convierten a Doubles
             //System.out.println("TODO BIEN");
            
         t1 = Double.parseDouble(tf1);
         t2 = Double.parseDouble(tf2);
         t3 = Double.parseDouble(tf3);
         t4 = Double.parseDouble(tf4);
         t5 = Double.parseDouble(tf5);
         t6 = Double.parseDouble(tf6);
         t7 = Double.parseDouble(tf7);
         t8 = Double.parseDouble(tf8);
         t9 = Double.parseDouble(tf9);
         t10 = Double.parseDouble(tf10);
         t11 = Double.parseDouble(tf11);
         t12 = Double.parseDouble(tf12);
         
        }//fin if
        
        //checa que los Doubles sean mayores a 0 (positivos)
        //si son menores, pase es false y se termina el ciclo
        Double[] num = {t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12};
        for (int i = 0; i < 12; i++) {
           if ( num[i]<=0.0) {
            pase = false;
            i=12;
         
            banderita=false;
          if(!banderita){ 
              JOptionPane.showMessageDialog(null,"Intenta otra vez." ); }
         }
        }//fin for
        
        //si son positivos, muestra la ventana
        if (pase){
           
            r = new Regalos2();
            
            r.t1 = t1;
            r.t2 = t2;
            r.t3 = t3;
            r.t4 = t4;
            r.t5 = t5;
            r.t6 = t6;
            r.t7 = t7;
            r.t8 = t8;
            r.t9 = t9;
            r.t10 = t10;
            r.t11 = t11;
            r.t12 = t12;
            
            r.cuentacc = cuentacc;
            r.cuentacm = cuentacm;
            r.cuentacg = cuentacg;
            r.cuentapa = cuentapa;
            r.cuentaci = cuentaci;
            r.cuentamo = cuentamo;
            r.cuentata = cuentata;
            r.monita   = monita;
            r.monito   = monito;
           
            r.ccajac   = ccajac;
            r.ccajam   = ccajam;
            r.ccajag   = ccajag;
            r.cpapel   = cpapel;
            r.ccinta   = ccinta;
            r.cmoño    = cmoño;
            r.ctarjeta = ctarjeta;
            r.stop     = stop;
            
            r.bdetener = bdetener;
            r.breiniciar = breiniciar;
            r.biniciar = biniciar;
            r.btnRes   = btnRes;
            
            r.listoUno = listoUno;
            r.listoDos = listoDos;
            r.act1 = act1;
            r.act2 = act2;
            
            r.c = c;
            
        //    r.ccajac = ccajac;
       //     r.pruebapapel = pruebapapel;
            
            r.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
             bdetener.setEnabled(false);
             biniciar.setEnabled(true);
             breiniciar.setEnabled(true);
             
             r = new Regalos2();
           
            }});
             
             r.setVisible(true);
            this.setVisible(false);
             
        }
    
   
   
        
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        int a = evt.getKeyCode();
        if (a == 10) {                     // for enter key
            jTextField2.requestFocus();
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        int a = evt.getKeyCode();
        if (a == 10) {                     // for enter key
            jTextField3.requestFocus();
        }
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
        int a = evt.getKeyCode();
        if (a == 10) {                     // for enter key
            jTextField4.requestFocus();
        }
    }//GEN-LAST:event_jTextField3KeyPressed

    private void jTextField4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyPressed
        int a = evt.getKeyCode();
        if (a == 10) {                     // for enter key
            jTextField5.requestFocus();
        }
    }//GEN-LAST:event_jTextField4KeyPressed

    private void jTextField5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyPressed
        int a = evt.getKeyCode();
        if (a == 10) {                     // for enter key
            jTextField6.requestFocus();
        }
    }//GEN-LAST:event_jTextField5KeyPressed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyPressed
         int a = evt.getKeyCode();
        if (a == 10) {                     // for enter key
            jTextField8.requestFocus();
        }
    }//GEN-LAST:event_jTextField7KeyPressed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyPressed
         int a = evt.getKeyCode();
        if (a == 10) {                     // for enter key
            jTextField9.requestFocus();
        }
    }//GEN-LAST:event_jTextField8KeyPressed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyPressed
       int a = evt.getKeyCode();
        if (a == 10) {                     // for enter key
            jTextField10.requestFocus();
        }
    }//GEN-LAST:event_jTextField9KeyPressed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField10KeyPressed
        int a = evt.getKeyCode();
        if (a == 10) {                     // for enter key
            jTextField11.requestFocus();
        }
    }//GEN-LAST:event_jTextField10KeyPressed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField11KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField11KeyPressed
        int a = evt.getKeyCode();
        if (a == 10) {                     // for enter key
            jTextField12.requestFocus();
        }
    }//GEN-LAST:event_jTextField11KeyPressed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jTextField12KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField12KeyPressed
      
    }//GEN-LAST:event_jTextField12KeyPressed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyPressed
        int a = evt.getKeyCode();
        if (a == 10) {                     // for enter key
            jTextField7.requestFocus();
        }
    }//GEN-LAST:event_jTextField6KeyPressed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
          
    }//GEN-LAST:event_jButton1KeyPressed
                                        
    /**
     * @param args the command line arguments
     */
    
    public boolean validarDouble(String str) {
    try {
      double numero1 = Double.parseDouble(str);
      
    } catch(Exception e) {
      return false;
    }
    return true;
  }
       
    
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
            java.util.logging.Logger.getLogger(Tiempos2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tiempos2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tiempos2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tiempos2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

             
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            
            public void run() {
                new Tiempos2().setVisible(true);
              
            }
     
        });
    
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
