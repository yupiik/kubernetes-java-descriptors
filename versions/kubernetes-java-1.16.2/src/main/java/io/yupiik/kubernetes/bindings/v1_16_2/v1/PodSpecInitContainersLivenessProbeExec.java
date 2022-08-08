package io.yupiik.kubernetes.bindings.v1_16_2.v1;

import java.util.List;
import java.util.Objects;

public class PodSpecInitContainersLivenessProbeExec {
    private List<String> command;

    public PodSpecInitContainersLivenessProbeExec() {
        // no-op
    }

    public PodSpecInitContainersLivenessProbeExec(final List<String> command) {
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
        if (!(__other instanceof PodSpecInitContainersLivenessProbeExec)) {
            return false;
        }
        final PodSpecInitContainersLivenessProbeExec __otherCasted = (PodSpecInitContainersLivenessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
