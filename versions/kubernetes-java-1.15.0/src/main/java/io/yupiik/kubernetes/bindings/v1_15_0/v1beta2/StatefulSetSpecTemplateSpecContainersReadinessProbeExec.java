package io.yupiik.kubernetes.bindings.v1_15_0.v1beta2;

import java.util.List;
import java.util.Objects;

public class StatefulSetSpecTemplateSpecContainersReadinessProbeExec {
    private List<String> command;

    public StatefulSetSpecTemplateSpecContainersReadinessProbeExec() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecContainersReadinessProbeExec(final List<String> command) {
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecContainersReadinessProbeExec)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecContainersReadinessProbeExec __otherCasted = (StatefulSetSpecTemplateSpecContainersReadinessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
