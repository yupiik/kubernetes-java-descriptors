package io.yupiik.kubernetes.bindings.v1_20_1.v1;

import java.util.List;
import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecInitContainersLivenessProbeExec {
    private List<String> command;

    public ReplicationControllerListItemsSpecTemplateSpecInitContainersLivenessProbeExec() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecInitContainersLivenessProbeExec(final List<String> command) {
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
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecInitContainersLivenessProbeExec)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecInitContainersLivenessProbeExec __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecInitContainersLivenessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
