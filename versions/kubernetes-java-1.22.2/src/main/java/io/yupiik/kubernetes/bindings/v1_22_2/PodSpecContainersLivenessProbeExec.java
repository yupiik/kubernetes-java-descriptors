package io.yupiik.kubernetes.bindings.v1_22_2;

import java.util.List;
import java.util.Objects;

public class PodSpecContainersLivenessProbeExec {
    private List<String> command;

    public PodSpecContainersLivenessProbeExec() {
        // no-op
    }

    public PodSpecContainersLivenessProbeExec(final List<String> command) {
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
        if (!(__other instanceof PodSpecContainersLivenessProbeExec)) {
            return false;
        }
        final PodSpecContainersLivenessProbeExec __otherCasted = (PodSpecContainersLivenessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
