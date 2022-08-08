package io.yupiik.kubernetes.bindings.v1_19_7.v1;

import java.util.List;
import java.util.Objects;

public class JobListItemsSpecTemplateSpecEphemeralContainersStartupProbeExec {
    private List<String> command;

    public JobListItemsSpecTemplateSpecEphemeralContainersStartupProbeExec() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecEphemeralContainersStartupProbeExec(final List<String> command) {
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
        if (!(__other instanceof JobListItemsSpecTemplateSpecEphemeralContainersStartupProbeExec)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecEphemeralContainersStartupProbeExec __otherCasted = (JobListItemsSpecTemplateSpecEphemeralContainersStartupProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
