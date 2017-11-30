import com.itcast.yitao.design.model.TemplateMethodModel.AbstractCalculator;
import com.itcast.yitao.design.model.TemplateMethodModel.PlusCalculator;
import org.junit.Test;

/**
 * Created by 311198 on 2017/2/9.
 */
public class TemplateMethodTest  {

    @Test
    public void templateTest(){
        AbstractCalculator abstractCalculator = new PlusCalculator();
        int result = abstractCalculator.calculate("8+2", "\\+");
        System.out.println(result);
    }
}
