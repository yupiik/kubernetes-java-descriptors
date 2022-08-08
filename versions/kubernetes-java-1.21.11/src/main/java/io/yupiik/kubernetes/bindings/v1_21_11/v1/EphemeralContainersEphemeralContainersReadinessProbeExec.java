package io.yupiik.kubernetes.bindings.v1_21_11.v1;

import java.util.List;
import java.util.Objects;

public class EphemeralContainersEphemeralContainersReadinessProbeExec {
    private List<String> command;

    public EphemeralContainersEphemeralContainersReadinessProbeExec() {
        // no-op
    }

    public EphemeralContainersEphemeralContainersReadinessProbeExec(final List<String> command) {
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
        if (!(__other instanceof EphemeralContainersEphemeralContainersReadinessProbeExec)) {
            return false;
        }
        final EphemeralContainersEphemeralContainersReadinessProbeExec __otherCasted = (EphemeralContainersEphemeralContainersReadinessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
