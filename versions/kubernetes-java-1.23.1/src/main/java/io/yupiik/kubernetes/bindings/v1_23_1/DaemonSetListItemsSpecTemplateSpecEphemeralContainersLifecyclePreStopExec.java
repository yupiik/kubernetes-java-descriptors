package io.yupiik.kubernetes.bindings.v1_23_1;

import java.util.List;
import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopExec {
    private List<String> command;

    public DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopExec() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopExec(final List<String> command) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopExec)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopExec __otherCasted = (DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePreStopExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
