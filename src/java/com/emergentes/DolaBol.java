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
@WebServlet(name = "DolaBol", urlPatterns = {"/DolaBol"})
public class DolaBol extends HttpServlet {

  
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
        out.println("<style>");
        out.println(".hidden{display:none;}");
        out.println("</style>");
        out.println("<body>");
        out.println("<h1>Convertir de bolivianos a dolares (viceversa)</h1>");
        out.println("<br><br>");
        out.print("<form action='' method='POST'>");
        out.print("<select name='seleccion' id='seleccion' onchange='a()' required>");
        out.print("<option value='0' disabled selected >Elija una opcion</option>");
        out.print("<option value='1'>Dolares a Bolivianos</option>");
        out.print("<option value='2'>Bolivianos a Dolares</option>");
        out.print("</select>");
        out.print("<br>");
        out.print("<div id='dol' class='hidden'>");
        out.println("Introducir dolares:");
        out.println("<input type='number' name='cant' min='1' required value='1'>$");
        out.println("<br>");
        out.print("</div>");
        out.print("<div id='bol' class='hidden'>");
        out.println("Introducir bolivianos:");
        out.println("<input type='number' name='cant2' min='1' required value='1'>Bs");
        out.println("<br>");
        out.print("</div>");
        out.println("<input type='submit' value='Enviar'>");
        out.println("</form>");
        out.println("<script>function a(){"
                + "if(document.getElementById('seleccion').value==1){"
                + "var elemento = document.getElementById('dol');elemento.className ='';"
                + "var elemento2 = document.getElementById('bol');elemento2.className ='hidden';"
                + "}else{"
                + "var elemento = document.getElementById('bol');elemento.className ='';"
                + "var elemento2 = document.getElementById('dol');elemento2.className ='hidden';"
                + "}"
                + "}</script>");
        out.println("</body>");
        out.println("</html>");
        } finally{
            out.close();
        }
        //processRequest(request, response);
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
               
                String tip = request.getParameter("seleccion");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        try{
        out.println("<!DOCTYPE html><html>");
        out.println("<head>");
        out.println("<title>Convertir</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Convertir Cantidades</h1>");
        out.println("<br>");
         
         int tip2=Integer.parseInt(tip);
        if((Integer.parseInt(tip)!=0)&&(tip != null)){
            if(tip2==1){
                 String cant = request.getParameter("cant");
                float cant2=Float.parseFloat(cant);
                double c = cant2 * 6.90;
                //dolares a bolivianos
                out.println("La cantidad es calculada en bolivianos es: <br>");
            out.println("Bolivianos (Bs): "+c+"<br>");
            }else{
                 String cant3 = request.getParameter("cant2");
                float cant2=Float.parseFloat(cant3);
                 double cc = cant2 / 6.90;
                 float x=(float) cc;
                //bolivianos a dolares
                out.println("La cantidad es calculada en dolares es: <br>");
            out.println("Dolares: ($) "+x+"<br>");
            }
            
        }else{
            out.println("No hay datos para mostrar");
        }
        out.println("<footer>");
        out.println("<a href='index.html'>Volver al Inicio</a>");
        out.println("</footer>");
        out.println("</body>");
        out.println("</html>");
        } finally{
            out.println("porfavor seleccione una opcion de conversion");
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
