package io.yupiik.kubernetes.bindings.v1_14_8.v1;

import java.util.List;
import java.util.Objects;

public class PodTemplateListItemsTemplateSpecInitContainersReadinessProbeExec {
    private List<String> command;

    public PodTemplateListItemsTemplateSpecInitContainersReadinessProbeExec() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecInitContainersReadinessProbeExec(final List<String> command) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecInitContainersReadinessProbeExec)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecInitContainersReadinessProbeExec __otherCasted = (PodTemplateListItemsTemplateSpecInitContainersReadinessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
