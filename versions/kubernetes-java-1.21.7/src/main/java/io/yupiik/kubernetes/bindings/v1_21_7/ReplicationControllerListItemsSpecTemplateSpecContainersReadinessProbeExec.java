package io.yupiik.kubernetes.bindings.v1_21_7;

import java.util.List;
import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecContainersReadinessProbeExec {
    private List<String> command;

    public ReplicationControllerListItemsSpecTemplateSpecContainersReadinessProbeExec() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecContainersReadinessProbeExec(final List<String> command) {
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
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecContainersReadinessProbeExec)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecContainersReadinessProbeExec __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecContainersReadinessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
