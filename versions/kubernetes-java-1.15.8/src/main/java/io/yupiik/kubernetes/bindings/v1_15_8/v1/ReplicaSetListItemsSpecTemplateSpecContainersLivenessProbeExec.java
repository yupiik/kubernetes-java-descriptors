package io.yupiik.kubernetes.bindings.v1_15_8.v1;

import java.util.List;
import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateSpecContainersLivenessProbeExec {
    private List<String> command;

    public ReplicaSetListItemsSpecTemplateSpecContainersLivenessProbeExec() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecContainersLivenessProbeExec(final List<String> command) {
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
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateSpecContainersLivenessProbeExec)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateSpecContainersLivenessProbeExec __otherCasted = (ReplicaSetListItemsSpecTemplateSpecContainersLivenessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
