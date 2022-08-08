package io.yupiik.kubernetes.bindings.v1_19_10;

import java.util.List;
import java.util.Objects;

public class PodListItemsSpecInitContainersLifecyclePostStartExec {
    private List<String> command;

    public PodListItemsSpecInitContainersLifecyclePostStartExec() {
        // no-op
    }

    public PodListItemsSpecInitContainersLifecyclePostStartExec(final List<String> command) {
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
        if (!(__other instanceof PodListItemsSpecInitContainersLifecyclePostStartExec)) {
            return false;
        }
        final PodListItemsSpecInitContainersLifecyclePostStartExec __otherCasted = (PodListItemsSpecInitContainersLifecyclePostStartExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
