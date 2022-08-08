package io.yupiik.kubernetes.bindings.v1_19_15.v1;

import java.util.List;
import java.util.Objects;

public class PodListItemsSpecInitContainersLifecyclePreStopExec {
    private List<String> command;

    public PodListItemsSpecInitContainersLifecyclePreStopExec() {
        // no-op
    }

    public PodListItemsSpecInitContainersLifecyclePreStopExec(final List<String> command) {
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
        if (!(__other instanceof PodListItemsSpecInitContainersLifecyclePreStopExec)) {
            return false;
        }
        final PodListItemsSpecInitContainersLifecyclePreStopExec __otherCasted = (PodListItemsSpecInitContainersLifecyclePreStopExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
