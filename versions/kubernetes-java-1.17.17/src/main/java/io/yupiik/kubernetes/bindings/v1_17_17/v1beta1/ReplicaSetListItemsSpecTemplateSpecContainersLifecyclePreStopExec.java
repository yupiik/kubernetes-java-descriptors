package io.yupiik.kubernetes.bindings.v1_17_17.v1beta1;

import java.util.List;
import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateSpecContainersLifecyclePreStopExec {
    private List<String> command;

    public ReplicaSetListItemsSpecTemplateSpecContainersLifecyclePreStopExec() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecContainersLifecyclePreStopExec(final List<String> command) {
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
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateSpecContainersLifecyclePreStopExec)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateSpecContainersLifecyclePreStopExec __otherCasted = (ReplicaSetListItemsSpecTemplateSpecContainersLifecyclePreStopExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
