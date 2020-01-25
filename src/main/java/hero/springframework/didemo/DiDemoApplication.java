package hero.springframework.didemo;

import hero.springframework.didemo.beans.MyBean;
import hero.springframework.didemo.controllers.ConstructorInjectedController;
import hero.springframework.didemo.controllers.MyController;
import hero.springframework.didemo.controllers.PropertyInjectedController;
import hero.springframework.didemo.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
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
    }

}
