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
public class Register_New_Products extends javax.swing.JDialog {
    
    public void clearAllFields(){
        txt_nameProduct.setText("");
        txt_colorProduct.setText("");
        txt_price_purchase.setText("");
        txt_price_sale.setText("");
        txt_amount.setText("");
        cb_SizeProduct.setSelectedIndex(-1);
        txt_nameProduct.requestFocus();
    } 
    /**
     * Creates new form Register_Products
     */
    public Register_New_Products(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        cb_SizeProduct.setSelectedIndex(-1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_Background = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        txt_nameProduct = new javax.swing.JTextField();
        Size = new javax.swing.JLabel();
        txt_colorProduct = new javax.swing.JTextField();
        PurchasePrice = new javax.swing.JLabel();
        txt_price_sale = new javax.swing.JTextField();
        Color = new javax.swing.JLabel();
        cb_SizeProduct = new javax.swing.JComboBox<>();
        SalePrice = new javax.swing.JLabel();
        txt_price_purchase = new javax.swing.JTextField();
        Amount = new javax.swing.JLabel();
        txt_amount = new javax.swing.JTextField();
        btn_CancelProduct = new javax.swing.JLabel();
        btn_SaveProduct1 = new javax.swing.JLabel();
        btn_ClearProduct1 = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        pnl_Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        name.setForeground(new java.awt.Color(0, 0, 51));
        name.setText("Nome:");
        pnl_Background.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 60, 20));

        txt_nameProduct.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_nameProduct.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 51)));
        txt_nameProduct.setOpaque(false);
        pnl_Background.add(txt_nameProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 102, 420, 20));

        Size.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Size.setForeground(new java.awt.Color(0, 0, 51));
        Size.setText("Tamanho:");
        pnl_Background.add(Size, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 70, 20));

        txt_colorProduct.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_colorProduct.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 51)));
        txt_colorProduct.setOpaque(false);
        pnl_Background.add(txt_colorProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 290, 20));

        PurchasePrice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PurchasePrice.setForeground(new java.awt.Color(0, 0, 51));
        PurchasePrice.setText("P. Custo:");
        pnl_Background.add(PurchasePrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 70, 20));

        txt_price_sale.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_price_sale.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 51)));
        txt_price_sale.setOpaque(false);
        pnl_Background.add(txt_price_sale, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 70, 20));

        Color.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Color.setForeground(new java.awt.Color(0, 0, 51));
        Color.setText("Cor:");
        pnl_Background.add(Color, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 50, 20));

        cb_SizeProduct.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cb_SizeProduct.setForeground(new java.awt.Color(0, 0, 51));
        cb_SizeProduct.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PP", "P", "M", "G", "GG" }));
        cb_SizeProduct.setBorder(null);
        pnl_Background.add(cb_SizeProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 50, -1));

        SalePrice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SalePrice.setForeground(new java.awt.Color(0, 0, 51));
        SalePrice.setText("P. Venda:");
        pnl_Background.add(SalePrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 70, 20));

        txt_price_purchase.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_price_purchase.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 51)));
        txt_price_purchase.setOpaque(false);
        pnl_Background.add(txt_price_purchase, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 70, 20));

        Amount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Amount.setForeground(new java.awt.Color(0, 0, 51));
        Amount.setText("Qtd.:");
        pnl_Background.add(Amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 40, 20));

        txt_amount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_amount.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 51)));
        txt_amount.setOpaque(false);
        pnl_Background.add(txt_amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 70, 20));

        btn_CancelProduct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_CancelProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_cancelar.png"))); // NOI18N
        btn_CancelProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_CancelProductMouseClicked(evt);
            }
        });
        pnl_Background.add(btn_CancelProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 110, 40));

        btn_SaveProduct1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_SaveProduct1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_salvar.png"))); // NOI18N
        pnl_Background.add(btn_SaveProduct1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 110, 40));

        btn_ClearProduct1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_ClearProduct1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_limpar.png"))); // NOI18N
        btn_ClearProduct1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ClearProduct1MouseClicked(evt);
            }
        });
        pnl_Background.add(btn_ClearProduct1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 110, 40));

        Title.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Title.setForeground(new java.awt.Color(108, 81, 233));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Cadastrar novo produto");
        pnl_Background.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 613, 63));

        Background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tela_cadastro.png"))); // NOI18N
        pnl_Background.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(pnl_Background, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CancelProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CancelProductMouseClicked
        this.dispose();
    }//GEN-LAST:event_btn_CancelProductMouseClicked

    private void btn_ClearProduct1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ClearProduct1MouseClicked
        clearAllFields();
    }//GEN-LAST:event_btn_ClearProduct1MouseClicked

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
            java.util.logging.Logger.getLogger(Register_New_Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register_New_Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register_New_Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register_New_Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Register_New_Products dialog = new Register_New_Products(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Color;
    private javax.swing.JLabel PurchasePrice;
    private javax.swing.JLabel SalePrice;
    private javax.swing.JLabel Size;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel btn_CancelProduct;
    private javax.swing.JLabel btn_ClearProduct1;
    private javax.swing.JLabel btn_SaveProduct1;
    private javax.swing.JComboBox<String> cb_SizeProduct;
    private javax.swing.JLabel name;
    private javax.swing.JPanel pnl_Background;
    private javax.swing.JTextField txt_amount;
    private javax.swing.JTextField txt_colorProduct;
    private javax.swing.JTextField txt_nameProduct;
    private javax.swing.JTextField txt_price_purchase;
    private javax.swing.JTextField txt_price_sale;
    // End of variables declaration//GEN-END:variables
}
