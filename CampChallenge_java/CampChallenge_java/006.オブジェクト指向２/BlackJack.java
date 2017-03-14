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

import java.util.ArrayList;

abstract class Human{
    abstract public Integer Open();
    abstract public boolean checkSum();
    ArrayList<Integer>myCards=new ArrayList<>();
    abstract public void setCard(ArrayList<Integer> sCard);
}


/**
 *
 * @author guest1Day
 */
@WebServlet(name = "BlackJack", urlPatterns = {"/BlackJack"})
public class BlackJack extends HttpServlet {

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
            out.println("<title>Servlet BlackJack</title>");            
            out.println("</head>");
            out.println("<body>");
            
            Dealer D=new Dealer();       //ディーラーのインスタンスを生成
            User U=new User();           //プレイヤーのインスタンスを生成
            
            D.setCard(D.deal());         //ディーラーのハンドを確定
            U.setCard(D.deal());         //プレイヤーのハンドを確定
            
            while(D.checkSum()){         //ディーラーのハンドが16以下ならヒット
                D.setCard(D.hit());      //17以上ならスタンド
            }
            while(U.checkSum()){         //ディーラーのハンドが16以下ならヒット
                U.setCard(D.hit());      //17以上ならスタンド
            }
            
            String msg="";
            if(U.Open()>=22){            //プレイヤーのハンドが22を超えていないか
                msg="BURST!!";           //超えてたらディーラーのハンド関係なしに負け
            }else if(D.Open()>=22){      //ディーラーのハンドが22を超えていないか
                msg="YOU WIN!!";         //超えてたらプレイヤーの勝ち(プレイヤー<22の前提)
            }else if(U.Open()>D.Open()){ //両者ハンド比較
                msg="YOU WIN!!";         //ディーラーより高ければ勝ち
            }else if(U.Open()==D.Open()){//引き分けか判断
                msg="PUSH";              //引き分けならPUSH
            }else{                       //ディーラーより低ければ負け
                msg="YOU LOSE";          //出直してこい
            }
            
            out.print("ディーラーのハンドは"+D.Open()+"<br>");
            out.print("あなたのハンドは"+U.Open()+"<br>");
            out.print(msg);
            
            
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
