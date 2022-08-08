package io.yupiik.kubernetes.bindings.v1_18_10;

import java.util.List;
import java.util.Objects;

public class PodListItemsSpecContainersLifecyclePostStartExec {
    private List<String> command;

    public PodListItemsSpecContainersLifecyclePostStartExec() {
        // no-op
    }

    public PodListItemsSpecContainersLifecyclePostStartExec(final List<String> command) {
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
        if (!(__other instanceof PodListItemsSpecContainersLifecyclePostStartExec)) {
            return false;
        }
        final PodListItemsSpecContainersLifecyclePostStartExec __otherCasted = (PodListItemsSpecContainersLifecyclePostStartExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
