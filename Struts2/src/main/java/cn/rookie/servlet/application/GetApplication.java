package cn.rookie.servlet.application;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Rookie on 2016/5/5.
 * Description:
 * Project_name: Framework-base
 * Copyright (c) All Rights Reserved.
 */
public class GetApplication extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter pw = resp.getWriter();
        ServletContext sc = getServletConfig().getServletContext();
        pw.print(sc.getAttribute("counter"));

    }
}
