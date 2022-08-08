package io.yupiik.kubernetes.bindings.v1_24_1;

import java.util.List;
import java.util.Objects;

public class ReplicaSetSpecTemplateSpecEphemeralContainersStartupProbeExec {
    private List<String> command;

    public ReplicaSetSpecTemplateSpecEphemeralContainersStartupProbeExec() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecEphemeralContainersStartupProbeExec(final List<String> command) {
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
        if (!(__other instanceof ReplicaSetSpecTemplateSpecEphemeralContainersStartupProbeExec)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecEphemeralContainersStartupProbeExec __otherCasted = (ReplicaSetSpecTemplateSpecEphemeralContainersStartupProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
