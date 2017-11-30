import com.itcast.yitao.design.model.strategyModel.ICalculator;
import com.itcast.yitao.design.model.strategyModel.Minus;
import com.itcast.yitao.design.model.strategyModel.Mutiply;
import com.itcast.yitao.design.model.strategyModel.Plus;
import org.junit.Test;

/**
 * Created by 311198 on 2017/2/9.
 */
public class StrategyModelTest {

    @Test
    public void strategyTest() {
        ICalculator calculator1 = new Plus();
        ICalculator calculator2 = new Minus();
        ICalculator calculator3 = new Mutiply();
        System.out.println(calculator1.calculate("8+2"));
        System.out.println(calculator2.calculate("8-2"));
        System.out.println(calculator3.calculate("8*2"));

    }
}
