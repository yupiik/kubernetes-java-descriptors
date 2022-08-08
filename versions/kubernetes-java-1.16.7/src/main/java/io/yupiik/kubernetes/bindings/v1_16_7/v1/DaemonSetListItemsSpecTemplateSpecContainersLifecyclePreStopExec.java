package io.yupiik.kubernetes.bindings.v1_16_7.v1;

import java.util.List;
import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecContainersLifecyclePreStopExec {
    private List<String> command;

    public DaemonSetListItemsSpecTemplateSpecContainersLifecyclePreStopExec() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecContainersLifecyclePreStopExec(final List<String> command) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecContainersLifecyclePreStopExec)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecContainersLifecyclePreStopExec __otherCasted = (DaemonSetListItemsSpecTemplateSpecContainersLifecyclePreStopExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
