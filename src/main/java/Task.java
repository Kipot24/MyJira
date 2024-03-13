import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@AllArgsConstructor

public abstract class Task {
    private int taskId;
    private String taskName;
    private String taskComments;
    private String taskAssignedTo;
    String description;
    private TaskType taskType;
}
