package io.yupiik.kubernetes.bindings.v1_19_15;

import java.util.List;
import java.util.Objects;

public class PodTemplateTemplateSpecEphemeralContainersLifecyclePreStopExec {
    private List<String> command;

    public PodTemplateTemplateSpecEphemeralContainersLifecyclePreStopExec() {
        // no-op
    }

    public PodTemplateTemplateSpecEphemeralContainersLifecyclePreStopExec(final List<String> command) {
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
        if (!(__other instanceof PodTemplateTemplateSpecEphemeralContainersLifecyclePreStopExec)) {
            return false;
        }
        final PodTemplateTemplateSpecEphemeralContainersLifecyclePreStopExec __otherCasted = (PodTemplateTemplateSpecEphemeralContainersLifecyclePreStopExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
