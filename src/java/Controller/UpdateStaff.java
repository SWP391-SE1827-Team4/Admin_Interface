/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import DAO.DAOCustomer;
import DAO.DAOStaff;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Staff;

/**
 *
 * @author xuank
 */
public class UpdateStaff extends HttpServlet {

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
            String service = request.getParameter("service");
            String submit = request.getParameter("Submit");
            DAOStaff dao = new DAOStaff();
            
            if (service.equals("insertStaff")) {
                if (submit == null) {
                    request.getRequestDispatcher("insertProducts.jsp").forward(request, response);
                }
                // Retrieve parameters from the request
                String name = request.getParameter("name");
                String imageUrl = request.getParameter("imageUrl");
                float price = Float.parseFloat(request.getParameter("price"));
                String title = request.getParameter("title");
                String description = request.getParameter("description");
                int sellId = Integer.parseInt(request.getParameter("sellId"));
                int categoryId = Integer.parseInt(request.getParameter("categoryId"));
                int status = Integer.parseInt(request.getParameter("status"));

                // Create a new Product object with the retrieved parameters
//                Staff product = new Staff(status, imageUrl, description, title, description, imageUrl, sellId, imageUrl, imageUrl)
//                // Assume dao.insertProduct(product) inserts the product into the database
//                int success = dao.inSertProduct(product);
//                if (success > 0) {
//                    response.sendRedirect("admin");
//                }
//                response.sendRedirect("admin");
//                
            }
            
            if (service.equals("updateProduct")) {
                response.sendRedirect("UpdateAccount.jsp");
            }
            
            if (service.equals("deleteStaff")) {
                int id = Integer.parseInt(request.getParameter("uid"));
                dao.deleteAccount(id);
                response.sendRedirect("StaffURL");
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
