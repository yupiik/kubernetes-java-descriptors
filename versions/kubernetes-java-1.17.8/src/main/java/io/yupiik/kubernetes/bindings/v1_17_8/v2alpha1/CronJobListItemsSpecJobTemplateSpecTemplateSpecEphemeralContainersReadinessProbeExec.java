package io.yupiik.kubernetes.bindings.v1_17_8.v2alpha1;

import java.util.List;
import java.util.Objects;

public class CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersReadinessProbeExec {
    private List<String> command;

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersReadinessProbeExec() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersReadinessProbeExec(final List<String> command) {
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
        if (!(__other instanceof CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersReadinessProbeExec)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersReadinessProbeExec __otherCasted = (CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersReadinessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
