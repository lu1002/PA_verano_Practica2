
package Parte3;


public class Practica06_b extends javax.swing.JFrame {

    public javax.swing.JButton Bagregar;
public javax.swing.JButton Beliminar;
public javax.swing.JButton Bsalir;
public javax.swing.JComboBox<String> ComboCategoria1;
public javax.swing.JPanel Panel;
public javax.swing.JTextField Tid;
public javax.swing.JTextField Tinsumo;
public javax.swing.JTextArea areaProductos1;
private javax.swing.JLabel jLabel1;
private javax.swing.JLabel jLabel2;
private javax.swing.JLabel jLabel4;
private javax.swing.JPanel jPanel1;
private javax.swing.JPanel jPanel2;
private javax.swing.JPanel jPanel3;
public javax.swing.JScrollPane scrollPane1;

    public Practica06_b() {
        initComponents();
    }

    private void initComponents() {

        Panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Tid = new javax.swing.JTextField();
        Tinsumo = new javax.swing.JTextField();
        scrollPane1 = new javax.swing.JScrollPane();
        areaProductos1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        ComboCategoria1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Beliminar = new javax.swing.JButton();
        Bagregar = new javax.swing.JButton();
        Bsalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.BorderLayout(10, 10));

        Panel.setLayout(new java.awt.BorderLayout(5, 5));

        jLabel1.setText("ID:");
        Panel.add(jLabel1, java.awt.BorderLayout.CENTER);

        Tid.setPreferredSize(new java.awt.Dimension(100, 30));
        Panel.add(Tid, java.awt.BorderLayout.PAGE_START);

        Tinsumo.setPreferredSize(new java.awt.Dimension(100, 30));
        Panel.add(Tinsumo, java.awt.BorderLayout.LINE_END);

        scrollPane1.setPreferredSize(new java.awt.Dimension(300, 200));

        areaProductos1.setEditable(false);
        areaProductos1.setColumns(20);
        areaProductos1.setRows(5);
        scrollPane1.setViewportView(areaProductos1);

        Panel.add(scrollPane1, java.awt.BorderLayout.LINE_START);

        getContentPane().add(Panel, java.awt.BorderLayout.CENTER);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel4.setText("Categorias:");
        jPanel1.add(jLabel4, java.awt.BorderLayout.CENTER);

        ComboCategoria1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Materiales", "Mano de Obra", "Maquinaria y Equipo ", "Maquinaria y Equipo"}));
        jPanel1.add(ComboCategoria1, java.awt.BorderLayout.CENTER);

        jLabel2.setText("Insumo:");
        jPanel1.add(jLabel2, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setLayout(new java.awt.BorderLayout());
        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanel3.setLayout(new java.awt.BorderLayout(10, 10));

        Beliminar.setText("Eliminar");
        jPanel3.add(Beliminar, java.awt.BorderLayout.CENTER);

        Bagregar.setText("Agregar");
        jPanel3.add(Bagregar, java.awt.BorderLayout.CENTER);

        Bsalir.setText("Salir");
        jPanel3.add(Bsalir, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel3, java.awt.BorderLayout.LINE_END);

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
            java.util.logging.Logger.getLogger(Practica06_b.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Practica06_b.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Practica06_b.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Practica06_b.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Practica06_b().setVisible(true);
            }
        });
    }

    }
