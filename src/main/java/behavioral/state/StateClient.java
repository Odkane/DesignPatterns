package behavioral.state;

public class StateClient {

    public static void main(String[] args) {
        var editor = new TextEditor(new DefaultCase());
        String s1 = "Good Morning";
        String s2 = "Good Night";

        editor.type(s1);
        editor.type(s2);

        System.out.println("-------------------------------------------");

        editor.setState(new UpperCase());
        editor.type(s1);
        editor.type(s2);

        System.out.println("-------------------------------------------");

        editor.setState(new LowerCase());
        editor.type(s1);
        editor.type(s2);

    }
}
