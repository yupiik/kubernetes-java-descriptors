package io.yupiik.kubernetes.bindings.v1_18_16.v1;

import java.util.List;
import java.util.Objects;

public class PodListItemsSpecEphemeralContainersLivenessProbeExec {
    private List<String> command;

    public PodListItemsSpecEphemeralContainersLivenessProbeExec() {
        // no-op
    }

    public PodListItemsSpecEphemeralContainersLivenessProbeExec(final List<String> command) {
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
        if (!(__other instanceof PodListItemsSpecEphemeralContainersLivenessProbeExec)) {
            return false;
        }
        final PodListItemsSpecEphemeralContainersLivenessProbeExec __otherCasted = (PodListItemsSpecEphemeralContainersLivenessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
