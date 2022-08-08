package io.yupiik.kubernetes.bindings.v1_19_12;

import java.util.List;
import java.util.Objects;

public class CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersReadinessProbeExec {
    private List<String> command;

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersReadinessProbeExec() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersReadinessProbeExec(final List<String> command) {
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
        if (!(__other instanceof CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersReadinessProbeExec)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersReadinessProbeExec __otherCasted = (CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersReadinessProbeExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
