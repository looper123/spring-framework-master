import com.itcast.yitao.design.model.FacadeModel.Computer;
import org.junit.Test;

/**
 * Created by 311198 on 2017/2/8.
 */
public class FacadeModelTest {

    @Test
    public void facadeTest(){
        Computer computer = new Computer();
        computer.start();
        computer.shutDown();
    }
}
