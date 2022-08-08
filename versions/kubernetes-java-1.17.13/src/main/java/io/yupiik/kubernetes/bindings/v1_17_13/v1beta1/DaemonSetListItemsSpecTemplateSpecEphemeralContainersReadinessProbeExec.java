package io.yupiik.kubernetes.bindings.v1_17_13.v1beta1;

import java.util.List;
import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecEphemeralContainersReadinessProbeExec {
    private List<String> command;

    public DaemonSetListItemsSpecTemplateSpecEphemeralContainersReadinessProbeExec() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecEphemeralContainersReadinessProbeExec(final List<String> command) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecEphemeralContainersReadinessProbeExec)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecEphemeralContainersReadinessProbeExec __otherCasted = (DaemonSetListItemsSpecTemplateSpecEphemeralContainersReadinessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
