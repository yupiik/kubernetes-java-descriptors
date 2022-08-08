package io.yupiik.kubernetes.bindings.v1_18_17.v1beta1;

import java.util.List;
import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecContainersLifecyclePostStartExec {
    private List<String> command;

    public CronJobSpecJobTemplateSpecTemplateSpecContainersLifecyclePostStartExec() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecContainersLifecyclePostStartExec(final List<String> command) {
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
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecContainersLifecyclePostStartExec)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecContainersLifecyclePostStartExec __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecContainersLifecyclePostStartExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
