package io.yupiik.kubernetes.bindings.v1_22_4;

import java.util.List;
import java.util.Objects;

public class PodListItemsSpecInitContainersStartupProbeExec {
    private List<String> command;

    public PodListItemsSpecInitContainersStartupProbeExec() {
        // no-op
    }

    public PodListItemsSpecInitContainersStartupProbeExec(final List<String> command) {
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
        if (!(__other instanceof PodListItemsSpecInitContainersStartupProbeExec)) {
            return false;
        }
        final PodListItemsSpecInitContainersStartupProbeExec __otherCasted = (PodListItemsSpecInitContainersStartupProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
