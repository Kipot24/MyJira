public class SubTask {
    private int parentStoryId;

    public int getParentStoryId() {
        return parentStoryId;
    }

    public void setParentStoryId(int parentStoryId) {
        this.parentStoryId = parentStoryId;
    }

    @Override
    public String toString() {
        return "SubTask{" +
                "parentStoryId=" + parentStoryId +
                '}';
    }
}
