package io.yupiik.kubernetes.bindings.v1_18_14.v1;

import java.util.List;
import java.util.Objects;

public class JobListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartExec {
    private List<String> command;

    public JobListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartExec() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartExec(final List<String> command) {
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
        if (!(__other instanceof JobListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartExec)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartExec __otherCasted = (JobListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
