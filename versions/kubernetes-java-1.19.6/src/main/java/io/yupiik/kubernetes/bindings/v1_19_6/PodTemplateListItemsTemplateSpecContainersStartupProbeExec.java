package io.yupiik.kubernetes.bindings.v1_19_6;

import java.util.List;
import java.util.Objects;

public class PodTemplateListItemsTemplateSpecContainersStartupProbeExec {
    private List<String> command;

    public PodTemplateListItemsTemplateSpecContainersStartupProbeExec() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecContainersStartupProbeExec(final List<String> command) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecContainersStartupProbeExec)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecContainersStartupProbeExec __otherCasted = (PodTemplateListItemsTemplateSpecContainersStartupProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
