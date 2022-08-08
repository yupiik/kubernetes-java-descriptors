package io.yupiik.kubernetes.bindings.v1_19_1;

import java.util.List;
import java.util.Objects;

public class PodSpecEphemeralContainersLifecyclePreStopExec {
    private List<String> command;

    public PodSpecEphemeralContainersLifecyclePreStopExec() {
        // no-op
    }

    public PodSpecEphemeralContainersLifecyclePreStopExec(final List<String> command) {
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
        if (!(__other instanceof PodSpecEphemeralContainersLifecyclePreStopExec)) {
            return false;
        }
        final PodSpecEphemeralContainersLifecyclePreStopExec __otherCasted = (PodSpecEphemeralContainersLifecyclePreStopExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
