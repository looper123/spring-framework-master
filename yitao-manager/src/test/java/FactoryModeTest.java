import com.itcast.yitao.design.model.abstractFactoryModel.MailFactorySender;
import com.itcast.yitao.design.model.abstractFactoryModel.Provider;
import com.itcast.yitao.design.model.Sender;
import com.itcast.yitao.design.model.factoryModel.SenderFactorise;
import com.itcast.yitao.design.model.factoryModel.SenderFactory;
import com.itcast.yitao.design.model.factoryModel.StaticSenderFactories;
import org.junit.Test;

/**
 * Created by 311198 on 2017/2/7.
 * 工厂模式，由工厂生产各类产品
 */
public class FactoryModeTest {


    //单工厂模式
    @Test
    public void sendFactoryTest() {
        SenderFactory senderFactory = new SenderFactory();
        Sender sender = senderFactory.produce("sms");
        sender.send();
    }

    //   多工厂模式
    @Test
    public void sendFactoriseTest() {
        SenderFactorise senderFactorise = new SenderFactorise();
        Sender mailSender = senderFactorise.mailSender();
        mailSender.send();
    }

    //    静态工厂模式
    @Test
    public void staticSendFactoriesTest() {
        Sender mailSender = StaticSenderFactories.mailSender();
        mailSender.send();
    }

    //    抽象工厂类
    @Test
    public void abstractSendFactoryTest() {
        Provider provider = new MailFactorySender();
        Sender mailSender = provider.produce();
        mailSender.send();
    }
}
