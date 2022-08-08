package io.yupiik.kubernetes.bindings.v1_22_11;

import java.util.List;
import java.util.Objects;

public class ReplicaSetSpecTemplateSpecContainersLivenessProbeExec {
    private List<String> command;

    public ReplicaSetSpecTemplateSpecContainersLivenessProbeExec() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecContainersLivenessProbeExec(final List<String> command) {
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
        if (!(__other instanceof ReplicaSetSpecTemplateSpecContainersLivenessProbeExec)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecContainersLivenessProbeExec __otherCasted = (ReplicaSetSpecTemplateSpecContainersLivenessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
