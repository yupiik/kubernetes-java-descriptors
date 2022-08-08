package io.yupiik.kubernetes.bindings.v1_19_4;

import java.util.List;
import java.util.Objects;

public class PodTemplateTemplateSpecEphemeralContainersReadinessProbeExec {
    private List<String> command;

    public PodTemplateTemplateSpecEphemeralContainersReadinessProbeExec() {
        // no-op
    }

    public PodTemplateTemplateSpecEphemeralContainersReadinessProbeExec(final List<String> command) {
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
        if (!(__other instanceof PodTemplateTemplateSpecEphemeralContainersReadinessProbeExec)) {
            return false;
        }
        final PodTemplateTemplateSpecEphemeralContainersReadinessProbeExec __otherCasted = (PodTemplateTemplateSpecEphemeralContainersReadinessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
