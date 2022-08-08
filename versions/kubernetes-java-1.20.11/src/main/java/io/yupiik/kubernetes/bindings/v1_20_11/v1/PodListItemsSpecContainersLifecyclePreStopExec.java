package io.yupiik.kubernetes.bindings.v1_20_11.v1;

import java.util.List;
import java.util.Objects;

public class PodListItemsSpecContainersLifecyclePreStopExec {
    private List<String> command;

    public PodListItemsSpecContainersLifecyclePreStopExec() {
        // no-op
    }

    public PodListItemsSpecContainersLifecyclePreStopExec(final List<String> command) {
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
        if (!(__other instanceof PodListItemsSpecContainersLifecyclePreStopExec)) {
            return false;
        }
        final PodListItemsSpecContainersLifecyclePreStopExec __otherCasted = (PodListItemsSpecContainersLifecyclePreStopExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
