package io.yupiik.kubernetes.bindings.v1_15_6.v1;

import java.util.List;
import java.util.Objects;

public class StatefulSetSpecTemplateSpecInitContainersReadinessProbeExec {
    private List<String> command;

    public StatefulSetSpecTemplateSpecInitContainersReadinessProbeExec() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecInitContainersReadinessProbeExec(final List<String> command) {
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecInitContainersReadinessProbeExec)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecInitContainersReadinessProbeExec __otherCasted = (StatefulSetSpecTemplateSpecInitContainersReadinessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
