public interface ICustomJiraHandler {
    Task createTask(int projectId, int boardId, TaskType type);
    Project createProject(int projectId, String projectName, String projectDescription);
    Board createBoard(int boardId, String boardName, String boardDescription);

}
