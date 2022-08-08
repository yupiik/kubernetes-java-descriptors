package io.yupiik.kubernetes.bindings.v1_18_16;

import java.util.List;
import java.util.Objects;

public class PodSpecContainersLifecyclePostStartExec {
    private List<String> command;

    public PodSpecContainersLifecyclePostStartExec() {
        // no-op
    }

    public PodSpecContainersLifecyclePostStartExec(final List<String> command) {
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
        if (!(__other instanceof PodSpecContainersLifecyclePostStartExec)) {
            return false;
        }
        final PodSpecContainersLifecyclePostStartExec __otherCasted = (PodSpecContainersLifecyclePostStartExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
