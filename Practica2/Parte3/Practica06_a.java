
package Parte3;

import javax.swing.JTextArea;


public class Practica06_a extends javax.swing.JFrame {
	
	 public javax.swing.JButton Bagregar;
	    public javax.swing.JButton Beliminar;
	    public javax.swing.JButton Bsalir;
	    public javax.swing.JComboBox<String> ComboCategoria;
	    public javax.swing.JPanel Panel;
	    public javax.swing.JTextField Tid;
	    public javax.swing.JTextField Tinsumo;
	    public javax.swing.JTextArea areaProductos;
	    private javax.swing.JLabel jLabel1;
	    private javax.swing.JLabel jLabel2;
	    private javax.swing.JLabel jLabel3;
	    public javax.swing.JScrollPane scrollPane;

   
    public Practica06_a() {
        initComponents();
    }

    private void initComponents() {

        Panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Tid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Tinsumo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ComboCategoria = new javax.swing.JComboBox<>();
        scrollPane = new javax.swing.JScrollPane();
        areaProductos = new javax.swing.JTextArea();
        Bagregar = new javax.swing.JButton();
        Beliminar = new javax.swing.JButton();
        Bsalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING));

        jLabel1.setText("ID:");
        Panel.add(jLabel1);

        Tid.setPreferredSize(new java.awt.Dimension(100, 30));
        Panel.add(Tid);

        jLabel2.setText("Insumo:");
        Panel.add(jLabel2);

        Tinsumo.setPreferredSize(new java.awt.Dimension(100, 30));
        Panel.add(Tinsumo);

        jLabel3.setText("Categorias:");
        Panel.add(jLabel3);

        ComboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Materiales", "Mano de Obra", "Maquinaria y Equipo ", "Maquinaria y Equipo"}));
        Panel.add(ComboCategoria);

        scrollPane.setPreferredSize(new java.awt.Dimension(300, 200));

        areaProductos.setEditable(false);
        areaProductos.setColumns(20);
        areaProductos.setRows(5);
        scrollPane.setViewportView(areaProductos);

        Panel.add(scrollPane);

        Bagregar.setText("Agregar");
        Panel.add(Bagregar);

        Beliminar.setText("Eliminar");
        Panel.add(Beliminar);

        Bsalir.setText("Salir");
        Panel.add(Bsalir);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Practica06_a.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Practica06_a.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Practica06_a.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Practica06_a.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Practica06_a().setVisible(true);
            }
        });
    }

   
   
   
}
