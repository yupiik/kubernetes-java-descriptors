package io.yupiik.kubernetes.bindings.v1_18_9;

import java.util.List;
import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecContainersLivenessProbeExec {
    private List<String> command;

    public ReplicationControllerListItemsSpecTemplateSpecContainersLivenessProbeExec() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecContainersLivenessProbeExec(final List<String> command) {
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
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecContainersLivenessProbeExec)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecContainersLivenessProbeExec __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecContainersLivenessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
