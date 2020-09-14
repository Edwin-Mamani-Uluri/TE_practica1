/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kr1pt0n
 */
@WebServlet(name = "Dados", urlPatterns = {"/Dados"})
public class Dados extends HttpServlet {

  
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
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
              try{
        out.println("<!DOCTYPE html>");
        out.println("<html lang='es'>");
        out.println("<head>");
        out.println("<title>Dados</title>");
        out.println("</head>");
        out.println("<style>");
        out.println(".hidden{display:none;}");
        out.println("</style>");
        out.println("<body>");
        out.println("<h1>Dados</h1>");
        out.println("<br><br>");
        out.print("<form action='' method='POST'>");
        
        out.println("<input type='submit' value='Lanzar los dados'>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
        } finally{
            out.close();
        }
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
         response.setContentType("text/html");
        PrintWriter out = response.getWriter();
              try{
        out.println("<!DOCTYPE html>");
        out.println("<html lang='es'>");
        out.println("<head>");
        out.println("<title>Dados</title>");
        out.println("</head>");
        out.println("<style>");
        out.println(".hidden{display:none;}");
        out.println("</style>");
        out.println("<body>");
        out.println("<h1>Resultado</h1>");
        out.println("<br><br>");
        int d1=(int) (Math.random()*6 + 1);
        int d2=(int) (Math.random()*6 + 1);
        
        out.println("Primer Dado :  "+d1+"<br>");
        out.println("Egundo Dado :  "+d2+"<br>");
        if(d1+d2==7 || d1+d2==11){
            out.println("<h3>Ganaste</h3>");
        }else{
            out.println("<h3>Perdiste</h3>");
        }
        
        out.println("</body>");
        out.println("</html>");
        } finally{
            out.close();
        }
        //processRequest(request, response);
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
