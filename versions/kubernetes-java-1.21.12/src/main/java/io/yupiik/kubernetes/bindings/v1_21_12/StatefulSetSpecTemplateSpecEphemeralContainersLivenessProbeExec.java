package io.yupiik.kubernetes.bindings.v1_21_12;

import java.util.List;
import java.util.Objects;

public class StatefulSetSpecTemplateSpecEphemeralContainersLivenessProbeExec {
    private List<String> command;

    public StatefulSetSpecTemplateSpecEphemeralContainersLivenessProbeExec() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecEphemeralContainersLivenessProbeExec(final List<String> command) {
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecEphemeralContainersLivenessProbeExec)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecEphemeralContainersLivenessProbeExec __otherCasted = (StatefulSetSpecTemplateSpecEphemeralContainersLivenessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
