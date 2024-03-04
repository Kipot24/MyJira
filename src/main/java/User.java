import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User {
    private int userId;
    private String userName;

    public User(int userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }


}
