package io.yupiik.kubernetes.bindings.v1_15_5.v1;

import java.util.List;
import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecContainersReadinessProbeExec {
    private List<String> command;

    public DaemonSetListItemsSpecTemplateSpecContainersReadinessProbeExec() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecContainersReadinessProbeExec(final List<String> command) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecContainersReadinessProbeExec)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecContainersReadinessProbeExec __otherCasted = (DaemonSetListItemsSpecTemplateSpecContainersReadinessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
