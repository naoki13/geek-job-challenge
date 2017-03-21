/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.*;
import java.util.*;
/**
 *
 * @author guest1Day
 */
@WebServlet(name = "BasicClass", urlPatterns = {"/BasicClass"})
public class BasicClass extends HttpServlet {
    
    

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet BasicClass</title>");            
            out.println("</head>");
            out.println("<body>");
            
            String k="<br>";
            Currency US=Currency.getInstance(Locale.US);
            Currency I=Currency.getInstance(Locale.ITALY);
            Currency J=Currency.getInstance(Locale.JAPAN);
            Currency C=Currency.getInstance(Locale.CHINA);
            Currency CA=Currency.getInstance(Locale.CANADA);
            
            Date sta=new Date();
            Date end=new Date();
            
            File txt=new File("text.txt");
            FileReader fr=new FileReader(txt);
            BufferedReader br=new BufferedReader(fr);
            FileWriter fw=new FileWriter(txt);
            
            fw.write("開始"+sta);
            fw.write(k);
            fw.write("アメリカの通貨は："+US);
            fw.write(k);
            fw.write("イタリアの通貨は："+I);
            fw.write(k);
            fw.write("日本の通貨は："+J);
            fw.write(k);
            fw.write("中国の通貨は："+C);
            fw.write(k);
            fw.write("カナダの通貨は："+CA);
            fw.write(k);
            fw.write("終了"+end);
            
            fw.close();
            
            String str=br.readLine();
            out.print(str);
            
            br.close();
            
            
            
            
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
