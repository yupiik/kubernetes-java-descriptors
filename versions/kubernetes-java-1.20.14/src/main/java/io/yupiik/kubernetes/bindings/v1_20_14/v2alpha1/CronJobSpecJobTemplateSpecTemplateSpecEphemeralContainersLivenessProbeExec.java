package io.yupiik.kubernetes.bindings.v1_20_14.v2alpha1;

import java.util.List;
import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLivenessProbeExec {
    private List<String> command;

    public CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLivenessProbeExec() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLivenessProbeExec(final List<String> command) {
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
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLivenessProbeExec)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLivenessProbeExec __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersLivenessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
