package io.yupiik.kubernetes.bindings.v1_18_7;

import java.util.List;
import java.util.Objects;

public class JobSpecTemplateSpecEphemeralContainersStartupProbeExec {
    private List<String> command;

    public JobSpecTemplateSpecEphemeralContainersStartupProbeExec() {
        // no-op
    }

    public JobSpecTemplateSpecEphemeralContainersStartupProbeExec(final List<String> command) {
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
        if (!(__other instanceof JobSpecTemplateSpecEphemeralContainersStartupProbeExec)) {
            return false;
        }
        final JobSpecTemplateSpecEphemeralContainersStartupProbeExec __otherCasted = (JobSpecTemplateSpecEphemeralContainersStartupProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
