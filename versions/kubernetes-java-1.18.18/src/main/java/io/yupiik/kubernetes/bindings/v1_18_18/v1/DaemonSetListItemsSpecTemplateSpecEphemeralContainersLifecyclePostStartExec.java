package io.yupiik.kubernetes.bindings.v1_18_18.v1;

import java.util.List;
import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartExec {
    private List<String> command;

    public DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartExec() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartExec(final List<String> command) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartExec)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartExec __otherCasted = (DaemonSetListItemsSpecTemplateSpecEphemeralContainersLifecyclePostStartExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
