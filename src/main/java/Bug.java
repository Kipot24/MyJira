import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Bug extends Task{
    private String priority;
    private int severity;


    public Bug(int taskId, String taskName, String taskComments, String taskAssignedTo, String description, String priority, int severity, TaskType taskType) {
        super(taskId, taskName, taskComments, taskAssignedTo, description, taskType);
        this.priority = priority;
        this.severity = severity;
    }

}
