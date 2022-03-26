package behavioral.memento;

import java.time.Instant;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

public class Backups {
    private final Map<String, EditorMemento> backupsMap;

    public Backups() {
        backupsMap = new LinkedHashMap<>();
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
