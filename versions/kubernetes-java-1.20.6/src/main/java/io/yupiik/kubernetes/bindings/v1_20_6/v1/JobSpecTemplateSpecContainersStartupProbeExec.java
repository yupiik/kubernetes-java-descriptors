package io.yupiik.kubernetes.bindings.v1_20_6.v1;

import java.util.List;
import java.util.Objects;

public class JobSpecTemplateSpecContainersStartupProbeExec {
    private List<String> command;

    public JobSpecTemplateSpecContainersStartupProbeExec() {
        // no-op
    }

    public JobSpecTemplateSpecContainersStartupProbeExec(final List<String> command) {
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
        if (!(__other instanceof JobSpecTemplateSpecContainersStartupProbeExec)) {
            return false;
        }
        final JobSpecTemplateSpecContainersStartupProbeExec __otherCasted = (JobSpecTemplateSpecContainersStartupProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
