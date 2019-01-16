package View;

public class TelaPrincipal extends javax.swing.JFrame {
    
    public TelaPrincipal() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        AreaTrabalho = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        btnCadastroUsuario = new javax.swing.JMenuItem();
        clientes = new javax.swing.JMenu();
        btnCadastroClientes = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");

        AreaTrabalho.setBackground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout AreaTrabalhoLayout = new javax.swing.GroupLayout(AreaTrabalho);
        AreaTrabalho.setLayout(AreaTrabalhoLayout);
        AreaTrabalhoLayout.setHorizontalGroup(
            AreaTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 699, Short.MAX_VALUE)
        );
        AreaTrabalhoLayout.setVerticalGroup(
            AreaTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 421, Short.MAX_VALUE)
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-arquivo-16.png"))); // NOI18N
        jMenu1.setText("Arquivo");
        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/user.png"))); // NOI18N
        jMenu2.setText("Usuarios");

        btnCadastroUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/user_add.png"))); // NOI18N
        btnCadastroUsuario.setText("Cadastro de Usuários");
        btnCadastroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroUsuarioActionPerformed(evt);
            }
        });
        jMenu2.add(btnCadastroUsuario);

        jMenuBar1.add(jMenu2);

        clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Grupos de usuarios.png"))); // NOI18N
        clientes.setText("Clientes");
        clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientesActionPerformed(evt);
            }
        });

        btnCadastroClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-adicionar-grupo-de-usuários-mulher-homem-16.png"))); // NOI18N
        btnCadastroClientes.setText("Cadastro de Clientes");
        btnCadastroClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroClientesActionPerformed(evt);
            }
        });
        clientes.add(btnCadastroClientes);

        jMenuBar1.add(clientes);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-services-16.png"))); // NOI18N
        jMenu7.setText("Configuração");
        jMenuBar1.add(jMenu7);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-informações-20.png"))); // NOI18N
        jMenu6.setText("Sobre");
        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AreaTrabalho)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AreaTrabalho)
        );

        setSize(new java.awt.Dimension(715, 480));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientesActionPerformed
        

    }//GEN-LAST:event_clientesActionPerformed

    private void btnCadastroClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroClientesActionPerformed
        TelaCadastroClientes telaclientes = new TelaCadastroClientes();
        AreaTrabalho.add(telaclientes);
        telaclientes.setVisible(true);
        
    }//GEN-LAST:event_btnCadastroClientesActionPerformed

    private void btnCadastroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroUsuarioActionPerformed
        TelaCadastroUsuario telausuario = new TelaCadastroUsuario();
        AreaTrabalho.add(telausuario);
        telausuario.setVisible(true);
        
    }//GEN-LAST:event_btnCadastroUsuarioActionPerformed
    
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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane AreaTrabalho;
    private javax.swing.JMenuItem btnCadastroClientes;
    private javax.swing.JMenuItem btnCadastroUsuario;
    private javax.swing.JMenu clientes;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    // End of variables declaration//GEN-END:variables
}
