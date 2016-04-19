package cn.rookie.framework;

import cn.rookie.framework.bean.ActionMapping;
import cn.rookie.framework.bean.ActionMappingManager;
import cn.rookie.framework.bean.Result;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Rookie on 2016/4/19.
 * 核心控制器，此项目只有这一个Servlet
 * 1.  拦截所有为 *.action 后缀的请求
 * 2.  拦截之后才能找对应的类进行处理
 */
public class ActionServlet extends HttpServlet{
    private ActionMappingManager actionMappingManager;
    /**
     * 第一次访问的时候会执行，且只执行一次,将配置文件的内容读取到内存中，然后根据访问时候的url从中找对应的处理类
     * @throws ServletException
     */
    @Override
    public void init() throws ServletException {
        System.out.println("初次使用时候执行，用来加载配置文件");
        actionMappingManager = new ActionMappingManager();
    }

    /**
     * 处理用户请求 http://localhost:8080/mystruts/login.action 请求是一串url
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            String uri = req.getRequestURI();
            String actionName = uri.substring(uri.lastIndexOf("/") + 1, uri.indexOf(".action"));
            System.out.println("获取的action name为"+actionName);

            ActionMapping actionMapping = actionMappingManager.getActionMapping(actionName);
            String className = actionMapping.getClassName();
            String methodName = actionMapping.getMethodName();
            System.out.println(className + " : " + methodName);

            Class<?> clazz = Class.forName(className);
            Object object = clazz.newInstance();
            Method method = clazz.getDeclaredMethod(methodName, HttpServletRequest.class, HttpServletResponse.class);
            String returnFlag = (String) method.invoke(object, req, resp);
            System.out.println("returnFlag " + returnFlag);

            Result result = actionMapping.getResults().get(returnFlag);
            String type = result.getType();
            String page = result.getPage();
            System.out.println(type +":" +page);
            if ("redirect".equals(type)) {
                resp.sendRedirect(req.getContextPath() + "/index.jsp");
            } else {
                req.getRequestDispatcher(page).forward(req, resp);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
