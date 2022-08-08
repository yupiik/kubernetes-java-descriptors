package io.yupiik.kubernetes.bindings.v1_19_4.v1;

import java.util.List;
import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecInitContainersLivenessProbeExec {
    private List<String> command;

    public ReplicationControllerSpecTemplateSpecInitContainersLivenessProbeExec() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecInitContainersLivenessProbeExec(final List<String> command) {
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
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecInitContainersLivenessProbeExec)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecInitContainersLivenessProbeExec __otherCasted = (ReplicationControllerSpecTemplateSpecInitContainersLivenessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
