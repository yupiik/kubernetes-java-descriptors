package io.yupiik.kubernetes.bindings.v1_16_1.v1;

import java.util.List;
import java.util.Objects;

public class JobListItemsSpecTemplateSpecInitContainersStartupProbeExec {
    private List<String> command;

    public JobListItemsSpecTemplateSpecInitContainersStartupProbeExec() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecInitContainersStartupProbeExec(final List<String> command) {
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
        if (!(__other instanceof JobListItemsSpecTemplateSpecInitContainersStartupProbeExec)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecInitContainersStartupProbeExec __otherCasted = (JobListItemsSpecTemplateSpecInitContainersStartupProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
