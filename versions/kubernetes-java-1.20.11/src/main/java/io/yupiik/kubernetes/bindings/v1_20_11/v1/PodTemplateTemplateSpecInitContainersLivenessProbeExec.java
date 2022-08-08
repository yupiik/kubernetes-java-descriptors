package io.yupiik.kubernetes.bindings.v1_20_11.v1;

import java.util.List;
import java.util.Objects;

public class PodTemplateTemplateSpecInitContainersLivenessProbeExec {
    private List<String> command;

    public PodTemplateTemplateSpecInitContainersLivenessProbeExec() {
        // no-op
    }

    public PodTemplateTemplateSpecInitContainersLivenessProbeExec(final List<String> command) {
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
        if (!(__other instanceof PodTemplateTemplateSpecInitContainersLivenessProbeExec)) {
            return false;
        }
        final PodTemplateTemplateSpecInitContainersLivenessProbeExec __otherCasted = (PodTemplateTemplateSpecInitContainersLivenessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
