import com.google.gson.Gson;
import data.DaoFactory;
import data.Movie;
import data.MoviesDao;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet(name = "MovieServlet", urlPatterns = "/movies")
public class MovieServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("application/json");

        try {
            PrintWriter out = response.getWriter();
//            Movie movie = new Movie("King Kong", 5, "nada", 1942, "Harry Carey", "Tom Cruise", "Cheap", "lol", 1);

            MoviesDao moviesDao = DaoFactory.getMoviesDao(DaoFactory.ImplType.MYSQL);

            String movieString = new Gson().toJson(moviesDao.all());

            out.println(movieString);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }


    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("application/json");
        Movie[] movies = new Gson().fromJson(request.getReader(), Movie[].class);
        PrintWriter out = response.getWriter();
        try {

            DaoFactory.getMoviesDao(DaoFactory.ImplType.MYSQL).insertAll(movies);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            response.setStatus(500);
            ex.printStackTrace();
            return;
        }
        out.println(new Gson().toJson("{message: \"Movies POST was successful\""));
        response.setStatus(200);

    }


    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response) throws IOException, IllegalStateException {
        response.setContentType("application/json");

        PrintWriter out = response.getWriter();

        try {
            Movie movie = new Gson().fromJson(request.getReader(), Movie.class);
            DaoFactory.getMoviesDao(DaoFactory.ImplType.MYSQL).update(movie);
        } catch (SQLException e) {
            out.println(new Gson().toJson(e.getLocalizedMessage()));
            response.setStatus(500);
            e.printStackTrace();
            return;
        } catch (Exception e) {
            out.println(new Gson().toJson(e.getLocalizedMessage()));
            response.setStatus(400);
            e.printStackTrace();
            return;
        }

        out.println(new Gson().toJson("{message: \"Movie UPDATE was successful\"}"));
        response.setStatus(200);

    }

    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("application/json");
        PrintWriter out = null;

        try {
            var id = new Gson().fromJson(request.getReader(), int.class);
            DaoFactory.getMoviesDao(DaoFactory.ImplType.MYSQL).destroy(id);
        } catch (SQLException | IOException e) {
            out.println(new Gson().toJson(e.getLocalizedMessage()));
            response.setStatus(500);
            e.printStackTrace();
            return;
        }

        out.println(new Gson().toJson("{message: \"Movie DELETE was successful\"}"));

    }


}
