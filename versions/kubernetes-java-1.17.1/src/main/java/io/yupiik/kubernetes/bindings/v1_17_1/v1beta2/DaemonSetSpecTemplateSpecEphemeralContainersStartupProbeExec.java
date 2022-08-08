package io.yupiik.kubernetes.bindings.v1_17_1.v1beta2;

import java.util.List;
import java.util.Objects;

public class DaemonSetSpecTemplateSpecEphemeralContainersStartupProbeExec {
    private List<String> command;

    public DaemonSetSpecTemplateSpecEphemeralContainersStartupProbeExec() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecEphemeralContainersStartupProbeExec(final List<String> command) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecEphemeralContainersStartupProbeExec)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecEphemeralContainersStartupProbeExec __otherCasted = (DaemonSetSpecTemplateSpecEphemeralContainersStartupProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
