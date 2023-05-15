import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet_Product_Discount_Calculator", value = "/index")
public class Servlet_Product_Discount_Calculator extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description = request.getParameter("description");
        float price = Float.parseFloat(request.getParameter("price"));
        float discount = Float.parseFloat(request.getParameter("discount"));

        float discount_amount = (float) (price * discount * 0.01);
        float discount_price = price - discount_amount;
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("Discount Amount : " + discount_amount);
        writer.println("<br>");
        writer.println("Discount Price : " + discount_price);
        writer.println("<br>");
        writer.println("Product Description : " + description);
        writer.println("</html>");
    }
}
