/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import BUS.NavigationBUS;
import DTO.ListDTO;
import java.util.ArrayList;
import java.util.List;
public class test extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    public test() {
        initComponents();
        
        NavigationBUS nav = new NavigationBUS(jPnlContainer);
        nav.setView(jPnlOS, jLblOS);
        
        ArrayList<ListDTO> listItem = new ArrayList<>();
        listItem.add (new ListDTO ("OS & HW Info", jPnlOS, jLblOS));
        listItem.add (new ListDTO ("Memory", jPnlMemory, jLblMemory));
        listItem.add(new ListDTO("CPU",jPnlCPU,jLblCPU));
        listItem.add(new ListDTO("FileStore",jPnlFileStore,jlblFS));
        listItem.add(new ListDTO("Processes",jPnlProc,jLblProc));
        listItem.add(new ListDTO("USB Devices",jPnlUSB,jLblUSB));
        listItem.add(new ListDTO("Network",jPnlNetwork,jLblNetwork));
        nav.setEvent(listItem);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPnlHeader = new javax.swing.JPanel();
        jPnlMenu = new javax.swing.JPanel();
        jPnlOS = new javax.swing.JPanel();
        jLblOS = new javax.swing.JLabel();
        jPnlMemory = new javax.swing.JPanel();
        jLblMemory = new javax.swing.JLabel();
        jPnlCPU = new javax.swing.JPanel();
        jLblCPU = new javax.swing.JLabel();
        jPnlFileStore = new javax.swing.JPanel();
        jlblFS = new javax.swing.JLabel();
        jPnlProc = new javax.swing.JPanel();
        jLblProc = new javax.swing.JLabel();
        jPnlUSB = new javax.swing.JPanel();
        jLblUSB = new javax.swing.JLabel();
        jPnlNetwork = new javax.swing.JPanel();
        jLblNetwork = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        LogojLabel = new javax.swing.JLabel();
        jPnlContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 153, 255));
        getContentPane().setLayout(null);

        jPnlHeader.setBackground(new java.awt.Color(197, 235, 254));

        javax.swing.GroupLayout jPnlHeaderLayout = new javax.swing.GroupLayout(jPnlHeader);
        jPnlHeader.setLayout(jPnlHeaderLayout);
        jPnlHeaderLayout.setHorizontalGroup(
            jPnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPnlHeaderLayout.setVerticalGroup(
            jPnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPnlHeader);
        jPnlHeader.setBounds(163, 0, 800, 100);

        jPnlMenu.setBackground(new java.awt.Color(197, 235, 254));

        jPnlOS.setBackground(new java.awt.Color(180, 159, 220));
        jPnlOS.setPreferredSize(new java.awt.Dimension(176, 35));

        jLblOS.setBackground(new java.awt.Color(0, 255, 255));
        jLblOS.setText("Tour");

        javax.swing.GroupLayout jPnlOSLayout = new javax.swing.GroupLayout(jPnlOS);
        jPnlOS.setLayout(jPnlOSLayout);
        jPnlOSLayout.setHorizontalGroup(
            jPnlOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlOSLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLblOS)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPnlOSLayout.setVerticalGroup(
            jPnlOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLblOS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPnlMemory.setBackground(new java.awt.Color(180, 159, 220));
        jPnlMemory.setPreferredSize(new java.awt.Dimension(119, 35));

        jLblMemory.setText("Memory");

        javax.swing.GroupLayout jPnlMemoryLayout = new javax.swing.GroupLayout(jPnlMemory);
        jPnlMemory.setLayout(jPnlMemoryLayout);
        jPnlMemoryLayout.setHorizontalGroup(
            jPnlMemoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlMemoryLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLblMemory)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPnlMemoryLayout.setVerticalGroup(
            jPnlMemoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLblMemory, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPnlCPU.setBackground(new java.awt.Color(180, 159, 220));
        jPnlCPU.setPreferredSize(new java.awt.Dimension(119, 35));

        jLblCPU.setText("CPU");

        javax.swing.GroupLayout jPnlCPULayout = new javax.swing.GroupLayout(jPnlCPU);
        jPnlCPU.setLayout(jPnlCPULayout);
        jPnlCPULayout.setHorizontalGroup(
            jPnlCPULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlCPULayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLblCPU)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPnlCPULayout.setVerticalGroup(
            jPnlCPULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLblCPU, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPnlFileStore.setBackground(new java.awt.Color(180, 159, 220));
        jPnlFileStore.setPreferredSize(new java.awt.Dimension(119, 35));

        jlblFS.setText("FileStore");

        javax.swing.GroupLayout jPnlFileStoreLayout = new javax.swing.GroupLayout(jPnlFileStore);
        jPnlFileStore.setLayout(jPnlFileStoreLayout);
        jPnlFileStoreLayout.setHorizontalGroup(
            jPnlFileStoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlFileStoreLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jlblFS)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPnlFileStoreLayout.setVerticalGroup(
            jPnlFileStoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlblFS, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPnlProc.setBackground(new java.awt.Color(180, 159, 220));
        jPnlProc.setPreferredSize(new java.awt.Dimension(119, 35));

        jLblProc.setBackground(new java.awt.Color(153, 255, 153));
        jLblProc.setText("Processes");

        javax.swing.GroupLayout jPnlProcLayout = new javax.swing.GroupLayout(jPnlProc);
        jPnlProc.setLayout(jPnlProcLayout);
        jPnlProcLayout.setHorizontalGroup(
            jPnlProcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlProcLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLblProc)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPnlProcLayout.setVerticalGroup(
            jPnlProcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLblProc, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPnlUSB.setBackground(new java.awt.Color(180, 159, 220));
        jPnlUSB.setPreferredSize(new java.awt.Dimension(119, 35));

        jLblUSB.setText("USB Devices");

        javax.swing.GroupLayout jPnlUSBLayout = new javax.swing.GroupLayout(jPnlUSB);
        jPnlUSB.setLayout(jPnlUSBLayout);
        jPnlUSBLayout.setHorizontalGroup(
            jPnlUSBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlUSBLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLblUSB)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPnlUSBLayout.setVerticalGroup(
            jPnlUSBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLblUSB, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPnlNetwork.setBackground(new java.awt.Color(180, 159, 220));
        jPnlNetwork.setPreferredSize(new java.awt.Dimension(119, 35));

        jLblNetwork.setText("Network");

        javax.swing.GroupLayout jPnlNetworkLayout = new javax.swing.GroupLayout(jPnlNetwork);
        jPnlNetwork.setLayout(jPnlNetworkLayout);
        jPnlNetworkLayout.setHorizontalGroup(
            jPnlNetworkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlNetworkLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLblNetwork)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPnlNetworkLayout.setVerticalGroup(
            jPnlNetworkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLblNetwork, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        LogojLabel.setIcon(new javax.swing.ImageIcon("D:\\SGU\\HK1 21-22\\HardwareInfoTracker\\image\\G (2).png")); // NOI18N
        LogojLabel.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(LogojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(LogojLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPnlMenuLayout = new javax.swing.GroupLayout(jPnlMenu);
        jPnlMenu.setLayout(jPnlMenuLayout);
        jPnlMenuLayout.setHorizontalGroup(
            jPnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPnlOS, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
            .addComponent(jPnlMemory, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
            .addComponent(jPnlCPU, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
            .addComponent(jPnlFileStore, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
            .addComponent(jPnlProc, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
            .addComponent(jPnlUSB, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
            .addComponent(jPnlNetwork, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        jPnlMenuLayout.setVerticalGroup(
            jPnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlMenuLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPnlOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPnlMemory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPnlCPU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPnlFileStore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPnlProc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPnlUSB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPnlNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        getContentPane().add(jPnlMenu);
        jPnlMenu.setBounds(0, 0, 160, 520);

        jPnlContainer.setBackground(new java.awt.Color(161, 201, 241));

        javax.swing.GroupLayout jPnlContainerLayout = new javax.swing.GroupLayout(jPnlContainer);
        jPnlContainer.setLayout(jPnlContainerLayout);
        jPnlContainerLayout.setHorizontalGroup(
            jPnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPnlContainerLayout.setVerticalGroup(
            jPnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        getContentPane().add(jPnlContainer);
        jPnlContainer.setBounds(163, 95, 800, 420);

        setBounds(0, 0, 977, 552);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LogojLabel;
    private javax.swing.JLabel jLblCPU;
    private javax.swing.JLabel jLblMemory;
    private javax.swing.JLabel jLblNetwork;
    private javax.swing.JLabel jLblOS;
    private javax.swing.JLabel jLblProc;
    private javax.swing.JLabel jLblUSB;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPnlCPU;
    private javax.swing.JPanel jPnlContainer;
    private javax.swing.JPanel jPnlFileStore;
    private javax.swing.JPanel jPnlHeader;
    private javax.swing.JPanel jPnlMemory;
    private javax.swing.JPanel jPnlMenu;
    private javax.swing.JPanel jPnlNetwork;
    private javax.swing.JPanel jPnlOS;
    private javax.swing.JPanel jPnlProc;
    private javax.swing.JPanel jPnlUSB;
    private javax.swing.JLabel jlblFS;
    // End of variables declaration//GEN-END:variables
}