package org.example.demo_jsp_module3.service;

import org.example.demo_jsp_module3.entity.KhachHang;
import org.example.demo_jsp_module3.repository.KhachHangRepository;

import java.util.List;

public interface IKhachHangService {
    List<KhachHang> findAll();
}
