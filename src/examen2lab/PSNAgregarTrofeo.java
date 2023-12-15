package examen2lab;


import java.io.IOException;
import javax.swing.JOptionPane;

public class PSNAgregarTrofeo extends javax.swing.JFrame {

    PSNUsers psn = new PSNUsers();
    String username;
    
    public PSNAgregarTrofeo(String username) throws IOException{
        this.username=username;
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JuegoTxT = new javax.swing.JLabel();
        Juego = new javax.swing.JTextField();
        TipoCBx = new javax.swing.JComboBox<>();
        AceptarBtn = new javax.swing.JButton();
        VolverBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TrofeoTxT = new javax.swing.JLabel();
        Trofeo = new javax.swing.JTextField();
        TipoTxT = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JuegoTxT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JuegoTxT.setForeground(new java.awt.Color(255, 255, 255));
        JuegoTxT.setText("Nombre del Juego:");
        getContentPane().add(JuegoTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 117, 178, -1));

        Juego.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(Juego, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 114, 163, -1));

        TipoCBx.setBackground(new java.awt.Color(0, 153, 255));
        TipoCBx.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        TipoCBx.setForeground(new java.awt.Color(255, 255, 255));
        TipoCBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Platino", "Oro", "Plata", "Bronce" }));
        getContentPane().add(TipoCBx, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 291, -1, -1));

        AceptarBtn.setBackground(new java.awt.Color(0, 153, 255));
        AceptarBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AceptarBtn.setForeground(new java.awt.Color(255, 255, 255));
        AceptarBtn.setText("Aceptar");
        AceptarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(AceptarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 371, -1, -1));

        VolverBtn.setBackground(new java.awt.Color(0, 153, 255));
        VolverBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        VolverBtn.setForeground(new java.awt.Color(255, 255, 255));
        VolverBtn.setText("Volver");
        VolverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverBtnActionPerformed(evt);
            }
        });
        getContentPane().add(VolverBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 371, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Agregar Trofeo");

        TrofeoTxT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TrofeoTxT.setForeground(new java.awt.Color(255, 255, 255));
        TrofeoTxT.setText("Nombre del Trofeo:");

        Trofeo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        TipoTxT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TipoTxT.setForeground(new java.awt.Color(255, 255, 255));
        TipoTxT.setText("Tipo del Trofeo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(TrofeoTxT, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Trofeo, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(TipoTxT)
                        .addGap(131, 131, 131))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TrofeoTxT)
                    .addComponent(Trofeo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(TipoTxT)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AceptarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarBtnActionPerformed
        String juego = Juego.getText().trim();
        String trofeo = Trofeo.getText().trim();
        String tipo = String.valueOf(TipoCBx.getSelectedItem());
        if(!juego.isEmpty() && !trofeo.isBlank() && tipo!=null){
            try{
            switch (tipo){
                case "Platino":
                    psn.addTrophyTo(username, juego, trofeo, Trophy.PLATINO);
                    break;
                case "Oro":
                    psn.addTrophyTo(username, juego, trofeo, Trophy.ORO);
                    break;
                case "Plata":
                    psn.addTrophyTo(username, juego, trofeo, Trophy.PLATA);
                    break;
                case "Bronce":
                    psn.addTrophyTo(username, juego, trofeo, Trophy.BRONCE);
                    break;
            }
                System.out.println("Sirve");
            JOptionPane.showMessageDialog(null, "Se ha aregado el trofeo exitosamente", "Trofeo agregado", JOptionPane.INFORMATION_MESSAGE);
            PSNMenuUser psnmenu = new PSNMenuUser(username);
            psnmenu.setVisible(true);
            this.dispose();
            }catch(IOException e){
                
            }
        }else{
            JOptionPane.showMessageDialog(null, "Por favor llenar todo");
        }
    }//GEN-LAST:event_AceptarBtnActionPerformed

    private void VolverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverBtnActionPerformed
        try{
            PSNMenuUser psnmenu = new PSNMenuUser(username);
            psnmenu.setVisible(true);
            this.dispose();
        }catch(IOException e){
            
        }
    }//GEN-LAST:event_VolverBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AceptarBtn;
    private javax.swing.JTextField Juego;
    private javax.swing.JLabel JuegoTxT;
    private javax.swing.JComboBox<String> TipoCBx;
    private javax.swing.JLabel TipoTxT;
    private javax.swing.JTextField Trofeo;
    private javax.swing.JLabel TrofeoTxT;
    private javax.swing.JButton VolverBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
