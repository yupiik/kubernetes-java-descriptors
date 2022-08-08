package io.yupiik.kubernetes.bindings.v1_24_1;

import java.util.List;
import java.util.Objects;

public class DaemonSetSpecTemplateSpecContainersStartupProbeExec {
    private List<String> command;

    public DaemonSetSpecTemplateSpecContainersStartupProbeExec() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecContainersStartupProbeExec(final List<String> command) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecContainersStartupProbeExec)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecContainersStartupProbeExec __otherCasted = (DaemonSetSpecTemplateSpecContainersStartupProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
