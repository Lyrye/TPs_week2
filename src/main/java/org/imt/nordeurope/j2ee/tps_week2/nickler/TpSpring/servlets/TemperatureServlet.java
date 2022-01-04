package org.imt.nordeurope.j2ee.tps_week2.nickler.TpSpring.servlets;

import org.imt.nordeurope.j2ee.tps_week2.nickler.TpSpring.Bean.TemperatureBeanImpl;
import org.imt.nordeurope.j2ee.tps_week2.nickler.TpSpring.Bean.TemperatureMain;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "Temperature", value = "/Temperature")
public class TemperatureServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {


        if(request.getParameter("action") !=null && request.getParameter("action").equals("GetTempartures")){
            request.setAttribute("fr",TemperatureMain.frBean);
            request.setAttribute("de",TemperatureMain.deBean);
            request.setAttribute("en",TemperatureMain.enBean);
        }
        RequestDispatcher requestDispatcher;
        requestDispatcher = getServletContext().getRequestDispatcher("/Temperature.jsp");
        requestDispatcher.forward(request, response);

    }
}
