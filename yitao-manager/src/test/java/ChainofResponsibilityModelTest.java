import com.itcast.yitao.design.model.ChainofResponsibilityModel.MyHandler;
import org.junit.Test;

/**
 * Created by 311198 on 2017/2/13.
 */
public class ChainofResponsibilityModelTest {

    @Test
    public void chainofResponsibilityTest(){
        MyHandler myHandler1 = new MyHandler("handler1");
        MyHandler myHandler2 = new MyHandler("handler2");
        MyHandler myHandler3 = new MyHandler("handler3");
        myHandler1.setHandler(myHandler2);
        myHandler2.setHandler(myHandler3);
        myHandler1.operator();

    }
}
