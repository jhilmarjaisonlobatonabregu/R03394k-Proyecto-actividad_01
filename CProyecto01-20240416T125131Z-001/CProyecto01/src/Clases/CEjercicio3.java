/**
 * Aplicación para obtener los gastos de una empresa por rubro.
*/

package Clases;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JOptionPane;

/** 
 *   @Version 1.0
 *   @Author Alfonso Gabriel Vilcahuaman Lozano
*/

public class CEjercicio3 extends javax.swing.JFrame {
    
    /**
     * Constuctor de la aplicación
    */
    public CEjercicio3() {
        initComponents();
        formulario();
        valoresIniciales();
    }
    
    /**
     * método formulario 
     * @param no tiene parametros
    */
    private void formulario(){
        this.setTitle("Gastos de una Empresa"); //titulo de la ventana
        this.setLocationRelativeTo(this); //aparece la ventana al medio
        this.setResizable(false); //cambiar el tamaño de mi formulario
        this.getContentPane().setBackground(new Color(51,51,51));//color del formulario
        this.panelTitulo.setBackground(new Color(51,51,51));
        this.panelEntrada.setBackground(new Color(51,51,51));
        this.panelSalida.setBackground(new Color(51,51,51));
    }
    
    /**
     * método valores iniciales
     * @param no tiene parametros
    */
    public void valoresIniciales(){
        this.txtInversion.requestFocus(); //para q inicie en la primera casilla, se activa el cursor.
    }
    
    /**
     * método para capturar la inversion
     * @param no tiene parametros
     * @return inversion
    */
    private float capturarInversion(){
        float inversion;
        inversion=Float.parseFloat(txtInversion.getText().trim());
        return inversion;
    }
    
    /**
     * método saber cuanto se gasto en el alquiler del espacio
     * @param inversion
     * @return a
    */
    private float alquiler(float inversion){
        float a;
        a= (float) (inversion *0.23);
        return a;
    }
    
    /**
     * método saber cuanto se gasto en la publicidad
     * @param inversion
     * @return p
    */
    private float publicidad(float inversion){
        float p;
        p= (float) (inversion *0.07);
        return p;
    }
    
    /**
     * método saber cuanto se gasto en el transporte
     * @param inversion
     * @return t
    */
    private float transporte(float inversion){
        float t;
        t= (float) (inversion *0.26);
        return t;
    }
    
    /**
     * método saber cuanto se gasto en los servicios feriales
     * @param inversion
     * @return s
    */
    private float serviciosF(float inversion){
        float s;
        s= (float) (inversion *0.12);
        return s;
    }
    
    /**
     * método saber cuanto se gasto en la decoracion
     * @param inversion
     * @return d
    */
    private float decoracion(float inversion){
        float d;
        d= (float) (inversion *0.21);
        return d;
    }
    /**
     * método saber cuanto se gasto en los gastos varios
     * @param inversion
     * @return g
    */
    private float gastosVarios(float inversion){
        float g;
        g= (float) (inversion *0.11);
        return g;
    }
    
    /**
     * método mostrar el alquiler
     * @param a
     * @return no
    */
    private void mostrarAlquiler(float a) {
        txtAlquiler.setText(String.valueOf(a));
    }
    
    /**
     * método mostrar publicidad
     * @param p
     * @return no
    */
    private void mostrarPublicidad(float p) {
        txtPublicidad.setText(String.valueOf(p));
    }
    
    /**
     * método mostrar transporte
     * @param t
     * @return no
    */
    private void mostrarTransporte(float t) {
        txtTransporte.setText(String.valueOf(t));
    }
    
    /**
     * método mostrar serviciosFeriales
     * @param s
     * @return no
    */
    private void mostrarServiciosF(float s) {
        txtServicios.setText(String.valueOf(s));
    }
    
    /**
     * método mostrar decoracion
     * @param d
     * @return no
    */
    private void mostrarDecoracion(float d) {
        txtDecoracion.setText(String.valueOf(d));
    }
    
    /**
     * método mostrar gastos varios
     * @param g
     * @return no
    */
    private void mostrarGastosVarios(float g) {
        txtGastosVarios.setText(String.valueOf(g));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtInversion6 = new javax.swing.JTextField();
        panelTitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        panelEntrada = new javax.swing.JPanel();
        lblinv = new javax.swing.JLabel();
        txtInversion = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        panelSalida = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblAlquiler = new javax.swing.JLabel();
        lblPublicidad = new javax.swing.JLabel();
        lblTrans = new javax.swing.JLabel();
        lblServ = new javax.swing.JLabel();
        lblDecoracion = new javax.swing.JLabel();
        lblGastos = new javax.swing.JLabel();
        txtAlquiler = new javax.swing.JLabel();
        txtPublicidad = new javax.swing.JLabel();
        txtTransporte = new javax.swing.JLabel();
        txtGastosVarios = new javax.swing.JLabel();
        txtDecoracion = new javax.swing.JLabel();
        txtServicios = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(231, 93, 55));
        lblTitulo.setText("GASTOS DE UNA EMPRESA POR RUBRO");

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(lblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblTitulo)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        lblinv.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblinv.setForeground(new java.awt.Color(255, 255, 255));
        lblinv.setText("Ingrese el monto invertido: ");

        txtInversion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtInversion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtInversion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        txtInversion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtInversionKeyTyped(evt);
            }
        });

        btnCalcular.setBackground(new java.awt.Color(231, 93, 55));
        btnCalcular.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcular.setText("CALCULAR");
        btnCalcular.setBorder(null);
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnNuevo.setBackground(new java.awt.Color(61, 174, 91));
        btnNuevo.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setText("NUEVO");
        btnNuevo.setBorder(null);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(231, 48, 75));
        btnSalir.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("SALIR");
        btnSalir.setBorder(null);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEntradaLayout = new javax.swing.GroupLayout(panelEntrada);
        panelEntrada.setLayout(panelEntradaLayout);
        panelEntradaLayout.setHorizontalGroup(
            panelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEntradaLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEntradaLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(36, Short.MAX_VALUE))
                    .addGroup(panelEntradaLayout.createSequentialGroup()
                        .addComponent(lblinv)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtInversion, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );
        panelEntradaLayout.setVerticalGroup(
            panelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEntradaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblinv)
                    .addComponent(txtInversion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(231, 93, 55));
        jLabel1.setText("RESULTADOS");

        lblAlquiler.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblAlquiler.setForeground(new java.awt.Color(255, 255, 255));
        lblAlquiler.setText("Alquiler de espacio en la feria");

        lblPublicidad.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblPublicidad.setForeground(new java.awt.Color(255, 255, 255));
        lblPublicidad.setText("Publicidad");

        lblTrans.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblTrans.setForeground(new java.awt.Color(255, 255, 255));
        lblTrans.setText("Transporte");

        lblServ.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblServ.setForeground(new java.awt.Color(255, 255, 255));
        lblServ.setText("Servicios Feriales");

        lblDecoracion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblDecoracion.setForeground(new java.awt.Color(255, 255, 255));
        lblDecoracion.setText("Decoración");

        lblGastos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblGastos.setForeground(new java.awt.Color(255, 255, 255));
        lblGastos.setText("Gastos Varios");

        txtAlquiler.setBackground(new java.awt.Color(231, 93, 55));
        txtAlquiler.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        txtAlquiler.setForeground(new java.awt.Color(232, 182, 91));

        txtPublicidad.setBackground(new java.awt.Color(231, 93, 55));
        txtPublicidad.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        txtPublicidad.setForeground(new java.awt.Color(232, 182, 91));

        txtTransporte.setBackground(new java.awt.Color(231, 93, 55));
        txtTransporte.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        txtTransporte.setForeground(new java.awt.Color(232, 182, 91));

        txtGastosVarios.setBackground(new java.awt.Color(231, 93, 55));
        txtGastosVarios.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        txtGastosVarios.setForeground(new java.awt.Color(232, 182, 91));

        txtDecoracion.setBackground(new java.awt.Color(231, 93, 55));
        txtDecoracion.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        txtDecoracion.setForeground(new java.awt.Color(232, 182, 91));

        txtServicios.setBackground(new java.awt.Color(231, 93, 55));
        txtServicios.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        txtServicios.setForeground(new java.awt.Color(232, 182, 91));

        javax.swing.GroupLayout panelSalidaLayout = new javax.swing.GroupLayout(panelSalida);
        panelSalida.setLayout(panelSalidaLayout);
        panelSalidaLayout.setHorizontalGroup(
            panelSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSalidaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSalidaLayout.createSequentialGroup()
                        .addGroup(panelSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTrans)
                            .addComponent(lblServ)
                            .addComponent(lblAlquiler)
                            .addComponent(lblPublicidad)
                            .addComponent(lblDecoracion)
                            .addComponent(lblGastos))
                        .addGap(40, 40, 40)
                        .addGroup(panelSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAlquiler, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPublicidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTransporte, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtServicios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDecoracion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGastosVarios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSalidaLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(159, 159, 159))))
        );
        panelSalidaLayout.setVerticalGroup(
            panelSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSalidaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(14, 14, 14)
                .addGroup(panelSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSalidaLayout.createSequentialGroup()
                        .addComponent(lblAlquiler)
                        .addGap(14, 14, 14)
                        .addComponent(lblPublicidad)
                        .addGap(14, 14, 14)
                        .addComponent(lblTrans)
                        .addGap(14, 14, 14)
                        .addComponent(lblServ)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDecoracion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblGastos))
                    .addGroup(panelSalidaLayout.createSequentialGroup()
                        .addComponent(txtAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPublicidad, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDecoracion, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGastosVarios, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed

        mostrarAlquiler(alquiler(capturarInversion()));
        mostrarPublicidad(publicidad(capturarInversion()));
        mostrarTransporte(transporte(capturarInversion()));
        mostrarServiciosF(serviciosF(capturarInversion()));
        mostrarDecoracion(decoracion(capturarInversion()));
        mostrarGastosVarios(gastosVarios(capturarInversion()));
    }//GEN-LAST:event_btnCalcularActionPerformed

    /**
     * Método que limpia las casillas e incializa en el primer número al hacer clic en el boton nuevo
     * @param evt 
     */    
    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        this.txtInversion.setText("");
        this.txtAlquiler.setText("");
        this.txtTransporte.setText("");
        this.txtGastosVarios.setText("");
        this.txtDecoracion.setText("");
        this.txtPublicidad.setText("");
        this.txtServicios.setText("");
        this.txtInversion.requestFocus();
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
    private void txtInversionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInversionKeyTyped
        char c= evt.getKeyChar(); //captura el caracter q digito
        if(!Character.isDigit(c)){  // si el caracter no es un dígito
            evt.consume(); //elimina el caracter ingresado
        }
    }//GEN-LAST:event_txtInversionKeyTyped

  
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
            java.util.logging.Logger.getLogger(CEjercicio3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CEjercicio3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CEjercicio3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CEjercicio3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CEjercicio3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAlquiler;
    private javax.swing.JLabel lblDecoracion;
    private javax.swing.JLabel lblGastos;
    private javax.swing.JLabel lblPublicidad;
    private javax.swing.JLabel lblServ;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTrans;
    private javax.swing.JLabel lblinv;
    private javax.swing.JPanel panelEntrada;
    private javax.swing.JPanel panelSalida;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JLabel txtAlquiler;
    private javax.swing.JLabel txtDecoracion;
    private javax.swing.JLabel txtGastosVarios;
    private javax.swing.JTextField txtInversion;
    private javax.swing.JTextField txtInversion6;
    private javax.swing.JLabel txtPublicidad;
    private javax.swing.JLabel txtServicios;
    private javax.swing.JLabel txtTransporte;
    // End of variables declaration//GEN-END:variables
}
