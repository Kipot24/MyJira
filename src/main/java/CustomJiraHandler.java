public class CustomJiraHandler implements ICustomJiraHandler{
private final TaskFactory taskFactory;

    public CustomJiraHandler(TaskFactory taskFactory) {
        this.taskFactory = taskFactory;
    }
    public Task createTask(TaskType type) {
        Task task = taskFactory.createTask(type);
        task.editTask();
        task.addComment();
        task.deleteTask();
        task.changeStatus();
    }

    @Override
    public Project createProject(int projectId, String projectName, String projectDescription) {
        return null;
    }

    @Override
    public Board createBoard(int boardId, String boardName, String boardDescription) {
        return new Board(boardId, boardName, boardDescription);
    }
}
