package io.yupiik.kubernetes.bindings.v1_20_1.v1;

import java.util.List;
import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecInitContainersLifecyclePostStartExec {
    private List<String> command;

    public DaemonSetListItemsSpecTemplateSpecInitContainersLifecyclePostStartExec() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecInitContainersLifecyclePostStartExec(final List<String> command) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecInitContainersLifecyclePostStartExec)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecInitContainersLifecyclePostStartExec __otherCasted = (DaemonSetListItemsSpecTemplateSpecInitContainersLifecyclePostStartExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
