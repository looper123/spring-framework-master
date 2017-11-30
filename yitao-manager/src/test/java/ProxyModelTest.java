import com.itcast.yitao.design.model.ProxyModel.Proxy;
import com.itcast.yitao.design.model.ProxyModel.Resource;
import org.junit.Test;

/**
 * Created by 311198 on 2017/2/8.
 */
public class ProxyModelTest {

    @Test
    public void proxyTest(){
        Resource resource = new Resource();
        Proxy proxy = new Proxy(resource);
        proxy.method();
    }
}
