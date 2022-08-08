package io.yupiik.kubernetes.bindings.v1_17_5.v1beta1;

import java.util.List;
import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecContainersReadinessProbeExec {
    private List<String> command;

    public CronJobSpecJobTemplateSpecTemplateSpecContainersReadinessProbeExec() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecContainersReadinessProbeExec(final List<String> command) {
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
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecContainersReadinessProbeExec)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecContainersReadinessProbeExec __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecContainersReadinessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
