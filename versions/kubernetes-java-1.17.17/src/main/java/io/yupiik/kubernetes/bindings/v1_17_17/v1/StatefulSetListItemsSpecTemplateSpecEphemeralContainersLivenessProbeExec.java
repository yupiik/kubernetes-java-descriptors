package io.yupiik.kubernetes.bindings.v1_17_17.v1;

import java.util.List;
import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbeExec {
    private List<String> command;

    public StatefulSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbeExec() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbeExec(final List<String> command) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbeExec)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbeExec __otherCasted = (StatefulSetListItemsSpecTemplateSpecEphemeralContainersLivenessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
