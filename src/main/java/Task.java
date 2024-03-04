import lombok.Data;
import lombok.NonNull;

@Data
public abstract class Task {
    @NonNull
    private int taskId;
    private String taskName;
    private String taskComments;
    private String taskAssignedTo;
    String description;
    private TaskType taskType;


    public Task(int taskId, String taskName, String taskComments, String taskAssignedTo, String description, TaskType taskType) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.taskComments = taskComments;
        this.taskAssignedTo = taskAssignedTo;
        this.description = description;
        this.taskType = taskType;
    }

}
