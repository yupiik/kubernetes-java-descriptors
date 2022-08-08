package io.yupiik.kubernetes.bindings.v1_15_12.v1;

import java.util.List;
import java.util.Objects;

public class JobSpecTemplateSpecContainersReadinessProbeExec {
    private List<String> command;

    public JobSpecTemplateSpecContainersReadinessProbeExec() {
        // no-op
    }

    public JobSpecTemplateSpecContainersReadinessProbeExec(final List<String> command) {
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
        if (!(__other instanceof JobSpecTemplateSpecContainersReadinessProbeExec)) {
            return false;
        }
        final JobSpecTemplateSpecContainersReadinessProbeExec __otherCasted = (JobSpecTemplateSpecContainersReadinessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
