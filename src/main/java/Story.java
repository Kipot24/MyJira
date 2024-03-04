import java.util.List;

public class Story extends Task{
    private List<SubTask> subTasks;
    private int storyId;

    public Story(int taskId, String taskName, String taskComments, String taskAssignedTo, String description, TaskType taskType, List<SubTask> subTasks, int storyId) {
        super(taskId, taskName, taskComments, taskAssignedTo, description, taskType);
        this.subTasks = subTasks;
        this.storyId = storyId;
    }
}