
package Parte2;

public class Practica05 extends javax.swing.JFrame {
	
	 private javax.swing.JMenu Mconfiguracion;
	    private javax.swing.JMenu Moperacion;
	    private javax.swing.JMenu Msalir;
	    private javax.swing.JMenuItem SMcategorias;
	    private javax.swing.JMenuItem SMinsumos;
	    private javax.swing.JMenuItem SMsalida;
	    private javax.swing.JMenuBar jMenuBar1;
	   

  
    public Practica05() {
        initComponents();
    }

   
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        Moperacion = new javax.swing.JMenu();
        Mconfiguracion = new javax.swing.JMenu();
        SMcategorias = new javax.swing.JMenuItem();
        SMinsumos = new javax.swing.JMenuItem();
        Msalir = new javax.swing.JMenu();
        SMsalida = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Moperacion.setText("Operacion");
        jMenuBar1.add(Moperacion);

        Mconfiguracion.setText("Configuracion");

        SMcategorias.setText("Categorias");
        Mconfiguracion.add(SMcategorias);

        SMinsumos.setText("Insumos");
        SMinsumos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SMinsumosActionPerformed(evt);
            }
        });
        Mconfiguracion.add(SMinsumos);

        jMenuBar1.add(Mconfiguracion);

        Msalir.setText("Salir");

        SMsalida.setText("Salida");
        Msalir.add(SMsalida);

        jMenuBar1.add(Msalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }

    private void SMinsumosActionPerformed(java.awt.event.ActionEvent evt) {}
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Practica05.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Practica05.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Practica05.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Practica05.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Practica05().setVisible(true);
            }
        });
    }

   
}
