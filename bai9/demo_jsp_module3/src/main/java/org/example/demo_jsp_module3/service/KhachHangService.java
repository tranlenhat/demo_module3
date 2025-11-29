package org.example.demo_jsp_module3.service;

import org.example.demo_jsp_module3.entity.KhachHang;
import org.example.demo_jsp_module3.repository.IKhachHangRepository;
import org.example.demo_jsp_module3.repository.KhachHangRepository;

import java.util.List;

public class KhachHangService implements IKhachHangService{
    private IKhachHangRepository khachHangRepository = new KhachHangRepository();
    @Override
    public List<KhachHang> findAll() {
        return khachHangRepository.findAll();
    }
}
