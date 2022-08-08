package io.yupiik.kubernetes.bindings.v1_15_7;

import java.util.List;
import java.util.Objects;

public class JobListItemsSpecTemplateSpecContainersReadinessProbeExec {
    private List<String> command;

    public JobListItemsSpecTemplateSpecContainersReadinessProbeExec() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecContainersReadinessProbeExec(final List<String> command) {
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
        if (!(__other instanceof JobListItemsSpecTemplateSpecContainersReadinessProbeExec)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecContainersReadinessProbeExec __otherCasted = (JobListItemsSpecTemplateSpecContainersReadinessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
