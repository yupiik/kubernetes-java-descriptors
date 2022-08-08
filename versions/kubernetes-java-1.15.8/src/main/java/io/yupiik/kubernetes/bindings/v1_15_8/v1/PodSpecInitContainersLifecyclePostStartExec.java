package io.yupiik.kubernetes.bindings.v1_15_8.v1;

import java.util.List;
import java.util.Objects;

public class PodSpecInitContainersLifecyclePostStartExec {
    private List<String> command;

    public PodSpecInitContainersLifecyclePostStartExec() {
        // no-op
    }

    public PodSpecInitContainersLifecyclePostStartExec(final List<String> command) {
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
        if (!(__other instanceof PodSpecInitContainersLifecyclePostStartExec)) {
            return false;
        }
        final PodSpecInitContainersLifecyclePostStartExec __otherCasted = (PodSpecInitContainersLifecyclePostStartExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
