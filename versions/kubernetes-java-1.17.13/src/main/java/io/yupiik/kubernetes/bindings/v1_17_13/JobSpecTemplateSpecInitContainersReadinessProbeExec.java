package io.yupiik.kubernetes.bindings.v1_17_13;

import java.util.List;
import java.util.Objects;

public class JobSpecTemplateSpecInitContainersReadinessProbeExec {
    private List<String> command;

    public JobSpecTemplateSpecInitContainersReadinessProbeExec() {
        // no-op
    }

    public JobSpecTemplateSpecInitContainersReadinessProbeExec(final List<String> command) {
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
        if (!(__other instanceof JobSpecTemplateSpecInitContainersReadinessProbeExec)) {
            return false;
        }
        final JobSpecTemplateSpecInitContainersReadinessProbeExec __otherCasted = (JobSpecTemplateSpecInitContainersReadinessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
