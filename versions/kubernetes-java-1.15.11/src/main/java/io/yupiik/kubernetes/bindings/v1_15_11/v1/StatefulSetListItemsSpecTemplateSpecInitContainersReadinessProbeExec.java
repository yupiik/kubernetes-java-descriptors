package io.yupiik.kubernetes.bindings.v1_15_11.v1;

import java.util.List;
import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecInitContainersReadinessProbeExec {
    private List<String> command;

    public StatefulSetListItemsSpecTemplateSpecInitContainersReadinessProbeExec() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecInitContainersReadinessProbeExec(final List<String> command) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecInitContainersReadinessProbeExec)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecInitContainersReadinessProbeExec __otherCasted = (StatefulSetListItemsSpecTemplateSpecInitContainersReadinessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
