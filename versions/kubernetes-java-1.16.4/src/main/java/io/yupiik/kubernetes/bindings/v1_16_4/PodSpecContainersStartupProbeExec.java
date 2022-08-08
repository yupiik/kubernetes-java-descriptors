package io.yupiik.kubernetes.bindings.v1_16_4;

import java.util.List;
import java.util.Objects;

public class PodSpecContainersStartupProbeExec {
    private List<String> command;

    public PodSpecContainersStartupProbeExec() {
        // no-op
    }

    public PodSpecContainersStartupProbeExec(final List<String> command) {
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
        if (!(__other instanceof PodSpecContainersStartupProbeExec)) {
            return false;
        }
        final PodSpecContainersStartupProbeExec __otherCasted = (PodSpecContainersStartupProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
