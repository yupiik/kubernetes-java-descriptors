package io.yupiik.kubernetes.bindings.v1_17_13;

import java.util.List;
import java.util.Objects;

public class PodSpecEphemeralContainersLivenessProbeExec {
    private List<String> command;

    public PodSpecEphemeralContainersLivenessProbeExec() {
        // no-op
    }

    public PodSpecEphemeralContainersLivenessProbeExec(final List<String> command) {
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
        if (!(__other instanceof PodSpecEphemeralContainersLivenessProbeExec)) {
            return false;
        }
        final PodSpecEphemeralContainersLivenessProbeExec __otherCasted = (PodSpecEphemeralContainersLivenessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
