package io.yupiik.kubernetes.bindings.v1_23_6;

import java.util.List;
import java.util.Objects;

public class DaemonSetSpecTemplateSpecContainersLivenessProbeExec {
    private List<String> command;

    public DaemonSetSpecTemplateSpecContainersLivenessProbeExec() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecContainersLivenessProbeExec(final List<String> command) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecContainersLivenessProbeExec)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecContainersLivenessProbeExec __otherCasted = (DaemonSetSpecTemplateSpecContainersLivenessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
