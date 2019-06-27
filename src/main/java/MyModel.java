import com.google.inject.AbstractModule;
import com.google.inject.Scopes;
import com.google.inject.servlet.ServletModule;
import service.AddSericeImpl;
import service.AddService;

/**
 * 绑定关系
 */
public class MyModel extends AbstractModule {
    @Override
    protected void configure() {
        //安装servlet支持
        install(new ServletModule(){
            @Override
            protected void configureServlets() {
                /**
                 * 绑定请求路径可以多个
                 */
                serve("/userServlet","/UserController").with(UserContoller.class);
                bind(AddService.class).to(AddSericeImpl.class).in(Scopes.SINGLETON);
            }
        });
       //
        //binder().requestInjection();
    }
}
