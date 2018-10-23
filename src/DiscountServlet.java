import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", urlPatterns = "/display-discount")
public class DiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String productDescription = request.getParameter("ProductDescription");
        double listPrice = Double.parseDouble(request.getParameter("ListPrice"));
        double discountPercent = Double.parseDouble(request.getParameter("DiscountPercent"));
        double discountAmount, discountPrice;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        discountAmount = (int) (listPrice * discountPercent * 0.01);
        discountPrice = listPrice - discountAmount;
        writer.println("<br>Product Description: " + productDescription);
        writer.println("<br>List Price: " + listPrice);
        writer.println("<br>Discount Percent: " + discountPercent);
        writer.println("<br>----->Discount Price: " + discountPrice);
        writer.println("<html/>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
