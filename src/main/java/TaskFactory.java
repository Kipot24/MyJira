import jdk.internal.org.jline.reader.impl.LineReaderImpl;
import lombok.AllArgsConstructor;

import java.util.List;

import static jdk.internal.org.jline.reader.impl.LineReaderImpl.CompletionType.List;

public class TaskFactory {
    public Task createTask(int taskId, String taskName, String taskComments, String taskAssignedTo, String
        description, TaskType taskType, String priority, int severity, SubTask subTask){

        return switch (taskType) {
            case BUG -> new Bug(taskId,
                    taskName,
                    taskComments,
                    taskAssignedTo,
                    description,
                    priority,
                    severity,
                    taskType);
            case STORY -> new Story(taskId, taskName, taskComments, taskAssignedTo, description, taskType, subTask);
        };
        }
    }