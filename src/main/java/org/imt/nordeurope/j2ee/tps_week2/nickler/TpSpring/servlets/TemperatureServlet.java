package org.imt.nordeurope.j2ee.tps_week2.nickler.TpSpring.servlets;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "Temperature", value = "/Temperature")
public class TemperatureServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        if(request.getParameter("action").equals("GetTempartures")){

        }

    }

}
