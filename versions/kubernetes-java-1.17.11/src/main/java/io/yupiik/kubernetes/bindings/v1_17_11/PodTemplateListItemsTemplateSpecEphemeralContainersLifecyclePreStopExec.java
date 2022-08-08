package io.yupiik.kubernetes.bindings.v1_17_11;

import java.util.List;
import java.util.Objects;

public class PodTemplateListItemsTemplateSpecEphemeralContainersLifecyclePreStopExec {
    private List<String> command;

    public PodTemplateListItemsTemplateSpecEphemeralContainersLifecyclePreStopExec() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecEphemeralContainersLifecyclePreStopExec(final List<String> command) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecEphemeralContainersLifecyclePreStopExec)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecEphemeralContainersLifecyclePreStopExec __otherCasted = (PodTemplateListItemsTemplateSpecEphemeralContainersLifecyclePreStopExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
