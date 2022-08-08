package io.yupiik.kubernetes.bindings.v1_18_18.v1;

import java.util.List;
import java.util.Objects;

public class ReplicaSetSpecTemplateSpecContainersReadinessProbeExec {
    private List<String> command;

    public ReplicaSetSpecTemplateSpecContainersReadinessProbeExec() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecContainersReadinessProbeExec(final List<String> command) {
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
        if (!(__other instanceof ReplicaSetSpecTemplateSpecContainersReadinessProbeExec)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecContainersReadinessProbeExec __otherCasted = (ReplicaSetSpecTemplateSpecContainersReadinessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
