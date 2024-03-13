import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Board {
    public int boardId;
    public String boardName;
    public String boardDescription;

}