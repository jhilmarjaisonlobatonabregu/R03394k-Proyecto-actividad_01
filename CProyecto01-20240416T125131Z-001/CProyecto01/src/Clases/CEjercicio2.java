
package Clases;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JOptionPane;

/**
* @Autor: Lobaton Anregu Jhilmar Jaison
* @version: 1.0
*/

public class CEjercicio2 extends javax.swing.JFrame {

    /**
     * constructor
     */
    public CEjercicio2() {
        initComponents();
         formulario();
    }
    /**
     * metodo formulario
     */
private void formulario(){
        this.setTitle("BOLETA DE SUELDO"); 
        this.setLocationRelativeTo(this); //ventana al medio
        this.setResizable(false); //cambiar el tamaño de mi formulario
        this.setSize(new Dimension(500,400)); //cambia dimension
        this.getContentPane().setBackground(new Color(225,225,225));
        this.panelTitulos.setBackground(new Color(225,225,225));
        this.panelDatos.setBackground(new Color(225,225,225));
        this.panelOperaciones.setBackground(new Color(225,225,225));
         // Establecer sueldo básico predeterminado
    lblsueldobasic.setText("350.75");
    }
 
    /**
     * 
     * @param sueldoBasico
     * @param importeTotalVendido
     * @return 
     */
    private double calcularSueldoBruto(double sueldoBasico, double importeTotalVendido) {
        double porcentajeComision = 0.05;
        return sueldoBasico + (porcentajeComision * importeTotalVendido);
    }
/**
 * metodo calcular el descuento
 * @param sueldoBruto
 * @return 
 */
    private double calcularDescuento(double sueldoBruto) {
        double porcentajeDescuento = 0.15;
        return sueldoBruto * porcentajeDescuento;
    }
/**
 * metodo para calcular el sueldo neto
 * @param sueldoBruto
 * @param descuento
 * @return 
 */
    private double calcularSueldoNeto(double sueldoBruto, double descuento) {
        return sueldoBruto - descuento;
    }
/**
 * metodo para mostrar boleta
 */
    private void mostrarBoleta() {
        double sueldoBasico = Double.parseDouble(lblsueldobasic.getText());
        double importeTotalVendido = Double.parseDouble(txtimporte.getText());

        double sueldoBruto = calcularSueldoBruto(sueldoBasico, importeTotalVendido);
        double descuento = calcularDescuento(sueldoBruto);
        double sueldoNeto = calcularSueldoNeto(sueldoBruto, descuento);

        
       lblrescomision.setText(String.valueOf(sueldoBruto - sueldoBasico));
       lblressueldbruto.setText(String.valueOf(sueldoBruto));
       lblrespdesc.setText(String.valueOf(descuento));
       lblrespsueldn.setText(String.valueOf(sueldoNeto));

    }

  
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelOperaciones = new javax.swing.JPanel();
        CALCULAR = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        panelDatos = new javax.swing.JPanel();
        lblsueldobasico = new javax.swing.JLabel();
        lblcomicion = new javax.swing.JLabel();
        lblsueldobruto = new javax.swing.JLabel();
        lblrescomision = new javax.swing.JLabel();
        lblressueldbruto = new javax.swing.JLabel();
        lbldescuento = new javax.swing.JLabel();
        lblsueldoneto = new javax.swing.JLabel();
        lblrespdesc = new javax.swing.JLabel();
        lblrespsueldn = new javax.swing.JLabel();
        IMPORTE = new javax.swing.JLabel();
        txtimporte = new javax.swing.JTextField();
        lblsueldobasic = new javax.swing.JLabel();
        panelTitulos = new javax.swing.JPanel();
        lbltitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));

        panelOperaciones.setBackground(new java.awt.Color(204, 255, 255));

        CALCULAR.setBackground(new java.awt.Color(204, 204, 255));
        CALCULAR.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CALCULAR.setText("Calcular");
        CALCULAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CALCULARActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(204, 204, 255));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelOperacionesLayout = new javax.swing.GroupLayout(panelOperaciones);
        panelOperaciones.setLayout(panelOperacionesLayout);
        panelOperacionesLayout.setHorizontalGroup(
            panelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOperacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CALCULAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelOperacionesLayout.setVerticalGroup(
            panelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOperacionesLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(CALCULAR)
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelDatos.setBackground(new java.awt.Color(204, 255, 255));

        lblsueldobasico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblsueldobasico.setText("SUELDO BASICO");
        lblsueldobasico.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                lblsueldobasicoHierarchyChanged(evt);
            }
        });

        lblcomicion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblcomicion.setText("COMISION");

        lblsueldobruto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblsueldobruto.setText("SUELDO BRUTO");

        lblrescomision.setBackground(new java.awt.Color(204, 204, 255));

        lblressueldbruto.setBackground(new java.awt.Color(204, 204, 255));

        lbldescuento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbldescuento.setText("DESCUENTO");

        lblsueldoneto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblsueldoneto.setText("SUELDO NETO");

        lblrespdesc.setBackground(new java.awt.Color(204, 204, 255));

        lblrespsueldn.setBackground(new java.awt.Color(204, 204, 255));

        IMPORTE.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        IMPORTE.setText("IMPORTE A LA VENTA");

        txtimporte.setBackground(new java.awt.Color(204, 204, 255));
        txtimporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtimporteActionPerformed(evt);
            }
        });
        txtimporte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtimporteKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbldescuento)
                    .addComponent(lblsueldobruto)
                    .addComponent(lblcomicion, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IMPORTE)
                            .addComponent(lblsueldoneto)
                            .addComponent(lblsueldobasico))
                        .addGap(18, 18, 18)
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblrespsueldn, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(txtimporte, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(lblrescomision, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(lblressueldbruto, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(lblrespdesc, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(lblsueldobasic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(103, 103, 103))
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IMPORTE)
                    .addComponent(txtimporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblsueldobasico)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addComponent(lblsueldobasic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblcomicion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblrescomision, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblsueldobruto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblressueldbruto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbldescuento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblrespdesc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblsueldoneto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblrespsueldn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        panelTitulos.setBackground(new java.awt.Color(204, 255, 255));
        panelTitulos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lbltitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbltitulo.setForeground(new java.awt.Color(153, 153, 255));
        lbltitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltitulo.setText("SOLUCION PROBLEMA O2");
        lbltitulo.setAlignmentX(0.5F);

        javax.swing.GroupLayout panelTitulosLayout = new javax.swing.GroupLayout(panelTitulos);
        panelTitulos.setLayout(panelTitulosLayout);
        panelTitulosLayout.setHorizontalGroup(
            panelTitulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitulosLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(lbltitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTitulosLayout.setVerticalGroup(
            panelTitulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitulosLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lbltitulo)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelTitulos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(panelOperaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTitulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelOperaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblsueldobasicoHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_lblsueldobasicoHierarchyChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_lblsueldobasicoHierarchyChanged
/**
 * metodp para ejecutar el programa y todo lo que esta en el metodo mostrarBoleta
 * @param evt 
 */
    private void CALCULARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CALCULARActionPerformed
       mostrarBoleta();
    }//GEN-LAST:event_CALCULARActionPerformed

    private void txtimporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtimporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtimporteActionPerformed

    /**
 * metodo para cerrar la aplicacion
 * @param evt 
 */
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int resp = JOptionPane.showOptionDialog(this,
               "estas seguro de salir...",
               "salida",JOptionPane.YES_NO_OPTION,
               JOptionPane.QUESTION_MESSAGE, null , new Object[]{"si","no"}, "Si");
       if (resp == 0 ){
           System.exit(0);
       }
    }//GEN-LAST:event_btnSalirActionPerformed

    /**
 * METODO PARA VALIDAR INGRESO DE NUMEROS
 * @param evt 
 */
    private void txtimporteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtimporteKeyTyped
        char c = evt.getKeyChar();
        if(Character.isLetter(c)|| c == ' '){
        evt.consume();
        }
    }//GEN-LAST:event_txtimporteKeyTyped

   
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(CEjercicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CEjercicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CEjercicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CEjercicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CEjercicio2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CALCULAR;
    private javax.swing.JLabel IMPORTE;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lblcomicion;
    private javax.swing.JLabel lbldescuento;
    private javax.swing.JLabel lblrescomision;
    private javax.swing.JLabel lblrespdesc;
    private javax.swing.JLabel lblrespsueldn;
    private javax.swing.JLabel lblressueldbruto;
    private javax.swing.JLabel lblsueldobasic;
    private javax.swing.JLabel lblsueldobasico;
    private javax.swing.JLabel lblsueldobruto;
    private javax.swing.JLabel lblsueldoneto;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelOperaciones;
    private javax.swing.JPanel panelTitulos;
    private javax.swing.JTextField txtimporte;
    // End of variables declaration//GEN-END:variables
}
