package io.yupiik.kubernetes.bindings.v1_21_3.v1beta1;

import java.util.List;
import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecInitContainersLivenessProbeExec {
    private List<String> command;

    public CronJobSpecJobTemplateSpecTemplateSpecInitContainersLivenessProbeExec() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecInitContainersLivenessProbeExec(final List<String> command) {
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
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecInitContainersLivenessProbeExec)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecInitContainersLivenessProbeExec __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecInitContainersLivenessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
