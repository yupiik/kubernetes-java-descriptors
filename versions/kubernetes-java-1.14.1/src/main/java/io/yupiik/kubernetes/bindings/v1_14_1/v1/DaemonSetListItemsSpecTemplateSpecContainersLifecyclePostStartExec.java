package io.yupiik.kubernetes.bindings.v1_14_1.v1;

import java.util.List;
import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecContainersLifecyclePostStartExec {
    private List<String> command;

    public DaemonSetListItemsSpecTemplateSpecContainersLifecyclePostStartExec() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecContainersLifecyclePostStartExec(final List<String> command) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecContainersLifecyclePostStartExec)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecContainersLifecyclePostStartExec __otherCasted = (DaemonSetListItemsSpecTemplateSpecContainersLifecyclePostStartExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
