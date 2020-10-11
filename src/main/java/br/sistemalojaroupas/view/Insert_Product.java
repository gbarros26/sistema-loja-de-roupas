/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistemalojaroupas.view;

/**
 *
 * @author lukas
 */
public class Insert_Product extends javax.swing.JDialog {

    /**
     * Creates new form Insert_Product
     */
    public Insert_Product(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        txt_nameProduct = new javax.swing.JTextField();
        Color = new javax.swing.JLabel();
        txt_colorProduct = new javax.swing.JTextField();
        PurchasePrice = new javax.swing.JLabel();
        txt_price_purchase = new javax.swing.JTextField();
        SalePrice = new javax.swing.JLabel();
        txt_price_sale = new javax.swing.JTextField();
        Size = new javax.swing.JLabel();
        cb_SizeProduct = new javax.swing.JComboBox<>();
        Amount = new javax.swing.JLabel();
        txt_amount = new javax.swing.JTextField();
        name1 = new javax.swing.JLabel();
        txt_codProduct = new javax.swing.JTextField();
        btn_searchCod = new javax.swing.JButton();
        btn_AddProduct = new javax.swing.JLabel();
        btn_ClearProduct = new javax.swing.JLabel();
        btn_CancelProduct = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(108, 81, 233));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Inserir Produto");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 0, 610, 60));

        name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        name.setForeground(new java.awt.Color(0, 0, 51));
        name.setText("Nome:");
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 60, 20));

        txt_nameProduct.setEditable(false);
        txt_nameProduct.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_nameProduct.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 51)));
        txt_nameProduct.setOpaque(false);
        jPanel1.add(txt_nameProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 420, 20));

        Color.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Color.setForeground(new java.awt.Color(0, 0, 51));
        Color.setText("Cor:");
        jPanel1.add(Color, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 50, 20));

        txt_colorProduct.setEditable(false);
        txt_colorProduct.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_colorProduct.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 51)));
        txt_colorProduct.setOpaque(false);
        jPanel1.add(txt_colorProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 290, 20));

        PurchasePrice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PurchasePrice.setForeground(new java.awt.Color(0, 0, 51));
        PurchasePrice.setText("P. Custo:");
        jPanel1.add(PurchasePrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 70, 20));

        txt_price_purchase.setEditable(false);
        txt_price_purchase.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_price_purchase.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 51)));
        txt_price_purchase.setOpaque(false);
        jPanel1.add(txt_price_purchase, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 70, 20));

        SalePrice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SalePrice.setForeground(new java.awt.Color(0, 0, 51));
        SalePrice.setText("P. Venda:");
        jPanel1.add(SalePrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 70, 20));

        txt_price_sale.setEditable(false);
        txt_price_sale.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_price_sale.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 51)));
        txt_price_sale.setOpaque(false);
        jPanel1.add(txt_price_sale, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 70, 20));

        Size.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Size.setForeground(new java.awt.Color(0, 0, 51));
        Size.setText("Tamanho:");
        jPanel1.add(Size, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 70, 20));

        cb_SizeProduct.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cb_SizeProduct.setForeground(new java.awt.Color(0, 0, 51));
        cb_SizeProduct.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PP", "P", "M", "G", "GG" }));
        cb_SizeProduct.setBorder(null);
        jPanel1.add(cb_SizeProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 40, -1));

        Amount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Amount.setForeground(new java.awt.Color(0, 0, 51));
        Amount.setText("Qtd.:");
        jPanel1.add(Amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 40, 20));

        txt_amount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_amount.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 51)));
        txt_amount.setOpaque(false);
        jPanel1.add(txt_amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 70, 20));

        name1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        name1.setForeground(new java.awt.Color(0, 0, 51));
        name1.setText("Código:");
        jPanel1.add(name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 60, 20));

        txt_codProduct.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_codProduct.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 51)));
        txt_codProduct.setOpaque(false);
        jPanel1.add(txt_codProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 90, 20));

        btn_searchCod.setBackground(new java.awt.Color(204, 204, 204));
        btn_searchCod.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_searchCod.setForeground(new java.awt.Color(0, 0, 51));
        btn_searchCod.setText("Pesquisar");
        jPanel1.add(btn_searchCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, -1, 23));

        btn_AddProduct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_AddProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_adicionarEscuro.png"))); // NOI18N
        jPanel1.add(btn_AddProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 110, 40));

        btn_ClearProduct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_ClearProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_limpar.png"))); // NOI18N
        jPanel1.add(btn_ClearProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 110, 40));

        btn_CancelProduct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_CancelProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_cancelar.png"))); // NOI18N
        btn_CancelProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_CancelProductMouseClicked(evt);
            }
        });
        jPanel1.add(btn_CancelProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 110, 40));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tela_cadastro.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CancelProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CancelProductMouseClicked
        this.dispose();
    }//GEN-LAST:event_btn_CancelProductMouseClicked

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
            java.util.logging.Logger.getLogger(Insert_Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insert_Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insert_Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insert_Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Insert_Product dialog = new Insert_Product(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Amount;
    private javax.swing.JLabel Color;
    private javax.swing.JLabel PurchasePrice;
    private javax.swing.JLabel SalePrice;
    private javax.swing.JLabel Size;
    private javax.swing.JLabel btn_AddProduct;
    private javax.swing.JLabel btn_CancelProduct;
    private javax.swing.JLabel btn_ClearProduct;
    private javax.swing.JButton btn_searchCod;
    private javax.swing.JComboBox<String> cb_SizeProduct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel name;
    private javax.swing.JLabel name1;
    private javax.swing.JTextField txt_amount;
    private javax.swing.JTextField txt_codProduct;
    private javax.swing.JTextField txt_colorProduct;
    private javax.swing.JTextField txt_nameProduct;
    private javax.swing.JTextField txt_price_purchase;
    private javax.swing.JTextField txt_price_sale;
    // End of variables declaration//GEN-END:variables
}
