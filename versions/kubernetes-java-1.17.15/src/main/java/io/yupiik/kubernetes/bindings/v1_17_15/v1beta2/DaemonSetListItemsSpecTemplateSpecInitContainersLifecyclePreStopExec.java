package io.yupiik.kubernetes.bindings.v1_17_15.v1beta2;

import java.util.List;
import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecInitContainersLifecyclePreStopExec {
    private List<String> command;

    public DaemonSetListItemsSpecTemplateSpecInitContainersLifecyclePreStopExec() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecInitContainersLifecyclePreStopExec(final List<String> command) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecInitContainersLifecyclePreStopExec)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecInitContainersLifecyclePreStopExec __otherCasted = (DaemonSetListItemsSpecTemplateSpecInitContainersLifecyclePreStopExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
