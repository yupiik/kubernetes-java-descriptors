package io.yupiik.kubernetes.bindings.v1_18_16.v1;

import java.util.List;
import java.util.Objects;

public class PodTemplateListItemsTemplateSpecEphemeralContainersReadinessProbeExec {
    private List<String> command;

    public PodTemplateListItemsTemplateSpecEphemeralContainersReadinessProbeExec() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecEphemeralContainersReadinessProbeExec(final List<String> command) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecEphemeralContainersReadinessProbeExec)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecEphemeralContainersReadinessProbeExec __otherCasted = (PodTemplateListItemsTemplateSpecEphemeralContainersReadinessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
