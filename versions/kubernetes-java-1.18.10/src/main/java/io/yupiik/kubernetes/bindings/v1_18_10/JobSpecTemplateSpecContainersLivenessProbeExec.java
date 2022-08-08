package io.yupiik.kubernetes.bindings.v1_18_10;

import java.util.List;
import java.util.Objects;

public class JobSpecTemplateSpecContainersLivenessProbeExec {
    private List<String> command;

    public JobSpecTemplateSpecContainersLivenessProbeExec() {
        // no-op
    }

    public JobSpecTemplateSpecContainersLivenessProbeExec(final List<String> command) {
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
        if (!(__other instanceof JobSpecTemplateSpecContainersLivenessProbeExec)) {
            return false;
        }
        final JobSpecTemplateSpecContainersLivenessProbeExec __otherCasted = (JobSpecTemplateSpecContainersLivenessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
