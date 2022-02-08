package creational.objectpool.example1;

public class ExportingProcess {
    private final long processNo;

    public ExportingProcess(int processNo)  {
        this.processNo = processNo;

        System.out.println("Object with process no. " + processNo + " was created");
    }

    public long getProcessNo() {
        return processNo;
    }
}
