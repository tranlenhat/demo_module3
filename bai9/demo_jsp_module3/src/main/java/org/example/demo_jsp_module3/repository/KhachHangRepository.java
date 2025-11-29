package org.example.demo_jsp_module3.repository;

import org.example.demo_jsp_module3.entity.KhachHang;

import java.util.ArrayList;
import java.util.List;

public class KhachHangRepository implements IKhachHangRepository{
    private static List<KhachHang> khachHangList = new ArrayList<>();
    static {
        khachHangList.add(new KhachHang("Mai Van Hoan","1982-08-20","Ha Noi","img"));
        khachHangList.add(new KhachHang("Pham Van Nam","1971-08-21","Bac Giang","img"));
        khachHangList.add(new KhachHang("Nguyen Thai Hoa","1991-08-20","Ha Noi","img"));
        khachHangList.add(new KhachHang("Tran Dang Khoa","2000-08-20","Da Nang","img"));
        khachHangList.add(new KhachHang("Nguyen Dinh Thi","2001-08-20","Gia Lai","img"));
    }
    @Override
    public List<KhachHang> findAll() {
        return khachHangList;
    }
}
