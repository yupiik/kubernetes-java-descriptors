package io.yupiik.kubernetes.bindings.v1_22_3;

import java.util.List;
import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecContainersLivenessProbeExec {
    private List<String> command;

    public StatefulSetListItemsSpecTemplateSpecContainersLivenessProbeExec() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecContainersLivenessProbeExec(final List<String> command) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecContainersLivenessProbeExec)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecContainersLivenessProbeExec __otherCasted = (StatefulSetListItemsSpecTemplateSpecContainersLivenessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
