package io.yupiik.kubernetes.bindings.v1_14_2.v1beta1;

import java.util.List;
import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecInitContainersLivenessProbeExec {
    private List<String> command;

    public StatefulSetListItemsSpecTemplateSpecInitContainersLivenessProbeExec() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecInitContainersLivenessProbeExec(final List<String> command) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecInitContainersLivenessProbeExec)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecInitContainersLivenessProbeExec __otherCasted = (StatefulSetListItemsSpecTemplateSpecInitContainersLivenessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
