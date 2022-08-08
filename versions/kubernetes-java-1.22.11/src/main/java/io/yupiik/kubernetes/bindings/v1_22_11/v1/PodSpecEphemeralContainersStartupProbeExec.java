package io.yupiik.kubernetes.bindings.v1_22_11.v1;

import java.util.List;
import java.util.Objects;

public class PodSpecEphemeralContainersStartupProbeExec {
    private List<String> command;

    public PodSpecEphemeralContainersStartupProbeExec() {
        // no-op
    }

    public PodSpecEphemeralContainersStartupProbeExec(final List<String> command) {
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
        if (!(__other instanceof PodSpecEphemeralContainersStartupProbeExec)) {
            return false;
        }
        final PodSpecEphemeralContainersStartupProbeExec __otherCasted = (PodSpecEphemeralContainersStartupProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
