package io.yupiik.kubernetes.bindings.v1_22_2;

import java.util.List;
import java.util.Objects;

public class PodSpecInitContainersStartupProbeExec {
    private List<String> command;

    public PodSpecInitContainersStartupProbeExec() {
        // no-op
    }

    public PodSpecInitContainersStartupProbeExec(final List<String> command) {
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
        if (!(__other instanceof PodSpecInitContainersStartupProbeExec)) {
            return false;
        }
        final PodSpecInitContainersStartupProbeExec __otherCasted = (PodSpecInitContainersStartupProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
