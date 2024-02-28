import java.util.List;

public class JavaHandler implements IProjectManager, ITaskManager{

    @Override
    public Project createProject(int projectId, String projectName, String projectDescription, List<Board> boards) {
        return null;
    }

    @Override
    public void addBoardToProject(int boardId) {

    }

    @Override
    public Task createTask(int projectId, int boardId, TaskType type) {
        return null;
    }

    @Override
    public void updateTaskStatus(int taskId, TaskStatus newStatus) {

    }
}
