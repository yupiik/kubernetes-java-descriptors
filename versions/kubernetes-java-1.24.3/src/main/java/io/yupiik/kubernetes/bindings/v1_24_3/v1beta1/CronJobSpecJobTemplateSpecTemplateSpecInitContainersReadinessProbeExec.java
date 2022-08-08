package io.yupiik.kubernetes.bindings.v1_24_3.v1beta1;

import java.util.List;
import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecInitContainersReadinessProbeExec {
    private List<String> command;

    public CronJobSpecJobTemplateSpecTemplateSpecInitContainersReadinessProbeExec() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecInitContainersReadinessProbeExec(final List<String> command) {
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
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecInitContainersReadinessProbeExec)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecInitContainersReadinessProbeExec __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecInitContainersReadinessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
