package io.yupiik.kubernetes.bindings.v1_18_1;

import java.util.List;
import java.util.Objects;

public class ReplicaSetSpecTemplateSpecEphemeralContainersLivenessProbeExec {
    private List<String> command;

    public ReplicaSetSpecTemplateSpecEphemeralContainersLivenessProbeExec() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecEphemeralContainersLivenessProbeExec(final List<String> command) {
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
        if (!(__other instanceof ReplicaSetSpecTemplateSpecEphemeralContainersLivenessProbeExec)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecEphemeralContainersLivenessProbeExec __otherCasted = (ReplicaSetSpecTemplateSpecEphemeralContainersLivenessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
