package behavioral.state;

public class DefaultCase implements WritingState{
    @Override
    public String write(String words) {
        return words;
    }
}
