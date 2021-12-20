/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import BLL.TourBUS;
import DTO.Tour;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class TourJpanel extends javax.swing.JPanel {

    /**
     * Creates new form TourJpanel
     */DefaultTableModel table;
    public TourJpanel() {
          
        initComponents();
       
        doDuLieuTenBang();
        txtMaTour.setEditable(false);
        try {
            TourBUS.setComboboxValues(cbLoaiTour);
        } catch (Exception ex) {
            Logger.getLogger(Tour.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        pInputTour = new javax.swing.JPanel();
        txtMaTour = new javax.swing.JTextField();
        lblMaTour = new javax.swing.JLabel();
        lblMaLoaiTour = new javax.swing.JLabel();
        lblTenTour = new javax.swing.JLabel();
        txtTenTour = new javax.swing.JTextField();
        cbLoaiTour = new javax.swing.JComboBox<>();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnQuayLai = new javax.swing.JButton();
        ctt = new javax.swing.JButton();
        lblTour = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTour = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(646, 711));
        setRequestFocusEnabled(false);

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(646, 711));

        pInputTour.setBackground(new java.awt.Color(153, 204, 255));
        pInputTour.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        pInputTour.setForeground(new java.awt.Color(255, 102, 102));

        txtMaTour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaTourActionPerformed(evt);
            }
        });

        lblMaTour.setText("Mã tour");

        lblMaLoaiTour.setText("Loại tour");

        lblTenTour.setText("Tên tour");

        txtTenTour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenTourActionPerformed(evt);
            }
        });

        cbLoaiTour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbLoaiTour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLoaiTourActionPerformed(evt);
            }
        });

        btnThem.setText("Thêm tour");
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

        btnXoa.setText("Xóa tour");
        btnXoa.setMaximumSize(new java.awt.Dimension(81, 23));
        btnXoa.setMinimumSize(new java.awt.Dimension(81, 23));
        btnXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnXoaMousePressed(evt);
            }
        });
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSuaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSuaMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSuaMousePressed(evt);
            }
        });
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnQuayLai.setText("Quay lại");
        btnQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuayLaiActionPerformed(evt);
            }
        });

        ctt.setText("Chi  tiết tour");
        ctt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cttMousePressed(evt);
            }
        });
        ctt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cttActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pInputTourLayout = new javax.swing.GroupLayout(pInputTour);
        pInputTour.setLayout(pInputTourLayout);
        pInputTourLayout.setHorizontalGroup(
            pInputTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pInputTourLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pInputTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pInputTourLayout.createSequentialGroup()
                        .addComponent(lblTenTour)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenTour))
                    .addGroup(pInputTourLayout.createSequentialGroup()
                        .addComponent(lblMaTour)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMaTour, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblMaLoaiTour)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbLoaiTour, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(btnQuayLai)
                .addGap(283, 283, 283))
            .addGroup(pInputTourLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnThem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ctt, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pInputTourLayout.setVerticalGroup(
            pInputTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInputTourLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pInputTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaTour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMaTour)
                    .addComponent(lblMaLoaiTour)
                    .addComponent(cbLoaiTour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQuayLai))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pInputTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenTour)
                    .addComponent(txtTenTour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pInputTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua)
                    .addComponent(ctt))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        lblTour.setBackground(new java.awt.Color(51, 51, 51));
        lblTour.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTour.setForeground(new java.awt.Color(0, 51, 255));
        lblTour.setText("DANH SÁCH TOUR DU LỊCH");
        lblTour.setToolTipText("");

        jtTour.setBackground(new java.awt.Color(204, 204, 204));
        jtTour.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã tour", "Loại tour", "Tên tour"
            }
        ));
        jtTour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtTourMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtTour);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(lblTour, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(pInputTour, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTour, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pInputTour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
                .addGap(18, 18, 18))
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

    private void txtMaTourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaTourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaTourActionPerformed

    private void txtTenTourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenTourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenTourActionPerformed

    private void cbLoaiTourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLoaiTourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbLoaiTourActionPerformed

    private void btnThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseClicked
        // TODO add your handling code here:
        TourBUS bus = new TourBUS();
        txtMaTour.setText(bus.remindMatour());
        DTO.Tour tour = new DTO.Tour();
        tour.setMatour(Integer.parseInt(txtMaTour.getText()));

        //txtMaNhanVien.setText(bus.remindManhanvien());
        txtMaTour.setText(bus.remindMatour());
        try {
            tour.setMaloaitour(bus.getMaLoaiTour(cbLoaiTour.getSelectedItem().toString()));
        } catch (Exception ex) {
            Logger.getLogger(Tour.class.getName()).log(Level.SEVERE, null, ex);
        }
        tour.setTentour(txtTenTour.getText());

        Vector head = new Vector();
        head.add(tour.getMatour());
        try {
            head.add(bus.getTenLoaiTour(tour.getMaloaitour()));
        } catch (Exception ex) {
            Logger.getLogger(TourJpanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        head.add(tour.getTentour());
        int rs = bus.Them(tour);
        if(rs == 1){
            table.addRow(head);
            jtTour.setModel(table);
            JOptionPane.showMessageDialog(null, "Thêm thành công");
        }
        cleanView();

    }//GEN-LAST:event_btnThemMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        int i = jtTour.getSelectedRow();
        if(i>=0){
            int result = JOptionPane.showConfirmDialog(null, "Xác nhận xóa ?", "Xác nhận",JOptionPane.YES_NO_OPTION);
            if(result == JOptionPane.YES_OPTION){
                TourBUS bus = new TourBUS();
                int check = bus.xoa(i);
                if(check == 1){
                    table.removeRow(i);
                    jtTour.setModel(table);
                    JOptionPane.showMessageDialog(null, "Xóa thành công");
                }
                cleanView();
            }
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaMouseClicked
        // TODO add your handling code here:
 
            ChinhsuatourJDialog form = new ChinhsuatourJDialog(Integer.parseInt(txtMaTour.getText()));
            form.setVisible(true);

        
    }//GEN-LAST:event_btnSuaMouseClicked

    private void btnSuaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSuaMouseEntered

    private void btnSuaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaMousePressed
    
    }//GEN-LAST:event_btnSuaMousePressed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuayLaiActionPerformed
       
    }//GEN-LAST:event_btnQuayLaiActionPerformed

    private void cttMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cttMousePressed
        
        ChitietTourJDialog ctt = new ChitietTourJDialog();
        ctt.setVisible(true);
    }//GEN-LAST:event_cttMousePressed

    private void cttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cttActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cttActionPerformed

    private void jtTourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtTourMouseClicked
        // TODO add your handling code here:
        int i = jtTour.getSelectedRow();
        if(i>=0) setTextFields(jtTour.getValueAt(i,0)+"",jtTour.getValueAt(i,1)+"",jtTour.getValueAt(i,2)+"");
    }//GEN-LAST:event_jtTourMouseClicked

    private void btnXoaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMousePressed
     int i = jtTour.getSelectedRow();
        if(i>=0){
            int result = JOptionPane.showConfirmDialog(null, "Xác nhận xóa ?", "Xác nhận",JOptionPane.YES_NO_OPTION);
            if(result == JOptionPane.YES_OPTION){
                TourBUS bus = new TourBUS();
                int check = bus.xoa(i);  
                if(check == 1){
                    table.removeRow(i);
                    jtTour.setModel(table);
                    JOptionPane.showMessageDialog(null, "Xóa thành công");
                } 
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbLoaiTour;
    private javax.swing.JButton ctt;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtTour;
    private javax.swing.JLabel lblMaLoaiTour;
    private javax.swing.JLabel lblMaTour;
    private javax.swing.JLabel lblTenTour;
    private javax.swing.JLabel lblTour;
    private javax.swing.JPanel pInputTour;
    private javax.swing.JTextField txtMaTour;
    private javax.swing.JTextField txtTenTour;
    // End of variables declaration//GEN-END:variables

public void doDuLieuTenBang()
    {
        TourBUS bus = new TourBUS();
        try {
            bus.docDuLieu();
            table = (DefaultTableModel) jtTour.getModel();
            //////////////arraylists
            table.setRowCount(0);
            for(DTO.Tour tour : bus.ds)
            {
                Vector vt = new Vector();
                vt.add(tour.getMatour());
                vt.add(bus.getTenLoaiTour(tour.getMaloaitour()));
                vt.add(tour.getTentour());
                table.addRow(vt);
            }
            jtTour.setModel(table);
        } catch (Exception ex) {
            Logger.getLogger(Tour.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void setTextFields(String matour, String loaitour, String tentour)
    {
        txtMaTour.setText(matour);
        cbLoaiTour.setSelectedItem(loaitour);
        txtTenTour.setText(tentour);
    }
     public void cleanView() //Xóa trắng các TextField
    {
        txtMaTour.setText("");
        txtTenTour.setText("");
        
    }
}
