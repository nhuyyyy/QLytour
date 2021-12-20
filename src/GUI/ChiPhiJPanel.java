/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import BLL.LoaiChiPhiBUS;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class ChiPhiJPanel extends javax.swing.JPanel {
DefaultTableModel table;
    /**
     * Creates new form ChiPhiJPanel
     */
    public ChiPhiJPanel() {
          initComponents();
       
        doDuLieuLenBang();
        txtMaLoaiChiPhi.setEditable(false);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jt = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lblMaDiadiem = new javax.swing.JLabel();
        txtMaLoaiChiPhi = new javax.swing.JTextField();
        lblTenDiaDiem = new javax.swing.JLabel();
        txtTenLoaiChiPhi = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnQuayLai = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(646, 711));

        lblQuanLy.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblQuanLy.setForeground(new java.awt.Color(0, 0, 204));
        lblQuanLy.setText("QUẢN LÝ LOẠI CHI PHÍ");

        jt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã loại chi phí", "Tên loại chi phí"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        lblMaDiadiem.setText("Mã loại chi phí");

        lblTenDiaDiem.setText("Tên loại chi phí");

        btnThem.setText("Tạo mới");
        btnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThemMouseClicked(evt);
            }
        });

        btnSua.setText("Chỉnh sừa");
        btnSua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSuaMouseClicked(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXoaMouseClicked(evt);
            }
        });
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnQuayLai.setText("Quay lại");
        btnQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuayLaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblMaDiadiem, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMaLoaiChiPhi, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTenDiaDiem)
                        .addGap(18, 18, 18)
                        .addComponent(txtTenLoaiChiPhi, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 46, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnQuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaDiadiem)
                    .addComponent(txtMaLoaiChiPhi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTenDiaDiem)
                    .addComponent(txtTenLoaiChiPhi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(btnQuayLai))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(lblQuanLy, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(lblQuanLy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 102, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtMouseClicked
        // TODO add your handling code here:
        int i = jt.getSelectedRow();
        if(i>=0) setTextFields(jt.getValueAt(i,0)+"",jt.getValueAt(i,1)+"");
    }//GEN-LAST:event_jtMouseClicked

    private void btnThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseClicked
        // TODO add your handling code here:
        LoaiChiPhiBUS bus = new LoaiChiPhiBUS();
        txtMaLoaiChiPhi.setText(bus.remindMaloaichiphi());
        DTO.LoaiChiPhi dd = new DTO.LoaiChiPhi();
        dd.setMaloaichiphi(Integer.parseInt(txtMaLoaiChiPhi.getText()));
        dd.setTenloaichiphi(txtTenLoaiChiPhi.getText().toString());

        Vector head = new Vector();
        head.add(dd.getMaloaichiphi());
        head.add(dd.getTenloaichiphi());

        int rs = bus.them(dd);
        if(rs == 1){
            table.addRow(head);
            jt.setModel(table);
            JOptionPane.showMessageDialog(null, "Thêm thành công");
        }else{
            JOptionPane.showMessageDialog(null, "Mã đã tồn tại. Thêm thất bại");
        }
cleanView();
    }//GEN-LAST:event_btnThemMouseClicked

    private void btnSuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaMouseClicked
        // TODO add your handling code here:
        LoaiChiPhiBUS bus = new LoaiChiPhiBUS();
        int i = jt.getSelectedRow();
        if(i>=0){

            int result = JOptionPane.showConfirmDialog(null, "Xác nhận sửa ?","Xác nhận",JOptionPane.YES_NO_OPTION);
            if(result == JOptionPane.YES_OPTION){
                DTO.LoaiChiPhi dd = new DTO.LoaiChiPhi();
                dd.setMaloaichiphi(Integer.parseInt(txtMaLoaiChiPhi.getText()));
                dd.setTenloaichiphi(txtTenLoaiChiPhi.getText());

                Vector head = new Vector();
                head.add(dd.getMaloaichiphi());
                head.add(dd.getTenloaichiphi());
                int check = bus.sua(i, dd);
                if(check == 1){
                    table.setValueAt(dd.getTenloaichiphi(), i, 1);
                    jt.setModel(table);
                    JOptionPane.showMessageDialog(null, "Sửa thành công");
                }
                cleanView();
            }
        }
    }//GEN-LAST:event_btnSuaMouseClicked

    private void btnXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseClicked
        // TODO add your handling code here:
        int i = jt.getSelectedRow();
        if(i>=0){
            int result = JOptionPane.showConfirmDialog(null, "Xác nhận xóa ?", "Xác nhận",JOptionPane.YES_NO_OPTION);
            if(result == JOptionPane.YES_OPTION){
                LoaiChiPhiBUS bus = new LoaiChiPhiBUS();
                int check = bus.xoa(i);
                if(check == 1){
                    table.removeRow(i);
                    jt.setModel(table);
                    JOptionPane.showMessageDialog(null, "Xóa thành công");
                }
                cleanView();
                
            }
        }
    }//GEN-LAST:event_btnXoaMouseClicked

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuayLaiActionPerformed

    }//GEN-LAST:event_btnQuayLaiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jt;
    private javax.swing.JLabel lblMaDiadiem;
    private javax.swing.JLabel lblQuanLy;
    private javax.swing.JLabel lblTenDiaDiem;
    private javax.swing.JTextField txtMaLoaiChiPhi;
    private javax.swing.JTextField txtTenLoaiChiPhi;
    // End of variables declaration//GEN-END:variables
  private void doDuLieuLenBang() {
        
        LoaiChiPhiBUS bus = new LoaiChiPhiBUS();
        try {
            bus.docDuLieu();
            table = (DefaultTableModel) jt.getModel();
            
            table.setRowCount(0);
            for(DTO.LoaiChiPhi dd : bus.ds)
            {
                Vector vt = new Vector();
                vt.add(dd.getMaloaichiphi());
                vt.add(dd.getTenloaichiphi());
                table.addRow(vt);
            }
            jt.setModel(table);
        } catch (Exception ex) {
            Logger.getLogger(TourJpanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void setTextFields(String string, String string0) {
        
        txtMaLoaiChiPhi.setText(string);
        txtTenLoaiChiPhi.setText(string0);
    }
      public void cleanView() //Xóa trắng các TextField
    {
        txtMaLoaiChiPhi.setText("");
        txtTenLoaiChiPhi.setText("");
        
    }
}
