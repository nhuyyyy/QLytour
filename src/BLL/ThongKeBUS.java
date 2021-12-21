package BLL;

import DAL.ThongKeDAO;
import DTO.ThongKe;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThongKeBUS {

    public static ThongKe tk;
    public static List<ThongKe> list_tk;

    public ThongKe thongKeChung(String a, String b) throws Exception {
        ThongKeDAO data = new ThongKeDAO();
        tk = data.getData(a, b);
        return tk;
    }

    public void doanhThu() throws Exception {
        ThongKeDAO data = new ThongKeDAO();
        list_tk = data.doanhthu();
    }

    public int[] dsMaTour() {
        ThongKeDAO data = new ThongKeDAO();
        return data.dsTour();
    }

    public void thongKeChiPhi(String maTour) throws Exception {
        ThongKeDAO data = new ThongKeDAO();
        list_tk = data.getChiPhi(maTour);
    }
}
