/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.fptuni.prj301.demo.servlet;

import com.fptuni.prj301.demo.Student.StudentDAO;
import com.fptuni.prj301.demo.Student.StudentDTO;
import com.fptuni.prj301.demo.User.UserDTO;
import com.fptuni.prj301.demo.utils.DBUtils;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DUNGHUYNH
 */
public class StudentServlet extends HttpServlet {

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
        
        
            String keyword = request.getParameter("keyword");
            String city = request.getParameter("city");
            
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out; 
        

            out = response.getWriter();
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet StudentListServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            
            RequestDispatcher rd1 = request.getRequestDispatcher("menu.html");
            rd1.include(request, response);
            
            out.println("<h1>Student List </h1>");
    
            UserDTO userDTO = (UserDTO) request.getAttribute("usersession");
            out.println("Login user:" + userDTO.getName() + " (" + userDTO.getUsername()+ ")");
            
            out.println("<table>");
            out.println("<tr><th>ID</th><th>First Name</th><th>Last Name</th></tr>");
            
            StudentDAO studentDAO = new StudentDAO();
            List<StudentDTO> list = studentDAO.list(keyword, city);
            
            
           
            for (StudentDTO student: list){
                   out.print("<tr><td>" + student.getId() + "</td> " 
                            + "<td>" + student.getFirstName() + "</td> " 
                            + "<td>" + student.getLastName() + "</td> </tr>"     );
            }
            
            
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");                

            out.flush();
            response.flushBuffer();

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
