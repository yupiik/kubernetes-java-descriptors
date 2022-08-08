package io.yupiik.kubernetes.bindings.v1_17_4.v1beta1;

import java.util.List;
import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateSpecEphemeralContainersStartupProbeExec {
    private List<String> command;

    public ReplicaSetListItemsSpecTemplateSpecEphemeralContainersStartupProbeExec() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecEphemeralContainersStartupProbeExec(final List<String> command) {
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
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateSpecEphemeralContainersStartupProbeExec)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateSpecEphemeralContainersStartupProbeExec __otherCasted = (ReplicaSetListItemsSpecTemplateSpecEphemeralContainersStartupProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
