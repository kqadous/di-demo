package hero.springframework.didemo.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@ConfigurationProperties(prefix = "my")
public class ListItems {

    private List<String> list = new ArrayList<>();

    public List<String> getList() {
        return list;
    }
}
