
public class Task {
    String description;
    int priority;
    
    public Task(String description, int priority){
        this.description = description;
        this.priority = priority;
    }    
    @Override
    public String toString(){
        return "[Priority " + priority + "] " + description;
    }
    
}
