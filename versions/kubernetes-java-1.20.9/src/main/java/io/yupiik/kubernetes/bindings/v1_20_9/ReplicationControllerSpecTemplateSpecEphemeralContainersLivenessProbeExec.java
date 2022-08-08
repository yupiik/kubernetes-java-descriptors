package io.yupiik.kubernetes.bindings.v1_20_9;

import java.util.List;
import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecEphemeralContainersLivenessProbeExec {
    private List<String> command;

    public ReplicationControllerSpecTemplateSpecEphemeralContainersLivenessProbeExec() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecEphemeralContainersLivenessProbeExec(final List<String> command) {
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
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecEphemeralContainersLivenessProbeExec)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecEphemeralContainersLivenessProbeExec __otherCasted = (ReplicationControllerSpecTemplateSpecEphemeralContainersLivenessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
