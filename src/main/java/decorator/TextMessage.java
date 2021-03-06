package decorator;

public class TextMessage implements Message{
    private final String content;

    public TextMessage(String content) {
        this.content = content;
    }

    @Override
    public String content() {
        return content;
    }
}
