package io.yupiik.kubernetes.bindings.v1_22_11.v1;

import java.util.List;
import java.util.Objects;

public class PodTemplateTemplateSpecEphemeralContainersLivenessProbeExec {
    private List<String> command;

    public PodTemplateTemplateSpecEphemeralContainersLivenessProbeExec() {
        // no-op
    }

    public PodTemplateTemplateSpecEphemeralContainersLivenessProbeExec(final List<String> command) {
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
        if (!(__other instanceof PodTemplateTemplateSpecEphemeralContainersLivenessProbeExec)) {
            return false;
        }
        final PodTemplateTemplateSpecEphemeralContainersLivenessProbeExec __otherCasted = (PodTemplateTemplateSpecEphemeralContainersLivenessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
