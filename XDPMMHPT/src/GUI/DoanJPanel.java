/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import BUS.DoanBUS;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class DoanJPanel extends javax.swing.JPanel {

  DefaultTableModel table;
    /**
     * Creates new form Doan
     */
    public DoanJPanel() {
        initComponents();
      
        doDuLieuLenBang();
        setEditable(false);
        
    }
 public void setEditable(boolean flag){
        txtMaDoan.setEditable(false);
        txtMaTour.setEditable(true);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblQuanLy = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jdcNgayBD = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        txtMaDoan = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtMaTour = new javax.swing.JTextField();
        jdcNgayKT = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jt = new javax.swing.JTable();

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(646, 711));

        lblQuanLy.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblQuanLy.setForeground(new java.awt.Color(0, 0, 204));
        lblQuanLy.setText("QUẢN LÝ ĐOÀN");

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));

        btnThem.setText("Tạo mới");
        btnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThemMouseClicked(evt);
            }
        });
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSuaMouseClicked(evt);
            }
        });
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa đoàn");
        btnXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXoaMouseClicked(evt);
            }
        });

        jLabel5.setText("Ngày bắt đầu");

        jLabel1.setText("Mã đoàn");

        txtMaDoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaDoanActionPerformed(evt);
            }
        });

        jLabel2.setText("Mã tour");

        jLabel7.setText("Ngày kết thúc");

        jt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã đoàn", "Mã tour", "Ngày bắt đầu", "Ngày kết thúc"
            }
        ));
        jt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jt);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMaDoan, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMaTour, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jdcNgayBD, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jdcNgayKT, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))))
                .addGap(28, 28, 28))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(txtMaDoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)
                                .addComponent(txtMaTour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))
                            .addComponent(jdcNgayBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jdcNgayKT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnThem)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoa)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(lblQuanLy)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblQuanLy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(480, 480, 480))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseClicked
        // TODO add your handling code here:
        DoanBUS bus = new DoanBUS();
        DTO.Doan gt = new DTO.Doan();
        txtMaDoan.setText(bus.remindMaDoan());
        gt.setMadoan(Integer.parseInt(txtMaDoan.getText()));
        gt.setMatour(Integer.parseInt(txtMaTour.getText()));
        System.out.println(jdcNgayBD.getDate());
        gt.setNbd(jdcNgayBD.getDate());
        gt.setNkt(jdcNgayKT.getDate());

        Vector head = new Vector();
        head.add(gt.getMadoan());
        head.add(gt.getMatour());
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        head.add(format.format(gt.getNbd()));
        head.add(format.format(gt.getNkt()));

        int rs = bus.them(gt);
        if(rs == 1){
            table.addRow(head);
            jt.setModel(table);
            JOptionPane.showMessageDialog(null, "Thêm thành công");
        }else{
            JOptionPane.showMessageDialog(null, "Mã đã tồn tại. Thêm thất bại");
        }
    }//GEN-LAST:event_btnThemMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaMouseClicked
        // TODO add your handling code here:
        /* chinh sua phien ban cu
        DoanBUS bus = new DoanBUS();
        int i = jt.getSelectedRow();
        if(i>=0){

            int result = JOptionPane.showConfirmDialog(null, "Xác nhận sửa ?","Xác nhận",JOptionPane.YES_NO_OPTION);
            if(result == JOptionPane.YES_OPTION){
                DTO.Doan gt = new DTO.Doan();
                gt.setMadoan(Integer.parseInt(txtMaDoan.getText()));
                gt.setMatour(Integer.parseInt(txtMaTour.getText()));

                gt.setNbd(jdcNgayBD.getDate());
                gt.setNkt(jdcNgayKT.getDate());

                DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                Vector head = new Vector();
                head.add(gt.getMadoan());
                head.add(gt.getMatour());

                head.add(format.format(gt.getNbd()));
                head.add(format.format(gt.getNkt()));

                int check = bus.sua(i, gt);
                if(check == 1){
                    table.setValueAt(gt.getMatour(), i, 1);
                    table.setValueAt(format.format(gt.getNbd()), i, 2);
                    table.setValueAt(format.format(gt.getNkt()), i, 3);
                    jt.setModel(table);
                    JOptionPane.showMessageDialog(null, "Sửa thành công");
                }
            }
        }
        */
        if( jt.getSelectedRow() >= 0)
        {
            this.setVisible(false);
            GUI.ChinhSuaDoan csd = new ChinhSuaDoan(Integer.parseInt(txtMaDoan.getText()));
            csd.setVisible(true);
        }

    }//GEN-LAST:event_btnSuaMouseClicked

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseClicked
        // TODO add your handling code here:
        int i = jt.getSelectedRow();
        if(i>=0){
            int result = JOptionPane.showConfirmDialog(null, "Xác nhận xóa ?", "Xác nhận",JOptionPane.YES_NO_OPTION);
            if(result == JOptionPane.YES_OPTION){
                DoanBUS bus = new DoanBUS();
                int check = bus.xoa(i);
                if(check == 1){
                    table.removeRow(i);
                    jt.setModel(table);
                    JOptionPane.showMessageDialog(null, "Xóa thành công");
                }
            }
        }
    }//GEN-LAST:event_btnXoaMouseClicked

    private void txtMaDoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaDoanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaDoanActionPerformed

    private void jtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtMouseClicked
        // TODO add your handling code here:
        int i = jt.getSelectedRow();
        if(i>=0) setTextFields(jt.getValueAt(i,0)+"",jt.getValueAt(i,1)+"",jt.getValueAt(i,2)+"",jt.getValueAt(i,3)+"");
    }//GEN-LAST:event_jtMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private com.toedter.calendar.JDateChooser jdcNgayBD;
    private com.toedter.calendar.JDateChooser jdcNgayKT;
    private javax.swing.JTable jt;
    private javax.swing.JLabel lblQuanLy;
    private javax.swing.JTextField txtMaDoan;
    private javax.swing.JTextField txtMaTour;
    // End of variables declaration//GEN-END:variables

    private void doDuLieuLenBang() {
        DoanBUS bus = new DoanBUS();
        try {
            bus.docDuLieu();
            table = (DefaultTableModel) jt.getModel();
            
            table.setRowCount(0);
            for(DTO.Doan gt : bus.ds)
            {
                Vector vt = new Vector();
                vt.add(gt.getMadoan());
                vt.add(gt.getMatour());
            
                vt.add(gt.getNbd());
                vt.add(gt.getNkt());
                table.addRow(vt);
            }
            jt.setModel(table);
        } catch (Exception ex) {
            Logger.getLogger(Tour.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }

    private void setTextFields(String madoan, String matour, String ngaybd, String ngaykt) {
        txtMaDoan.setText(madoan);
        txtMaTour.setText(matour);
     
        try {
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            jdcNgayBD.setDate(dateFormat.parse(ngaybd));
            jdcNgayKT.setDate(dateFormat.parse(ngaykt));
        } catch (ParseException ex) {
            Logger.getLogger(Doan.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }}
