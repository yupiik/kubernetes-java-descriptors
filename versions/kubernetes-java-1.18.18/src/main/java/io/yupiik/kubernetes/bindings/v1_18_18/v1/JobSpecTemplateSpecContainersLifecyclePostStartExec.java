package io.yupiik.kubernetes.bindings.v1_18_18.v1;

import java.util.List;
import java.util.Objects;

public class JobSpecTemplateSpecContainersLifecyclePostStartExec {
    private List<String> command;

    public JobSpecTemplateSpecContainersLifecyclePostStartExec() {
        // no-op
    }

    public JobSpecTemplateSpecContainersLifecyclePostStartExec(final List<String> command) {
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
        if (!(__other instanceof JobSpecTemplateSpecContainersLifecyclePostStartExec)) {
            return false;
        }
        final JobSpecTemplateSpecContainersLifecyclePostStartExec __otherCasted = (JobSpecTemplateSpecContainersLifecyclePostStartExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
