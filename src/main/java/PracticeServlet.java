import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;


@WebServlet(name = "PracticeServlet", urlPatterns = "/practice-servlet")
public class PracticeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response){
        response.setContentType("text/html");

        try {
            PrintWriter out = response.getWriter();
            out.println("I did not copy and paste");
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
