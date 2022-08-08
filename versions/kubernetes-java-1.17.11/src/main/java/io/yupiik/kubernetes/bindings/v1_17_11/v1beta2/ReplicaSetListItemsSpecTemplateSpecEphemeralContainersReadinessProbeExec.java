package io.yupiik.kubernetes.bindings.v1_17_11.v1beta2;

import java.util.List;
import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateSpecEphemeralContainersReadinessProbeExec {
    private List<String> command;

    public ReplicaSetListItemsSpecTemplateSpecEphemeralContainersReadinessProbeExec() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecEphemeralContainersReadinessProbeExec(final List<String> command) {
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
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateSpecEphemeralContainersReadinessProbeExec)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateSpecEphemeralContainersReadinessProbeExec __otherCasted = (ReplicaSetListItemsSpecTemplateSpecEphemeralContainersReadinessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
