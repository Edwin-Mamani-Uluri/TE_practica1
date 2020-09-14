/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kr1pt0n
 */
@WebServlet(name = "CalEdad", urlPatterns = {"/CalEdad"})
public class CalEdad extends HttpServlet {



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
        out.println("<title>servlet LeeParametros POST(formulario)</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Calcular la edad</h1>");
        out.println("<br><br>");
        out.print("<form action='' method='POST'>");
        out.println("Introducir el año de nacimiento:");
        out.println("<input type='number' name='fecha' required min='1980' max='2015'>");
        out.println("<br>");
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
        String fecha = request.getParameter("fecha");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        try{
        out.println("<!DOCTYPE html><html>");
        out.println("<head>");
        out.println("<title>servlet LeeParametros POST(formulario)</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>La Edad calculada</h1>");
        out.println("<br>");
        int e=2020-Integer.parseInt(fecha);
        if(fecha != null){
            out.println("La edad calculada es: <br>");
           // int e=fecha
            out.println("edad actual: "+e+"<br>");
        }else{
            out.println("No hay datos para mostrar");
        }
        out.println("<footer>");
        out.println("<a href='index.html'>Volver al Inicio</a>");
        out.println("</footer>");
        out.println("</body>");
        out.println("</html>");
        } finally{
            out.close();
        }
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
