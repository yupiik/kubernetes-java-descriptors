package io.yupiik.kubernetes.bindings.v1_17_7;

import java.util.List;
import java.util.Objects;

public class JobListItemsSpecTemplateSpecContainersLivenessProbeExec {
    private List<String> command;

    public JobListItemsSpecTemplateSpecContainersLivenessProbeExec() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecContainersLivenessProbeExec(final List<String> command) {
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
        if (!(__other instanceof JobListItemsSpecTemplateSpecContainersLivenessProbeExec)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecContainersLivenessProbeExec __otherCasted = (JobListItemsSpecTemplateSpecContainersLivenessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
