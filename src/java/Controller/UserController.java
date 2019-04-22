/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.UserModel;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserController extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        String proses=request.getParameter("proses");
         String action=request.getParameter("action");
     if (proses.equals("input-user")){
        response.sendRedirect("tambah_user.jsp");
     return;
     }
     else if(proses.equals("edit-user")){
            response.sendRedirect("edit.jsp?Kodebarang="+request.getParameter("Kodebarang"));
            return;
    }
     
else if(proses.equals("hapus-user")){
            UserModel hm=new UserModel();
            hm.setKodebarang(request.getParameter("Kodebarang"));
            hm.hapus();
            response.sendRedirect("");
        }
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
String data = request.getParameter("data");
   String proses = request.getParameter("proses");
        
    if (data != null){
       if(data.equals("user")){
            UserModel um=new UserModel();
            um.setKodebarang(request.getParameter("Kodebarang"));
            um.setNamabarang(request.getParameter("Namabarang"));
            um.setHargajual(request.getParameter("Hargajual"));
            um.setHargabeli(request.getParameter("Hargabeli"));
            um.setSatuan(request.getParameter("Satuan"));
            um.setKategori(request.getParameter("Kategori"));
             if (proses.equals("input-user")){
                  um.simpan();
             }
             

        else if (proses.equals("update-user")){
                    um.update();
                }
              else if(proses.equals("hapus-user")){
                    um.hapus();
                }
             response.sendRedirect("index.jsp");
            }
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
