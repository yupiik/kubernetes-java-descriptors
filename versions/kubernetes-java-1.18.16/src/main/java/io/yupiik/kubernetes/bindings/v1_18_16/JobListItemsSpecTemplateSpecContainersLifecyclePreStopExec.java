package io.yupiik.kubernetes.bindings.v1_18_16;

import java.util.List;
import java.util.Objects;

public class JobListItemsSpecTemplateSpecContainersLifecyclePreStopExec {
    private List<String> command;

    public JobListItemsSpecTemplateSpecContainersLifecyclePreStopExec() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecContainersLifecyclePreStopExec(final List<String> command) {
        // no-op
    }

    public List<String> getCommand() {
        return command;
    }

    public void setCommand(final List<String> command) {
        this.command = command;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                command);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof JobListItemsSpecTemplateSpecContainersLifecyclePreStopExec)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecContainersLifecyclePreStopExec __otherCasted = (JobListItemsSpecTemplateSpecContainersLifecyclePreStopExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
