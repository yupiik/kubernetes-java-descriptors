package io.yupiik.kubernetes.bindings.v1_18_0;

import java.util.List;
import java.util.Objects;

public class CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePostStartExec {
    private List<String> command;

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePostStartExec() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePostStartExec(final List<String> command) {
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
        if (!(__other instanceof CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePostStartExec)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePostStartExec __otherCasted = (CronJobListItemsSpecJobTemplateSpecTemplateSpecEphemeralContainersLifecyclePostStartExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
