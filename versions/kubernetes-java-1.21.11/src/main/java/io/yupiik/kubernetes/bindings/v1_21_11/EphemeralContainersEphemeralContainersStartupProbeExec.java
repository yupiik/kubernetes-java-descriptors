package io.yupiik.kubernetes.bindings.v1_21_11;

import java.util.List;
import java.util.Objects;

public class EphemeralContainersEphemeralContainersStartupProbeExec {
    private List<String> command;

    public EphemeralContainersEphemeralContainersStartupProbeExec() {
        // no-op
    }

    public EphemeralContainersEphemeralContainersStartupProbeExec(final List<String> command) {
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
        if (!(__other instanceof EphemeralContainersEphemeralContainersStartupProbeExec)) {
            return false;
        }
        final EphemeralContainersEphemeralContainersStartupProbeExec __otherCasted = (EphemeralContainersEphemeralContainersStartupProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
