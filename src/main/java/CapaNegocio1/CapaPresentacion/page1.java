/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package CapaNegocio1.CapaPresentacion;
import CapaNegocio1.Guia;
import CapaNegocio1.Alojamiento;
import CapaNegocio1.Horario;
import CapaNegocio1.Reserva;
import CapaNegocio1.Pasajero;
import CapaNegocio1.Tour;
import java.awt.BorderLayout;

/**
 *
 * @author User
 */
public class page1 extends javax.swing.JPanel {

    /**
     * Creates new form page0
     */
    public page1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        lbl1 = new javax.swing.JLabel();
        content1 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setName("page00"); // NOI18N

        jButton1.setText("Detalles");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Reservar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Tour en cusco");

        jLabel2.setText("Tour en cusco por 1 noche");

        jLabel3.setText("Tour en cusco y en el valle sagrado por 1 noche");

        jButton3.setText("Detalles");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Reservar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Detalles");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Reservar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        content1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout content1Layout = new javax.swing.GroupLayout(content1);
        content1.setLayout(content1Layout);
        content1Layout.setHorizontalGroup(
            content1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        content1Layout.setVerticalGroup(
            content1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(146, 146, 146)
                        .addComponent(jLabel2)
                        .addGap(125, 125, 125)
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2))
                                .addGap(214, 214, 214)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton4))
                                .addGap(176, 176, 176)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton6))
                                .addGap(0, 76, Short.MAX_VALUE)))
                        .addGap(306, 306, 306))))
            .addComponent(content1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton5))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton4)
                    .addComponent(jButton6))
                .addGap(18, 18, 18)
                .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(content1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String promociones = "15% menos valido hasta el 15 de mayo";
        String descripcion = "Recorrido Guiado por el centro arqueologico de saqsaywaman a solo s/74 por persona.";
        
        Tour tour = new Tour();
        tour.setPromociones(promociones);
        tour.setDescripcion(descripcion);
        lbl1.setText("<html>Tour en cusco<p>"+descripcion+"("+promociones+")"+"</html>");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String promociones = "15% menos valido hasta el 15 de mayo";
        String descripcion = "<html>Día 1: Recorrido guiado por el centro arqueologico de saqsaywaman y alojamiento en el hotel de elección<p>Dia 2: recorrido guiado por la plaza de armas.<p> s/100 por persona (No incluye hospedaje, se paga en el hotel).</html>";

        Tour tour = new Tour();
        tour.setPromociones(promociones);
        tour.setDescripcion(descripcion);
        lbl1.setText("<html>Tour 1 noche en cusco<p>"+descripcion+"("+promociones+")"+"</html>");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String promociones = "15% menos valido hasta el 15 de mayo";
        String descripcion = "<html>Día 1: Recorrido guiado por el centro arqueologico de saqsaywaman y alojamiento en el hotel de elección<p>Dia 2: recorrido guiado por el valle sagrado de los incas.<p> s/130 por persona (No incluye hospedaje, se paga en el hotel).</html>";

        Tour tour = new Tour();
        tour.setPromociones(promociones);
        tour.setDescripcion(descripcion);
        lbl1.setText("<html>Tour 1 noche en cusco<p>"+descripcion+"("+promociones+")"+"</html>");

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        page2 p1 = new page2();
        p1.setSize(1000,1500);
        p1.setLocation(0,0);
        
        content1.removeAll();
        content1.add(p1, BorderLayout.CENTER);
        content1.revalidate();
        content1.repaint();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        page3 p1 = new page3();
        p1.setSize(1000,1500);
        p1.setLocation(0,0);
        
        content1.removeAll();
        content1.add(p1, BorderLayout.CENTER);
        content1.revalidate();
        content1.repaint();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        page4 p1 = new page4();
        p1.setSize(1000,1500);
        p1.setLocation(0,0);
        
        content1.removeAll();
        content1.add(p1, BorderLayout.CENTER);
        content1.revalidate();
        content1.repaint();
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel content1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbl1;
    // End of variables declaration//GEN-END:variables
}