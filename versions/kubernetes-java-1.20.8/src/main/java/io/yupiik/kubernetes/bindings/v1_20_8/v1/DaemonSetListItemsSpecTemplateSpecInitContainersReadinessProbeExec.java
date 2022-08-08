package io.yupiik.kubernetes.bindings.v1_20_8.v1;

import java.util.List;
import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecInitContainersReadinessProbeExec {
    private List<String> command;

    public DaemonSetListItemsSpecTemplateSpecInitContainersReadinessProbeExec() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecInitContainersReadinessProbeExec(final List<String> command) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecInitContainersReadinessProbeExec)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecInitContainersReadinessProbeExec __otherCasted = (DaemonSetListItemsSpecTemplateSpecInitContainersReadinessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
