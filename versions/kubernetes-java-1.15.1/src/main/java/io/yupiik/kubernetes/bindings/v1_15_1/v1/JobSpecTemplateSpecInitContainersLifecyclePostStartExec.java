package io.yupiik.kubernetes.bindings.v1_15_1.v1;

import java.util.List;
import java.util.Objects;

public class JobSpecTemplateSpecInitContainersLifecyclePostStartExec {
    private List<String> command;

    public JobSpecTemplateSpecInitContainersLifecyclePostStartExec() {
        // no-op
    }

    public JobSpecTemplateSpecInitContainersLifecyclePostStartExec(final List<String> command) {
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
        if (!(__other instanceof JobSpecTemplateSpecInitContainersLifecyclePostStartExec)) {
            return false;
        }
        final JobSpecTemplateSpecInitContainersLifecyclePostStartExec __otherCasted = (JobSpecTemplateSpecInitContainersLifecyclePostStartExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
