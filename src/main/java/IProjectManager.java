import java.util.List;

public interface IProjectManager {
    Project createProject(int projectId, String projectName, String projectDescription, List<Board> boards);
    Project getProject(int projectId);
    void addBoardToProject(int boardId);

}
