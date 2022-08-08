package io.yupiik.kubernetes.bindings.v1_24_3;

import java.util.List;
import java.util.Objects;

public class DaemonSetSpecTemplateSpecInitContainersReadinessProbeExec {
    private List<String> command;

    public DaemonSetSpecTemplateSpecInitContainersReadinessProbeExec() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecInitContainersReadinessProbeExec(final List<String> command) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecInitContainersReadinessProbeExec)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecInitContainersReadinessProbeExec __otherCasted = (DaemonSetSpecTemplateSpecInitContainersReadinessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
