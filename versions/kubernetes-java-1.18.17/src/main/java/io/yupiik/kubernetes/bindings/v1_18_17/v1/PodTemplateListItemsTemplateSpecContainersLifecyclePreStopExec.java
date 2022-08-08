package io.yupiik.kubernetes.bindings.v1_18_17.v1;

import java.util.List;
import java.util.Objects;

public class PodTemplateListItemsTemplateSpecContainersLifecyclePreStopExec {
    private List<String> command;

    public PodTemplateListItemsTemplateSpecContainersLifecyclePreStopExec() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecContainersLifecyclePreStopExec(final List<String> command) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecContainersLifecyclePreStopExec)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecContainersLifecyclePreStopExec __otherCasted = (PodTemplateListItemsTemplateSpecContainersLifecyclePreStopExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
