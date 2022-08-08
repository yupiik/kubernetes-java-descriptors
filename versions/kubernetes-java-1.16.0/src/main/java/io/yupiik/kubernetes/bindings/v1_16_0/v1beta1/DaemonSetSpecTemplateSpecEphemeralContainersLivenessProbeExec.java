package io.yupiik.kubernetes.bindings.v1_16_0.v1beta1;

import java.util.List;
import java.util.Objects;

public class DaemonSetSpecTemplateSpecEphemeralContainersLivenessProbeExec {
    private List<String> command;

    public DaemonSetSpecTemplateSpecEphemeralContainersLivenessProbeExec() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecEphemeralContainersLivenessProbeExec(final List<String> command) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecEphemeralContainersLivenessProbeExec)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecEphemeralContainersLivenessProbeExec __otherCasted = (DaemonSetSpecTemplateSpecEphemeralContainersLivenessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
