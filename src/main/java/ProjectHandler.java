import java.util.List;

public class ProjectHandler implements IProjectManager{

    @Override
    public Project createProject(int projectId, String projectName, String projectDescription, List<Board> boards) {
        return null;
    }

    @Override
    public void addBoardToProject(int boardId) {
    if (boardId>0){
        Project project = getProject(1);
        Board board = getBoard(boardId);
        getProject(1).addBoard(1);
    }
    else throw new IllegalArgumentException("\"Board with id \" + boardId + \" not found\"");
    }

    private Board getBoard(int boardId) {
        return null;
    }

    @Override
    public Project getProject(int projectId) {
        return null;
    }
}
