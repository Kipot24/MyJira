import java.util.List;

public class TaskHandler implements ITaskManager{
    @Override
    public Task createTask(int projectId, int boardId, TaskType type) {
        return null;
    }

    @Override
    public List<Task> getAllTasks(int boardId) {
        return null;
    }

    @Override
    public Task getTaskById(int taskId) {
        return null;
    }

    @Override
    public void updateTaskStatus(int taskId, TaskStatus newStatus) {

    }

    @Override
    public Task editTask(int taskId, String newDescription) {
        return null;
    }

    @Override
    public Task addComment(int taskId, String taskComments) {
        return null;
    }
}
