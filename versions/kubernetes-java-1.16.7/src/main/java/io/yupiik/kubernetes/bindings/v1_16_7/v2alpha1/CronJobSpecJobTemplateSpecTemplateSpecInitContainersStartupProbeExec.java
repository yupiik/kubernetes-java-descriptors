package io.yupiik.kubernetes.bindings.v1_16_7.v2alpha1;

import java.util.List;
import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecInitContainersStartupProbeExec {
    private List<String> command;

    public CronJobSpecJobTemplateSpecTemplateSpecInitContainersStartupProbeExec() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecInitContainersStartupProbeExec(final List<String> command) {
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
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecInitContainersStartupProbeExec)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecInitContainersStartupProbeExec __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecInitContainersStartupProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
