package io.yupiik.kubernetes.bindings.v1_21_0.v1;

import java.util.List;
import java.util.Objects;

public class PodListItemsSpecEphemeralContainersStartupProbeExec {
    private List<String> command;

    public PodListItemsSpecEphemeralContainersStartupProbeExec() {
        // no-op
    }

    public PodListItemsSpecEphemeralContainersStartupProbeExec(final List<String> command) {
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
        if (!(__other instanceof PodListItemsSpecEphemeralContainersStartupProbeExec)) {
            return false;
        }
        final PodListItemsSpecEphemeralContainersStartupProbeExec __otherCasted = (PodListItemsSpecEphemeralContainersStartupProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
