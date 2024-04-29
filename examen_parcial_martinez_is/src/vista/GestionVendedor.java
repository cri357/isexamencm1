package vista;
import javax.swing.JOptionPane;//ventanas emergentes
import java.sql.Connection;//conexion a BD
import java.sql.DriverManager;//Controlador de java a MySQL
import java.sql.Statement;//Instrucciones SQL querys de BD
import java.sql.ResultSet;//Resultado final de datos
import java.sql.SQLException;//Trabajar errors de base de datos
import java.sql.*;//Libreria general de base de datos
import java.io.*;//Entrada y salidad de datos
import javax.swing.table.DefaultTableModel;//Modelo de datos

public class GestionVendedor extends javax.swing.JFrame {
    //variables de conexion
        public  Connection cn;//conexion a BD
        public  Statement stmt;//Instrucciones SQL querys de BD
        public  ResultSet rs;//Resultado final de datos
        
    public GestionVendedor() {//inicia construcion
        initComponents();
    }//termina construcion
    
    public void conectarBase(){//inicia metodo conectar
    try{//inicia try
    //puente de conexion
    Class.forName("com.mysql.jdbc.Driver");//puente de conexion
       cn=DriverManager.getConnection("jdbc:mysql://localhost/bdexamartinez294","root","");
       stmt=cn.createStatement();//genera sentencias sql
       JOptionPane.showMessageDialog(null,"CONEXION BD ESTABLECIDA \nMartinez");
    }catch(SQLException ex){//inicia exeption
        JOptionPane.showMessageDialog(null, ex);
    }catch(Exception e){//inica exception errores generales
        JOptionPane.showMessageDialog(null, e);
    }  
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panAlta = new javax.swing.JPanel();
        lblEquipo = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        lblModelo = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        txtIdEquipo = new javax.swing.JTextField();
        txtMarcaVendedor = new javax.swing.JTextField();
        txtModeloVendedor = new javax.swing.JTextField();
        txtPrecioVendedor = new javax.swing.JTextField();
        btnRegistrarProducto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtConsultaProductos = new javax.swing.JTable();
        btnConsultaProductos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panAlta.setBackground(new java.awt.Color(0, 153, 255));
        panAlta.setBorder(javax.swing.BorderFactory.createTitledBorder("Alta Vendedor "));

        lblEquipo.setText("Id Equipo");

        lblMarca.setText("Marca");

        lblModelo.setText("Modelo");

        lblPrecio.setText("Precio");

        txtIdEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdEquipoActionPerformed(evt);
            }
        });

        txtMarcaVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaVendedorActionPerformed(evt);
            }
        });

        txtModeloVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloVendedorActionPerformed(evt);
            }
        });

        txtPrecioVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioVendedorActionPerformed(evt);
            }
        });

        btnRegistrarProducto.setText("Registrar ");
        btnRegistrarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panAltaLayout = new javax.swing.GroupLayout(panAlta);
        panAlta.setLayout(panAltaLayout);
        panAltaLayout.setHorizontalGroup(
            panAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panAltaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMarca)
                    .addComponent(lblPrecio)
                    .addComponent(lblModelo)
                    .addComponent(lblEquipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMarcaVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecioVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtModeloVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panAltaLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnRegistrarProducto)))
                .addGap(202, 202, 202))
        );
        panAltaLayout.setVerticalGroup(
            panAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAltaLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(panAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEquipo)
                    .addComponent(txtIdEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(panAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblMarca)
                    .addComponent(txtMarcaVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(panAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblModelo)
                    .addComponent(txtModeloVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(panAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPrecio)
                    .addComponent(txtPrecioVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnRegistrarProducto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtConsultaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Equipo", "Marca", "Modelo", "Precio"
            }
        ));
        jScrollPane1.setViewportView(jtConsultaProductos);

        btnConsultaProductos.setText("Actualizar> Productos");
        btnConsultaProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaProductosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(113, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnConsultaProductos)
                        .addGap(304, 304, 304))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(panAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(219, 219, 219))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(panAlta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnConsultaProductos)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdEquipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdEquipoActionPerformed

    private void txtMarcaVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaVendedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaVendedorActionPerformed

    private void txtModeloVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloVendedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeloVendedorActionPerformed

    private void txtPrecioVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioVendedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioVendedorActionPerformed

    private void btnRegistrarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarProductoActionPerformed

        conectarBase();//llamada a metodo conectar
        //declaracion de variables de entrada
        int idEquipo=Integer.parseInt(txtIdEquipo.getText());
        String marca=txtMarcaVendedor.getText();
        String modelo=txtModeloVendedor.getText();
        String precio=txtPrecioVendedor.getText();

        //proceso guardar en la base de datos
        String altaProducto="INSERT INTO TVENDEDOR VALUES ('"+idEquipo+"','"+marca+"','"+modelo+"','"+precio+"')";
        try {//estructura de control de tratamiento de errores
            //Ejecutar instruccion de alta
            stmt.executeUpdate(altaProducto);
            JOptionPane.showMessageDialog(null, "Se agrego producto de forma correcta\n"+marca);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error de BD :\n"+ e);
        }//termina catch
    }//GEN-LAST:event_btnRegistrarProductoActionPerformed

    private void btnConsultaProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaProductosActionPerformed

        try{//inicia try    Estructura de control para trataminento de errores
            conectarBase();//llamada  a la conexion a BD
            //Objeto Model es para almacenar  y guardar los valores de la tabla
            DefaultTableModel modeloDatos = new DefaultTableModel();
            jtConsultaProductos.setModel(modeloDatos);
            rs=stmt.executeQuery("Select * from tvendedor");
            ResultSetMetaData rsmd=rs.getMetaData();
            int cantidadColumnas=rsmd.getColumnCount();
            modeloDatos.addColumn("Id equipo ");
            modeloDatos.addColumn("Modelo");
            modeloDatos.addColumn("Marca");
            modeloDatos.addColumn("Precio");
            while (rs.next()) { //inicia
                //arreglo objetos para imprimir filas
                Object [] fila = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {//inicia for
                    fila[i]=rs.getObject(i+1);
                }//termina for
                modeloDatos.addRow(fila);
            }//termina while
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error de BD\n"+ ex);
        }//terrmina catch
    }//GEN-LAST:event_btnConsultaProductosActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GestionVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionVendedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultaProductos;
    private javax.swing.JButton btnRegistrarProducto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtConsultaProductos;
    private javax.swing.JLabel lblEquipo;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JPanel panAlta;
    private javax.swing.JTextField txtIdEquipo;
    private javax.swing.JTextField txtMarcaVendedor;
    private javax.swing.JTextField txtModeloVendedor;
    private javax.swing.JTextField txtPrecioVendedor;
    // End of variables declaration//GEN-END:variables
}
