package io.yupiik.kubernetes.bindings.v1_17_6.v1;

import java.util.List;
import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateSpecContainersStartupProbeExec {
    private List<String> command;

    public ReplicaSetListItemsSpecTemplateSpecContainersStartupProbeExec() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecContainersStartupProbeExec(final List<String> command) {
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
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateSpecContainersStartupProbeExec)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateSpecContainersStartupProbeExec __otherCasted = (ReplicaSetListItemsSpecTemplateSpecContainersStartupProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
