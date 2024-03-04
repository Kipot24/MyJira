import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Board {
    public int boardId;
    public String boardName;
    public String boardDescription;

    public Board(int boardId, String boardName, String boardDescription) {
        this.boardId = boardId;
        this.boardName = boardName;
        this.boardDescription = boardDescription;
    }

}