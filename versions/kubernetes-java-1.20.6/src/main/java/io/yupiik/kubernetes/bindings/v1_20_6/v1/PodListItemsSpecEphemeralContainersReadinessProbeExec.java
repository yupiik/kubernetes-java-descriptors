package io.yupiik.kubernetes.bindings.v1_20_6.v1;

import java.util.List;
import java.util.Objects;

public class PodListItemsSpecEphemeralContainersReadinessProbeExec {
    private List<String> command;

    public PodListItemsSpecEphemeralContainersReadinessProbeExec() {
        // no-op
    }

    public PodListItemsSpecEphemeralContainersReadinessProbeExec(final List<String> command) {
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
        if (!(__other instanceof PodListItemsSpecEphemeralContainersReadinessProbeExec)) {
            return false;
        }
        final PodListItemsSpecEphemeralContainersReadinessProbeExec __otherCasted = (PodListItemsSpecEphemeralContainersReadinessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
