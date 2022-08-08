package io.yupiik.kubernetes.bindings.v1_24_1.v1beta1;

import java.util.List;
import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecContainersLivenessProbeExec {
    private List<String> command;

    public CronJobSpecJobTemplateSpecTemplateSpecContainersLivenessProbeExec() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecContainersLivenessProbeExec(final List<String> command) {
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
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecContainersLivenessProbeExec)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecContainersLivenessProbeExec __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecContainersLivenessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
