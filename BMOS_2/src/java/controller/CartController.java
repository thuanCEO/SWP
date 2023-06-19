/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import cart.CART1;
import dao.ProductDAO;
import dto.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author THUAN
 */
public class CartController extends HttpServlet {

    private static final String CART = "viewCart.jsp";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        String url = CART;
        try {

            HttpSession session = request.getSession();

        } catch (Exception e) {
            log("Error at SearchController: " + e.toString());
        } finally {
            request.getRequestDispatcher(url).forward(request, response);
        }
//         try {
//            HttpSession session = request.getSession(false);
//            if (session != null) {
//                CART1 cart = (CART1) session.getAttribute("CART");
//                List<Product> listPlant = null;
//                if (cart != null) {
//                    Map<String, Integer> items = cart.getCart();
//                    if (items != null) {
//                        if (listPlant == null) {
//                            listPlant = new ArrayList<>();
//                        }
//                        ProductDAO dao = new ProductDAO();
//                        for (String item : items.keySet()) {
//                            int quantity = items.get(item);
//                            Product dto = dao.detailProduct(item);
//                            //dto.setQuantity(quantity);
//                            listPlant.add(dto);
//                        }
//                    }
//                    
//                }
//                session.setAttribute("LISTCART", listPlant);
//            }
//        } catch (SQLException ex) {
//            log("ViewCartController _ SQL: " + ex.getMessage());
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(CartController.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            request.getRequestDispatcher(url).forward(request, response);
//        }

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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(CartController.class.getName()).log(Level.SEVERE, null, ex);
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(CartController.class.getName()).log(Level.SEVERE, null, ex);
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
