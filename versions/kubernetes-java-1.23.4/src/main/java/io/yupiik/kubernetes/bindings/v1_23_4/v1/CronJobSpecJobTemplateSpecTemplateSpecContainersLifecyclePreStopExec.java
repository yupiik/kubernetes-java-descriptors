package io.yupiik.kubernetes.bindings.v1_23_4.v1;

import java.util.List;
import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecContainersLifecyclePreStopExec {
    private List<String> command;

    public CronJobSpecJobTemplateSpecTemplateSpecContainersLifecyclePreStopExec() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecContainersLifecyclePreStopExec(final List<String> command) {
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
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecContainersLifecyclePreStopExec)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecContainersLifecyclePreStopExec __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecContainersLifecyclePreStopExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
