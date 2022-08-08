package io.yupiik.kubernetes.bindings.v1_22_4.v1;

import java.util.List;
import java.util.Objects;

public class PodTemplateListItemsTemplateSpecContainersLifecyclePostStartExec {
    private List<String> command;

    public PodTemplateListItemsTemplateSpecContainersLifecyclePostStartExec() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecContainersLifecyclePostStartExec(final List<String> command) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecContainersLifecyclePostStartExec)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecContainersLifecyclePostStartExec __otherCasted = (PodTemplateListItemsTemplateSpecContainersLifecyclePostStartExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
