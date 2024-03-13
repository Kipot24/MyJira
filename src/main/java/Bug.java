import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class Bug extends Task{
    @NonNull
    private String priority;
    @NonNull
    private int severity;


    public Bug(int taskId, String taskName, String taskComments, String taskAssignedTo, String description, String priority, int severity, TaskType taskType) {
        super(taskId, taskName, taskComments, taskAssignedTo, description, taskType);
        this.priority = priority;
        this.severity = severity;
    }

}
