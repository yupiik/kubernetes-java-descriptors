package io.yupiik.kubernetes.bindings.v1_20_3;

import java.util.List;
import java.util.Objects;

public class PodTemplateTemplateSpecContainersLivenessProbeExec {
    private List<String> command;

    public PodTemplateTemplateSpecContainersLivenessProbeExec() {
        // no-op
    }

    public PodTemplateTemplateSpecContainersLivenessProbeExec(final List<String> command) {
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
        if (!(__other instanceof PodTemplateTemplateSpecContainersLivenessProbeExec)) {
            return false;
        }
        final PodTemplateTemplateSpecContainersLivenessProbeExec __otherCasted = (PodTemplateTemplateSpecContainersLivenessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
