import lombok.Data;

import java.util.List;

@Data
public class Project {
    private int projectId;
    private String projectName;
    private String projectDescription;
    private List<Board> boards;

    public Project(int projectId, String projectName, String projectDescription, List<Board> boards) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.projectDescription = projectDescription;
        this.boards = boards;
    }

}
