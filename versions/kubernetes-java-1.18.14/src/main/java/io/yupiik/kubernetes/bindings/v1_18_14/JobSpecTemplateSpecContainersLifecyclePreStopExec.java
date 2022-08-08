package io.yupiik.kubernetes.bindings.v1_18_14;

import java.util.List;
import java.util.Objects;

public class JobSpecTemplateSpecContainersLifecyclePreStopExec {
    private List<String> command;

    public JobSpecTemplateSpecContainersLifecyclePreStopExec() {
        // no-op
    }

    public JobSpecTemplateSpecContainersLifecyclePreStopExec(final List<String> command) {
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
        if (!(__other instanceof JobSpecTemplateSpecContainersLifecyclePreStopExec)) {
            return false;
        }
        final JobSpecTemplateSpecContainersLifecyclePreStopExec __otherCasted = (JobSpecTemplateSpecContainersLifecyclePreStopExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
