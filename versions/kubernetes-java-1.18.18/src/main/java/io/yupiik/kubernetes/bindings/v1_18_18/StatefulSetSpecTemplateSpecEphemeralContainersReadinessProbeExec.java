package io.yupiik.kubernetes.bindings.v1_18_18;

import java.util.List;
import java.util.Objects;

public class StatefulSetSpecTemplateSpecEphemeralContainersReadinessProbeExec {
    private List<String> command;

    public StatefulSetSpecTemplateSpecEphemeralContainersReadinessProbeExec() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecEphemeralContainersReadinessProbeExec(final List<String> command) {
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecEphemeralContainersReadinessProbeExec)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecEphemeralContainersReadinessProbeExec __otherCasted = (StatefulSetSpecTemplateSpecEphemeralContainersReadinessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
