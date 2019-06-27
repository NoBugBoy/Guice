import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Singleton;
import service.AddService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Singleton
public class UserContoller extends HttpServlet {
    /**
     * 使用这种注入要在model中配置
     */
    @Inject
    AddService addService;

    /**
     * 也可以通过注入器去找到
     */
//    @Inject
//    Injector injector;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user = req.getParameter("user");
        System.out.println(user);
        addService.add(666);
//        injector.getInstance(AddService.class).add(666);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
