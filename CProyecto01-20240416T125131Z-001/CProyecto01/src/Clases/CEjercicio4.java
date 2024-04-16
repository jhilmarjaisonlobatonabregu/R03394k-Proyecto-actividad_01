/**
 * Aplicación para venta de camisas con doble descuento
*/
package Clases;

import java.awt.Color;
import javax.swing.JOptionPane;

/** 
 *   @Version 1.0
 *   @Author Alfonso Gabriel Vilcahuaman Lozano
*/

public class CEjercicio4 extends javax.swing.JFrame {
    /**
     * Constuctor de la aplicación
    */
    public CEjercicio4() {
        initComponents();
        formulario();
        valoresIniciales();
    }
    /**
     * método formulario 
     * @param no tiene parametros
    */
    private void formulario(){
        this.setTitle("Descuentos de camisas"); //titulo de la ventana
        this.setLocationRelativeTo(this); //aparece la ventana al medio
        this.setResizable(false); //cambiar el tamaño de mi formulario
        this.getContentPane().setBackground(new Color(13,41,30));//color del formulario
        this.panelTitulo.setBackground(new Color(13,41,30));
        this.panelEntrada.setBackground(new Color(13,41,30));
        this.panelSalida.setBackground(new Color(13,41,30));
    }
    
    /**
     * método valores iniciales
     * @param no tiene parametros
    */
    public void valoresIniciales(){
        this.txtPrecio.requestFocus(); //para q inicie en la primera casilla, se activa el cursor.
    }
    
    /**
     * método para capturar el precio
     * @param no tiene parametros
     * @return precio
    */
    private float capturarPrecio(){
        float precio;
        precio=Float.parseFloat(txtPrecio.getText().trim());
        return precio;
    }
    
    /**
     * método para capturar la cantidad
     * @param no tiene parametros
     * @return unidades
    */
    private float capturarCantidad(){
        float unidades;
        unidades=Float.parseFloat(txtCantidad.getText().trim());
        return unidades;
    }
    
    /**
     * método para calcular el importe de la compra
     * @param precio, unidades
     * @return impCompra
    */
    private float ImporteCompra(float precio, float unidades){
        float impCompra;
        impCompra= precio*unidades;
        return impCompra;
    }
    
    /**
     * método para calcular el importe del primer descuento
     * @param impCompra
     * @return impPrimerDesc
    */
    private float ImportePrimerDescuento(float impCompra){
        float impPrimerDesc;
        impPrimerDesc= (float) (impCompra*0.07);
        return impPrimerDesc;
    }
    
    /**
     * método para calcular el importe del segundo descuento
     * @param impCompra , impPrimerDesc
     * @return impSegundoDesc
    */
    private float ImporteSegundoDescuento(float impCompra, float impPrimerDesc){
        float impSegundoDesc;
        impSegundoDesc= (float) ((impCompra-impPrimerDesc)* 0.07);
        return impSegundoDesc;
    }
    
    /**
     * método para calcular el importe total del descuento
     * @param impSegundoDesc , impPrimerDesc
     * @return impTotalDesc
    */
    private float ImporteTotalDescuento( float impPrimerDesc, float impSegundoDesc){
        float impTotalDesc;
        impTotalDesc = impPrimerDesc+impSegundoDesc;
        return impTotalDesc;
    }
    
    /**
     * método para calcular el importe a pagar
     * @param impCompra , impTotalDesc
     * @return impPago
    */
    private float ImportePagar( float impCompra, float impTotalDesc){
        float impPago;
        impPago = impCompra-impTotalDesc;
        return impPago;
    }
    
    /**
     * método mostrar el importe de la compra
     * @param ic
     * @return no
    */
    private void mostrarImpCompra(float ic) {
        lblImpCompra.setText(String.valueOf(ic));
    }
    
    /**
     * método mostrar primer descuento
     * @param pd
     * @return no
    */
    private void mostrarPrimerDesc(float pd) {
        lblImpPrimer.setText(String.valueOf(pd));
    }
    
    /**
     * método mostrar segundo descuento
     * @param sd
     * @return no
    */
    private void mostrarSegundoDesc(float sd) {
        lblImpSegundo.setText(String.valueOf(sd));
    }
    
    /**
     * método mostrar descuento total
     * @param dt
     * @return no
    */
    private void mostrarDescTotal(float dt) {
        lblImpDesTotal.setText(String.valueOf(dt));
    }
    
    /**
     * método mostrar el importe a pagar
     * @param ip
     * @return no
    */
    private void mostrarImpPagar(float ip) {
        lblImpPagar.setText(String.valueOf(ip));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelEntrada = new javax.swing.JPanel();
        txtPrecio = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        panelSalida = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblImpCompra = new javax.swing.JLabel();
        lblImpPrimer = new javax.swing.JLabel();
        lblImpSegundo = new javax.swing.JLabel();
        lblImpDesTotal = new javax.swing.JLabel();
        lblImpPagar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(16, 107, 174));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VENTA DE CAMISAS CON DESCUENTO");

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        txtPrecio.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(16, 107, 174));
        txtPrecio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });

        txtCantidad.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtCantidad.setForeground(new java.awt.Color(16, 107, 174));
        txtCantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(51, 214, 84));
        jLabel2.setText("PRECIO DEL PRODUCTO:");

        jLabel3.setForeground(new java.awt.Color(51, 214, 84));
        jLabel3.setText("UNIDADES ADQUIRIDAS:");

        btnCalcular.setBackground(new java.awt.Color(16, 107, 174));
        btnCalcular.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnNuevo.setBackground(new java.awt.Color(0, 204, 0));
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(204, 0, 0));
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEntradaLayout = new javax.swing.GroupLayout(panelEntrada);
        panelEntrada.setLayout(panelEntradaLayout);
        panelEntradaLayout.setHorizontalGroup(
            panelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEntradaLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnNuevo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCalcular, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPrecio)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );
        panelEntradaLayout.setVerticalGroup(
            panelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEntradaLayout.createSequentialGroup()
                .addGroup(panelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEntradaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(panelEntradaLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel2))
                    .addGroup(panelEntradaLayout.createSequentialGroup()
                        .addComponent(btnCalcular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalir)))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jLabel4.setForeground(new java.awt.Color(0, 143, 100));
        jLabel4.setText("Importe de la compra");

        jLabel5.setForeground(new java.awt.Color(0, 143, 100));
        jLabel5.setText("Importe del primer descuento");

        jLabel6.setForeground(new java.awt.Color(0, 143, 100));
        jLabel6.setText("Importe del descuento total");

        jLabel7.setForeground(new java.awt.Color(0, 143, 100));
        jLabel7.setText("Importe del segundo descuento");

        jLabel9.setForeground(new java.awt.Color(0, 143, 100));
        jLabel9.setText("Importe a pagar");

        lblImpCompra.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblImpCompra.setForeground(new java.awt.Color(51, 214, 84));
        lblImpCompra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblImpPrimer.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblImpPrimer.setForeground(new java.awt.Color(51, 214, 84));
        lblImpPrimer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblImpSegundo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblImpSegundo.setForeground(new java.awt.Color(51, 214, 84));
        lblImpSegundo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblImpDesTotal.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblImpDesTotal.setForeground(new java.awt.Color(51, 214, 84));
        lblImpDesTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblImpPagar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblImpPagar.setForeground(new java.awt.Color(51, 214, 84));
        lblImpPagar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelSalidaLayout = new javax.swing.GroupLayout(panelSalida);
        panelSalida.setLayout(panelSalidaLayout);
        panelSalidaLayout.setHorizontalGroup(
            panelSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSalidaLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(panelSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(panelSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImpPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImpPrimer, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImpCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImpDesTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImpSegundo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
        );
        panelSalidaLayout.setVerticalGroup(
            panelSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSalidaLayout.createSequentialGroup()
                .addGroup(panelSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSalidaLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelSalidaLayout.createSequentialGroup()
                        .addComponent(lblImpCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblImpPrimer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblImpSegundo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblImpDesTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblImpPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
       mostrarImpCompra(ImporteCompra(capturarPrecio(),capturarCantidad()));
        mostrarPrimerDesc(ImportePrimerDescuento(ImporteCompra(capturarPrecio(),capturarCantidad())));
        mostrarSegundoDesc(ImporteSegundoDescuento(ImporteCompra(capturarPrecio(),capturarCantidad()), ImportePrimerDescuento(ImporteCompra(capturarPrecio(),capturarCantidad()))));
        mostrarDescTotal(ImporteTotalDescuento(ImportePrimerDescuento(ImporteCompra(capturarPrecio(),capturarCantidad())),ImporteSegundoDescuento(ImporteCompra(capturarPrecio(),capturarCantidad()), ImportePrimerDescuento(ImporteCompra(capturarPrecio(),capturarCantidad())))));
        mostrarImpPagar(ImportePagar(ImporteCompra(capturarPrecio(),capturarCantidad()), ImporteTotalDescuento(ImportePrimerDescuento(ImporteCompra(capturarPrecio(),capturarCantidad())),ImporteSegundoDescuento(ImporteCompra(capturarPrecio(),capturarCantidad()), ImportePrimerDescuento(ImporteCompra(capturarPrecio(),capturarCantidad()))))));
    }//GEN-LAST:event_btnCalcularActionPerformed
    
    /**
     * Método que limpia las casillas e incializa en el primer número al hacer clic en el boton nuevo
     * @param evt 
     */   
    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        this.txtPrecio.setText("");
        this.txtCantidad.setText("");
        this.lblImpCompra.setText("");
        this.lblImpPrimer.setText("");
        this.lblImpSegundo.setText("");
        this.lblImpDesTotal.setText("");
        this.lblImpPagar.setText("");
        this.txtPrecio.requestFocus();
    }//GEN-LAST:event_btnNuevoActionPerformed

    /**
     * Metodo que cierra el formulario al hacer clic en el boton salir
     * @param evt 
     */
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int resp = JOptionPane.showOptionDialog(this,"Estas seguro de salir...", "Salida",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null, 
                    new Object[]{"Si","No"}, "Si");
        if(resp==0){
            System.exit(0);
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    /**
     * Metodo para solo aceptar numeros enteros
     * @param evt 
     */
    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        char c= evt.getKeyChar(); //captura el caracter q digito
        if(!Character.isDigit(c)){  // si el caracter no es un dígito
            evt.consume(); //elimina el caracter ingresado
        }
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        char c= evt.getKeyChar(); //captura el caracter q digito
        if(!Character.isDigit(c)){  // si el caracter no es un dígito
            evt.consume(); //elimina el caracter ingresado
        }
    }//GEN-LAST:event_txtCantidadKeyTyped

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
            java.util.logging.Logger.getLogger(CEjercicio4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CEjercicio4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CEjercicio4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CEjercicio4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CEjercicio4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblImpCompra;
    private javax.swing.JLabel lblImpDesTotal;
    private javax.swing.JLabel lblImpPagar;
    private javax.swing.JLabel lblImpPrimer;
    private javax.swing.JLabel lblImpSegundo;
    private javax.swing.JPanel panelEntrada;
    private javax.swing.JPanel panelSalida;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
