package View;

import Model.Bean.Cliente;
import Model.DAO.ClienteDAO;
import javax.swing.table.DefaultTableModel;

public class AlterarCliente extends javax.swing.JFrame {

        
        
    public AlterarCliente() {
        initComponents();
        VisualizarTabela();
        setTitle("Alterar Dados");
    }
    
    
    
    
    public void VisualizarTabela() {
        DefaultTableModel modelo = (DefaultTableModel) tblClientes.getModel();
        modelo.setNumRows(0);
        ClienteDAO pdao = new ClienteDAO();

        //inserindo dados do BD para a tabela da interface gráfica
        for (Cliente c : pdao.Listar()) {

            modelo.addRow(new Object[]{
                c.getId(),
                c.getNome(),
                c.getCpf(),
                c.getTelefone()

            });
        }

    }
    
    public void LimparTexto(){
        txtNome.setText("");
        txtCpf.setText("");
        txtTelefone.setText("");
    }
    
    
    
     public void BuscarPorNome(String nome) {
        DefaultTableModel modelo = (DefaultTableModel) tblClientes.getModel();
        modelo.setNumRows(0);
        ClienteDAO pdao = new ClienteDAO();

        //inserindo dados do BD para a tabela da interface gráfica
        for (Cliente c : pdao.BuscarPorNome(nome)) {

            modelo.addRow(new Object[]{
                c.getId(),
                c.getNome(),
                c.getCpf(),
                c.getTelefone()

            });
        }

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        btnAlterar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        txtID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnBuscarNome = new javax.swing.JButton();
        txtBuscarNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Nome");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(25, 25, 50, 17);
        getContentPane().add(txtNome);
        txtNome.setBounds(25, 53, 397, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("CPF");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(25, 84, 40, 17);
        getContentPane().add(txtCpf);
        txtCpf.setBounds(25, 107, 397, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Telefone");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(25, 138, 60, 17);
        getContentPane().add(txtTelefone);
        txtTelefone.setBounds(25, 161, 397, 30);

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-repeat-25.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlterar);
        btnAlterar.setBounds(25, 271, 100, 30);

        tblClientes.setBackground(new java.awt.Color(153, 153, 153));
        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "CPF", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblClientes);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(440, 25, 568, 457);

        txtID.setEnabled(false);
        getContentPane().add(txtID);
        txtID.setBounds(25, 213, 48, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("ID");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(25, 192, 14, 17);

        btnBuscarNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-pesquisar-20.png"))); // NOI18N
        btnBuscarNome.setText("Buscar");
        btnBuscarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarNomeActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscarNome);
        btnBuscarNome.setBounds(10, 400, 100, 30);
        getContentPane().add(txtBuscarNome);
        txtBuscarNome.setBounds(120, 400, 300, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fundo_home.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 1020, 490);

        setSize(new java.awt.Dimension(1034, 532));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
        if (tblClientes.getSelectedRow() != -1) {
            Cliente c = new Cliente();
            ClienteDAO dao = new ClienteDAO();
            

            //Setando valores da caixa de texto no objeto Editar.
            c.setNome(txtNome.getText().toUpperCase());
            c.setCpf(txtCpf.getText().toUpperCase());
            c.setTelefone(txtTelefone.getText().toUpperCase());
            c.setId((int) tblClientes.getValueAt(tblClientes.getSelectedRow(), 0));
            dao.Editar(c);
        }
       
        LimparTexto();
        
        VisualizarTabela();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void tblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientesMouseClicked

        if (tblClientes.getSelectedRow() != -1) {
            txtID.setText(tblClientes.getValueAt(tblClientes.getSelectedRow(), 0).toString());
            txtNome.setText(tblClientes.getValueAt(tblClientes.getSelectedRow(), 1).toString());
            txtCpf.setText(tblClientes.getValueAt(tblClientes.getSelectedRow(), 2).toString());
            txtTelefone.setText(tblClientes.getValueAt(tblClientes.getSelectedRow(), 3).toString());
        }
        
    }//GEN-LAST:event_tblClientesMouseClicked

    private void btnBuscarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarNomeActionPerformed
        // TODO add your handling code here:
        BuscarPorNome(txtBuscarNome.getText().toUpperCase());
        txtBuscarNome.setText("");
    }//GEN-LAST:event_btnBuscarNomeActionPerformed

    
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
            java.util.logging.Logger.getLogger(AlterarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBuscarNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtBuscarNome;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
