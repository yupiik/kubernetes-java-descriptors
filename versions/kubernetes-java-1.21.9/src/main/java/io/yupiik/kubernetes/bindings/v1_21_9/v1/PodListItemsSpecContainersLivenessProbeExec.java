package io.yupiik.kubernetes.bindings.v1_21_9.v1;

import java.util.List;
import java.util.Objects;

public class PodListItemsSpecContainersLivenessProbeExec {
    private List<String> command;

    public PodListItemsSpecContainersLivenessProbeExec() {
        // no-op
    }

    public PodListItemsSpecContainersLivenessProbeExec(final List<String> command) {
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
        if (!(__other instanceof PodListItemsSpecContainersLivenessProbeExec)) {
            return false;
        }
        final PodListItemsSpecContainersLivenessProbeExec __otherCasted = (PodListItemsSpecContainersLivenessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
