package BUS;

import DAO.ThongKeDAO;
import DAO.ThongKeDAO;
import DTO.ThongKe;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThongKeBUS {

    public static ThongKe tk;

    public ThongKe thongKeChung(String a, String b) throws Exception{
        ThongKeDAO data = new ThongKeDAO();
        tk = data.getData(a, b);
        return tk;
    }
    
    public float doanhthu(String a, String b){
        ThongKeDAO data = new ThongKeDAO();
        return data.doanhthu(a, b);
    }
}
