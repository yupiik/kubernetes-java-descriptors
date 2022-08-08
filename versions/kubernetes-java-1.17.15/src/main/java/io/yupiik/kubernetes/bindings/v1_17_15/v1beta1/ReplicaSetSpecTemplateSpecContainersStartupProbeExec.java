package io.yupiik.kubernetes.bindings.v1_17_15.v1beta1;

import java.util.List;
import java.util.Objects;

public class ReplicaSetSpecTemplateSpecContainersStartupProbeExec {
    private List<String> command;

    public ReplicaSetSpecTemplateSpecContainersStartupProbeExec() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecContainersStartupProbeExec(final List<String> command) {
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
        if (!(__other instanceof ReplicaSetSpecTemplateSpecContainersStartupProbeExec)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecContainersStartupProbeExec __otherCasted = (ReplicaSetSpecTemplateSpecContainersStartupProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
