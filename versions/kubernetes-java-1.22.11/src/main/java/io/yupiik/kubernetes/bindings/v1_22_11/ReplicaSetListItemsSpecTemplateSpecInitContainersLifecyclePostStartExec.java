package io.yupiik.kubernetes.bindings.v1_22_11;

import java.util.List;
import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateSpecInitContainersLifecyclePostStartExec {
    private List<String> command;

    public ReplicaSetListItemsSpecTemplateSpecInitContainersLifecyclePostStartExec() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecInitContainersLifecyclePostStartExec(final List<String> command) {
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
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateSpecInitContainersLifecyclePostStartExec)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateSpecInitContainersLifecyclePostStartExec __otherCasted = (ReplicaSetListItemsSpecTemplateSpecInitContainersLifecyclePostStartExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
