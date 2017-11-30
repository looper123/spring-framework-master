import com.itcast.yitao.design.model.DecoratorModel.DecoratorImpl;
import com.itcast.yitao.design.model.DecoratorModel.OraginalImpl;
import org.junit.Test;

/**
 * Created by 311198 on 2017/2/8.
 */
public class DecoratorModelTest {


    @Test
    public void DecoratorTest(){
        OraginalImpl oraginal = new OraginalImpl();
        DecoratorImpl decorator = new DecoratorImpl(oraginal);
        decorator.method();
    }
}
