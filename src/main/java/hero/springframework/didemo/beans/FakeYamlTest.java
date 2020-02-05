package hero.springframework.didemo.beans;

import java.util.ArrayList;
import java.util.List;

public class FakeYamlTest {

    private String name;

    private List<String> myList = new ArrayList<>();

    private Boolean testBoolean;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getMyList() {
        return myList;
    }

    public void setMyList(List<String> myList) {
        this.myList = myList;
    }

    public Boolean getTestBoolean() {
        return testBoolean;
    }

    public void setTestBoolean(Boolean testBoolean) {
        this.testBoolean = testBoolean;
    }
}
