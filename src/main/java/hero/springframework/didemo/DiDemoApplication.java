package hero.springframework.didemo;

import hero.springframework.beans.MyBean;
import hero.springframework.didemo.beans.FakeDataSource;
import hero.springframework.didemo.beans.FakeJmsBroker;
import hero.springframework.didemo.beans.FakeYamlTest;
import hero.springframework.didemo.controllers.ConstructorInjectedController;
import hero.springframework.didemo.controllers.MyController;
import hero.springframework.didemo.controllers.PropertyInjectedController;
import hero.springframework.didemo.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = {MyBean.class} , basePackages = {"hero.springframework.didemo"})
public class DiDemoApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        MyController myController = (MyController)ctx.getBean("myController");

        System.out.println(myController.hello());

        MyBean myBean = (MyBean) ctx.getBean("myBean");

        myBean.echo();

        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());

        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());

        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());

        FakeDataSource fakeDataSource = (FakeDataSource)ctx.getBean(FakeDataSource.class);

        System.out.println("Fake datasource username>>>> " +fakeDataSource.getUsername());

        FakeJmsBroker fakeJmsBroker = (FakeJmsBroker)ctx.getBean("fakeJmsBroker");

        System.out.println("Fake jms URL>>>> " +fakeJmsBroker.getUrl());

        FakeYamlTest fakeYamlTest = (FakeYamlTest)ctx.getBean(FakeYamlTest.class);

        System.out.println("================== Test Yaml Start =================");
        System.out.println("name:" +fakeYamlTest.getName() );

        System.out.println("Set Size::"+fakeYamlTest.getMyList().size());

        fakeYamlTest.getMyList().stream().forEach(listItem -> System.out.println("List Item:"+listItem));
        System.out.println("================== Test Yaml End =================");
    }

}
