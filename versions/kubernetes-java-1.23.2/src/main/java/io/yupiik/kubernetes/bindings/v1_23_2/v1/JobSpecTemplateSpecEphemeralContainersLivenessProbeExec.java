package io.yupiik.kubernetes.bindings.v1_23_2.v1;

import java.util.List;
import java.util.Objects;

public class JobSpecTemplateSpecEphemeralContainersLivenessProbeExec {
    private List<String> command;

    public JobSpecTemplateSpecEphemeralContainersLivenessProbeExec() {
        // no-op
    }

    public JobSpecTemplateSpecEphemeralContainersLivenessProbeExec(final List<String> command) {
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
        if (!(__other instanceof JobSpecTemplateSpecEphemeralContainersLivenessProbeExec)) {
            return false;
        }
        final JobSpecTemplateSpecEphemeralContainersLivenessProbeExec __otherCasted = (JobSpecTemplateSpecEphemeralContainersLivenessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
