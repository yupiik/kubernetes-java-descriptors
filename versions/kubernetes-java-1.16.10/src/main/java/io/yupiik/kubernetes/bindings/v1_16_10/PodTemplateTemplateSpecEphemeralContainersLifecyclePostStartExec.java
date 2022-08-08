package io.yupiik.kubernetes.bindings.v1_16_10;

import java.util.List;
import java.util.Objects;

public class PodTemplateTemplateSpecEphemeralContainersLifecyclePostStartExec {
    private List<String> command;

    public PodTemplateTemplateSpecEphemeralContainersLifecyclePostStartExec() {
        // no-op
    }

    public PodTemplateTemplateSpecEphemeralContainersLifecyclePostStartExec(final List<String> command) {
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
        if (!(__other instanceof PodTemplateTemplateSpecEphemeralContainersLifecyclePostStartExec)) {
            return false;
        }
        final PodTemplateTemplateSpecEphemeralContainersLifecyclePostStartExec __otherCasted = (PodTemplateTemplateSpecEphemeralContainersLifecyclePostStartExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
