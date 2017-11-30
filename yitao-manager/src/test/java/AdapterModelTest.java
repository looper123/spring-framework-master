import com.itcast.yitao.design.model.adpaterModel.*;
import org.junit.Test;

/**
 * Created by 311198 on 2017/2/8.
 */
public class AdapterModelTest {

    @Test
    public void classAdapterTest(){
        ClassAdapter classAdapter = new ClassAdapter();
        classAdapter.method1();
        classAdapter.method2();
    }

    @Test
    public void objectAdapterTest(){
        Source source = new Source();
        ObjectAdapter objectAdapter = new ObjectAdapter(source);
        objectAdapter.method1();
        objectAdapter.method2();
    }

    @Test
    public void interfaceAdapterTest(){
        SourceSub1 sourceSub1 = new SourceSub1();
        SourceSub2 sourceSub2 = new SourceSub2();
        sourceSub1.method1();
        sourceSub1.method2();
        sourceSub2.method1();
        sourceSub2.method2();
    }
}
