package io.yupiik.kubernetes.bindings.v1_20_4;

import java.util.List;
import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecEphemeralContainersStartupProbeExec {
    private List<String> command;

    public DaemonSetListItemsSpecTemplateSpecEphemeralContainersStartupProbeExec() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecEphemeralContainersStartupProbeExec(final List<String> command) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecEphemeralContainersStartupProbeExec)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecEphemeralContainersStartupProbeExec __otherCasted = (DaemonSetListItemsSpecTemplateSpecEphemeralContainersStartupProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
