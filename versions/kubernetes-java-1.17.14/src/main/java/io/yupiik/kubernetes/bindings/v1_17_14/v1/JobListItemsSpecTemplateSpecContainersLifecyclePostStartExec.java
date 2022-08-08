package io.yupiik.kubernetes.bindings.v1_17_14.v1;

import java.util.List;
import java.util.Objects;

public class JobListItemsSpecTemplateSpecContainersLifecyclePostStartExec {
    private List<String> command;

    public JobListItemsSpecTemplateSpecContainersLifecyclePostStartExec() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecContainersLifecyclePostStartExec(final List<String> command) {
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
        if (!(__other instanceof JobListItemsSpecTemplateSpecContainersLifecyclePostStartExec)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecContainersLifecyclePostStartExec __otherCasted = (JobListItemsSpecTemplateSpecContainersLifecyclePostStartExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
