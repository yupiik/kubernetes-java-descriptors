package io.yupiik.kubernetes.bindings.v1_18_11;

import java.util.List;
import java.util.Objects;

public class DaemonSetSpecTemplateSpecInitContainersStartupProbeExec {
    private List<String> command;

    public DaemonSetSpecTemplateSpecInitContainersStartupProbeExec() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecInitContainersStartupProbeExec(final List<String> command) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecInitContainersStartupProbeExec)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecInitContainersStartupProbeExec __otherCasted = (DaemonSetSpecTemplateSpecInitContainersStartupProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
