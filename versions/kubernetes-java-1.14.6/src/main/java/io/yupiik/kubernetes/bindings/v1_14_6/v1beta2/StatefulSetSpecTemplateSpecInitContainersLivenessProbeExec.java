package io.yupiik.kubernetes.bindings.v1_14_6.v1beta2;

import java.util.List;
import java.util.Objects;

public class StatefulSetSpecTemplateSpecInitContainersLivenessProbeExec {
    private List<String> command;

    public StatefulSetSpecTemplateSpecInitContainersLivenessProbeExec() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecInitContainersLivenessProbeExec(final List<String> command) {
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecInitContainersLivenessProbeExec)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecInitContainersLivenessProbeExec __otherCasted = (StatefulSetSpecTemplateSpecInitContainersLivenessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
