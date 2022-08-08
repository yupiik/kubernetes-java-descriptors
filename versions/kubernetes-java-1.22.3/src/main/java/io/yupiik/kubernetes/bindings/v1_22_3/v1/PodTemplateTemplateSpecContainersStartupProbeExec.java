package io.yupiik.kubernetes.bindings.v1_22_3.v1;

import java.util.List;
import java.util.Objects;

public class PodTemplateTemplateSpecContainersStartupProbeExec {
    private List<String> command;

    public PodTemplateTemplateSpecContainersStartupProbeExec() {
        // no-op
    }

    public PodTemplateTemplateSpecContainersStartupProbeExec(final List<String> command) {
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
        if (!(__other instanceof PodTemplateTemplateSpecContainersStartupProbeExec)) {
            return false;
        }
        final PodTemplateTemplateSpecContainersStartupProbeExec __otherCasted = (PodTemplateTemplateSpecContainersStartupProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
