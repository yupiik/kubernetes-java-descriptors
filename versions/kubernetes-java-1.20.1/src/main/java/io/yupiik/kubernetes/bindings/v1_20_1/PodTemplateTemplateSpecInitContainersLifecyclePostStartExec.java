package io.yupiik.kubernetes.bindings.v1_20_1;

import java.util.List;
import java.util.Objects;

public class PodTemplateTemplateSpecInitContainersLifecyclePostStartExec {
    private List<String> command;

    public PodTemplateTemplateSpecInitContainersLifecyclePostStartExec() {
        // no-op
    }

    public PodTemplateTemplateSpecInitContainersLifecyclePostStartExec(final List<String> command) {
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
        if (!(__other instanceof PodTemplateTemplateSpecInitContainersLifecyclePostStartExec)) {
            return false;
        }
        final PodTemplateTemplateSpecInitContainersLifecyclePostStartExec __otherCasted = (PodTemplateTemplateSpecInitContainersLifecyclePostStartExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
