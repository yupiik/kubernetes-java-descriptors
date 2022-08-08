package io.yupiik.kubernetes.bindings.v1_17_14;

import java.util.List;
import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersReadinessProbeExec {
    private List<String> command;

    public ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersReadinessProbeExec() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersReadinessProbeExec(final List<String> command) {
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
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersReadinessProbeExec)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersReadinessProbeExec __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersReadinessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
