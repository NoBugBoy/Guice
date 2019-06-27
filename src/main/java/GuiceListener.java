import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;

/**
 * 需要在web.xml中配置这个全路径 demo没有包名所以=类名
 */
public class GuiceListener extends GuiceServletContextListener {
    @Override
    protected Injector getInjector() {
        return Guice.createInjector(new MyModel());
    }
}
