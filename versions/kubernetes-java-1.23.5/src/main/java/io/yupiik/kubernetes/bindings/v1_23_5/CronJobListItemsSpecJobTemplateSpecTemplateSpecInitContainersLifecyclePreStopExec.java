package io.yupiik.kubernetes.bindings.v1_23_5;

import java.util.List;
import java.util.Objects;

public class CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePreStopExec {
    private List<String> command;

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePreStopExec() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePreStopExec(final List<String> command) {
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
        if (!(__other instanceof CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePreStopExec)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePreStopExec __otherCasted = (CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersLifecyclePreStopExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
