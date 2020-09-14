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
@WebServlet(name = "DosNum", urlPatterns = {"/DosNum"})
public class DosNum extends HttpServlet {

   
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
        out.println("<title>Servlet Operaciones con dos numeros</title>");
        out.println("</head>");
        out.println("<style>");
        out.println(".hidden{display:none;}");
        out.println("</style>");
        out.println("<body>");
        out.println("<h1>Introducir Dos numeros y un operador</h1>");
        out.println("<br><br>");
        out.print("<form action='' method='POST'>");
        out.print("<div id='num' >");
        out.println("Introducir el primer numero:");
        out.println("<input type='number' name='n' min='1' required >");
        out.println("<br>");
        out.print("</div>");
        out.print("<div id='numm' >");
        out.println("Introducir el segundo numero:");
        out.println("<input type='number' name='nn' min='1' required >");
        out.println("<br>");
        out.print("</div>");
        out.print("<select name='operador' id='operador' required>");
        out.print("<option value='0' disabled selected >Elija una opcion</option>");
        out.print("<option value='1'>Suma</option>");
        out.print("<option value='2'>Resta</option>");
        out.print("<option value='3'>Multiplicacion</option>");
        out.print("<option value='4'>Division</option>");
        out.print("</select>");
        out.print("<br><br>");
        
        out.println("<input type='submit' value='Enviar'>");
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
        String op = request.getParameter("operador");
        String num1 = request.getParameter("n");
        String num2 = request.getParameter("nn");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
         try{
        out.println("<!DOCTYPE html><html>");
        out.println("<head>");
        out.println("<title>Operaciones</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Operaciones</h1>");
        out.println("<br>");
        if((Integer.parseInt(op) != 0) && (op != null)){
            if(Integer.parseInt(op)==1){
                int sum=Integer.parseInt(num1)+Integer.parseInt(num2);
                out.println("la suma es: "+sum+"");
            }
            if(Integer.parseInt(op)==2){
                int resta=Integer.parseInt(num1)-Integer.parseInt(num2);
                out.println("la resta es: "+resta+"");
            }
            if(Integer.parseInt(op)==3){
                int mul=Integer.parseInt(num1)*Integer.parseInt(num2);
                out.println("la multiplicacion es: "+mul+"");
            }
            if(Integer.parseInt(op)==4){
                float div=Float.parseFloat(num1)/Float.parseFloat(num2);
                out.println("la resta es: "+div+"");
            }
        }
        out.println("<footer>");
        out.println("<a href='index.html'>Volver al Inicio</a>");
        out.println("</footer>");
        out.println("</body>");
        out.println("</html>");
        } finally{
             out.println("porfavor selecione una operacion");
            out.close();
        }
      //  processRequest(request, response);
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
