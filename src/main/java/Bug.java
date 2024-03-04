public class Bug extends Task{
    String priority;
    int severity;


    public Bug(int taskId, String taskType, String taskName, String taskComments, String taskAssignedTo, Type type) {
        super(taskId, taskType, taskName, taskComments, taskAssignedTo, type);
    }
}
