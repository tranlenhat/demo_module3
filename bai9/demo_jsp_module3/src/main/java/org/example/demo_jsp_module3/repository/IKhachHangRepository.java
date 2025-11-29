package org.example.demo_jsp_module3.repository;

import org.example.demo_jsp_module3.entity.KhachHang;

import java.util.List;

public interface IKhachHangRepository {
    List<KhachHang> findAll();
}
