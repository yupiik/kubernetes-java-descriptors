package io.yupiik.kubernetes.bindings.v1_16_14;

import java.util.List;
import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecInitContainersLivenessProbeExec {
    private List<String> command;

    public DaemonSetListItemsSpecTemplateSpecInitContainersLivenessProbeExec() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecInitContainersLivenessProbeExec(final List<String> command) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecInitContainersLivenessProbeExec)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecInitContainersLivenessProbeExec __otherCasted = (DaemonSetListItemsSpecTemplateSpecInitContainersLivenessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
