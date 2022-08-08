package io.yupiik.kubernetes.bindings.v1_19_11.v1;

import java.util.List;
import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecInitContainersReadinessProbeExec {
    private List<String> command;

    public ReplicationControllerListItemsSpecTemplateSpecInitContainersReadinessProbeExec() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecInitContainersReadinessProbeExec(final List<String> command) {
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
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecInitContainersReadinessProbeExec)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecInitContainersReadinessProbeExec __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecInitContainersReadinessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
