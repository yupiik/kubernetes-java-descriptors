package io.yupiik.kubernetes.bindings.v1_15_2.v1beta1;

import java.util.List;
import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateSpecInitContainersReadinessProbeExec {
    private List<String> command;

    public ReplicaSetListItemsSpecTemplateSpecInitContainersReadinessProbeExec() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecInitContainersReadinessProbeExec(final List<String> command) {
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
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateSpecInitContainersReadinessProbeExec)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateSpecInitContainersReadinessProbeExec __otherCasted = (ReplicaSetListItemsSpecTemplateSpecInitContainersReadinessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
