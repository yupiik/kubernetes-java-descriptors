package io.yupiik.kubernetes.bindings.v1_19_14.v1;

import java.util.List;
import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateSpecContainersReadinessProbeExec {
    private List<String> command;

    public ReplicaSetListItemsSpecTemplateSpecContainersReadinessProbeExec() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecContainersReadinessProbeExec(final List<String> command) {
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
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateSpecContainersReadinessProbeExec)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateSpecContainersReadinessProbeExec __otherCasted = (ReplicaSetListItemsSpecTemplateSpecContainersReadinessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
