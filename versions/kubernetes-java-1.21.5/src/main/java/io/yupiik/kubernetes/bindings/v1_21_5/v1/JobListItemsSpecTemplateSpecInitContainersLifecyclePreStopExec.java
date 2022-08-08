package io.yupiik.kubernetes.bindings.v1_21_5.v1;

import java.util.List;
import java.util.Objects;

public class JobListItemsSpecTemplateSpecInitContainersLifecyclePreStopExec {
    private List<String> command;

    public JobListItemsSpecTemplateSpecInitContainersLifecyclePreStopExec() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecInitContainersLifecyclePreStopExec(final List<String> command) {
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
        if (!(__other instanceof JobListItemsSpecTemplateSpecInitContainersLifecyclePreStopExec)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecInitContainersLifecyclePreStopExec __otherCasted = (JobListItemsSpecTemplateSpecInitContainersLifecyclePreStopExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
