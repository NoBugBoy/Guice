import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import org.junit.Before;
import service.AddService;

public class Test {
    private Injector injector;
@Inject
AddService addService;
//    @org.junit.Test
//    public void a(){
//        Injector injector = Guice.createInjector();
//        AddService instance = injector.getInstance(AddService.class);
//        instance.add();
//    }
    @org.junit.Test
public  void main() {
//    Injector injector = Guice.createInjector();
//        Test instance = injector.getInstance(Test.class);
//    long l = System.currentTimeMillis();
//    for (int i = 0; i < 100; i++) {
//        instance.hello(i);
//    }
//    long l1 = System.currentTimeMillis();
//    System.out.println((l1-l) / 1000);
        Test test = new Test();
        Guice.createInjector().injectMembers(test);
       // AddService instance = injector.getInstance(AddService.class);
        //instance.add(11);
        addService.add(11);
    }
}
