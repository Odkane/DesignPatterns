package behavioral.memento;

import java.time.Instant;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

public class Backups {
    private static final Backups INSTANCE = new Backups();
    private final Map<String, EditorMemento> backupsMap;

    private Backups() {
        backupsMap = new LinkedHashMap<>();
    }

    public static Backups getInstance() {
        return INSTANCE;
    }

    public Map<String, EditorMemento> getBackupsMap() {
        return backupsMap;
    }

    public void save(EditorMemento memento){
        backupsMap.put(String.valueOf(Instant.now()),memento);
    }

    public void listAllSavedStates(){
        AtomicInteger i= new AtomicInteger(1);
        System.out.println("Saved states");
        backupsMap.forEach((key, value) -> {
            System.out.printf("%s - %s \n", i, key);
            i.getAndIncrement();
        });
    }

    public Optional<EditorMemento> getSavedState(int index){
        if (index<0 || index >= backupsMap.size()){
            System.out.printf("State %d not found \n", index+1);
            return Optional.empty();
        }

        Object[] keyArray = backupsMap.keySet().toArray();

        return Optional.of(backupsMap.get(String.valueOf(keyArray[index])));
    }
}
