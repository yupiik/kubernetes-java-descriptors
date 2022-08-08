package io.yupiik.kubernetes.bindings.v1_15_11.v1;

import java.util.List;
import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecyclePreStopExec {
    private List<String> command;

    public ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecyclePreStopExec() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecyclePreStopExec(final List<String> command) {
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
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecyclePreStopExec)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecyclePreStopExec __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecInitContainersLifecyclePreStopExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
