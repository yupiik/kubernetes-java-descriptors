package io.yupiik.kubernetes.bindings.v1_17_5.v1;

import java.util.List;
import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbeExec {
    private List<String> command;

    public DaemonSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbeExec() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbeExec(final List<String> command) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbeExec)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbeExec __otherCasted = (DaemonSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
