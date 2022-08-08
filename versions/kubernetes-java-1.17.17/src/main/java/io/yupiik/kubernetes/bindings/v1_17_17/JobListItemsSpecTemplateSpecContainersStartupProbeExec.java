package io.yupiik.kubernetes.bindings.v1_17_17;

import java.util.List;
import java.util.Objects;

public class JobListItemsSpecTemplateSpecContainersStartupProbeExec {
    private List<String> command;

    public JobListItemsSpecTemplateSpecContainersStartupProbeExec() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecContainersStartupProbeExec(final List<String> command) {
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
        if (!(__other instanceof JobListItemsSpecTemplateSpecContainersStartupProbeExec)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecContainersStartupProbeExec __otherCasted = (JobListItemsSpecTemplateSpecContainersStartupProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
