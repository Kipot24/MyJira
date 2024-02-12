public class Task {
    int taskId;
    String taskType;
    String taskName;
    String taskComments;
    String taskAssignedTo;
    private Type type;

    public Task(int taskId, String taskType, String taskName, String taskComments, String taskAssignedTo, Type type) {
        this.taskId = taskId;
        this.taskType = taskType;
        this.taskName = taskName;
        this.taskComments = taskComments;
        this.taskAssignedTo = taskAssignedTo;
        this.type = type;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
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

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }


    @Override
    public String toString() {
        return "Task{" +
                "taskId=" + taskId +
                ", taskType='" + taskType + '\'' +
                ", taskName='" + taskName + '\'' +
                ", taskComments='" + taskComments + '\'' +
                ", taskAssignedTo='" + taskAssignedTo + '\'' +
                ", type=" + type +
                '}';
    }
}
