package io.yupiik.kubernetes.bindings.v1_15_4.v1;

import java.util.List;
import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateSpecContainersLifecyclePostStartExec {
    private List<String> command;

    public ReplicaSetListItemsSpecTemplateSpecContainersLifecyclePostStartExec() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecContainersLifecyclePostStartExec(final List<String> command) {
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
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateSpecContainersLifecyclePostStartExec)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateSpecContainersLifecyclePostStartExec __otherCasted = (ReplicaSetListItemsSpecTemplateSpecContainersLifecyclePostStartExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
