package io.yupiik.kubernetes.bindings.v1_20_4;

import java.util.List;
import java.util.Objects;

public class JobListItemsSpecTemplateSpecInitContainersLivenessProbeExec {
    private List<String> command;

    public JobListItemsSpecTemplateSpecInitContainersLivenessProbeExec() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecInitContainersLivenessProbeExec(final List<String> command) {
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
        if (!(__other instanceof JobListItemsSpecTemplateSpecInitContainersLivenessProbeExec)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecInitContainersLivenessProbeExec __otherCasted = (JobListItemsSpecTemplateSpecInitContainersLivenessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
