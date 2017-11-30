import com.itcast.yitao.design.model.interpreterModel.Context;
import com.itcast.yitao.design.model.interpreterModel.Minus;
import com.itcast.yitao.design.model.interpreterModel.Plus;
import org.junit.Test;

/**
 * Created by 311198 on 2017/2/14.
 */
public class InterceptModelTest {

    @Test
    public void  interceptTest(){
        int result  = new Minus().interpret(new Context(new Plus().interpret(new Context(9, 2)), 8));
        System.out.println(result);
    }
}
