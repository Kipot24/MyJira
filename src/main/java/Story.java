import java.util.List;

public class Story extends Task{
    private List<SubTask> subTasks;
    private int storyId;


    public Story(int taskId, String taskType, String taskName, String taskComments, String taskAssignedTo, String description, List<SubTask> subTasks, int storyId) {
        super(taskId,
                taskType,
                taskName,
                taskComments,
                taskAssignedTo,
                getDescription());
    }
}
