package hero.springframework.didemo.beans;

import org.springframework.stereotype.Component;

@Component
public class MyBean {

    public void echo() {

        System.out.println("This is my first bean");
    }
}
