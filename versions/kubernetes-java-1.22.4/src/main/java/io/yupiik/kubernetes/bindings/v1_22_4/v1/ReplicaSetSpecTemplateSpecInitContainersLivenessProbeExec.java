package io.yupiik.kubernetes.bindings.v1_22_4.v1;

import java.util.List;
import java.util.Objects;

public class ReplicaSetSpecTemplateSpecInitContainersLivenessProbeExec {
    private List<String> command;

    public ReplicaSetSpecTemplateSpecInitContainersLivenessProbeExec() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecInitContainersLivenessProbeExec(final List<String> command) {
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
        if (!(__other instanceof ReplicaSetSpecTemplateSpecInitContainersLivenessProbeExec)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecInitContainersLivenessProbeExec __otherCasted = (ReplicaSetSpecTemplateSpecInitContainersLivenessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
