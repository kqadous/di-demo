package hero.springframework.didemo;

import hero.springframework.didemo.beans.MyBean;
import hero.springframework.didemo.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(DiDemoApplication.class, args);

        MyController myController = (MyController)context.getBean("myController");

        myController.hello();

        MyBean myBean = (MyBean) context.getBean("myBean");

        myBean.echo();
    }

}
