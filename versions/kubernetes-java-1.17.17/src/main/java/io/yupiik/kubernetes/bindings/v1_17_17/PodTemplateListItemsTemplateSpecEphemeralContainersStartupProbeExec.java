package io.yupiik.kubernetes.bindings.v1_17_17;

import java.util.List;
import java.util.Objects;

public class PodTemplateListItemsTemplateSpecEphemeralContainersStartupProbeExec {
    private List<String> command;

    public PodTemplateListItemsTemplateSpecEphemeralContainersStartupProbeExec() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecEphemeralContainersStartupProbeExec(final List<String> command) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecEphemeralContainersStartupProbeExec)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecEphemeralContainersStartupProbeExec __otherCasted = (PodTemplateListItemsTemplateSpecEphemeralContainersStartupProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
