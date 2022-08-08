package io.yupiik.kubernetes.bindings.v1_20_2.v1;

import java.util.List;
import java.util.Objects;

public class PodListItemsSpecEphemeralContainersLifecyclePreStopExec {
    private List<String> command;

    public PodListItemsSpecEphemeralContainersLifecyclePreStopExec() {
        // no-op
    }

    public PodListItemsSpecEphemeralContainersLifecyclePreStopExec(final List<String> command) {
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
        if (!(__other instanceof PodListItemsSpecEphemeralContainersLifecyclePreStopExec)) {
            return false;
        }
        final PodListItemsSpecEphemeralContainersLifecyclePreStopExec __otherCasted = (PodListItemsSpecEphemeralContainersLifecyclePreStopExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
