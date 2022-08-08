package io.yupiik.kubernetes.bindings.v1_16_3;

import java.util.List;
import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecContainersLivenessProbeExec {
    private List<String> command;

    public ReplicationControllerSpecTemplateSpecContainersLivenessProbeExec() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecContainersLivenessProbeExec(final List<String> command) {
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
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecContainersLivenessProbeExec)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecContainersLivenessProbeExec __otherCasted = (ReplicationControllerSpecTemplateSpecContainersLivenessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
