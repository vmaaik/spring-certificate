package beans;

import org.springframework.stereotype.Component;

public class MyBean {

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
