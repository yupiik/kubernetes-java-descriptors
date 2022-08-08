package io.yupiik.kubernetes.bindings.v1_16_2;

import java.util.List;
import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateSpecInitContainersStartupProbeExec {
    private List<String> command;

    public ReplicaSetListItemsSpecTemplateSpecInitContainersStartupProbeExec() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecInitContainersStartupProbeExec(final List<String> command) {
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
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateSpecInitContainersStartupProbeExec)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateSpecInitContainersStartupProbeExec __otherCasted = (ReplicaSetListItemsSpecTemplateSpecInitContainersStartupProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
