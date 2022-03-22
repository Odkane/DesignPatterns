package behavioral.state;

public class TextEditor {
    private WritingState state;

    public TextEditor(WritingState state) {
        this.state = state;
    }

    public void setState(WritingState state) {
        this.state = state;
    }

    public void type(String words) {
        System.out.printf("The words %s writng with the writing state %s returns : %s \n",
                words, state.getClass().getSimpleName(), state.write(words));
    }
}
