package io.yupiik.kubernetes.bindings.v1_18_7.v1;

import java.util.List;
import java.util.Objects;

public class PodListItemsSpecContainersReadinessProbeExec {
    private List<String> command;

    public PodListItemsSpecContainersReadinessProbeExec() {
        // no-op
    }

    public PodListItemsSpecContainersReadinessProbeExec(final List<String> command) {
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
        if (!(__other instanceof PodListItemsSpecContainersReadinessProbeExec)) {
            return false;
        }
        final PodListItemsSpecContainersReadinessProbeExec __otherCasted = (PodListItemsSpecContainersReadinessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
