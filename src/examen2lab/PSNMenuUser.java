package examen2lab;


import java.io.IOException;
import javax.swing.JOptionPane;

public class PSNMenuUser extends javax.swing.JFrame {

    PSNUsers psn = new PSNUsers();
    String username;
    public PSNMenuUser(String username) throws IOException{
        this.username=username;
        initComponents();
        setLocationRelativeTo(null);
        UsernameTxT.setText(username);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VerMiPerfilBtn = new javax.swing.JButton();
        BorrarCuentaBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        AgregarTrofeoBtn = new javax.swing.JButton();
        UsernameTxT = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        VerMiPerfilBtn.setBackground(new java.awt.Color(0, 153, 255));
        VerMiPerfilBtn.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        VerMiPerfilBtn.setForeground(new java.awt.Color(255, 255, 255));
        VerMiPerfilBtn.setText("Ver Perfil");
        VerMiPerfilBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerMiPerfilBtnActionPerformed(evt);
            }
        });
        getContentPane().add(VerMiPerfilBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 227, -1, -1));

        BorrarCuentaBtn.setBackground(new java.awt.Color(0, 153, 255));
        BorrarCuentaBtn.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        BorrarCuentaBtn.setForeground(new java.awt.Color(255, 255, 255));
        BorrarCuentaBtn.setText("Borrar Cuenta");
        BorrarCuentaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarCuentaBtnActionPerformed(evt);
            }
        });
        getContentPane().add(BorrarCuentaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 296, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 153, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 421, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));

        AgregarTrofeoBtn.setBackground(new java.awt.Color(0, 153, 255));
        AgregarTrofeoBtn.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        AgregarTrofeoBtn.setForeground(new java.awt.Color(255, 255, 255));
        AgregarTrofeoBtn.setText("Agregar Trofeo");
        AgregarTrofeoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarTrofeoBtnActionPerformed(evt);
            }
        });

        UsernameTxT.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        UsernameTxT.setForeground(new java.awt.Color(255, 255, 255));
        UsernameTxT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(AgregarTrofeoBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(UsernameTxT, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(UsernameTxT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(AgregarTrofeoBtn)
                .addContainerGap(258, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BorrarCuentaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarCuentaBtnActionPerformed
        int opcion = JOptionPane.showOptionDialog(null, "¿Está seguro que desea borrar su cuenta?", "Salir", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Si", "No"}, "No");
        if (opcion==JOptionPane.YES_OPTION){
            try{
                psn.deactivateUser(username);
                PSNMain psnmain = new PSNMain();
                psnmain.setVisible(true);
                this.dispose();
            }catch(IOException e){
                
            }
        }
    }//GEN-LAST:event_BorrarCuentaBtnActionPerformed

    private void AgregarTrofeoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarTrofeoBtnActionPerformed
        try{
            PSNAgregarTrofeo psnagregar = new PSNAgregarTrofeo(username);
            psnagregar.setVisible(true);
            this.dispose();
        }catch(IOException e){
     
            
        }
    }//GEN-LAST:event_AgregarTrofeoBtnActionPerformed

    private void VerMiPerfilBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerMiPerfilBtnActionPerformed
        try{
            PSNPlayerInfo psnplayer = new PSNPlayerInfo(username);
            psnplayer.setVisible(true);
            this.dispose();
        }catch(IOException e){
            
        }
    }//GEN-LAST:event_VerMiPerfilBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            PSNMain psnmain = new PSNMain();
            psnmain.setVisible(true);
            this.dispose();
        }catch(IOException e){
                    
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarTrofeoBtn;
    private javax.swing.JButton BorrarCuentaBtn;
    private javax.swing.JLabel UsernameTxT;
    private javax.swing.JButton VerMiPerfilBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
