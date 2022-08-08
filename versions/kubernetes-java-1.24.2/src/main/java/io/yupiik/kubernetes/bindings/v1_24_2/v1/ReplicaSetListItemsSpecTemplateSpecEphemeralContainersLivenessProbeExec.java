package io.yupiik.kubernetes.bindings.v1_24_2.v1;

import java.util.List;
import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbeExec {
    private List<String> command;

    public ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbeExec() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbeExec(final List<String> command) {
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
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbeExec)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbeExec __otherCasted = (ReplicaSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
