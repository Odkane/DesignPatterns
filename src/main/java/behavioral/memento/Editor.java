package behavioral.memento;

import java.util.Map;
import java.util.Optional;

public class Editor {
    private final Backups backups = new Backups();
    private String content;

    public Editor() {
        content = "";
    }

    public String getContent() {
        return content;
    }

    public void addContent(String content) {
        if (!content.isEmpty()) {
            this.content = this.content.isEmpty() ? content : this.content + " \n" + content;
        }
    }

    public EditorMemento save() {
        EditorMemento editorMemento = new EditorMemento(content);
        backups.save(editorMemento);

        return editorMemento;
    }

    public void listAllSavedStates(){
        backups.listAllSavedStates();
    }

    public void restore(int index) {
        Optional<EditorMemento> memento = backups.getSavedState(index-1);
        memento.ifPresent((m) -> this.content = m.getContent());
    }
}
