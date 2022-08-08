package io.yupiik.kubernetes.bindings.v1_15_11.v1beta1;

import java.util.List;
import java.util.Objects;

public class StatefulSetSpecTemplateSpecInitContainersLifecyclePostStartExec {
    private List<String> command;

    public StatefulSetSpecTemplateSpecInitContainersLifecyclePostStartExec() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecInitContainersLifecyclePostStartExec(final List<String> command) {
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecInitContainersLifecyclePostStartExec)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecInitContainersLifecyclePostStartExec __otherCasted = (StatefulSetSpecTemplateSpecInitContainersLifecyclePostStartExec) __other;
        return Objects.equals(command, __otherCasted.command);
    }
}
