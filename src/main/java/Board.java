import lombok.Data;

@Data
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