package io.yupiik.kubernetes.bindings.v1_22_7.v1beta1;

import java.util.List;
import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersStartupProbeExec {
    private List<String> command;

    public CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersStartupProbeExec() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersStartupProbeExec(final List<String> command) {
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
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersStartupProbeExec)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersStartupProbeExec __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersStartupProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
