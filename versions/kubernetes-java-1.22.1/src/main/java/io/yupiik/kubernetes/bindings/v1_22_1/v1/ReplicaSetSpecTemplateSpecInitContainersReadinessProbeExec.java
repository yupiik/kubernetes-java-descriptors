package io.yupiik.kubernetes.bindings.v1_22_1.v1;

import java.util.List;
import java.util.Objects;

public class ReplicaSetSpecTemplateSpecInitContainersReadinessProbeExec {
    private List<String> command;

    public ReplicaSetSpecTemplateSpecInitContainersReadinessProbeExec() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecInitContainersReadinessProbeExec(final List<String> command) {
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
        if (!(__other instanceof ReplicaSetSpecTemplateSpecInitContainersReadinessProbeExec)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecInitContainersReadinessProbeExec __otherCasted = (ReplicaSetSpecTemplateSpecInitContainersReadinessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
