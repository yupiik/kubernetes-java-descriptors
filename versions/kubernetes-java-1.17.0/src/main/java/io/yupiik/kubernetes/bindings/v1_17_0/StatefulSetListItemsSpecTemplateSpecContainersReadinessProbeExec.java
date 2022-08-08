package io.yupiik.kubernetes.bindings.v1_17_0;

import java.util.List;
import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecContainersReadinessProbeExec {
    private List<String> command;

    public StatefulSetListItemsSpecTemplateSpecContainersReadinessProbeExec() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecContainersReadinessProbeExec(final List<String> command) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecContainersReadinessProbeExec)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecContainersReadinessProbeExec __otherCasted = (StatefulSetListItemsSpecTemplateSpecContainersReadinessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
