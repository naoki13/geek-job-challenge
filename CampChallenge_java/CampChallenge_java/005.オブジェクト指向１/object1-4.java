/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.sample;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author guest1Day
 */
@WebServlet(name = "object", urlPatterns = {"/object"})
public class object extends HttpServlet {
    
     public class FootballPlayer{
        //サッカープレイヤークラスを作成
        public int age= 0;
        public int back=0;
        //背番号と年齢を定義
        public void getAge(int age){
            this.age=age;
        }
        //プレイヤークラスに設定されている年齢を後に入力される値に更新するためのメソッド
        public void getBack(int back){
            this.back=back;
        }
        //同上
        public void printAge(PrintWriter out){
            out.print(age);
        }
        public void printBack(PrintWriter out){
            out.print(back);
        }
        
    }   
    public class Player extends FootballPlayer{
        public int getCleAge(){
            return age=0;
        }
        //受け取った値を0に戻す
        public int getCleBack(){
        return back=0;
    }
        //同上
    }
    
    
    

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
            out.println("<title>Servlet object</title>");            
            out.println("</head>");
            out.println("<body>");
            
            Player Pogba=new Player();
            
            Pogba.getAge(22);
            Pogba.getCleAge();
            
            Pogba.getBack(19);
            Pogba.getCleBack();
            
            
            Pogba.printAge(out);
            out.print("<br>");
            Pogba.printBack(out);
            
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
