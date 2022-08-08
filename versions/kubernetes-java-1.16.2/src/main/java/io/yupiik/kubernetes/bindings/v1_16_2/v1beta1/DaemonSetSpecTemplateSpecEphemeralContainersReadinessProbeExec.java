package io.yupiik.kubernetes.bindings.v1_16_2.v1beta1;

import java.util.List;
import java.util.Objects;

public class DaemonSetSpecTemplateSpecEphemeralContainersReadinessProbeExec {
    private List<String> command;

    public DaemonSetSpecTemplateSpecEphemeralContainersReadinessProbeExec() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecEphemeralContainersReadinessProbeExec(final List<String> command) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecEphemeralContainersReadinessProbeExec)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecEphemeralContainersReadinessProbeExec __otherCasted = (DaemonSetSpecTemplateSpecEphemeralContainersReadinessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
