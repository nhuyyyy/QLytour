package BLL;

import DTO.ListDTO;

import GUI.DoanJPanel;
import GUI.GiaPanel;
import GUI.KhachHangJPanel;

import GUI.NhanvienJPanel;
import GUI.ThongKe;
import GUI.TourJpanel;
import GUI.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.*;
public class NavigationBUS {
    private JPanel root;
    private String kindSelected = "";
    private ArrayList<ListDTO> listItem = null;
    public NavigationBUS (JPanel jpnRoot) {
        this.root = jpnRoot;
    }
    public void setView (JPanel jpnItem, JLabel jlbItem) {
        kindSelected = "Tour";
       
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add (new TourJpanel());
        root.validate();
        root.repaint ();
    }
    public void setEvent( ArrayList<ListDTO> listItem){
        this.listItem = listItem;
        for( var item : listItem) {
            item.getJlb().addMouseListener(new LabelEvent(item.getKind(), item.getJpn(), item.getJlb()));

        }
    }    
    class LabelEvent implements MouseListener {
        private JPanel node;
        private String kind;
        private JPanel jpnItem;
        private JLabel jlblItem;

        public LabelEvent(String kind, JPanel jpnItem, JLabel jLblItem) {
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlblItem = jLblItem;
        }
        
        
        @Override
        public void mousePressed(MouseEvent e) {
            switch (kind){
                case "Tour":
                    node = new TourJpanel();
                    break;
                case "Giá":
                    node = new GiaPanel();
                   
                    break;
                case "Đoàn" :
                    node = new DoanJPanel();
                     
                    break;
                case "Chi Phí":
                    node =new ChiPhiJPanel();
                    break;
                case "Khách hàng" :
                    node = new KhachHangJPanel();
                    break;
                  case "Nhân viên" :
                    node = new NhanvienJPanel();
                    break;
                  case "Thống kê" :
                    node = new ThongKe();

                    break;        
                   case "Loại Tour" :
                    node = new LoaitourJPanel();

                    break;  
                    case "Địa Điểm" :
                    node = new DiaDiemJPanel();

                    break;       
            default:
                break;
            }        
            root.removeAll();
            root.setLayout (new BorderLayout ());
            root.add (node);
            root.validate();
            root.repaint();
            setChangeBackgroud(kind);
        }
        @Override
        public void mouseClicked(MouseEvent e) {
           
        }
        @Override
        public void mouseReleased(MouseEvent e){
       
        }
        @Override
        public void mouseEntered (MouseEvent e){
//            jpnItem.setBackground (new Color (180,159,220));
//            jlblItem.setBackground (new Color (180,159,220));
        }
        @Override
        public void mouseExited(MouseEvent e){
//            if (!kindSelected.equalsIgnoreCase (kind)){
//                jpnItem.setBackground (new Color (119, 153, 204));
//                jlblItem.setBackground (new Color (119, 153, 204));
//            }    
        }
    }
    private void setChangeBackgroud (String kind){
        for (var item : listItem) {
            if(item.getKind ().equalsIgnoreCase (kind)) {
                item.getJpn ().setBackground (new Color (119, 153, 204));
                item.getJlb ().setBackground (new Color (119, 153, 204));
            }else{
                item.getJpn ().setBackground (new Color (180,159,220));
                item.getJlb().setBackground(new Color (180,159,220));
            }     
        }  
    }    
}
