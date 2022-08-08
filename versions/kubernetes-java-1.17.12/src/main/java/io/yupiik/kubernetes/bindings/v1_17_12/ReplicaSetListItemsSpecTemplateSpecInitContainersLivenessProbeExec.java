package io.yupiik.kubernetes.bindings.v1_17_12;

import java.util.List;
import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateSpecInitContainersLivenessProbeExec {
    private List<String> command;

    public ReplicaSetListItemsSpecTemplateSpecInitContainersLivenessProbeExec() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecInitContainersLivenessProbeExec(final List<String> command) {
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
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateSpecInitContainersLivenessProbeExec)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateSpecInitContainersLivenessProbeExec __otherCasted = (ReplicaSetListItemsSpecTemplateSpecInitContainersLivenessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
