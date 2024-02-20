public class Bug extends Task{
    private String priority;
    private int severity;


    public Bug(int taskId, String taskName, String taskComments, String taskAssignedTo, String description, String priority, int severity) {
        super(taskId, taskName, taskComments, taskAssignedTo, description);
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public int getSeverity() {
        return severity;
    }

    public void setSeverity(int severity) {
        this.severity = severity;
    }

    @Override
    public String toString() {
        return "Bug{" +
                "priority='" + priority + '\'' +
                ", severity=" + severity +
                '}';
    }
}
