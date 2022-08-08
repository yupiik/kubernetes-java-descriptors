package io.yupiik.kubernetes.bindings.v1_18_19;

import java.util.List;
import java.util.Objects;

public class PodTemplateListItemsTemplateSpecEphemeralContainersLivenessProbeExec {
    private List<String> command;

    public PodTemplateListItemsTemplateSpecEphemeralContainersLivenessProbeExec() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecEphemeralContainersLivenessProbeExec(final List<String> command) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecEphemeralContainersLivenessProbeExec)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecEphemeralContainersLivenessProbeExec __otherCasted = (PodTemplateListItemsTemplateSpecEphemeralContainersLivenessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
