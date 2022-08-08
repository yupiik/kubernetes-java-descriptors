package io.yupiik.kubernetes.bindings.v1_22_6.v1;

import java.util.List;
import java.util.Objects;

public class CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersLifecyclePostStartExec {
    private List<String> command;

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersLifecyclePostStartExec() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersLifecyclePostStartExec(final List<String> command) {
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
        if (!(__other instanceof CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersLifecyclePostStartExec)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersLifecyclePostStartExec __otherCasted = (CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersLifecyclePostStartExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
