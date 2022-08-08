package io.yupiik.kubernetes.bindings.v1_17_0.v1;

import java.util.List;
import java.util.Objects;

public class ReplicaSetSpecTemplateSpecInitContainersStartupProbeExec {
    private List<String> command;

    public ReplicaSetSpecTemplateSpecInitContainersStartupProbeExec() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecInitContainersStartupProbeExec(final List<String> command) {
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
        if (!(__other instanceof ReplicaSetSpecTemplateSpecInitContainersStartupProbeExec)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecInitContainersStartupProbeExec __otherCasted = (ReplicaSetSpecTemplateSpecInitContainersStartupProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
