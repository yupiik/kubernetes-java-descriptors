package io.yupiik.kubernetes.bindings.v1_24_1;

import java.util.List;
import java.util.Objects;

public class JobListItemsSpecTemplateSpecInitContainersReadinessProbeExec {
    private List<String> command;

    public JobListItemsSpecTemplateSpecInitContainersReadinessProbeExec() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecInitContainersReadinessProbeExec(final List<String> command) {
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
        if (!(__other instanceof JobListItemsSpecTemplateSpecInitContainersReadinessProbeExec)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecInitContainersReadinessProbeExec __otherCasted = (JobListItemsSpecTemplateSpecInitContainersReadinessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
