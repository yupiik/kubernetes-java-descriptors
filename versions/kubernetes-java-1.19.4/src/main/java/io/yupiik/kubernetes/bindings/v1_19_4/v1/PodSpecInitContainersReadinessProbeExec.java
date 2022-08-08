package io.yupiik.kubernetes.bindings.v1_19_4.v1;

import java.util.List;
import java.util.Objects;

public class PodSpecInitContainersReadinessProbeExec {
    private List<String> command;

    public PodSpecInitContainersReadinessProbeExec() {
        // no-op
    }

    public PodSpecInitContainersReadinessProbeExec(final List<String> command) {
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
        if (!(__other instanceof PodSpecInitContainersReadinessProbeExec)) {
            return false;
        }
        final PodSpecInitContainersReadinessProbeExec __otherCasted = (PodSpecInitContainersReadinessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
