package io.yupiik.kubernetes.bindings.v1_23_1.v1beta1;

import io.yupiik.kubernetes.bindings.v1_23_1.Exportable;

public enum ContainerTerminationMessagePolicy implements Exportable {
    FallbackToLogsOnError,
    File
    ;

    @Override
    public String asJson() {
        return "\"" + name() + "\"";
    }
}
