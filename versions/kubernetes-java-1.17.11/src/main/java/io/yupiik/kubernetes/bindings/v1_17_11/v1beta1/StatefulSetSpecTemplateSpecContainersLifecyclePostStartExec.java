package io.yupiik.kubernetes.bindings.v1_17_11.v1beta1;

import java.util.List;
import java.util.Objects;

public class StatefulSetSpecTemplateSpecContainersLifecyclePostStartExec {
    private List<String> command;

    public StatefulSetSpecTemplateSpecContainersLifecyclePostStartExec() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecContainersLifecyclePostStartExec(final List<String> command) {
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecContainersLifecyclePostStartExec)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecContainersLifecyclePostStartExec __otherCasted = (StatefulSetSpecTemplateSpecContainersLifecyclePostStartExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
