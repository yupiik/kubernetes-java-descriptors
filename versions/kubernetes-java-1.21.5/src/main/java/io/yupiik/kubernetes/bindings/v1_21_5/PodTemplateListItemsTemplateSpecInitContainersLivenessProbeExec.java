package io.yupiik.kubernetes.bindings.v1_21_5;

import java.util.List;
import java.util.Objects;

public class PodTemplateListItemsTemplateSpecInitContainersLivenessProbeExec {
    private List<String> command;

    public PodTemplateListItemsTemplateSpecInitContainersLivenessProbeExec() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecInitContainersLivenessProbeExec(final List<String> command) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecInitContainersLivenessProbeExec)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecInitContainersLivenessProbeExec __otherCasted = (PodTemplateListItemsTemplateSpecInitContainersLivenessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
