package org.example.demo_jsp_module3.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.demo_jsp_module3.entity.KhachHang;
import org.example.demo_jsp_module3.service.IKhachHangService;
import org.example.demo_jsp_module3.service.KhachHangService;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "khachHangController", value = "/khach-hang")
public class KhachHangController extends HttpServlet {
    private IKhachHangService khachHangService = new KhachHangService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "add":
                req.getRequestDispatcher("/view/khachhang/add.jsp").forward(req,resp);
                break;
            default:
                List<KhachHang> khachHangList = khachHangService.findAll();
                req.setAttribute("khachHangList", khachHangList);
                req.getRequestDispatcher("/view/khachhang/list.jsp").forward(req,resp);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
