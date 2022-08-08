package io.yupiik.kubernetes.bindings.v1_20_14;

import java.util.List;
import java.util.Objects;

public class DaemonSetSpecTemplateSpecInitContainersLivenessProbeExec {
    private List<String> command;

    public DaemonSetSpecTemplateSpecInitContainersLivenessProbeExec() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecInitContainersLivenessProbeExec(final List<String> command) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecInitContainersLivenessProbeExec)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecInitContainersLivenessProbeExec __otherCasted = (DaemonSetSpecTemplateSpecInitContainersLivenessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
