public class TaskFactory {
    public Task createTask(TaskType type){
        Task task = null;

        switch (type){
            case BUG:
                task =  new Bug();
                break;
            case STORY:
                task = new Story();
                break;
        }
        return task;
    }
}
