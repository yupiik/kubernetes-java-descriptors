package io.yupiik.kubernetes.bindings.v1_17_15;

import java.util.List;
import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecInitContainersStartupProbeExec {
    private List<String> command;

    public DaemonSetListItemsSpecTemplateSpecInitContainersStartupProbeExec() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecInitContainersStartupProbeExec(final List<String> command) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecInitContainersStartupProbeExec)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecInitContainersStartupProbeExec __otherCasted = (DaemonSetListItemsSpecTemplateSpecInitContainersStartupProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
