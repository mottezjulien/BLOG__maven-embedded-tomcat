package fr.jmottez.lessons;

import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.getOutputStream().println("Hello World !!");
        List<String> list = new ArrayList<>();
        list.add("value1");
        list.add("value2");
        list.stream().forEach(value -> {
            try {
                res.getOutputStream().println(value);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });


    }

}
