public abstract class Task {
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

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskComments() {
        return taskComments;
    }

    public void setTaskComments(String taskComments) {
        this.taskComments = taskComments;
    }

    public String getTaskAssignedTo() {
        return taskAssignedTo;
    }

    public void setTaskAssignedTo(String taskAssignedTo) {
        this.taskAssignedTo = taskAssignedTo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    @Override
    public String toString() {
        return "Task{" +
                "taskId=" + taskId +
                ", taskName='" + taskName + '\'' +
                ", taskComments='" + taskComments + '\'' +
                ", taskAssignedTo='" + taskAssignedTo + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public TaskType getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskType taskType) {
        this.taskType = taskType;
    }
}
