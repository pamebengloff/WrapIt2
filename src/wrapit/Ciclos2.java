package wrapit;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.util.concurrent.*;

public class Ciclos2{
  
    //variables receptoras de las clases de Tiempos2 y Regalos2
    public JLabel monita,monito, listoUno,listoDos, act1,act2;
  //  Thread hilo;
    
    public JLabel ccajac, cpapel,ccinta,ctarjeta, ccajam, ccajag, cmoño;
    
    public boolean stop = false;
    public boolean stop1=false;
    public boolean stop2=false;
    
    public JButton breiniciar;
    public JButton biniciar;
    public JButton bdetener;
    public JButton btnRes;
    
    int i,j,k,a,b,c;
    //tiempos por actividad: 
    double t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12;
    //regalos pedidos:
    public int rC,rM,rG;
    //recursos sobrantes:
    public int cuentacc, cuentacm, cuentacg,cuentapa,cuentaci,cuentamo,cuentata;

    
    //NO SEEE si se tienen que igualar a sus respectivos recursos:
    public int cuentacc1, cuentacm1, cuentacg1,cuentapa1,cuentaci1,cuentamo1,cuentata1;
    public int cuentacc2, cuentacm2, cuentacg2,cuentapa2,cuentaci2,cuentamo2,cuentata2;

    
    
    
//recursos usados;
    int cantRM, cantRG, cantCM, cantCG, cantPA, cantCI, cantMO, cantTA =0;
    int cantRC=0;
    int cantCC=0;
    int cantCC1, cantCC2, cantCM1,cantCM2, cantCG1, cantCG2, cantPA1, cantCI1, cantMO1, cantTA1, cantPA2, cantCI2, cantMO2, cantTA2=0;
    int cantRC1=0;
    int cantRC2=0;
    int cantRM1=0;
    int cantRM2=0;
    int cantRG1=0;
    int cantRG2=0;
    //tiempos totales:
    double tiempoChico1, tiempoMediano1,tiempoGrande1,tiempoSim1;  
    double tiempoChico2, tiempoMediano2,tiempoGrande2,tiempoSim2;  
    double tiempoTotal;
    
    public Sis2 s = new Sis2();
    public Regalos2 reg;
    public Tiempos2 t;
    public Res2 res;
    public int totalcantRC;
    public int totalcantRM1, totalcantRM2;
    public int totalcantRG1, totalcantRG2;
    
    
    
   public void myExecute(){
    ExecutorService user = Executors.newFixedThreadPool(2);   
           user.execute(()->  primero());//1 thread
           user.execute(()->  segundo());//2 thread
          
           user.shutdown();
   }           

    
   private void primero(){  
//CICLO REGALOS CHICOS:       
    if(rC >0){
      if(cuentacc >= 1 && cuentapa >= 1 && cuentaci >= 12 && cuentamo >= 1 && cuentata >=1){ //si sí hay regalos chicos que hacer
        for (i = 0; i < rC ; i++) {//cada n veces se ciclará, depende de cuanto tenga cuentacc
 
    int x = 0; 
    
    //sus propios tiempos
    int timeCaja1     = (int)(t1 * 1000);
    int timePapel1    = (int)(t2 * 1000);
    int timeCinta1    = (int)(t3 * 1000);
    int timeEnvolver1 = (int)(t4 * 1000);
    int timeMoño1     = (int)(t5 * 1000);
    int timeTarjeta1  = (int)(t6 * 1000);
            
//caja CHICA--------------------------------------------  
    if(cuentacc <=0 ||  cantRC1 == rC || cantRC2 == rC){
      //  System.out.println("ya no hay cajas chicas, o ya se hicieron todos los regalos chicos");
        stop1=true; 
        try { synchronized(this) { if(stop1) {  break; } } } catch(Exception e) {}
    }//end if chiquitito    
      
    if (cantCC == rC){ //para que no se vaya de paso si hay mas cajasc que rC
        stop1=true;
        try { synchronized(this) { if(stop1) {   break; } } } catch(Exception e) {}
    }//end if chiquito
    
    cuentacc -= 1;     
    cantCC ++; 
    cantCC1++;
    try { Thread.sleep(timeCaja1); } catch(Exception e) {}
    try { synchronized(this) { if(stop) { break; } } } catch(Exception e) {}  
    x += 60;
    monita.setBounds(x, 120, 47,47);
    String num1 = String.valueOf(cuentacc);
    ccajac.setText(num1);
    act1.setText("Elegir caja"); 
  
    
//papel--------------------------------------------      
    if(cuentapa <1){
          //System.out.println("no hay suficiente papel, chico, user1");
         stop1=true;  
         try { synchronized(this) { if(stop1) {   break; } } } catch(Exception e) {}
    }//end if chiquito
    cuentapa -=1;
    cantPA++;
    cantPA1++;
       try{Thread.sleep(timePapel1);  }catch(Exception e){}
       try { synchronized(this) { if(stop) {  break; } } } catch(Exception e) {}
       x += 60;
       monita.setBounds(x, 120, 47,47);
       String num2 = String.valueOf(cuentapa);
       cpapel.setText(num2);
      act1.setText("Elegir papel"); 
            
       
        
//cinta--------------------------------------------
        if(cuentaci <12){
        //    System.out.println("fin de la simulacion, se acabaron los recursos para user2 regalos chicos, sobrantes");
            stop1=true;  
            try { synchronized(this) { if(stop1) { break; } } } catch(Exception e) {}
        }//end if chiquitito  
        
      cuentaci -=12;
      cantCI +=12;
      cantCI1 +=12;
      try{Thread.sleep(timeCinta1);  }catch(Exception e){}
      try { synchronized(this) { if(stop) {  break; } } } catch(Exception e) {}
      x += 60;
      monita.setBounds(x, 120, 47,47);
      String num3 = String.valueOf(cuentaci);
      ccinta.setText(num3);
      act1.setText("Cortar cinta"); 
     
//tiempo para envolver, esto no tiene recurso al cual restarle 1--------------------------------------------
       try{Thread.sleep(timeEnvolver1);  }catch(Exception e){}
       try { synchronized(this) { if(stop) {  break; } } } catch(Exception e) {}
       x += 60;
       act1.setText("Envolver caja"); 
       monita.setBounds(x, 120, 47,47);
       
//moño--------------------------------------------
     if(cuentamo <1){
        //  System.out.println("fin de la simulacion, se acabaron los recursos para user1 regalos chicos, sobrantes");
         stop1=true;  
         try { synchronized(this) { if(stop1) {   break; } } } catch(Exception e) {}
     }//end if chiquito
       
       cuentamo -=1;
       cantMO++;
       cantMO1++;
       try{Thread.sleep(timeMoño1);  }catch(Exception e){}
       try { synchronized(this) { if(stop) {   break; } } } catch(Exception e) {}
       x += 60;
       monita.setBounds(x, 120, 47,47);
       String num4 = String.valueOf(cuentamo);
       cmoño.setText(num4);
       act1.setText("Colocar moño"); 
        
        
//tarjeta--------------------------------------------
    if(cuentata <1){
       // System.out.println("fin de la simulacion, se acabaron los recursos para user1 regalos chicos, sobrantes");
        stop1=true;  
        try { synchronized(this) { if(stop1) {   break; } } } catch(Exception e) {}
    }//end if chiquito
       
       cuentata -=1;
       cantTA ++;
       cantTA1 ++;
       try{Thread.sleep(timeTarjeta1);  }catch(Exception e){}
       try { synchronized(this) { if(stop) { break; } } } catch(Exception e) {}
       x += 60;
       monita.setBounds(x, 120, 47,47);
       String num5 = String.valueOf(cuentata);
       ctarjeta.setText(num5);
       act1.setText("Colocar tarjeta"); 
       
//REGALO CHICO COMPLETADO----------------------------------------------------          
       cantRC1++;
       String num11 = String.valueOf(cantRC1);
       listoUno.setText(num11);
      
       totalcantRC = cantRC1+cantRC2;
  //     System.out.println("total cantRC en u1: "+ totalcantRC);
       
        if (totalcantRC == rC){ //si los regalos hechos es igual a la cantidad de pedidos, termina la simulacion
      //      System.out.println("fin user1, regalos pedidos y recursos usados "    );
              i=rC; 
              a=rC; 
        }//end if
       
       //si cualquiera de los recursos es 0, termina el ciclo:
        if(cuentacc == 0 || cuentapa == 0 || cuentaci < 12 || cuentamo ==0 || cuentata==0){
           stop1=true;  
            try { synchronized(this) { if(stop1) {  break; } } } catch(Exception e) {} 
        //    System.out.println("fin de la simulacion, se acabaron los recursos para user1 regalos chicos, sobrantes");
        // i=rC; 
         a=rC; 
        }//end if
      
       } //end for rC 
    }//end if regalos chicos y sus recursos
    else{
      
         //       System.out.println("user1 cantidad de recursos insuficiente para Regalos2 chicos");
       }//end else regalos chicos y sus recursos
    
}// end rC>0
    
    
    //REGALOS MEDIANOS user1--------------------------------------------------------------------
  if(rM >0)   {
    if(cuentacm >= 1 && cuentapa >= 1 && cuentaci >= 12 && cuentamo >= 1 && cuentata >=1){
        //cada n veces se ciclará, depende de cuanto tenga cuentacc
       for (j = 0; j < rM ; j++) {
          
          int x = 0; 
      
        int timeCaja1     = (int)(t1 * 1000);
        int timePapel1    = (int)(t2 * 1000);
        int timeCinta1    = (int)(t3 * 1000);
        int timeEnvolver1 = (int)(t4 * 1000);
        int timeMoño1     = (int)(t5 * 1000);
        int timeTarjeta1  = (int)(t6 * 1000);
          
   //    stop = false;
            
//caja MEDIANA-----------------------------------------------------
   
    if(cuentacm <=0 ||  cantRM1 == rM || cantRM2 == rM){
    //    System.out.println("fin de la simulacion, ya no hay cajas medianas o ya se hicieron todos los regalos medianos");
        stop1=true;  
        try { synchronized(this) { if(stop1) {  break; } } } catch(Exception e) {}
       
    }//end if chiquitito    
      
    if (cantCM == rM){ //para que no se vaya de paso si hay mas cajasc que rC
        stop1=true; 
        try { synchronized(this) { if(stop1) {   break; } } } catch(Exception e) {}
      //  System.out.println("cantCM es igual a rM, stop itttt");
    }//end if chiquito
               
       cuentacm -= 1;
       cantCM ++;
       cantCM1 ++;
       try{Thread.sleep(timeCaja1);  }catch(Exception e){}
       try { synchronized(this) { if(stop) {break; } } } catch(Exception e) {}
       x += 60;
       monita.setBounds(x, 120, 47,47);
       String num1 = String.valueOf(cuentacm);
       ccajam.setText(num1); 
       act1.setText("Elegir caja"); 
            
//papel--------------------------------------------
    if(cuentapa <1){
      //  System.out.println("fin de la simulacion, se acabaron los recursos para user1 regalos medianos, sobrantes");
        stop1=true;  
        try { synchronized(this) { if(stop1) {   break; } } } catch(Exception e) {}
    }//end if chiquito
       
       cuentapa -=1;
       cantPA++;
       cantPA1++;
       try{Thread.sleep(timePapel1);  }catch(Exception e){}
       try { synchronized(this) { if(stop) {break; } } } catch(Exception e) {}
       x += 60;
       monita.setBounds(x, 120, 47,47);
       String num2 = String.valueOf(cuentapa);
       cpapel.setText(num2);
       act1.setText("Elegir papel"); 
       
 //cinta--------------------------------------------
    if(cuentaci <12){
     //   System.out.println("fin de la simulacion, se acabaron los recursos para user2 regalos chicos, sobrantes");
        stop1=true;  
        try { synchronized(this) { if(stop1) { break; } } } catch(Exception e) {}
    }//end if chiquitito  
       
       cuentaci -=12;
       cantCI +=12;
       cantCI1 +=12;
       try{Thread.sleep(timeCinta1);  }catch(Exception e){}
       try { synchronized(this) { if(stop) { break; } } } catch(Exception e) {}
       x += 60;
       monita.setBounds(x, 120, 47,47);
       String num3 = String.valueOf(cuentaci);
       ccinta.setText(num3);
       act1.setText("Cortar cinta"); 
       
//tiempo para envolver, esto no tiene recurso al cual restarle 1--------------------------------------------
       try{Thread.sleep(timeEnvolver1);  }catch(Exception e){}
       try { synchronized(this) { if(stop) { break; } } } catch(Exception e) {}
       x += 60;
       monita.setBounds(x, 120, 47,47);
       act1.setText("Envolver caja"); 
       
//moño--------------------------------------------
    if(cuentamo <1){
    //    System.out.println("fin de la simulacion, se acabaron los recursos para user1 regalos chicos, sobrantes");
        stop1=true;  
        try { synchronized(this) { if(stop1) {   break; } } } catch(Exception e) {}
    }//end if chiquito
       
        cuentamo -=1;
        cantMO++; 
        cantMO1++; 
        try{Thread.sleep(timeMoño1);  }catch(Exception e){}
        try { synchronized(this) { if(stop) { break; } } } catch(Exception e) {}
        x += 60;
        monita.setBounds(x, 120, 47,47);
        String num4 = String.valueOf(cuentamo);
        cmoño.setText(num4);
        act1.setText("Colocar moño"); 
        
//tarjeta--------------------------------------------
     if(cuentata <1){
      //  System.out.println("fin de la simulacion, se acabaron los recursos para user1 regalos chicos, sobrantes");
        stop1=true;  
        try { synchronized(this) { if(stop1) {   break; } } } catch(Exception e) {}
    }//end if chiquito
       
       cuentata -=1; 
       cantTA ++;
       cantTA1 ++;
       try{Thread.sleep(timeTarjeta1);  }catch(Exception e){}
       try { synchronized(this) { if(stop) { break; } } } catch(Exception e) {}
       x += 60;
       monita.setBounds(x, 120, 47,47);
       String num5 = String.valueOf(cuentata);
       ctarjeta.setText(num5);
       act1.setText("Colocar tarjeta"); 
       
//REGALO MEDIANO COMPLETADO--------------------------------------------       
            
    cantRM1 ++;
    
    totalcantRM1 = cantRC1 + cantRM1;
    String num11 = String.valueOf(totalcantRM1);
    listoUno.setText(num11);
    
    if (cantRM == rM){ // System.out.println("pedidos y recursos usados "     );
        a=rC;
        j=rM;
    }
       
//si cualquiera de los recursos es 0, termina el ciclo
    if(cuentacm == 0 || cuentapa == 0 || cuentaci < 12 || cuentamo ==0 || cuentata==0){
        stop1=true;  
        try { synchronized(this) { if(stop1) {  break; } } } catch(Exception e) {} 
       // System.out.println("fin de la simulacion, se acabaron los recursos para user1 regalos chicos, sobrantes");
        // i=rC; 
         j=rM;
         i=rC;
        }//end if
    
     }//end for mediano
    }//end if recursos mediano
     else{//System.out.println("cantidad de recursos insuficiente para regalos medianos");
     }  }//end if regalos medianos 
     else{  // System.out.println("no piden regalos medianos, sigue con el siguiente tamaño");
    } //end else

//REGALOS GRANDES user1----------------------------------------------------------------------
   if(rG >0)   {
     if(cuentacg >= 1 && cuentapa >= 2 && cuentaci >= 12 && cuentamo >= 1 && cuentata >=1){
        //cada n veces se ciclará, depende de cuanto tenga cuentacc
       for ( k = 0; k < rG ; k++) {
          
          int x = 0; 
      
        int timeCaja1     = (int)(t1 * 1000);
        int timePapel1    = (int)(t2 * 1000);
        int timeCinta1    = (int)(t3 * 1000);
        int timeEnvolver1 = (int)(t4 * 1000);
        int timeMoño1     = (int)(t5 * 1000);
        int timeTarjeta1  = (int)(t6 * 1000);
          
    //   stop = false;
            
//caja GRANDE user1 -----------------------------------------------------
    if(cuentacg <=0 ||  cantRG1 == rG || cantRG2 == rG){
      //  System.out.println("fin de la simulacion, ya no hay cajas grandes o ya se hicieron todos los regalos medianos");
        stop1=true;  
        try { synchronized(this) { if(stop1) {  break; } } } catch(Exception e) {}
        
    }//end if chiquitito    
      
    if (cantCG == rG){ //para que no se vaya de paso si hay mas cajasc que rC
        stop1=true;
        try { synchronized(this) { if(stop1) {   break; } } } catch(Exception e) {}
        
     //   System.out.println("cantCG es igual a rG, stop itttt");
    }//end if chiquito
            
       cuentacg -= 1;
       cantCG ++;
       cantCG1 ++;
       try{Thread.sleep(timeCaja1);  }catch(Exception e){} 
       try { synchronized(this) { if(stop) { break; } } } catch(Exception e) {}
       x += 60;
       monita.setBounds(x, 120, 47,47);
       String num1 = String.valueOf(cuentacg);
       ccajag.setText(num1); 
       act1.setText("Elegir caja"); 
            
//papel--------------------------------------------
    if(cuentapa <2){
       // System.out.println("fin de la simulacion, se acabaron los recursos para user1 regalos grandes, sobrantes");
        stop1=true;  
        try { synchronized(this) { if(stop1) {   break; } } } catch(Exception e) {}
    }//end if chiquito
 
       cuentapa -=2;
       cantPA +=2; 
       cantPA1 +=2;
       try{Thread.sleep(timePapel1);  }catch(Exception e){}
       try { synchronized(this) { if(stop) { break; } } } catch(Exception e) {}
       x += 60;
       monita.setBounds(x, 110, 47,47);
       String num2 = String.valueOf(cuentapa);
       cpapel.setText(num2);
       act1.setText("Elegir papel"); 
      
 //cinta--------------------------------------------
    if(cuentaci <12){
    //    System.out.println("fin de la simulacion, se acabaron los recursos para user2 regalos chicos, sobrantes");
        stop1=true;  
        try { synchronized(this) { if(stop1) { break; } } } catch(Exception e) {}
    }//end if chiquitito 
       
       cuentaci -=12;
       cantCI +=12;
       cantCI1 +=12;
       try{Thread.sleep(timeCinta1);  }catch(Exception e){}
       try { synchronized(this) { if(stop) { break; } } } catch(Exception e) {}
       x += 60;
       monita.setBounds(x, 120, 47,47);
       String num3 = String.valueOf(cuentaci);
       ccinta.setText(num3);
       act1.setText("Cortar cinta"); 
     
//tiempo para envolver, esto no tiene recurso al cual restarle 1--------------------------------------------
       try{Thread.sleep(timeEnvolver1);  }catch(Exception e){}
       try { synchronized(this) { if(stop) { break; } } } catch(Exception e) {}
       x += 60;
       monita.setBounds(x, 120, 47,47);
       act1.setText("Envolver caja"); 
       
//moño--------------------------------------------
    if(cuentamo <1){
       // System.out.println("fin de la simulacion, se acabaron los recursos para user1 regalos chicos, sobrantes");
        stop1=true;  
        try { synchronized(this) { if(stop1) {   break; } } } catch(Exception e) {}
    }//end if chiquito
        
       cuentamo -=1;
       cantMO++;
       cantMO1++;
       try{Thread.sleep(timeMoño1);  }catch(Exception e){}
       try { synchronized(this) { if(stop) { break; } } } catch(Exception e) {}
       x += 60;
       monita.setBounds(x, 120, 47,47);
       String num4 = String.valueOf(cuentamo);
       cmoño.setText(num4);
       act1.setText("Colocar moño"); 
        
//tarjeta--------------------------------------------
    if(cuentata <1){
     //   System.out.println("fin de la simulacion, se acabaron los recursos para user1 regalos chicos, sobrantes");
        stop1=true;  
        try { synchronized(this) { if(stop1) {   break; } } } catch(Exception e) {}
    }//end if chiquito
    
       cuentata -=1; 
       cantTA ++;
       cantTA1 ++;
       try{Thread.sleep(timeTarjeta1);  }catch(Exception e){}
       try { synchronized(this) { if(stop) { break; } } } catch(Exception e) {}
       x += 60;
       monita.setBounds(x, 120, 47,47);
       String num5 = String.valueOf(cuentata);
       ctarjeta.setText(num5);
       act1.setText("Colocar tarjeta"); 
       
//--------------------------------------------       
            
    cantRG1 ++;
    totalcantRG1 = cantRC1 + cantRM1+ cantRG1;
    String num11 = String.valueOf(totalcantRG1);
    listoUno.setText(num11);
   
    if (cantRG1 == rG){ //  System.out.println("regalos pedidos y recursos usados"   );
        a=rC;
        j=rM;   
        k= rG;   
       }
       
//si cualquiera de los recursos es 0, termina el ciclo
     if(cuentacg== 0 || cuentapa < 2 || cuentaci < 12 || cuentamo ==0 || cuentata==0){
        stop1=true;  
        try { synchronized(this) { if(stop1) {  break; } } } catch(Exception e) {} 
     //   System.out.println("fin de la simulacion, se acabaron los recursos para user1 regalos chicos, sobrantes");
        // i=rC; 
         j=rM;
         i=rC;
         k=rG;
        }//end if 
    
       }//end for
     }//end if recursos grande
     
     else{
      //   System.out.println("cantidad de recursos insuficiente para regalos grandes");
     }
    }//end if regalos grandes 
     else{
       //  System.out.println("no piden regalos grandes, FINALIZA EL THREAD Y LA SIMULACIÓN");
   
   }//end else
  
 cantRC = cantRC1+cantRC2;
 cantRM = cantRM1+cantRM2;
 cantRG = cantRG1+cantRG2;
  
  
  if (stop1 == true || stop ==true ||cantRC == rC|| cantRM == rM || cantRG == rG) {
        resultados1();}else{
   if ( stop ==true) {
        resultados1();}
  
  }
   
  
}//end primer thread primero()

   
private void segundo(){
   //CICLO REGALOS CHICOS:       
    if(rC >0){ //"hay regalos chicos por hacer"
      if(cuentacc >= 1 && cuentapa >= 1 && cuentaci >= 12 && cuentamo >= 1 && cuentata >=1){ //si sí hay regalos chicos que hacer
        for (a = 0; a < rC ; a++) {//cada n veces se ciclará, depende de cuanto tenga cuentacc
          
    int x = 0; 

    //sus propios tiempos
    int timeCaja2     = (int)(t7 * 1000);
    int timePapel2    = (int)(t8 * 1000);
    int timeCinta2    = (int)(t9 * 1000);
    int timeEnvolver2 = (int)(t10 * 1000);
    int timeMoño2     = (int)(t11 * 1000);
    int timeTarjeta2  = (int)(t12 * 1000);
            
//caja chica   
    
     if(cuentacc <=0 ||  cantRC1 == rC || cantRC2 == rC){
      //  System.out.println("ya no hay cajas chicas, o ya se hicieron todos los regalos chicos");
        stop2=true; 
       try { synchronized(this) { if(stop2) {  break; } } } catch(Exception e) {}
    }//end if chiquitito    
      
    if (cantCC == rC){ //para que no se vaya de paso si hay mas cajasc que rC
        stop2=true;
        try { synchronized(this) { if(stop2) {   break; } } } catch(Exception e) {}
       // System.out.println("cantCC es igual a rC, stop itttt");
    }//end if chiquito
    
    cuentacc -= 1; 
    cantCC ++; 
    cantCC2 ++; 
    try { Thread.sleep(timeCaja2); } catch(Exception e) {}
    try { synchronized(this) { if(stop) { break; } }} catch(Exception e) {}  
    x += 60;
    monito.setBounds(x, 300, 47,47);
    String num1 = String.valueOf(cuentacc);
    ccajac.setText(num1); 
    act2.setText("Elegir caja"); 
    
   
    
//papel--------------------------------------------      
    if(cuentapa <1){
     //    System.out.println("no hay suficiente papel, chico, user2");
        stop2=true;  
        try { synchronized(this) { if(stop2) {  break; } } } catch(Exception e) {}
   
    }//if chiquitito
    cuentapa -=1;
    cantPA++;
    cantPA2++;
       // System.out.println("cuentapa user2: " + cuentapa);      
       try{Thread.sleep(timePapel2);  }catch(Exception e){}
       try { synchronized(this) { if(stop) { break; } } } catch(Exception e) {}
       x += 60;
       monito.setBounds(x, 300, 47,47);
       String num2 = String.valueOf(cuentapa);
       cpapel.setText(num2);
       act2.setText("Elegir papel"); 
         
       
//cinta--------------------------------------------
        if(cuentaci <12){
           // System.out.println("fin de la simulacion, se acabaron los recursos para user2 regalos chicos, sobrantes");
            stop2=true;  
            try { synchronized(this) { if(stop2) { break; } } } catch(Exception e) {}
     
        }//end if chiquitito  
        
        cuentaci -=12;
        cantCI +=12;
        cantCI2 +=12;
        //System.out.println("cuentaci user2: " + cuentaci);
        try{Thread.sleep(timeCinta2);  }catch(Exception e){}
        try { synchronized(this) { if(stop) {  break; } } } catch(Exception e) {}
        x += 60;
        monito.setBounds(x, 300, 47,47);
        String num3 = String.valueOf(cuentaci);
        ccinta.setText(num3);
        act2.setText("Cortar cinta"); 
       
//tiempo para envolver, esto no tiene recurso al cual restarle 1--------------------------------------------
       try{Thread.sleep(timeEnvolver2);  }catch(Exception e){}
       try { synchronized(this) { if(stop) { break; } } } catch(Exception e) {}
       x += 60;
       act2.setText("Envolver caja"); 
       monito.setBounds(x, 300, 47,47);
       
//moño--------------------------------------------
    if(cuentamo <1){
       // System.out.println("fin de la simulacion, se acabaron los recursos para user1 regalos chicos, sobrantes");
        stop2=true;  
        try { synchronized(this) { if(stop2) {   break; } } } catch(Exception e) {}
    }//end if chiquito
      
        cuentamo -=1;
        cantMO++;
        cantMO2++;
        try{Thread.sleep(timeMoño2);  }catch(Exception e){}
        try { synchronized(this) { if(stop) {  break; } } } catch(Exception e) {}
        x += 60;
        monito.setBounds(x, 300, 47,47);
        String num4 = String.valueOf(cuentamo);
        cmoño.setText(num4);
        act2.setText("Colocar moño"); 
       
        
//tarjeta--------------------------------------------
       if(cuentata <1){
        //System.out.println("fin de la simulacion, se acabaron los recursos para user1 regalos chicos, sobrantes");
        stop1=true;  
        try { synchronized(this) { if(stop1) {   break; } } } catch(Exception e) {}
    }//end if chiquito
        
       cuentata -=1; 
       cantTA ++;
       cantTA2 ++;
       try{Thread.sleep(timeTarjeta2);  }catch(Exception e){}
       try { synchronized(this) { if(stop) { 
         break; } } } catch(Exception e) {}
       x += 60;
       monito.setBounds(x, 300, 47,47);
       String num5 = String.valueOf(cuentata);
       ctarjeta.setText(num5);
       act2.setText("Colocar tarjeta"); 
       
//------------------------------------------------------------------      
     
        cantRC2++;
        String num11 = String.valueOf(cantRC2);
        listoDos.setText(num11);
        
        totalcantRC = cantRC1+cantRC2;
       // System.out.println("total cantRC en u2: "+ totalcantRC);
       
        if (totalcantRC == rC){ //si los regalos hechos es igual a la cantidad de pedidos, termina la simulacion
         //   System.out.println("fin user2, regalos pedidos y recursos usados "    );
              i=rC; 
              a=rC; 
        }//end if
        //si cualquiera de los recursos es 0, termina el ciclo:
        if(cuentacc == 0 || cuentapa == 0 || cuentaci < 12  || cuentamo == 0 || cuentata ==0){
            stop2=true;  
            try { synchronized(this) { if(stop2) { break; } } } catch(Exception e) {}        
        //    System.out.println("fin de la simulacion, se acabaron los recursos para user2 regalos chicos, sobrantes");
            //i=rC; 
            a=rC; 
  //          resultados();
       }//end if chiquitito    
            
       } //end for rC

    }//end if regalos chicos y sus recursos
    else{
   //  resultados();
         //       System.out.println("user 2 cantidad de recursos insuficiente para Regalos2 chicos");
       }

   }//end if rC>0
    
//REGALOS MEDIANOS user2--------------------------------------------------------------------
     if(rM >0)   {
  //  stop = false;
   
     if(cuentacm >= 1 && cuentapa >= 1 && cuentaci >= 12 && cuentamo >= 1 && cuentata >=1){
         
        //cada n veces se ciclará, depende de cuanto tenga cuentacc
       for (b = 0; b < rM ; b++) {
          
          int x = 0; 
      
    int timeCaja2     = (int)(t7 * 1000);
    int timePapel2    = (int)(t8 * 1000);
    int timeCinta2    = (int)(t9 * 1000);
    int timeEnvolver2 = (int)(t10 * 1000);
    int timeMoño2     = (int)(t11 * 1000);
    int timeTarjeta2  = (int)(t12 * 1000);
  
//caja mediana-----------------------------------------------------
   
    if(cuentacm <=0 ||  cantRM1 == rM || cantRM2 == rM){
      //  System.out.println("fin de la simulacion, ya no hay cajas medianas o ya se hicieron todos los regalos medianos");
        stop2=true; 
        try { synchronized(this) { if(stop2) {  break; } } } catch(Exception e) {}
    }//end if chiquitito    
      
    if (cantCM == rM){ //para que no se vaya de paso si hay mas cajasc que rC
        stop2=true;  
        try { synchronized(this) { if(stop2) {   break; } } } catch(Exception e) {}
    //    System.out.println("cantCM es igual a rM, stop itttt");
    }//end if chiquito
            
       cuentacm -= 1;
       cantCM ++;
       cantCM2 ++;
       try{Thread.sleep(timeCaja2);  }catch(Exception e){}
       try { synchronized(this) { if(stop) {break; } } } catch(Exception e) {}
       x += 60;
       monito.setBounds(x, 300, 47,47);
       String num1 = String.valueOf(cuentacm);
       ccajam.setText(num1); 
       act2.setText("Elegir caja"); 
            
//papel--------------------------------------------
    if(cuentapa <1){
        //System.out.println("fin de la simulacion, se acabaron los recursos para user1 regalos chicos, sobrantes");
        stop2=true;  
        try { synchronized(this) { if(stop2) {   break; } } } catch(Exception e) {}
    }//end if chiquito
       
       cuentapa -=1;
       cantPA++;
       cantPA2++;
       try{Thread.sleep(timePapel2);  }catch(Exception e){}
       try { synchronized(this) { if(stop) {break; } } } catch(Exception e) {}
       x += 60;
       monito.setBounds(x, 300, 47,47);
       String num2 = String.valueOf(cuentapa);
       cpapel.setText(num2);
       act2.setText("Elegir papel"); 
       
 //cinta--------------------------------------------
    if(cuentaci <12){
       // System.out.println("fin de la simulacion, se acabaron los recursos para user2 regalos chicos, sobrantes");
        stop2=true;  
        try { synchronized(this) { if(stop2) { break; } } } catch(Exception e) {}
    }//end if chiquitito  
       
       cuentaci -=12;
       cantCI +=12;
       cantCI2 +=12;
       try{Thread.sleep(timeCinta2);  }catch(Exception e){}
       try { synchronized(this) { if(stop) { break; } } } catch(Exception e) {}
       x += 60;
       monito.setBounds(x, 300, 47,47);
       String num3 = String.valueOf(cuentaci);
       ccinta.setText(num3);
       act2.setText("Cortar cinta"); 
       
//tiempo para envolver, esto no tiene recurso al cual restarle 1--------------------------------------------
       try{Thread.sleep(timeEnvolver2);  }catch(Exception e){}
       try { synchronized(this) { if(stop) { break; } } } catch(Exception e) {}
       x += 60;
       monito.setBounds(x, 300, 47,47);
       act2.setText("Envolver caja"); 
       
//moño--------------------------------------------
    if(cuentamo <1){
      //  System.out.println("fin de la simulacion, se acabaron los recursos para user1 regalos chicos, sobrantes");
        stop2=true;  
        try { synchronized(this) { if(stop2) {   break; } } } catch(Exception e) {}
    }//end if chiquito
       
        cuentamo -=1;
        cantMO++; 
        cantMO2++; 
        try{Thread.sleep(timeMoño2);  }catch(Exception e){}
        try { synchronized(this) { if(stop) { break; } } } catch(Exception e) {}
        x += 60;
        monito.setBounds(x, 300, 47,47);
        String num4 = String.valueOf(cuentamo);
        cmoño.setText(num4);
        act2.setText("Colocar moño"); 
        
//tarjeta--------------------------------------------
     if(cuentata <1){
        //System.out.println("fin de la simulacion, se acabaron los recursos para user1 regalos chicos, sobrantes");
        stop2=true;  
        try { synchronized(this) { if(stop2) {   break; } } } catch(Exception e) {}
    }//end if chiquito
       
       cuentata -=1; 
       cantTA ++;
       cantTA2 ++;
       try{Thread.sleep(timeTarjeta2);  }catch(Exception e){}
       try { synchronized(this) { if(stop) { break; } } } catch(Exception e) {}
       x += 60;
       monito.setBounds(x, 300, 47,47);
       String num5 = String.valueOf(cuentata);
       ctarjeta.setText(num5);
       act2.setText("Colocar tarjeta"); 
       
//REGALO MEDIANO COMPLETADO--------------------------------------------       
    
    cantRM2++;
      
    totalcantRM2 = cantRC2 + cantRM2;  
    String num11 = String.valueOf(totalcantRM2);
    listoDos.setText(num11);
    
    if (cantRM2 == rM){ // System.out.println("pedidos y recursos usados "     );
        a=rC;
        b=rM;
    }
       
//si cualquiera de los recursos es 0, termina el ciclo
      if(cuentacm == 0 || cuentapa == 0 || cuentaci < 12  || cuentamo == 0 || cuentata ==0){
            stop2=true;  
            try { synchronized(this) { if(stop2) { break; } } } catch(Exception e) {}        
         //   System.out.println("fin de la simulacion, se acabaron los recursos para user2 regalos chicos, sobrantes");
            //i=rC; 
            a=rC; 
            b=rM;
            

       }//end if chiquitito    
            
    
     }//end for mediano
    }//end if recursos mediano
     else{//System.out.println("cantidad de recursos insuficiente para regalos medianos");
     } 
   
     
     }//end if regalos medianos 
     else{  // System.out.println("no piden regalos medianos, sigue con el siguiente tamaño");
    } //end else

//REGALOS GRANDES user2----------------------------------------------------------------------
   if(rG >0)   {
     if(cuentacg >= 1 && cuentapa >= 2 && cuentaci >= 12 && cuentamo >= 1 && cuentata >=1){
        //cada n veces se ciclará, depende de cuanto tenga cuentacc
       for ( c = 0; c < rG ; c++) {
          
          int x = 0; 
      
        int timeCaja2     = (int)(t7 * 1000);
        int timePapel2    = (int)(t8 * 1000);
        int timeCinta2    = (int)(t9 * 1000);
        int timeEnvolver2 = (int)(t10 * 1000);
        int timeMoño2     = (int)(t11 * 1000);
        int timeTarjeta2  = (int)(t12 * 1000);
          
    //   stop = false;
            
//caja GRANDE user2-----------------------------------------------------
    if(cuentacg <=0 ||  cantRG1 == rG || cantRG2 == rG){
      //  System.out.println("fin de la simulacion, ya no hay cajas grandes o ya se hicieron todos los regalos medianos");
        stop2=true;  
        try { synchronized(this) { if(stop2) {   break; } } } catch(Exception e) {}
    }//end if chiquitito    
      
    if (cantCG == rG){ //para que no se vaya de paso si hay mas cajasc que rC
        stop2=true;  
        try { synchronized(this) { if(stop2) {   break; } } } catch(Exception e) {}
       // System.out.println("cantCG es igual a rG, stop itttt");
    }//end if chiquito
            
       cuentacg -= 1;
       cantCG ++;
       cantCG2 ++;
       try{Thread.sleep(timeCaja2);  }catch(Exception e){} 
       try { synchronized(this) { if(stop) { break; } } } catch(Exception e) {}
       x += 60;
       monito.setBounds(x, 300, 47,47);
       String num1 = String.valueOf(cuentacg);
       ccajag.setText(num1); 
       act2.setText("Elegir caja"); 
            
//papel--------------------------------------------
    if(cuentapa <2){
      //  System.out.println("fin de la simulacion, se acabaron los recursos para user1 regalos grandes, sobrantes");
        stop2=true;  
        try { synchronized(this) { if(stop2) {   break; } } } catch(Exception e) {}
    }//end if chiquito
 
       cuentapa -=2;
       cantPA +=2; 
       cantPA2 +=2; 
       try{Thread.sleep(timePapel2);  }catch(Exception e){}
       try { synchronized(this) { if(stop) { break; } } } catch(Exception e) {}
       x += 60;
       monito.setBounds(x, 300, 47,47);
       String num2 = String.valueOf(cuentapa);
       cpapel.setText(num2);
       act2.setText("Elegir papel"); 
      
 //cinta--------------------------------------------
    if(cuentaci <12){
      //  System.out.println("fin de la simulacion, se acabaron los recursos para user2 regalos chicos, sobrantes");
        stop2=true;  
        try { synchronized(this) { if(stop2) { break; } } } catch(Exception e) {}
    }//end if chiquitito 
       
       cuentaci -=12;
       cantCI +=12;
       cantCI2 +=12;
       try{Thread.sleep(timeCinta2);  }catch(Exception e){}
       try { synchronized(this) { if(stop) { break; } } } catch(Exception e) {}
       x += 60;
       monito.setBounds(x, 300, 47,47);
       String num3 = String.valueOf(cuentaci);
       ccinta.setText(num3);
       act2.setText("Cortar cinta"); 
     
//tiempo para envolver, esto no tiene recurso al cual restarle 1--------------------------------------------
       try{Thread.sleep(timeEnvolver2);  }catch(Exception e){}
       try { synchronized(this) { if(stop) { break; } } } catch(Exception e) {}
       x += 60;
       monito.setBounds(x, 300, 47,47);
       act2.setText("Envolver caja"); 
       
//moño--------------------------------------------
    if(cuentamo <1){
       // System.out.println("fin de la simulacion, se acabaron los recursos para user1 regalos chicos, sobrantes");
        stop2=true;  
        try { synchronized(this) { if(stop2) {   break; } } } catch(Exception e) {}
    }//end if chiquito
        
       cuentamo -=1;
       cantMO++;
       cantMO2++;
       try{Thread.sleep(timeMoño2);  }catch(Exception e){}
       try { synchronized(this) { if(stop) { break; } } } catch(Exception e) {}
       x += 60;
       monito.setBounds(x, 300, 47,47);
       String num4 = String.valueOf(cuentamo);
       cmoño.setText(num4);
       act2.setText("Colocar moño"); 
        
//tarjeta--------------------------------------------
    if(cuentata <1){
       // System.out.println("fin de la simulacion, se acabaron los recursos para user1 regalos chicos, sobrantes");
        stop2=true;  
        try { synchronized(this) { if(stop2) {   break; } } } catch(Exception e) {}
    }//end if chiquito
    
       cuentata -=1; 
       cantTA ++;
       cantTA2 ++;
       try{Thread.sleep(timeTarjeta2);  }catch(Exception e){}
       try { synchronized(this) { if(stop) { break; } } } catch(Exception e) {}
       x += 60;
       monito.setBounds(x, 300, 47,47);
       String num5 = String.valueOf(cuentata);
       ctarjeta.setText(num5);
       act2.setText("Colocar tarjeta"); 
       
//--------------------------------------------       
            
    cantRG2 ++;
    totalcantRG2 = cantRC2 + cantRM2+ cantRG2;
    String num11 = String.valueOf(totalcantRG2);
    listoDos.setText(num11);
   
    if (cantRG2 == rG){ //  System.out.println("regalos pedidos y recursos usados"   );
        i=rC;
        j=rM;   
        k= rG;   
       }
       
//si cualquiera de los recursos es 0, termina el ciclo
     if(cuentacg== 0 || cuentapa < 2 || cuentaci < 12 || cuentamo ==0 || cuentata==0){
        stop2=true;  
        try { synchronized(this) { if(stop2) {  break; } } } catch(Exception e) {} 
      //  System.out.println("fin de la simulacion, se acabaron los recursos para user1 regalos chicos, sobrantes");
        // i=rC; 
         a=rM;
         b=rC;
         c=rG;
        }//end if 
    
    
       }//end for
     }//end if recursos grande
     
     else{
       //  System.out.println("cantidad de recursos insuficiente para regalos grandes");
     }
    }//end if regalos grandes 
     else{
       //  System.out.println("no piden regalos grandes, FINALIZA EL THREAD Y LA SIMULACIÓN");
     
  
   }//end else
     //poner en otra parte?
 cantRC = cantRC1+cantRC2;
 cantRM = cantRM1+cantRM2;
 cantRG = cantRG1+cantRG2;
 
 //si ya están completados todos los regalos pedidos, o si se para el programa, o si faltan recursos
  if (stop2 == true || stop ==true || cantRC == rC|| cantRM == rM || cantRG == rG) {
        resultados2();}else{
  if ( stop ==true) { //si solo se detiene el programa sin importar todo lo de arribita
        resultados2();}
  }

   }//end segundo thread segundo()
 
public void resultados1(){
   
     biniciar.setEnabled(false);
     breiniciar.setEnabled(true);
     bdetener.setEnabled(false);
     
        breiniciar.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent evt){
            biniciar.setEnabled(true);
            bdetener.setEnabled(false);
            }}); 
     
    tiempoChico1   = (t1+t2+t3+t4+t5+t6)*(cantRC1);
    tiempoMediano1 = (t1+t2+t3+t4+t5+t6)*(cantRM1);
    tiempoGrande1  = (t1+t2+t3+t4+t5+t6)*(cantRG1);
    tiempoSim1     = tiempoChico1+tiempoMediano1+tiempoGrande1;
 
    tiempoTotal = tiempoSim1 + tiempoSim2;
    
     JOptionPane.showMessageDialog(null ,
             "USUARIO 1 : " +"\n"+
             " "+"\n"+
             "Regalos chicos pedidos: " + rC       +"\n"+
             "Regalos medianos pedidos: " + rM       +"\n"+
             "Regalos grandes pedidos: " + rG       +"\n"+
             "Regalos chicos completados: " + cantRC1   +"\n"+
             "Regalos medianos completados: " + cantRM1   +"\n"+                           
             "Regalos grandes completados: " + cantRG1   +"\n"+
                      " "+"\n"+
                     "RECURSOS USADOS"+"\n"+
             "Cajas chicas usadas: " + cantCC1   +"\n"+
             "Cajas medianas usadas: " + cantCM1   +"\n"+
             "Cajas grandes usadas: " + cantCG1   +"\n"+
             "Papel usado: " + cantPA1   +"\n"+
             "Cinta usada: " + cantCI1   +"\n"+
             "Moños usados: " + cantMO1   +"\n"+
             "Tarjetas usadas: " + cantTA1   +"\n"+
                     " "+"\n"+
                     "RECURSOS SOBRANTES"+"\n"+
             "Cajas chicas sobrantes: " + cuentacc +"\n"+ 
             "Cajas medianas sobrantes: " + cuentacm +"\n"+
             "Cajas grandes sobrantes: " + cuentacg +"\n"+
             "Papel sobrante: " + cuentapa +"\n"+
             "Cinta sobrante: " + cuentaci +"\n"+
             "Moños sobrantes: " + cuentamo +"\n"+
             "Tarjetas sobrantes: " + cuentata +"\n"
            +" "+"\n"+ 
             "TIEMPOS TOTALES" +"\n"+
             "Tiempo envolver r. chicos: "+ tiempoChico1 +"\n"+
             "Tiempo envolver r. medianos: "+ tiempoMediano1 +"\n"+
             "Tiempo envolver r. grandes: "+ tiempoGrande1 +"\n"+
             "Tiempo total sim usuario 1: "+ tiempoSim1 +"\n"+
             "Tiempo total simulación: "+ tiempoTotal +"\n"
     ); 
    
   
 }

 public void resultados2(){
   
     biniciar.setEnabled(false);
     breiniciar.setEnabled(true);
     bdetener.setEnabled(false);
     
        breiniciar.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent evt){
            biniciar.setEnabled(true);
            bdetener.setEnabled(false);
            }}); 
    
    tiempoChico2   = (t7+t8+t9+t10+t11+t12)*(cantRC2);
    tiempoMediano2 = (t7+t8+t9+t10+t11+t12)*(cantRM2);
    tiempoGrande2  = (t7+t8+t9+t10+t11+t12)*(cantRG2);
    tiempoSim2     = tiempoChico2+tiempoMediano2+tiempoGrande2;
    
    tiempoTotal = tiempoSim1 + tiempoSim2;
    
     JOptionPane.showMessageDialog(null ,
              "USUARIO 2 : "   +"\n"+
             " "+"\n"+
             "Regalos chicos pedidos: " + rC       +"\n"+
             "Regalos medianos pedidos: " + rM       +"\n"+
             "Regalos grandes pedidos: " + rG       +"\n"+
             "Regalos chicos completados: " + cantRC2   +"\n"+
             "Regalos medianos completados: " + cantRM2   +"\n"+                           
             "Regalos grandes completados: " + cantRG2   +"\n"+
                      " "+"\n"+
                     "RECURSOS USADOS"+"\n"+
             "Cajas chicas usadas: " + cantCC2   +"\n"+
             "Cajas medianas usadas: " + cantCM2   +"\n"+
             "Cajas grandes usadas: " + cantCG2   +"\n"+
             "Papel usado: " + cantPA2   +"\n"+
             "Cinta usada: " + cantCI2   +"\n"+
             "Moños usados: " + cantMO2   +"\n"+
             "Tarjetas usadas: " + cantTA2   +"\n"+
                     " "+"\n"+
                     "RECURSOS SOBRANTES"+"\n"+
             "Cajas chicas sobrantes: " + cuentacc +"\n"+ 
             "Cajas medianas sobrantes: " + cuentacm +"\n"+
             "Cajas grandes sobrantes: " + cuentacg +"\n"+
             "Papel sobrante: " + cuentapa +"\n"+
             "Cinta sobrante: " + cuentaci +"\n"+
             "Moños sobrantes: " + cuentamo +"\n"+
             "Tarjetas sobrantes: " + cuentata +"\n"
            +" "+"\n"+ 
             "TIEMPOS TOTALES" +"\n"+
             "Tiempo envolver r. chicos: "+ tiempoChico2 +"\n"+
             "Tiempo envolver r. medianos: "+ tiempoMediano2 +"\n"+
             "Tiempo envolver r. grandes: "+ tiempoGrande2 +"\n"+
             "Tiempo total sim usuario 2: "+ tiempoSim2 +"\n"+
             "Tiempo total simulación: "+ tiempoTotal +"\n"
     ); 
    
   
 }
  
 
  public synchronized void stopHilo() {  
      stop = true;
      stop1=true;
      stop2=true;
  i =rC;
  j= rM;
  a= rC; //ESTO ES NUEVO
  k = rG;
    bdetener.setEnabled(false);
    biniciar.setEnabled(false);
    breiniciar.setEnabled(true);

    breiniciar.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent evt){
        biniciar.setEnabled(true);
        bdetener.setEnabled(false);     }});
  //System.out.println("se paró el thread");
 
  } //end stopHilo 


} //end Ciclos2
  
    

