package io.yupiik.kubernetes.bindings.v1_23_2.v1;

import java.util.List;
import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecContainersReadinessProbeExec {
    private List<String> command;

    public ReplicationControllerSpecTemplateSpecContainersReadinessProbeExec() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecContainersReadinessProbeExec(final List<String> command) {
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
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecContainersReadinessProbeExec)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecContainersReadinessProbeExec __otherCasted = (ReplicationControllerSpecTemplateSpecContainersReadinessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
