public class Story extends Task{
    String description;

    public Story(int taskId, String taskType, String taskName, String taskComments, String taskAssignedTo, Type type) {
        super(taskId, taskType, taskName, taskComments, taskAssignedTo, type);
    }
}
