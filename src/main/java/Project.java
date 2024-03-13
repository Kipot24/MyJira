import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class Project {
    private int projectId;
    private String projectName;
    private String projectDescription;
    private List<Board> boards;


    public void addBoard(int i) {
    }
}
