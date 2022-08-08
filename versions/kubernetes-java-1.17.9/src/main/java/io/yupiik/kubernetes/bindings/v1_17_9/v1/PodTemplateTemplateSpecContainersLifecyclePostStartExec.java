package io.yupiik.kubernetes.bindings.v1_17_9.v1;

import java.util.List;
import java.util.Objects;

public class PodTemplateTemplateSpecContainersLifecyclePostStartExec {
    private List<String> command;

    public PodTemplateTemplateSpecContainersLifecyclePostStartExec() {
        // no-op
    }

    public PodTemplateTemplateSpecContainersLifecyclePostStartExec(final List<String> command) {
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
        if (!(__other instanceof PodTemplateTemplateSpecContainersLifecyclePostStartExec)) {
            return false;
        }
        final PodTemplateTemplateSpecContainersLifecyclePostStartExec __otherCasted = (PodTemplateTemplateSpecContainersLifecyclePostStartExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
