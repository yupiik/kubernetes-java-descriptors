package io.yupiik.kubernetes.bindings.v1_18_4.v1;

import java.util.List;
import java.util.Objects;

public class PodSpecInitContainersLifecyclePreStopExec {
    private List<String> command;

    public PodSpecInitContainersLifecyclePreStopExec() {
        // no-op
    }

    public PodSpecInitContainersLifecyclePreStopExec(final List<String> command) {
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
        if (!(__other instanceof PodSpecInitContainersLifecyclePreStopExec)) {
            return false;
        }
        final PodSpecInitContainersLifecyclePreStopExec __otherCasted = (PodSpecInitContainersLifecyclePreStopExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
