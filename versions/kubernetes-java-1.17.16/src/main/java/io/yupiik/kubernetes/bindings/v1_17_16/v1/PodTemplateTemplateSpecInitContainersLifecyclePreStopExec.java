package io.yupiik.kubernetes.bindings.v1_17_16.v1;

import java.util.List;
import java.util.Objects;

public class PodTemplateTemplateSpecInitContainersLifecyclePreStopExec {
    private List<String> command;

    public PodTemplateTemplateSpecInitContainersLifecyclePreStopExec() {
        // no-op
    }

    public PodTemplateTemplateSpecInitContainersLifecyclePreStopExec(final List<String> command) {
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
        if (!(__other instanceof PodTemplateTemplateSpecInitContainersLifecyclePreStopExec)) {
            return false;
        }
        final PodTemplateTemplateSpecInitContainersLifecyclePreStopExec __otherCasted = (PodTemplateTemplateSpecInitContainersLifecyclePreStopExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
