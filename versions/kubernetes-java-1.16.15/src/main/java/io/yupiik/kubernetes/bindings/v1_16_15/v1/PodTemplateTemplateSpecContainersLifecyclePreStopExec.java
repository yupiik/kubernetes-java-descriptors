package io.yupiik.kubernetes.bindings.v1_16_15.v1;

import java.util.List;
import java.util.Objects;

public class PodTemplateTemplateSpecContainersLifecyclePreStopExec {
    private List<String> command;

    public PodTemplateTemplateSpecContainersLifecyclePreStopExec() {
        // no-op
    }

    public PodTemplateTemplateSpecContainersLifecyclePreStopExec(final List<String> command) {
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
        if (!(__other instanceof PodTemplateTemplateSpecContainersLifecyclePreStopExec)) {
            return false;
        }
        final PodTemplateTemplateSpecContainersLifecyclePreStopExec __otherCasted = (PodTemplateTemplateSpecContainersLifecyclePreStopExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
