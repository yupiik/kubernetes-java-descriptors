package io.yupiik.kubernetes.bindings.v1_15_2;

import java.util.List;
import java.util.Objects;

public class PodTemplateListItemsTemplateSpecInitContainersLifecyclePreStopExec {
    private List<String> command;

    public PodTemplateListItemsTemplateSpecInitContainersLifecyclePreStopExec() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecInitContainersLifecyclePreStopExec(final List<String> command) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecInitContainersLifecyclePreStopExec)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecInitContainersLifecyclePreStopExec __otherCasted = (PodTemplateListItemsTemplateSpecInitContainersLifecyclePreStopExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
