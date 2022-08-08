package io.yupiik.kubernetes.bindings.v1_17_13.v1;

import java.util.List;
import java.util.Objects;

public class PodSpecEphemeralContainersReadinessProbeExec {
    private List<String> command;

    public PodSpecEphemeralContainersReadinessProbeExec() {
        // no-op
    }

    public PodSpecEphemeralContainersReadinessProbeExec(final List<String> command) {
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
        if (!(__other instanceof PodSpecEphemeralContainersReadinessProbeExec)) {
            return false;
        }
        final PodSpecEphemeralContainersReadinessProbeExec __otherCasted = (PodSpecEphemeralContainersReadinessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
