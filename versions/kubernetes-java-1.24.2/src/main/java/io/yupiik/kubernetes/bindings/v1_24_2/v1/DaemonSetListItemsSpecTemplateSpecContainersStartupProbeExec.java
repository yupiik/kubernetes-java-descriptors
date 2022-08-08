package io.yupiik.kubernetes.bindings.v1_24_2.v1;

import java.util.List;
import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecContainersStartupProbeExec {
    private List<String> command;

    public DaemonSetListItemsSpecTemplateSpecContainersStartupProbeExec() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecContainersStartupProbeExec(final List<String> command) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecContainersStartupProbeExec)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecContainersStartupProbeExec __otherCasted = (DaemonSetListItemsSpecTemplateSpecContainersStartupProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
