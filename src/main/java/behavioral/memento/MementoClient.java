package behavioral.memento;

public class MementoClient {

    public static void main(String[] args) {
        Editor editor = new Editor();

        editor.addContent("this is the first line");
        editor.addContent("this is the second line");

        EditorMemento save1 = editor.save();

        editor.addContent("this is the third line");
        editor.addContent("this is the fourth line");

        EditorMemento save2 = editor.save();

        editor.addContent("this is the fifth line");
        editor.addContent("this is the sixth line");

        EditorMemento save3 = editor.save();

        System.out.println(editor.getContent());

        editor.listAllSavedStates();
        System.out.println("---------");
        editor.restore(4);
        System.out.println(editor.getContent());
    }
}
