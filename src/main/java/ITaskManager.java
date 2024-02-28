import java.util.List;

public interface ITaskManager {
    Task createTask(int projectId, int boardId, TaskType type);
    List<Task> getAllTasks(int boardId);
    Task getTaskById(int taskId);
    void updateTaskStatus(int taskId, TaskStatus newStatus);
    Task editTask(int taskId, String newDescription);
    Task addComment(int taskId, String taskComments);

}
