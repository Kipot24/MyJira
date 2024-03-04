import java.util.List;

public interface IProjectManager {
    Project createProject(int projectId, String projectName, String proj3ectDescription, List<Board> boards);
    Project getProject(int projectId);
    void addBoardToProject(int boardId);

}
