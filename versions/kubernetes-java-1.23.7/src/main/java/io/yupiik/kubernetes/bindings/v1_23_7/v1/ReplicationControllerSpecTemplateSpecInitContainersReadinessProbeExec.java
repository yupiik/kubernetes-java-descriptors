package io.yupiik.kubernetes.bindings.v1_23_7.v1;

import java.util.List;
import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecInitContainersReadinessProbeExec {
    private List<String> command;

    public ReplicationControllerSpecTemplateSpecInitContainersReadinessProbeExec() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecInitContainersReadinessProbeExec(final List<String> command) {
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
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecInitContainersReadinessProbeExec)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecInitContainersReadinessProbeExec __otherCasted = (ReplicationControllerSpecTemplateSpecInitContainersReadinessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
