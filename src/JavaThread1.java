
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author bianchi.emmanuele
 */
public class JavaThread1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        ProcessoRunnable p1 = new ProcessoRunnable("p1");
//        Thread t1 = new Thread(p1);
//        t1.start();
//        try {
//            Thread.sleep(5000);
//            p1.stoppa();
//        } catch (InterruptedException ex) {
//            Logger.getLogger(JavaThread1.class.getName()).log(Level.SEVERE, null, ex);
//        }
        Conto c = new Conto(2000);
        sportello sport1 = new sportello(c);
        sportello sport2 = new sportello(c);
        Thread genitore1 = new Thread(sport1);
        Thread genitore2 = new Thread(sport2);
        
        
        
        try {
            genitore1.start();
            genitore2.start();
            Thread.sleep(5000);
            //System.out.println(c.saldo());
        } catch (InterruptedException ex) {
            Logger.getLogger(JavaThread1.class.getName()).log(Level.SEVERE, null, ex);
        }
////        sport1.versa(800);
////        sport2.versa(500);

        
        
    }

}
