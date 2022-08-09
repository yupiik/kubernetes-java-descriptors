package io.yupiik.kubernetes.bindings.v1_23_0.v1beta1;

import io.yupiik.kubernetes.bindings.v1_23_0.Exportable;

public enum EphemeralContainerTerminationMessagePolicy implements Exportable {
    FallbackToLogsOnError,
    File
    ;

    @Override
    public String asJson() {
        return "\"" + name() + "\"";
    }
}
